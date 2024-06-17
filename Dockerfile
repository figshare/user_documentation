# Use an official Python runtime as the base image
FROM debian:11-slim AS build

# Set the working directory in the container
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY . /app

# Install system dependencies
RUN apt-get update && apt-get install -y --no-install-recommends \
    python3-dev \
    python3-pip \
    python3-venv \
    openjdk-17-jre \
    build-essential \
    libxml2-dev \
    libxslt-dev \
    zip \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*

RUN python3 -m venv /virtualenv
ENV PATH="/virtualenv/bin:$PATH"

# Install Python dependencies
RUN pip install --no-cache-dir mkdocs black

# Install additional dependencies for swagger documentation
RUN make install
RUN make swagger_install

FROM build as development

# Make the swagger documentation
RUN make swagger_build

# Expose port 8000 for the server
EXPOSE 8000

# Set the default command to run when the container starts
CMD ["make", "server"]

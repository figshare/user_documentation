build:
	mkdocs build
.PHONY: build

publish:
	mkdocs gh-deploy
.PHONY: publish

server:
	cd swagger_documentation && python -m http.server 8000
.PHONY: server

install:
	pip install mkdocs
.PHONY: install

format:
	 black -l 120 -t py39 ./swagger_documentation
.PHONY: format

swagger_build:
	cd swagger_documentation && make documentation
.PHONY: swagger_build

swagger_install:
	cd swagger_documentation && make install
.PHONY: swagger_install

container_images:
	docker build --target build -t figshare/user_documentation:build .
	docker build -t figshare/user_documentation:latest .
.PHONY: container_images

container_build:
	docker run --rm -v $(PWD):/app figshare/user_documentation:build make build
	docker run --rm -v $(PWD):/app figshare/user_documentation:build make swagger_build
.PHONY: container_build

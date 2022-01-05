build:
	mkdocs build

publish:
	mkdocs gh-deploy

server:
	cd swagger_documentation && python -m SimpleHTTPServer 8000

install:
	pip install mkdocs

format:
	 black -l 120 -t py39 ./swagger_documentation

swagger_build:
	cd swagger_documentation && make documentation

swagger_install:
	cd swagger_documentation && make install

.PHONY: swagger_build swagger_install

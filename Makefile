build:
	mkdocs build

publish:
	mkdocs gh-deploy

server:
	mkdocs serve

configure:
	pip install mkdocs

.PHONY: publish server

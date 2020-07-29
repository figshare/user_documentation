#build:
#	mkdocs build

swagger_build:
	cd swagger_documentation && make documentation

#publish:
#	mkdocs gh-deploy

#server:
#	mkdocs serve

#configure:
#	pip install mkdocs

swagger_configure:
	cd swagger_documentation && make configure

.PHONY: swagger_build swagger_configure

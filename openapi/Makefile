generate-openapi:
	java -jar swagger-codegen-cli.jar generate -l openapi -i ../swagger_documentation/swagger_parsed.json -o codegen-output/

openapi: generate-openapi
	cp codegen-output/openapi.json openapi.json
	rm -r codegen-output/

documentation: openapi
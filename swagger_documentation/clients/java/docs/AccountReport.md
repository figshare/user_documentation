
# AccountReport

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | A unique ID for the AccountRecord | 
**accountId** | **Long** | The ID of the account which generated this report. | 
**createdDate** | **String** | Date when the AccountReport was requested | 
**status** | [**StatusEnum**](#StatusEnum) | Status of the report | 
**downloadUrl** | **String** | The download link for the generated XLSX | 
**groupId** | **Long** | The group ID that was used to filter the report, if any. | 


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
MISSING | &quot;missing&quot;
PENDING | &quot;pending&quot;
DONE | &quot;done&quot;




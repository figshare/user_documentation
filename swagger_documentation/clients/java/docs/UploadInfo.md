
# UploadInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token** | **String** | token received after initializing a file upload |  [optional]
**md5** | **String** | md5 provided on upload initialization |  [optional]
**size** | **Long** | size of file in bytes |  [optional]
**name** | **String** | name of file on upload server |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Upload status |  [optional]
**parts** | [**List&lt;UploadFilePart&gt;**](UploadFilePart.md) | Uploads parts |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
COMPLETED | &quot;COMPLETED&quot;
ABORTED | &quot;ABORTED&quot;




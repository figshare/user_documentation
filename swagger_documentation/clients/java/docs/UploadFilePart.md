
# UploadFilePart

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**partNo** | **Long** | File part id |  [optional]
**startOffset** | **Long** | Indexes on byte range. zero-based and inclusive |  [optional]
**endOffset** | **Long** | Indexes on byte range. zero-based and inclusive |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | part status |  [optional]
**locked** | **Boolean** | When a part is being uploaded it is being locked, by setting the locked flag to true. No changes/uploads can happen on this part from other requests. |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
COMPLETE | &quot;COMPLETE&quot;




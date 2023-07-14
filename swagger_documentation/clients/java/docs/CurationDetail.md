
# CurationDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The review id | 
**groupId** | **Long** | The group in which the article is present. | 
**accountId** | **Long** | The ID of the account of the owner of the article of this review. | 
**assignedTo** | **Long** | The ID of the account to which this review is assigned. | 
**articleId** | **Long** | The ID of the article of this review. | 
**version** | **Long** | The Version number of the article in review. | 
**commentsCount** | **Long** | The number of comments in the review. | 
**status** | [**StatusEnum**](#StatusEnum) | The status of the review. | 
**createdDate** | **String** | The creation date of the review. | 
**modifiedDate** | **String** | The date the review has been modified. | 


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;pending&quot;
APPROVED | &quot;approved&quot;
REJECTED | &quot;rejected&quot;
CLOSED | &quot;closed&quot;




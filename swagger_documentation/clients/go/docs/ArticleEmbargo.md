# ArticleEmbargo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IsEmbargoed** | **bool** | True if embargoed | [default to null]
**EmbargoTitle** | **string** | Title for embargo | [default to null]
**EmbargoReason** | **string** | Reason for embargo | [default to null]
**EmbargoOptions** | [**[]interface{}**](interface{}.md) | List of embargo permissions that are associated with the article. If the type is logged_in and the group_ids list is empty, then the whole institution can see the article; if there are multiple group_ids, then only users that are under those groups can see the article. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



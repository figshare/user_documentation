# ArticleEmbargoUpdater

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IsEmbargoed** | **bool** | Embargo status | [default to null]
**EmbargoDate** | **string** | Date when the embargo expires and the article gets published, &#39;0&#39; value will set up permanent embargo | [default to null]
**EmbargoType** | **string** | Embargo can be enabled at the article or the file level. Possible values: article, file | [default to null]
**EmbargoTitle** | **string** | Title for embargo | [optional] [default to null]
**EmbargoReason** | **string** | Reason for setting embargo | [optional] [default to null]
**EmbargoOptions** | [**[]interface{}**](interface{}.md) | List of embargo permissions to be associated with the article. The list must contain &#x60;id&#x60; and can also contain &#x60;group_ids&#x60;(a field that only applies to &#39;logged_in&#39; permissions). The new list replaces old options in the database, and an empty list removes all permissions for this article. Administration permission has to be set up alone but logged in and IP range permissions can be set up together. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



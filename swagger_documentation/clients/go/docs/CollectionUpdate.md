# CollectionUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Funding** | **string** | Grant number or funding authority | [optional] [default to null]
**FundingList** | [**[]FundingCreate**](FundingCreate.md) | Funding creation / update items | [optional] [default to null]
**Title** | **string** | Title of collection | [optional] [default to null]
**Description** | **string** | The collection description. In a publisher case, usually this is the remote collection description | [optional] [default to null]
**Articles** | **[]int32** | List of articles to be associated with the collection | [optional] [default to null]
**Authors** | [**[]interface{}**](interface{}.md) | List of authors to be associated with the collection. The list can contain the following fields: id, name, first_name, last_name, email, orcid_id. If an id is supplied, it will take priority and everything else will be ignored. For adding more authors use the specific authors endpoint. | [optional] [default to null]
**Categories** | **[]int64** | List of category ids to be associated with the collection (e.g [1, 23, 33, 66]) | [optional] [default to null]
**CategoriesBySourceId** | **[]string** | List of category source ids to be associated with the article, supersedes the categories property | [optional] [default to null]
**Tags** | **[]string** | List of tags to be associated with the collection. Keywords can be used instead | [optional] [default to null]
**Keywords** | **[]string** | List of tags to be associated with the collection. Tags can be used instead | [optional] [default to null]
**References** | **[]string** | List of links to be associated with the collection (e.g [\&quot;http://link1\&quot;, \&quot;http://link2\&quot;, \&quot;http://link3\&quot;]) | [optional] [default to null]
**CustomFields** | [**interface{}**](interface{}.md) | List of key, values pairs to be associated with the collection | [optional] [default to null]
**CustomFieldsList** | [**[]CustomArticleFieldAdd**](CustomArticleFieldAdd.md) | List of custom fields values, supersedes custom_fields parameter | [optional] [default to null]
**Doi** | **string** | Not applicable for regular users. In an institutional case, make sure your group supports setting DOIs. This setting is applied by figshare via opening a ticket through our support/helpdesk system. | [optional] [default to null]
**Handle** | **string** | Not applicable for regular users. In an institutional case, make sure your group supports setting Handles. This setting is applied by figshare via opening a ticket through our support/helpdesk system. | [optional] [default to null]
**ResourceId** | **string** | Not applicable to regular users. In a publisher case, this is the publisher article id | [optional] [default to null]
**ResourceDoi** | **string** | Not applicable to regular users. In a publisher case, this is the publisher article DOI. | [optional] [default to null]
**ResourceLink** | **string** | Not applicable to regular users. In a publisher case, this is the publisher article link | [optional] [default to null]
**ResourceTitle** | **string** | Not applicable to regular users. In a publisher case, this is the publisher article title. | [optional] [default to null]
**ResourceVersion** | **int32** | Not applicable to regular users. In a publisher case, this is the publisher article version | [optional] [default to null]
**GroupId** | **int64** | Not applicable to regular users. This field is reserved to institutions/publishers with access to assign to specific groups | [optional] [default to null]
**Timeline** | [**TimelineUpdate**](TimelineUpdate.md) | Various timeline dates | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


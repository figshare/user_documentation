
# ProjectCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **String** | The title for this project - mandatory. 3 - 1000 characters. | 
**description** | **String** | Project description |  [optional]
**funding** | **String** | Grant number or organization(s) that funded this project. Up to 2000 characters permitted. |  [optional]
**fundingList** | [**List&lt;FundingCreate&gt;**](FundingCreate.md) | Funding creation / update items |  [optional]
**groupId** | **Long** | Only if project type is group. |  [optional]
**customFields** | **Object** | List of key, values pairs to be associated with the project |  [optional]
**customFieldsList** | [**List&lt;CustomArticleFieldAdd&gt;**](CustomArticleFieldAdd.md) | List of custom fields values, supersedes custom_fields parameter |  [optional]




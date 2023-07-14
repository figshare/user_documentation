
# ArticleEmbargoUpdater

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isEmbargoed** | **Boolean** | Embargo status | 
**embargoDate** | **String** | Date when the embargo expires and the article gets published, &#39;0&#39; value will set up permanent embargo | 
**embargoType** | [**EmbargoTypeEnum**](#EmbargoTypeEnum) | Embargo can be enabled at the article or the file level. Possible values: article, file | 
**embargoTitle** | **String** | Title for embargo |  [optional]
**embargoReason** | **String** | Reason for setting embargo |  [optional]
**embargoOptions** | **List&lt;Object&gt;** | List of embargo permissions to be associated with the article. The list must contain &#x60;id&#x60; and can also contain &#x60;group_ids&#x60;(a field that only applies to &#39;logged_in&#39; permissions). The new list replaces old options in the database, and an empty list removes all permissions for this article. Administration permission has to be set up alone but logged in and IP range permissions can be set up together. |  [optional]


<a name="EmbargoTypeEnum"></a>
## Enum: EmbargoTypeEnum
Name | Value
---- | -----
ARTICLE | &quot;article&quot;
FILE | &quot;file&quot;




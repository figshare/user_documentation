
# CollectionUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**funding** | **String** | Grant number or funding authority |  [optional]
**fundingList** | [**List&lt;FundingCreate&gt;**](FundingCreate.md) | Funding creation / update items |  [optional]
**title** | **String** | Title of collection |  [optional]
**description** | **String** | The collection description. In a publisher case, usually this is the remote collection description |  [optional]
**articles** | **List&lt;Integer&gt;** | List of articles to be associated with the collection |  [optional]
**authors** | **List&lt;Object&gt;** | List of authors to be associated with the collection. The list can contain the following fields: id, name, first_name, last_name, email, orcid_id. If an id is supplied, it will take priority and everything else will be ignored. For adding more authors use the specific authors endpoint. |  [optional]
**categories** | **List&lt;Long&gt;** | List of category ids to be associated with the collection (e.g [1, 23, 33, 66]) |  [optional]
**categoriesBySourceId** | **List&lt;String&gt;** | List of category source ids to be associated with the article, supersedes the categories property |  [optional]
**tags** | **List&lt;String&gt;** | List of tags to be associated with the collection. Keywords can be used instead |  [optional]
**keywords** | **List&lt;String&gt;** | List of tags to be associated with the collection. Tags can be used instead |  [optional]
**references** | **List&lt;String&gt;** | List of links to be associated with the collection (e.g [\&quot;http://link1\&quot;, \&quot;http://link2\&quot;, \&quot;http://link3\&quot;]) |  [optional]
**customFields** | **Object** | List of key, values pairs to be associated with the collection |  [optional]
**customFieldsList** | [**List&lt;CustomArticleFieldAdd&gt;**](CustomArticleFieldAdd.md) | List of custom fields values, supersedes custom_fields parameter |  [optional]
**doi** | **String** | Not applicable for regular users. In an institutional case, make sure your group supports setting DOIs. This setting is applied by figshare via opening a ticket through our support/helpdesk system. |  [optional]
**handle** | **String** | Not applicable for regular users. In an institutional case, make sure your group supports setting Handles. This setting is applied by figshare via opening a ticket through our support/helpdesk system. |  [optional]
**resourceId** | **String** | Not applicable to regular users. In a publisher case, this is the publisher article id |  [optional]
**resourceDoi** | **String** | Not applicable to regular users. In a publisher case, this is the publisher article DOI. |  [optional]
**resourceLink** | **String** | Not applicable to regular users. In a publisher case, this is the publisher article link |  [optional]
**resourceTitle** | **String** | Not applicable to regular users. In a publisher case, this is the publisher article title. |  [optional]
**resourceVersion** | **Integer** | Not applicable to regular users. In a publisher case, this is the publisher article version |  [optional]
**groupId** | **Long** | Not applicable to regular users. This field is reserved to institutions/publishers with access to assign to specific groups |  [optional]
**timeline** | [**TimelineUpdate**](TimelineUpdate.md) | Various timeline dates |  [optional]




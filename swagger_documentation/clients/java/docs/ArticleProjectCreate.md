
# ArticleProjectCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **String** | Title of article | 
**description** | **String** | The article description. In a publisher case, usually this is the remote article description |  [optional]
**tags** | **List&lt;String&gt;** | List of tags to be associated with the article. Keywords can be used instead |  [optional]
**keywords** | **List&lt;String&gt;** | List of tags to be associated with the article. Tags can be used instead |  [optional]
**references** | **List&lt;String&gt;** | List of links to be associated with the article (e.g [\&quot;http://link1\&quot;, \&quot;http://link2\&quot;, \&quot;http://link3\&quot;]) |  [optional]
**relatedMaterials** | [****](.md) | List of related materials; supersedes references. |  [optional]
**categories** | **List&lt;Long&gt;** | List of category ids to be associated with the article(e.g [1, 23, 33, 66]) |  [optional]
**categoriesBySourceId** | **List&lt;String&gt;** | List of category source ids to be associated with the article, supersedes the categories property |  [optional]
**authors** | **List&lt;Object&gt;** | List of authors to be associated with the article. The list can contain the following fields: id, name, first_name, last_name, email, orcid_id. If an id is supplied, it will take priority and everything else will be ignored. For adding more authors use the specific authors endpoint. |  [optional]
**customFields** | **Object** | List of key, values pairs to be associated with the article |  [optional]
**customFieldsList** | [**List&lt;CustomArticleFieldAdd&gt;**](CustomArticleFieldAdd.md) | List of custom fields values, supersedes custom_fields parameter |  [optional]
**definedType** | **String** | &lt;b&gt;One of:&lt;/b&gt; &lt;code&gt;figure&lt;/code&gt; &lt;code&gt;online resource&lt;/code&gt; &lt;code&gt;preprint&lt;/code&gt; &lt;code&gt;book&lt;/code&gt; &lt;code&gt;conference contribution&lt;/code&gt; &lt;code&gt;media&lt;/code&gt; &lt;code&gt;dataset&lt;/code&gt; &lt;code&gt;poster&lt;/code&gt; &lt;code&gt;journal contribution&lt;/code&gt; &lt;code&gt;presentation&lt;/code&gt; &lt;code&gt;thesis&lt;/code&gt; &lt;code&gt;software&lt;/code&gt; |  [optional]
**funding** | **String** | Grant number or funding authority |  [optional]
**fundingList** | [**List&lt;FundingCreate&gt;**](FundingCreate.md) | Funding creation / update items |  [optional]
**license** | **Long** | License id for this article. |  [optional]
**doi** | **String** | Not applicable for regular users. In an institutional case, make sure your group supports setting DOIs. This setting is applied by figshare via opening a ticket through our support/helpdesk system. |  [optional]
**handle** | **String** | Not applicable for regular users. In an institutional case, make sure your group supports setting Handles. This setting is applied by figshare via opening a ticket through our support/helpdesk system. |  [optional]
**resourceDoi** | **String** | Not applicable to regular users. In a publisher case, this is the publisher article DOI. |  [optional]
**resourceTitle** | **String** | Not applicable to regular users. In a publisher case, this is the publisher article title. |  [optional]
**timeline** | [**TimelineUpdate**](TimelineUpdate.md) | Various timeline dates |  [optional]




# \ArticlesApi

All URIs are relative to *https://api.figinternal.dev/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AccountArticleReport**](ArticlesApi.md#AccountArticleReport) | **Get** /account/articles/export | Account Article Report
[**AccountArticleReportGenerate**](ArticlesApi.md#AccountArticleReportGenerate) | **Post** /account/articles/export | Initiate a new Report
[**ArticleDetails**](ArticlesApi.md#ArticleDetails) | **Get** /articles/{article_id} | View article details
[**ArticleFileDetails**](ArticlesApi.md#ArticleFileDetails) | **Get** /articles/{article_id}/files/{file_id} | Article file details
[**ArticleFiles**](ArticlesApi.md#ArticleFiles) | **Get** /articles/{article_id}/files | List article files
[**ArticleVersionConfidentiality**](ArticlesApi.md#ArticleVersionConfidentiality) | **Get** /articles/{article_id}/versions/{v_number}/confidentiality | Public Article Confidentiality for article version
[**ArticleVersionDetails**](ArticlesApi.md#ArticleVersionDetails) | **Get** /articles/{article_id}/versions/{v_number} | Article details for version
[**ArticleVersionEmbargo**](ArticlesApi.md#ArticleVersionEmbargo) | **Get** /articles/{article_id}/versions/{v_number}/embargo | Public Article Embargo for article version
[**ArticleVersionUpdate**](ArticlesApi.md#ArticleVersionUpdate) | **Put** /account/articles/{article_id}/versions/{version_id}/ | Update article version
[**ArticleVersionUpdateThumb**](ArticlesApi.md#ArticleVersionUpdateThumb) | **Put** /account/articles/{article_id}/versions/{version_id}/update_thumb | Update article version thumbnail
[**ArticleVersions**](ArticlesApi.md#ArticleVersions) | **Get** /articles/{article_id}/versions | List article versions
[**ArticlesList**](ArticlesApi.md#ArticlesList) | **Get** /articles | Public Articles
[**ArticlesSearch**](ArticlesApi.md#ArticlesSearch) | **Post** /articles/search | Public Articles Search
[**PrivateArticleAuthorDelete**](ArticlesApi.md#PrivateArticleAuthorDelete) | **Delete** /account/articles/{article_id}/authors/{author_id} | Delete article author
[**PrivateArticleAuthorsAdd**](ArticlesApi.md#PrivateArticleAuthorsAdd) | **Post** /account/articles/{article_id}/authors | Add article authors
[**PrivateArticleAuthorsList**](ArticlesApi.md#PrivateArticleAuthorsList) | **Get** /account/articles/{article_id}/authors | List article authors
[**PrivateArticleAuthorsReplace**](ArticlesApi.md#PrivateArticleAuthorsReplace) | **Put** /account/articles/{article_id}/authors | Replace article authors
[**PrivateArticleCategoriesAdd**](ArticlesApi.md#PrivateArticleCategoriesAdd) | **Post** /account/articles/{article_id}/categories | Add article categories
[**PrivateArticleCategoriesList**](ArticlesApi.md#PrivateArticleCategoriesList) | **Get** /account/articles/{article_id}/categories | List article categories
[**PrivateArticleCategoriesReplace**](ArticlesApi.md#PrivateArticleCategoriesReplace) | **Put** /account/articles/{article_id}/categories | Replace article categories
[**PrivateArticleCategoryDelete**](ArticlesApi.md#PrivateArticleCategoryDelete) | **Delete** /account/articles/{article_id}/categories/{category_id} | Delete article category
[**PrivateArticleConfidentialityDelete**](ArticlesApi.md#PrivateArticleConfidentialityDelete) | **Delete** /account/articles/{article_id}/confidentiality | Delete article confidentiality
[**PrivateArticleConfidentialityDetails**](ArticlesApi.md#PrivateArticleConfidentialityDetails) | **Get** /account/articles/{article_id}/confidentiality | Article confidentiality details
[**PrivateArticleConfidentialityUpdate**](ArticlesApi.md#PrivateArticleConfidentialityUpdate) | **Put** /account/articles/{article_id}/confidentiality | Update article confidentiality
[**PrivateArticleCreate**](ArticlesApi.md#PrivateArticleCreate) | **Post** /account/articles | Create new Article
[**PrivateArticleDelete**](ArticlesApi.md#PrivateArticleDelete) | **Delete** /account/articles/{article_id} | Delete article
[**PrivateArticleDetails**](ArticlesApi.md#PrivateArticleDetails) | **Get** /account/articles/{article_id} | Article details
[**PrivateArticleEmbargoDelete**](ArticlesApi.md#PrivateArticleEmbargoDelete) | **Delete** /account/articles/{article_id}/embargo | Delete Article Embargo
[**PrivateArticleEmbargoDetails**](ArticlesApi.md#PrivateArticleEmbargoDetails) | **Get** /account/articles/{article_id}/embargo | Article Embargo Details
[**PrivateArticleEmbargoUpdate**](ArticlesApi.md#PrivateArticleEmbargoUpdate) | **Put** /account/articles/{article_id}/embargo | Update Article Embargo
[**PrivateArticleFile**](ArticlesApi.md#PrivateArticleFile) | **Get** /account/articles/{article_id}/files/{file_id} | Single File
[**PrivateArticleFileDelete**](ArticlesApi.md#PrivateArticleFileDelete) | **Delete** /account/articles/{article_id}/files/{file_id} | File Delete
[**PrivateArticleFilesList**](ArticlesApi.md#PrivateArticleFilesList) | **Get** /account/articles/{article_id}/files | List article files
[**PrivateArticlePrivateLink**](ArticlesApi.md#PrivateArticlePrivateLink) | **Get** /account/articles/{article_id}/private_links | List private links
[**PrivateArticlePrivateLinkCreate**](ArticlesApi.md#PrivateArticlePrivateLinkCreate) | **Post** /account/articles/{article_id}/private_links | Create private link
[**PrivateArticlePrivateLinkDelete**](ArticlesApi.md#PrivateArticlePrivateLinkDelete) | **Delete** /account/articles/{article_id}/private_links/{link_id} | Disable private link
[**PrivateArticlePrivateLinkUpdate**](ArticlesApi.md#PrivateArticlePrivateLinkUpdate) | **Put** /account/articles/{article_id}/private_links/{link_id} | Update private link
[**PrivateArticlePublish**](ArticlesApi.md#PrivateArticlePublish) | **Post** /account/articles/{article_id}/publish | Private Article Publish
[**PrivateArticleReserveDoi**](ArticlesApi.md#PrivateArticleReserveDoi) | **Post** /account/articles/{article_id}/reserve_doi | Private Article Reserve DOI
[**PrivateArticleReserveHandle**](ArticlesApi.md#PrivateArticleReserveHandle) | **Post** /account/articles/{article_id}/reserve_handle | Private Article Reserve Handle
[**PrivateArticleResource**](ArticlesApi.md#PrivateArticleResource) | **Post** /account/articles/{article_id}/resource | Private Article Resource
[**PrivateArticleUpdate**](ArticlesApi.md#PrivateArticleUpdate) | **Put** /account/articles/{article_id} | Update article
[**PrivateArticleUploadComplete**](ArticlesApi.md#PrivateArticleUploadComplete) | **Post** /account/articles/{article_id}/files/{file_id} | Complete Upload
[**PrivateArticleUploadInitiate**](ArticlesApi.md#PrivateArticleUploadInitiate) | **Post** /account/articles/{article_id}/files | Initiate Upload
[**PrivateArticlesList**](ArticlesApi.md#PrivateArticlesList) | **Get** /account/articles | Private Articles
[**PrivateArticlesSearch**](ArticlesApi.md#PrivateArticlesSearch) | **Post** /account/articles/search | Private Articles search


# **AccountArticleReport**
> []AccountReport AccountArticleReport($groupId)

Account Article Report

Return status on all reports generated for the account from the oauth credentials


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **int64**| A group ID to filter by | [optional] 

### Return type

[**[]AccountReport**](AccountReport.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AccountArticleReportGenerate**
> AccountReport AccountArticleReportGenerate()

Initiate a new Report

Initiate a new Article Report for this Account. There is a limit of 1 report per day.


### Parameters
This endpoint does not need any parameter.

### Return type

[**AccountReport**](AccountReport.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ArticleDetails**
> ArticleComplete ArticleDetails($articleId)

View article details

View an article


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article Unique identifier | 

### Return type

[**ArticleComplete**](ArticleComplete.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ArticleFileDetails**
> PublicFile ArticleFileDetails($articleId, $fileId)

Article file details

File by id


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article Unique identifier | 
 **fileId** | **int64**| File Unique identifier | 

### Return type

[**PublicFile**](PublicFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ArticleFiles**
> []PublicFile ArticleFiles($articleId)

List article files

Files list for article


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article Unique identifier | 

### Return type

[**[]PublicFile**](PublicFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ArticleVersionConfidentiality**
> ArticleConfidentiality ArticleVersionConfidentiality($articleId, $vNumber)

Public Article Confidentiality for article version

Confidentiality for article version. The confidentiality feature is now deprecated. This has been replaced by the new extended embargo functionality and all items that used to be confidential have now been migrated to items with a permanent embargo on files. All API endpoints related to this functionality will remain for backwards compatibility, but will now be attached to the new extended embargo workflows.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article Unique identifier | 
 **vNumber** | **int64**| Version Number | 

### Return type

[**ArticleConfidentiality**](ArticleConfidentiality.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ArticleVersionDetails**
> ArticleComplete ArticleVersionDetails($articleId, $vNumber)

Article details for version

Article with specified version


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article Unique identifier | 
 **vNumber** | **int64**| Article Version Number | 

### Return type

[**ArticleComplete**](ArticleComplete.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ArticleVersionEmbargo**
> ArticleEmbargo ArticleVersionEmbargo($articleId, $vNumber)

Public Article Embargo for article version

Embargo for article version


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article Unique identifier | 
 **vNumber** | **int64**| Version Number | 

### Return type

[**ArticleEmbargo**](ArticleEmbargo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ArticleVersionUpdate**
> LocationWarningsUpdate ArticleVersionUpdate($articleId, $versionId, $article)

Update article version

Updating an article version by passing body parameters; request can also be made with the PATCH method.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article unique identifier | 
 **versionId** | **int64**| Article version identifier | 
 **article** | [**ArticleUpdate**](ArticleUpdate.md)| Article description | 

### Return type

[**LocationWarningsUpdate**](LocationWarningsUpdate.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ArticleVersionUpdateThumb**
> ArticleVersionUpdateThumb($articleId, $versionId, $fileId)

Update article version thumbnail

For a given public article version update the article thumbnail by choosing one of the associated files


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article unique identifier | 
 **versionId** | **int64**| Article version identifier | 
 **fileId** | [**FileId**](FileId.md)| File ID | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ArticleVersions**
> []ArticleVersions ArticleVersions($articleId)

List article versions

List public article versions


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article Unique identifier | 

### Return type

[**[]ArticleVersions**](ArticleVersions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ArticlesList**
> []Article ArticlesList($xCursor, $page, $pageSize, $limit, $offset, $order, $orderDirection, $institution, $publishedSince, $modifiedSince, $group, $resourceDoi, $itemType, $doi, $handle)

Public Articles

Returns a list of public articles


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xCursor** | **string**| Unique hash used for bypassing the item retrieval limit of 9,000 entities. When using this parameter, please note that the offset parameter will not be available, but the limit parameter will still work as expected. | [optional] 
 **page** | **int64**| Page number. Used for pagination with page_size | [optional] 
 **pageSize** | **int64**| The number of results included on a page. Used for pagination with page | [optional] [default to 10]
 **limit** | **int64**| Number of results included on a page. Used for pagination with query | [optional] 
 **offset** | **int64**| Where to start the listing(the offset of the first result). Used for pagination with limit | [optional] 
 **order** | **string**| The field by which to order. Default varies by endpoint/resource. | [optional] [default to published_date]
 **orderDirection** | **string**|  | [optional] [default to desc]
 **institution** | **int64**| only return articles from this institution | [optional] 
 **publishedSince** | **string**| Filter by article publishing date. Will only return articles published after the date. date(ISO 8601) YYYY-MM-DD | [optional] 
 **modifiedSince** | **string**| Filter by article modified date. Will only return articles published after the date. date(ISO 8601) YYYY-MM-DD | [optional] 
 **group** | **int64**| only return articles from this group | [optional] 
 **resourceDoi** | **string**| only return articles with this resource_doi | [optional] 
 **itemType** | **int64**| Only return articles with the respective type. Mapping for item_type is: 1 - Figure, 2 - Media, 3 - Dataset, 5 - Poster, 6 - Journal contribution, 7 - Presentation, 8 - Thesis, 9 - Software, 11 - Online resource, 12 - Preprint, 13 - Book, 14 - Conference contribution, 15 - Chapter, 16 - Peer review, 17 - Educational resource, 18 - Report, 19 - Standard, 20 - Composition, 21 - Funding, 22 - Physical object, 23 - Data management plan, 24 - Workflow, 25 - Monograph, 26 - Performance, 27 - Event, 28 - Service, 29 - Model | [optional] 
 **doi** | **string**| only return articles with this doi | [optional] 
 **handle** | **string**| only return articles with this handle | [optional] 

### Return type

[**[]Article**](Article.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ArticlesSearch**
> []ArticleWithProject ArticlesSearch($xCursor, $search)

Public Articles Search

Returns a list of public articles, filtered by the search parameters


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xCursor** | **string**| Unique hash used for bypassing the item retrieval limit of 9,000 entities. When using this parameter, please note that the offset parameter will not be available, but the limit parameter will still work as expected. | [optional] 
 **search** | [**ArticleSearch**](ArticleSearch.md)| Search Parameters | [optional] 

### Return type

[**[]ArticleWithProject**](ArticleWithProject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateArticleAuthorDelete**
> PrivateArticleAuthorDelete($articleId, $authorId)

Delete article author

De-associate author from article


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article unique identifier | 
 **authorId** | **int64**| Article Author unique identifier | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateArticleAuthorsAdd**
> PrivateArticleAuthorsAdd($articleId, $authors)

Add article authors

Associate new authors with the article. This will add new authors to the list of already associated authors


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article unique identifier | 
 **authors** | [**AuthorsCreator**](AuthorsCreator.md)| Authors description | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateArticleAuthorsList**
> []Author PrivateArticleAuthorsList($articleId)

List article authors

List article authors


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article unique identifier | 

### Return type

[**[]Author**](Author.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateArticleAuthorsReplace**
> PrivateArticleAuthorsReplace($articleId, $authors)

Replace article authors

Associate new authors with the article. This will remove all already associated authors and add these new ones


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article unique identifier | 
 **authors** | [**AuthorsCreator**](AuthorsCreator.md)| Authors description | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateArticleCategoriesAdd**
> PrivateArticleCategoriesAdd($articleId, $categories)

Add article categories

Associate new categories with the article. This will add new categories to the list of already associated categories


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article unique identifier | 
 **categories** | [**CategoriesCreator**](CategoriesCreator.md)|  | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateArticleCategoriesList**
> []Category PrivateArticleCategoriesList($articleId)

List article categories

List article categories


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article unique identifier | 

### Return type

[**[]Category**](Category.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateArticleCategoriesReplace**
> PrivateArticleCategoriesReplace($articleId, $categories)

Replace article categories

Associate new categories with the article. This will remove all already associated categories and add these new ones


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article unique identifier | 
 **categories** | [**CategoriesCreator**](CategoriesCreator.md)|  | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateArticleCategoryDelete**
> PrivateArticleCategoryDelete($articleId, $categoryId)

Delete article category

De-associate category from article


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article unique identifier | 
 **categoryId** | **int64**| Category unique identifier | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateArticleConfidentialityDelete**
> PrivateArticleConfidentialityDelete($articleId)

Delete article confidentiality

Delete confidentiality settings. The confidentiality feature is now deprecated. This has been replaced by the new extended embargo functionality and all items that used to be confidential have now been migrated to items with a permanent embargo on files. All API endpoints related to this functionality will remain for backwards compatibility, but will now be attached to the new extended embargo workflows.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article unique identifier | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateArticleConfidentialityDetails**
> ArticleConfidentiality PrivateArticleConfidentialityDetails($articleId)

Article confidentiality details

View confidentiality settings. The confidentiality feature is now deprecated. This has been replaced by the new extended embargo functionality and all items that used to be confidential have now been migrated to items with a permanent embargo on files. All API endpoints related to this functionality will remain for backwards compatibility, but will now be attached to the new extended embargo workflows.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article unique identifier | 

### Return type

[**ArticleConfidentiality**](ArticleConfidentiality.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateArticleConfidentialityUpdate**
> PrivateArticleConfidentialityUpdate($articleId, $reason)

Update article confidentiality

Update confidentiality settings. The confidentiality feature is now deprecated. This has been replaced by the new extended embargo functionality and all items that used to be confidential have now been migrated to items with a permanent embargo on files. All API endpoints related to this functionality will remain for backwards compatibility, but will now be attached to the new extended embargo workflows.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article unique identifier | 
 **reason** | [**ConfidentialityCreator**](ConfidentialityCreator.md)|  | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateArticleCreate**
> LocationWarnings PrivateArticleCreate($article)

Create new Article

Create a new Article by sending article information


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **article** | [**ArticleCreate**](ArticleCreate.md)| Article description | 

### Return type

[**LocationWarnings**](LocationWarnings.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateArticleDelete**
> PrivateArticleDelete($articleId)

Delete article

Delete an article


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article unique identifier | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateArticleDetails**
> ArticleCompletePrivate PrivateArticleDetails($articleId)

Article details

View a private article


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article unique identifier | 

### Return type

[**ArticleCompletePrivate**](ArticleCompletePrivate.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateArticleEmbargoDelete**
> PrivateArticleEmbargoDelete($articleId)

Delete Article Embargo

Will lift the embargo for the specified article


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article unique identifier | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateArticleEmbargoDetails**
> ArticleEmbargo PrivateArticleEmbargoDetails($articleId)

Article Embargo Details

View a private article embargo details


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article unique identifier | 

### Return type

[**ArticleEmbargo**](ArticleEmbargo.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateArticleEmbargoUpdate**
> PrivateArticleEmbargoUpdate($articleId, $embargo)

Update Article Embargo

Note: setting an article under whole embargo does not imply that the article will be published when the embargo will expire. You must explicitly call the publish endpoint to enable this functionality.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article unique identifier | 
 **embargo** | [**ArticleEmbargoUpdater**](ArticleEmbargoUpdater.md)| Embargo description | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateArticleFile**
> PrivateFile PrivateArticleFile($articleId, $fileId)

Single File

View details of file for specified article


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article unique identifier | 
 **fileId** | **int64**| File unique identifier | 

### Return type

[**PrivateFile**](PrivateFile.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateArticleFileDelete**
> PrivateArticleFileDelete($articleId, $fileId)

File Delete

Complete file upload


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article unique identifier | 
 **fileId** | **int64**| File unique identifier | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateArticleFilesList**
> []PrivateFile PrivateArticleFilesList($articleId)

List article files

List private files


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article unique identifier | 

### Return type

[**[]PrivateFile**](PrivateFile.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateArticlePrivateLink**
> []PrivateLink PrivateArticlePrivateLink($articleId)

List private links

List private links


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article unique identifier | 

### Return type

[**[]PrivateLink**](PrivateLink.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateArticlePrivateLinkCreate**
> PrivateLinkResponse PrivateArticlePrivateLinkCreate($articleId, $privateLink)

Create private link

Create new private link for this article


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article unique identifier | 
 **privateLink** | [**PrivateLinkCreator**](PrivateLinkCreator.md)|  | [optional] 

### Return type

[**PrivateLinkResponse**](PrivateLinkResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateArticlePrivateLinkDelete**
> PrivateArticlePrivateLinkDelete($articleId, $linkId)

Disable private link

Disable/delete private link for this article


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article unique identifier | 
 **linkId** | **string**| Private link token | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateArticlePrivateLinkUpdate**
> PrivateArticlePrivateLinkUpdate($articleId, $linkId, $privateLink)

Update private link

Update existing private link for this article


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article unique identifier | 
 **linkId** | **string**| Private link token | 
 **privateLink** | [**PrivateLinkCreator**](PrivateLinkCreator.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateArticlePublish**
> Location PrivateArticlePublish($articleId)

Private Article Publish

- If the whole article is under embargo, it will not be published immediately, but when the embargo expires or is lifted. - When an article is published, a new public version will be generated. Any further updates to the article will affect the private article data. In order to make these changes publicly visible, an explicit publish operation is needed.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article unique identifier | 

### Return type

[**Location**](Location.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateArticleReserveDoi**
> ArticleDoi PrivateArticleReserveDoi($articleId)

Private Article Reserve DOI

Reserve DOI for article


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article unique identifier | 

### Return type

[**ArticleDoi**](ArticleDOI.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateArticleReserveHandle**
> ArticleHandle PrivateArticleReserveHandle($articleId)

Private Article Reserve Handle

Reserve Handle for article


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article unique identifier | 

### Return type

[**ArticleHandle**](ArticleHandle.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateArticleResource**
> Location PrivateArticleResource($articleId, $resource)

Private Article Resource

Edit article resource data.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article unique identifier | 
 **resource** | [**Resource**](Resource.md)| Resource data | 

### Return type

[**Location**](Location.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateArticleUpdate**
> LocationWarningsUpdate PrivateArticleUpdate($articleId, $article)

Update article

Updating an article by passing body parameters; request can also be made with the PATCH method.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article unique identifier | 
 **article** | [**ArticleUpdate**](ArticleUpdate.md)| Article description | 

### Return type

[**LocationWarningsUpdate**](LocationWarningsUpdate.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateArticleUploadComplete**
> PrivateArticleUploadComplete($articleId, $fileId)

Complete Upload

Complete file upload


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article unique identifier | 
 **fileId** | **int64**| File unique identifier | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateArticleUploadInitiate**
> Location PrivateArticleUploadInitiate($articleId, $file)

Initiate Upload

Initiate a new file upload within the article. Either use the link property to point to an existing file that resides elsewhere and will not be uploaded to Figshare or use the other 3 parameters (md5, name, size).


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **articleId** | **int64**| Article unique identifier | 
 **file** | [**FileCreator**](FileCreator.md)|  | 

### Return type

[**Location**](Location.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateArticlesList**
> []Article PrivateArticlesList($page, $pageSize, $limit, $offset)

Private Articles

Get Own Articles


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int64**| Page number. Used for pagination with page_size | [optional] 
 **pageSize** | **int64**| The number of results included on a page. Used for pagination with page | [optional] [default to 10]
 **limit** | **int64**| Number of results included on a page. Used for pagination with query | [optional] 
 **offset** | **int64**| Where to start the listing(the offset of the first result). Used for pagination with limit | [optional] 

### Return type

[**[]Article**](Article.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateArticlesSearch**
> []ArticleWithProject PrivateArticlesSearch($search)

Private Articles search

Returns a list of private articles filtered by the search parameters


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | [**PrivateArticleSearch**](PrivateArticleSearch.md)| Search Parameters | 

### Return type

[**[]ArticleWithProject**](ArticleWithProject.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


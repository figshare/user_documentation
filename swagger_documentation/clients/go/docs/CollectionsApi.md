# \CollectionsApi

All URIs are relative to *https://api.figinternal.dev/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CollectionArticles**](CollectionsApi.md#CollectionArticles) | **Get** /collections/{collection_id}/articles | Public Collection Articles
[**CollectionDetails**](CollectionsApi.md#CollectionDetails) | **Get** /collections/{collection_id} | Collection details
[**CollectionVersionDetails**](CollectionsApi.md#CollectionVersionDetails) | **Get** /collections/{collection_id}/versions/{version_id} | Collection Version details
[**CollectionVersions**](CollectionsApi.md#CollectionVersions) | **Get** /collections/{collection_id}/versions | Collection Versions list
[**CollectionsList**](CollectionsApi.md#CollectionsList) | **Get** /collections | Public Collections
[**CollectionsSearch**](CollectionsApi.md#CollectionsSearch) | **Post** /collections/search | Public Collections Search
[**PrivateCollectionArticleDelete**](CollectionsApi.md#PrivateCollectionArticleDelete) | **Delete** /account/collections/{collection_id}/articles/{article_id} | Delete collection article
[**PrivateCollectionArticlesAdd**](CollectionsApi.md#PrivateCollectionArticlesAdd) | **Post** /account/collections/{collection_id}/articles | Add collection articles
[**PrivateCollectionArticlesList**](CollectionsApi.md#PrivateCollectionArticlesList) | **Get** /account/collections/{collection_id}/articles | List collection articles
[**PrivateCollectionArticlesReplace**](CollectionsApi.md#PrivateCollectionArticlesReplace) | **Put** /account/collections/{collection_id}/articles | Replace collection articles
[**PrivateCollectionAuthorDelete**](CollectionsApi.md#PrivateCollectionAuthorDelete) | **Delete** /account/collections/{collection_id}/authors/{author_id} | Delete collection author
[**PrivateCollectionAuthorsAdd**](CollectionsApi.md#PrivateCollectionAuthorsAdd) | **Post** /account/collections/{collection_id}/authors | Add collection authors
[**PrivateCollectionAuthorsList**](CollectionsApi.md#PrivateCollectionAuthorsList) | **Get** /account/collections/{collection_id}/authors | List collection authors
[**PrivateCollectionAuthorsReplace**](CollectionsApi.md#PrivateCollectionAuthorsReplace) | **Put** /account/collections/{collection_id}/authors | Replace collection authors
[**PrivateCollectionCategoriesAdd**](CollectionsApi.md#PrivateCollectionCategoriesAdd) | **Post** /account/collections/{collection_id}/categories | Add collection categories
[**PrivateCollectionCategoriesList**](CollectionsApi.md#PrivateCollectionCategoriesList) | **Get** /account/collections/{collection_id}/categories | List collection categories
[**PrivateCollectionCategoriesReplace**](CollectionsApi.md#PrivateCollectionCategoriesReplace) | **Put** /account/collections/{collection_id}/categories | Replace collection categories
[**PrivateCollectionCategoryDelete**](CollectionsApi.md#PrivateCollectionCategoryDelete) | **Delete** /account/collections/{collection_id}/categories/{category_id} | Delete collection category
[**PrivateCollectionCreate**](CollectionsApi.md#PrivateCollectionCreate) | **Post** /account/collections | Create collection
[**PrivateCollectionDelete**](CollectionsApi.md#PrivateCollectionDelete) | **Delete** /account/collections/{collection_id} | Delete collection
[**PrivateCollectionDetails**](CollectionsApi.md#PrivateCollectionDetails) | **Get** /account/collections/{collection_id} | Collection details
[**PrivateCollectionPrivateLinkCreate**](CollectionsApi.md#PrivateCollectionPrivateLinkCreate) | **Post** /account/collections/{collection_id}/private_links | Create collection private link
[**PrivateCollectionPrivateLinkDelete**](CollectionsApi.md#PrivateCollectionPrivateLinkDelete) | **Delete** /account/collections/{collection_id}/private_links/{link_id} | Disable private link
[**PrivateCollectionPrivateLinkUpdate**](CollectionsApi.md#PrivateCollectionPrivateLinkUpdate) | **Put** /account/collections/{collection_id}/private_links/{link_id} | Update collection private link
[**PrivateCollectionPrivateLinksList**](CollectionsApi.md#PrivateCollectionPrivateLinksList) | **Get** /account/collections/{collection_id}/private_links | List collection private links
[**PrivateCollectionPublish**](CollectionsApi.md#PrivateCollectionPublish) | **Post** /account/collections/{collection_id}/publish | Private Collection Publish
[**PrivateCollectionReserveDoi**](CollectionsApi.md#PrivateCollectionReserveDoi) | **Post** /account/collections/{collection_id}/reserve_doi | Private Collection Reserve DOI
[**PrivateCollectionReserveHandle**](CollectionsApi.md#PrivateCollectionReserveHandle) | **Post** /account/collections/{collection_id}/reserve_handle | Private Collection Reserve Handle
[**PrivateCollectionResource**](CollectionsApi.md#PrivateCollectionResource) | **Post** /account/collections/{collection_id}/resource | Private Collection Resource
[**PrivateCollectionUpdate**](CollectionsApi.md#PrivateCollectionUpdate) | **Put** /account/collections/{collection_id} | Update collection
[**PrivateCollectionsList**](CollectionsApi.md#PrivateCollectionsList) | **Get** /account/collections | Private Collections List
[**PrivateCollectionsSearch**](CollectionsApi.md#PrivateCollectionsSearch) | **Post** /account/collections/search | Private Collections Search


# **CollectionArticles**
> []Article CollectionArticles($collectionId, $page, $pageSize, $limit, $offset)

Public Collection Articles

Returns a list of public collection articles


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **int64**| Collection Unique identifier | 
 **page** | **int64**| Page number. Used for pagination with page_size | [optional] 
 **pageSize** | **int64**| The number of results included on a page. Used for pagination with page | [optional] [default to 10]
 **limit** | **int64**| Number of results included on a page. Used for pagination with query | [optional] 
 **offset** | **int64**| Where to start the listing(the offset of the first result). Used for pagination with limit | [optional] 

### Return type

[**[]Article**](Article.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CollectionDetails**
> CollectionComplete CollectionDetails($collectionId)

Collection details

View a collection


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **int64**| Collection Unique identifier | 

### Return type

[**CollectionComplete**](CollectionComplete.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CollectionVersionDetails**
> CollectionComplete CollectionVersionDetails($collectionId, $versionId)

Collection Version details

View details for a certain version of a collection


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **int64**| Collection Unique identifier | 
 **versionId** | **int64**| Version Number | 

### Return type

[**CollectionComplete**](CollectionComplete.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CollectionVersions**
> []CollectionVersions CollectionVersions($collectionId)

Collection Versions list

Returns a list of public collection Versions


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **int64**| Collection Unique identifier | 

### Return type

[**[]CollectionVersions**](CollectionVersions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CollectionsList**
> []Collection CollectionsList($xCursor, $page, $pageSize, $limit, $offset, $order, $orderDirection, $institution, $publishedSince, $modifiedSince, $group, $resourceDoi, $doi, $handle)

Public Collections

Returns a list of public collections


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
 **institution** | **int64**| only return collections from this institution | [optional] 
 **publishedSince** | **string**| Filter by collection publishing date. Will only return collections published after the date. date(ISO 8601) YYYY-MM-DD | [optional] 
 **modifiedSince** | **string**| Filter by collection modified date. Will only return collections published after the date. date(ISO 8601) YYYY-MM-DD | [optional] 
 **group** | **int64**| only return collections from this group | [optional] 
 **resourceDoi** | **string**| only return collections with this resource_doi | [optional] 
 **doi** | **string**| only return collections with this doi | [optional] 
 **handle** | **string**| only return collections with this handle | [optional] 

### Return type

[**[]Collection**](Collection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CollectionsSearch**
> []Collection CollectionsSearch($xCursor, $search)

Public Collections Search

Returns a list of public collections


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xCursor** | **string**| Unique hash used for bypassing the item retrieval limit of 9,000 entities. When using this parameter, please note that the offset parameter will not be available, but the limit parameter will still work as expected. | [optional] 
 **search** | [**CollectionSearch**](CollectionSearch.md)| Search Parameters | [optional] 

### Return type

[**[]Collection**](Collection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateCollectionArticleDelete**
> PrivateCollectionArticleDelete($collectionId, $articleId)

Delete collection article

De-associate article from collection


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **int64**| Collection unique identifier | 
 **articleId** | **int64**| Collection article unique identifier | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateCollectionArticlesAdd**
> Location PrivateCollectionArticlesAdd($collectionId, $articles)

Add collection articles

Associate new articles with the collection. This will add new articles to the list of already associated articles


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **int64**| Collection unique identifier | 
 **articles** | [**ArticlesCreator**](ArticlesCreator.md)| Articles list | 

### Return type

[**Location**](Location.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateCollectionArticlesList**
> []Article PrivateCollectionArticlesList($collectionId, $page, $pageSize, $limit, $offset)

List collection articles

List collection articles


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **int64**| Collection unique identifier | 
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

# **PrivateCollectionArticlesReplace**
> PrivateCollectionArticlesReplace($collectionId, $articles)

Replace collection articles

Associate new articles with the collection. This will remove all already associated articles and add these new ones


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **int64**| Collection unique identifier | 
 **articles** | [**ArticlesCreator**](ArticlesCreator.md)| Articles List | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateCollectionAuthorDelete**
> PrivateCollectionAuthorDelete($collectionId, $authorId)

Delete collection author

Delete collection author


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **int64**| Collection unique identifier | 
 **authorId** | **int64**| Collection Author unique identifier | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateCollectionAuthorsAdd**
> Location PrivateCollectionAuthorsAdd($collectionId, $authors)

Add collection authors

Associate new authors with the collection. This will add new authors to the list of already associated authors


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **int64**| Collection unique identifier | 
 **authors** | [**AuthorsCreator**](AuthorsCreator.md)| List of authors | 

### Return type

[**Location**](Location.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateCollectionAuthorsList**
> []Author PrivateCollectionAuthorsList($collectionId)

List collection authors

List collection authors


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **int64**| Collection unique identifier | 

### Return type

[**[]Author**](Author.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateCollectionAuthorsReplace**
> PrivateCollectionAuthorsReplace($collectionId, $authors)

Replace collection authors

Associate new authors with the collection. This will remove all already associated authors and add these new ones


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **int64**| Collection unique identifier | 
 **authors** | [**AuthorsCreator**](AuthorsCreator.md)| List of authors | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateCollectionCategoriesAdd**
> Location PrivateCollectionCategoriesAdd($collectionId, $categories)

Add collection categories

Associate new categories with the collection. This will add new categories to the list of already associated categories


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **int64**| Collection unique identifier | 
 **categories** | [**CategoriesCreator**](CategoriesCreator.md)| Categories list | 

### Return type

[**Location**](Location.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateCollectionCategoriesList**
> []Category PrivateCollectionCategoriesList($collectionId)

List collection categories

List collection categories


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **int64**| Collection unique identifier | 

### Return type

[**[]Category**](Category.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateCollectionCategoriesReplace**
> PrivateCollectionCategoriesReplace($collectionId, $categories)

Replace collection categories

Associate new categories with the collection. This will remove all already associated categories and add these new ones


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **int64**| Collection unique identifier | 
 **categories** | [**CategoriesCreator**](CategoriesCreator.md)| Categories list | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateCollectionCategoryDelete**
> PrivateCollectionCategoryDelete($collectionId, $categoryId)

Delete collection category

De-associate category from collection


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **int64**| Collection unique identifier | 
 **categoryId** | **int64**| Collection category unique identifier | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateCollectionCreate**
> LocationWarnings PrivateCollectionCreate($collection)

Create collection

Create a new Collection by sending collection information


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collection** | [**CollectionCreate**](CollectionCreate.md)| Collection description | 

### Return type

[**LocationWarnings**](LocationWarnings.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateCollectionDelete**
> PrivateCollectionDelete($collectionId)

Delete collection

Delete n collection


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **int64**| Collection Unique identifier | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateCollectionDetails**
> CollectionCompletePrivate PrivateCollectionDetails($collectionId)

Collection details

View a collection


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **int64**| Collection Unique identifier | 

### Return type

[**CollectionCompletePrivate**](CollectionCompletePrivate.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateCollectionPrivateLinkCreate**
> PrivateLinkResponse PrivateCollectionPrivateLinkCreate($collectionId, $privateLink)

Create collection private link

Create new private link


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **int64**| Collection unique identifier | 
 **privateLink** | [**CollectionPrivateLinkCreator**](CollectionPrivateLinkCreator.md)|  | [optional] 

### Return type

[**PrivateLinkResponse**](PrivateLinkResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateCollectionPrivateLinkDelete**
> PrivateCollectionPrivateLinkDelete($collectionId, $linkId)

Disable private link

Disable/delete private link for this collection


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **int64**| Collection unique identifier | 
 **linkId** | **string**| Private link token | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateCollectionPrivateLinkUpdate**
> PrivateCollectionPrivateLinkUpdate($collectionId, $linkId, $privateLink)

Update collection private link

Update existing private link for this collection


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **int64**| Collection unique identifier | 
 **linkId** | **string**| Private link token | 
 **privateLink** | [**CollectionPrivateLinkCreator**](CollectionPrivateLinkCreator.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateCollectionPrivateLinksList**
> []PrivateLink PrivateCollectionPrivateLinksList($collectionId)

List collection private links

List article private links


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **int64**| Collection unique identifier | 

### Return type

[**[]PrivateLink**](PrivateLink.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateCollectionPublish**
> Location PrivateCollectionPublish($collectionId)

Private Collection Publish

When a collection is published, a new public version will be generated. Any further updates to the collection will affect the private collection data. In order to make these changes publicly visible, an explicit publish operation is needed.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **int64**| Collection Unique identifier | 

### Return type

[**Location**](Location.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateCollectionReserveDoi**
> CollectionDoi PrivateCollectionReserveDoi($collectionId)

Private Collection Reserve DOI

Reserve DOI for collection


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **int64**| Collection Unique identifier | 

### Return type

[**CollectionDoi**](CollectionDOI.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateCollectionReserveHandle**
> CollectionHandle PrivateCollectionReserveHandle($collectionId)

Private Collection Reserve Handle

Reserve Handle for collection


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **int64**| Collection Unique identifier | 

### Return type

[**CollectionHandle**](CollectionHandle.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateCollectionResource**
> Location PrivateCollectionResource($collectionId, $resource)

Private Collection Resource

Edit collection resource data.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **int64**| Collection unique identifier | 
 **resource** | [**Resource**](Resource.md)| Resource data | 

### Return type

[**Location**](Location.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateCollectionUpdate**
> LocationWarningsUpdate PrivateCollectionUpdate($collectionId, $collection)

Update collection

Update collection details; request can also be made with the PATCH method.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **int64**| Collection Unique identifier | 
 **collection** | [**CollectionUpdate**](CollectionUpdate.md)| Collection description | 

### Return type

[**LocationWarningsUpdate**](LocationWarningsUpdate.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateCollectionsList**
> []Collection PrivateCollectionsList($page, $pageSize, $limit, $offset, $order, $orderDirection)

Private Collections List

List private collections


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int64**| Page number. Used for pagination with page_size | [optional] 
 **pageSize** | **int64**| The number of results included on a page. Used for pagination with page | [optional] [default to 10]
 **limit** | **int64**| Number of results included on a page. Used for pagination with query | [optional] 
 **offset** | **int64**| Where to start the listing(the offset of the first result). Used for pagination with limit | [optional] 
 **order** | **string**| The field by which to order. Default varies by endpoint/resource. | [optional] [default to published_date]
 **orderDirection** | **string**|  | [optional] [default to desc]

### Return type

[**[]Collection**](Collection.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateCollectionsSearch**
> []Collection PrivateCollectionsSearch($search)

Private Collections Search

Returns a list of private Collections


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | [**PrivateCollectionSearch**](PrivateCollectionSearch.md)| Search Parameters | 

### Return type

[**[]Collection**](Collection.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


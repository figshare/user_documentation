# CollectionsApi

All URIs are relative to *https://api.figinternal.dev/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**collectionArticles**](CollectionsApi.md#collectionArticles) | **GET** /collections/{collection_id}/articles | Public Collection Articles
[**collectionDetails**](CollectionsApi.md#collectionDetails) | **GET** /collections/{collection_id} | Collection details
[**collectionVersionDetails**](CollectionsApi.md#collectionVersionDetails) | **GET** /collections/{collection_id}/versions/{version_id} | Collection Version details
[**collectionVersions**](CollectionsApi.md#collectionVersions) | **GET** /collections/{collection_id}/versions | Collection Versions list
[**collectionsList**](CollectionsApi.md#collectionsList) | **GET** /collections | Public Collections
[**collectionsSearch**](CollectionsApi.md#collectionsSearch) | **POST** /collections/search | Public Collections Search
[**privateCollectionArticleDelete**](CollectionsApi.md#privateCollectionArticleDelete) | **DELETE** /account/collections/{collection_id}/articles/{article_id} | Delete collection article
[**privateCollectionArticlesAdd**](CollectionsApi.md#privateCollectionArticlesAdd) | **POST** /account/collections/{collection_id}/articles | Add collection articles
[**privateCollectionArticlesList**](CollectionsApi.md#privateCollectionArticlesList) | **GET** /account/collections/{collection_id}/articles | List collection articles
[**privateCollectionArticlesReplace**](CollectionsApi.md#privateCollectionArticlesReplace) | **PUT** /account/collections/{collection_id}/articles | Replace collection articles
[**privateCollectionAuthorDelete**](CollectionsApi.md#privateCollectionAuthorDelete) | **DELETE** /account/collections/{collection_id}/authors/{author_id} | Delete collection author
[**privateCollectionAuthorsAdd**](CollectionsApi.md#privateCollectionAuthorsAdd) | **POST** /account/collections/{collection_id}/authors | Add collection authors
[**privateCollectionAuthorsList**](CollectionsApi.md#privateCollectionAuthorsList) | **GET** /account/collections/{collection_id}/authors | List collection authors
[**privateCollectionAuthorsReplace**](CollectionsApi.md#privateCollectionAuthorsReplace) | **PUT** /account/collections/{collection_id}/authors | Replace collection authors
[**privateCollectionCategoriesAdd**](CollectionsApi.md#privateCollectionCategoriesAdd) | **POST** /account/collections/{collection_id}/categories | Add collection categories
[**privateCollectionCategoriesList**](CollectionsApi.md#privateCollectionCategoriesList) | **GET** /account/collections/{collection_id}/categories | List collection categories
[**privateCollectionCategoriesReplace**](CollectionsApi.md#privateCollectionCategoriesReplace) | **PUT** /account/collections/{collection_id}/categories | Replace collection categories
[**privateCollectionCategoryDelete**](CollectionsApi.md#privateCollectionCategoryDelete) | **DELETE** /account/collections/{collection_id}/categories/{category_id} | Delete collection category
[**privateCollectionCreate**](CollectionsApi.md#privateCollectionCreate) | **POST** /account/collections | Create collection
[**privateCollectionDelete**](CollectionsApi.md#privateCollectionDelete) | **DELETE** /account/collections/{collection_id} | Delete collection
[**privateCollectionDetails**](CollectionsApi.md#privateCollectionDetails) | **GET** /account/collections/{collection_id} | Collection details
[**privateCollectionPrivateLinkCreate**](CollectionsApi.md#privateCollectionPrivateLinkCreate) | **POST** /account/collections/{collection_id}/private_links | Create collection private link
[**privateCollectionPrivateLinkDelete**](CollectionsApi.md#privateCollectionPrivateLinkDelete) | **DELETE** /account/collections/{collection_id}/private_links/{link_id} | Disable private link
[**privateCollectionPrivateLinkUpdate**](CollectionsApi.md#privateCollectionPrivateLinkUpdate) | **PUT** /account/collections/{collection_id}/private_links/{link_id} | Update collection private link
[**privateCollectionPrivateLinksList**](CollectionsApi.md#privateCollectionPrivateLinksList) | **GET** /account/collections/{collection_id}/private_links | List collection private links
[**privateCollectionPublish**](CollectionsApi.md#privateCollectionPublish) | **POST** /account/collections/{collection_id}/publish | Private Collection Publish
[**privateCollectionReserveDoi**](CollectionsApi.md#privateCollectionReserveDoi) | **POST** /account/collections/{collection_id}/reserve_doi | Private Collection Reserve DOI
[**privateCollectionReserveHandle**](CollectionsApi.md#privateCollectionReserveHandle) | **POST** /account/collections/{collection_id}/reserve_handle | Private Collection Reserve Handle
[**privateCollectionResource**](CollectionsApi.md#privateCollectionResource) | **POST** /account/collections/{collection_id}/resource | Private Collection Resource
[**privateCollectionUpdate**](CollectionsApi.md#privateCollectionUpdate) | **PUT** /account/collections/{collection_id} | Update collection
[**privateCollectionsList**](CollectionsApi.md#privateCollectionsList) | **GET** /account/collections | Private Collections List
[**privateCollectionsSearch**](CollectionsApi.md#privateCollectionsSearch) | **POST** /account/collections/search | Private Collections Search


<a name="collectionArticles"></a>
# **collectionArticles**
> List&lt;Article&gt; collectionArticles(collectionId, page, pageSize, limit, offset)

Public Collection Articles

Returns a list of public collection articles

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
Long collectionId = 789L; // Long | Collection Unique identifier
Long page = 789L; // Long | Page number. Used for pagination with page_size
Long pageSize = 10L; // Long | The number of results included on a page. Used for pagination with page
Long limit = 789L; // Long | Number of results included on a page. Used for pagination with query
Long offset = 789L; // Long | Where to start the listing(the offset of the first result). Used for pagination with limit
try {
    List<Article> result = apiInstance.collectionArticles(collectionId, page, pageSize, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#collectionArticles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Long**| Collection Unique identifier |
 **page** | **Long**| Page number. Used for pagination with page_size | [optional]
 **pageSize** | **Long**| The number of results included on a page. Used for pagination with page | [optional] [default to 10]
 **limit** | **Long**| Number of results included on a page. Used for pagination with query | [optional]
 **offset** | **Long**| Where to start the listing(the offset of the first result). Used for pagination with limit | [optional]

### Return type

[**List&lt;Article&gt;**](Article.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="collectionDetails"></a>
# **collectionDetails**
> CollectionComplete collectionDetails(collectionId)

Collection details

View a collection

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
Long collectionId = 789L; // Long | Collection Unique identifier
try {
    CollectionComplete result = apiInstance.collectionDetails(collectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#collectionDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Long**| Collection Unique identifier |

### Return type

[**CollectionComplete**](CollectionComplete.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="collectionVersionDetails"></a>
# **collectionVersionDetails**
> CollectionComplete collectionVersionDetails(collectionId, versionId)

Collection Version details

View details for a certain version of a collection

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
Long collectionId = 789L; // Long | Collection Unique identifier
Long versionId = 789L; // Long | Version Number
try {
    CollectionComplete result = apiInstance.collectionVersionDetails(collectionId, versionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#collectionVersionDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Long**| Collection Unique identifier |
 **versionId** | **Long**| Version Number |

### Return type

[**CollectionComplete**](CollectionComplete.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="collectionVersions"></a>
# **collectionVersions**
> List&lt;CollectionVersions&gt; collectionVersions(collectionId)

Collection Versions list

Returns a list of public collection Versions

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
Long collectionId = 789L; // Long | Collection Unique identifier
try {
    List<CollectionVersions> result = apiInstance.collectionVersions(collectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#collectionVersions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Long**| Collection Unique identifier |

### Return type

[**List&lt;CollectionVersions&gt;**](CollectionVersions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="collectionsList"></a>
# **collectionsList**
> List&lt;Collection&gt; collectionsList(xCursor, page, pageSize, limit, offset, order, orderDirection, institution, publishedSince, modifiedSince, group, resourceDoi, doi, handle)

Public Collections

Returns a list of public collections

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
UUID xCursor = new UUID(); // UUID | Unique hash used for bypassing the item retrieval limit of 9,000 entities. When using this parameter, please note that the offset parameter will not be available, but the limit parameter will still work as expected.
Long page = 789L; // Long | Page number. Used for pagination with page_size
Long pageSize = 10L; // Long | The number of results included on a page. Used for pagination with page
Long limit = 789L; // Long | Number of results included on a page. Used for pagination with query
Long offset = 789L; // Long | Where to start the listing(the offset of the first result). Used for pagination with limit
String order = "published_date"; // String | The field by which to order. Default varies by endpoint/resource.
String orderDirection = "desc"; // String | 
Long institution = 789L; // Long | only return collections from this institution
String publishedSince = "publishedSince_example"; // String | Filter by collection publishing date. Will only return collections published after the date. date(ISO 8601) YYYY-MM-DD
String modifiedSince = "modifiedSince_example"; // String | Filter by collection modified date. Will only return collections published after the date. date(ISO 8601) YYYY-MM-DD
Long group = 789L; // Long | only return collections from this group
String resourceDoi = "resourceDoi_example"; // String | only return collections with this resource_doi
String doi = "doi_example"; // String | only return collections with this doi
String handle = "handle_example"; // String | only return collections with this handle
try {
    List<Collection> result = apiInstance.collectionsList(xCursor, page, pageSize, limit, offset, order, orderDirection, institution, publishedSince, modifiedSince, group, resourceDoi, doi, handle);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#collectionsList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xCursor** | **UUID**| Unique hash used for bypassing the item retrieval limit of 9,000 entities. When using this parameter, please note that the offset parameter will not be available, but the limit parameter will still work as expected. | [optional]
 **page** | **Long**| Page number. Used for pagination with page_size | [optional]
 **pageSize** | **Long**| The number of results included on a page. Used for pagination with page | [optional] [default to 10]
 **limit** | **Long**| Number of results included on a page. Used for pagination with query | [optional]
 **offset** | **Long**| Where to start the listing(the offset of the first result). Used for pagination with limit | [optional]
 **order** | **String**| The field by which to order. Default varies by endpoint/resource. | [optional] [default to published_date] [enum: published_date, modified_date, views, shares, cites]
 **orderDirection** | **String**|  | [optional] [default to desc] [enum: asc, desc]
 **institution** | **Long**| only return collections from this institution | [optional]
 **publishedSince** | **String**| Filter by collection publishing date. Will only return collections published after the date. date(ISO 8601) YYYY-MM-DD | [optional]
 **modifiedSince** | **String**| Filter by collection modified date. Will only return collections published after the date. date(ISO 8601) YYYY-MM-DD | [optional]
 **group** | **Long**| only return collections from this group | [optional]
 **resourceDoi** | **String**| only return collections with this resource_doi | [optional]
 **doi** | **String**| only return collections with this doi | [optional]
 **handle** | **String**| only return collections with this handle | [optional]

### Return type

[**List&lt;Collection&gt;**](Collection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="collectionsSearch"></a>
# **collectionsSearch**
> List&lt;Collection&gt; collectionsSearch(xCursor, search)

Public Collections Search

Returns a list of public collections

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CollectionsApi;


CollectionsApi apiInstance = new CollectionsApi();
UUID xCursor = new UUID(); // UUID | Unique hash used for bypassing the item retrieval limit of 9,000 entities. When using this parameter, please note that the offset parameter will not be available, but the limit parameter will still work as expected.
CollectionSearch search = new CollectionSearch(); // CollectionSearch | Search Parameters
try {
    List<Collection> result = apiInstance.collectionsSearch(xCursor, search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#collectionsSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xCursor** | **UUID**| Unique hash used for bypassing the item retrieval limit of 9,000 entities. When using this parameter, please note that the offset parameter will not be available, but the limit parameter will still work as expected. | [optional]
 **search** | [**CollectionSearch**](CollectionSearch.md)| Search Parameters | [optional]

### Return type

[**List&lt;Collection&gt;**](Collection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="privateCollectionArticleDelete"></a>
# **privateCollectionArticleDelete**
> privateCollectionArticleDelete(collectionId, articleId)

Delete collection article

De-associate article from collection

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CollectionsApi apiInstance = new CollectionsApi();
Long collectionId = 789L; // Long | Collection unique identifier
Long articleId = 789L; // Long | Collection article unique identifier
try {
    apiInstance.privateCollectionArticleDelete(collectionId, articleId);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#privateCollectionArticleDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Long**| Collection unique identifier |
 **articleId** | **Long**| Collection article unique identifier |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="privateCollectionArticlesAdd"></a>
# **privateCollectionArticlesAdd**
> Location privateCollectionArticlesAdd(collectionId, articles)

Add collection articles

Associate new articles with the collection. This will add new articles to the list of already associated articles

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CollectionsApi apiInstance = new CollectionsApi();
Long collectionId = 789L; // Long | Collection unique identifier
ArticlesCreator articles = new ArticlesCreator(); // ArticlesCreator | Articles list
try {
    Location result = apiInstance.privateCollectionArticlesAdd(collectionId, articles);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#privateCollectionArticlesAdd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Long**| Collection unique identifier |
 **articles** | [**ArticlesCreator**](ArticlesCreator.md)| Articles list |

### Return type

[**Location**](Location.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="privateCollectionArticlesList"></a>
# **privateCollectionArticlesList**
> List&lt;Article&gt; privateCollectionArticlesList(collectionId, page, pageSize, limit, offset)

List collection articles

List collection articles

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CollectionsApi apiInstance = new CollectionsApi();
Long collectionId = 789L; // Long | Collection unique identifier
Long page = 789L; // Long | Page number. Used for pagination with page_size
Long pageSize = 10L; // Long | The number of results included on a page. Used for pagination with page
Long limit = 789L; // Long | Number of results included on a page. Used for pagination with query
Long offset = 789L; // Long | Where to start the listing(the offset of the first result). Used for pagination with limit
try {
    List<Article> result = apiInstance.privateCollectionArticlesList(collectionId, page, pageSize, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#privateCollectionArticlesList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Long**| Collection unique identifier |
 **page** | **Long**| Page number. Used for pagination with page_size | [optional]
 **pageSize** | **Long**| The number of results included on a page. Used for pagination with page | [optional] [default to 10]
 **limit** | **Long**| Number of results included on a page. Used for pagination with query | [optional]
 **offset** | **Long**| Where to start the listing(the offset of the first result). Used for pagination with limit | [optional]

### Return type

[**List&lt;Article&gt;**](Article.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="privateCollectionArticlesReplace"></a>
# **privateCollectionArticlesReplace**
> privateCollectionArticlesReplace(collectionId, articles)

Replace collection articles

Associate new articles with the collection. This will remove all already associated articles and add these new ones

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CollectionsApi apiInstance = new CollectionsApi();
Long collectionId = 789L; // Long | Collection unique identifier
ArticlesCreator articles = new ArticlesCreator(); // ArticlesCreator | Articles List
try {
    apiInstance.privateCollectionArticlesReplace(collectionId, articles);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#privateCollectionArticlesReplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Long**| Collection unique identifier |
 **articles** | [**ArticlesCreator**](ArticlesCreator.md)| Articles List |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="privateCollectionAuthorDelete"></a>
# **privateCollectionAuthorDelete**
> privateCollectionAuthorDelete(collectionId, authorId)

Delete collection author

Delete collection author

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CollectionsApi apiInstance = new CollectionsApi();
Long collectionId = 789L; // Long | Collection unique identifier
Long authorId = 789L; // Long | Collection Author unique identifier
try {
    apiInstance.privateCollectionAuthorDelete(collectionId, authorId);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#privateCollectionAuthorDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Long**| Collection unique identifier |
 **authorId** | **Long**| Collection Author unique identifier |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="privateCollectionAuthorsAdd"></a>
# **privateCollectionAuthorsAdd**
> Location privateCollectionAuthorsAdd(collectionId, authors)

Add collection authors

Associate new authors with the collection. This will add new authors to the list of already associated authors

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CollectionsApi apiInstance = new CollectionsApi();
Long collectionId = 789L; // Long | Collection unique identifier
AuthorsCreator authors = new AuthorsCreator(); // AuthorsCreator | List of authors
try {
    Location result = apiInstance.privateCollectionAuthorsAdd(collectionId, authors);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#privateCollectionAuthorsAdd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Long**| Collection unique identifier |
 **authors** | [**AuthorsCreator**](AuthorsCreator.md)| List of authors |

### Return type

[**Location**](Location.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="privateCollectionAuthorsList"></a>
# **privateCollectionAuthorsList**
> List&lt;Author&gt; privateCollectionAuthorsList(collectionId)

List collection authors

List collection authors

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CollectionsApi apiInstance = new CollectionsApi();
Long collectionId = 789L; // Long | Collection unique identifier
try {
    List<Author> result = apiInstance.privateCollectionAuthorsList(collectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#privateCollectionAuthorsList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Long**| Collection unique identifier |

### Return type

[**List&lt;Author&gt;**](Author.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="privateCollectionAuthorsReplace"></a>
# **privateCollectionAuthorsReplace**
> privateCollectionAuthorsReplace(collectionId, authors)

Replace collection authors

Associate new authors with the collection. This will remove all already associated authors and add these new ones

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CollectionsApi apiInstance = new CollectionsApi();
Long collectionId = 789L; // Long | Collection unique identifier
AuthorsCreator authors = new AuthorsCreator(); // AuthorsCreator | List of authors
try {
    apiInstance.privateCollectionAuthorsReplace(collectionId, authors);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#privateCollectionAuthorsReplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Long**| Collection unique identifier |
 **authors** | [**AuthorsCreator**](AuthorsCreator.md)| List of authors |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="privateCollectionCategoriesAdd"></a>
# **privateCollectionCategoriesAdd**
> Location privateCollectionCategoriesAdd(collectionId, categories)

Add collection categories

Associate new categories with the collection. This will add new categories to the list of already associated categories

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CollectionsApi apiInstance = new CollectionsApi();
Long collectionId = 789L; // Long | Collection unique identifier
CategoriesCreator categories = new CategoriesCreator(); // CategoriesCreator | Categories list
try {
    Location result = apiInstance.privateCollectionCategoriesAdd(collectionId, categories);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#privateCollectionCategoriesAdd");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Long**| Collection unique identifier |
 **categories** | [**CategoriesCreator**](CategoriesCreator.md)| Categories list |

### Return type

[**Location**](Location.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="privateCollectionCategoriesList"></a>
# **privateCollectionCategoriesList**
> List&lt;Category&gt; privateCollectionCategoriesList(collectionId)

List collection categories

List collection categories

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CollectionsApi apiInstance = new CollectionsApi();
Long collectionId = 789L; // Long | Collection unique identifier
try {
    List<Category> result = apiInstance.privateCollectionCategoriesList(collectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#privateCollectionCategoriesList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Long**| Collection unique identifier |

### Return type

[**List&lt;Category&gt;**](Category.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="privateCollectionCategoriesReplace"></a>
# **privateCollectionCategoriesReplace**
> privateCollectionCategoriesReplace(collectionId, categories)

Replace collection categories

Associate new categories with the collection. This will remove all already associated categories and add these new ones

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CollectionsApi apiInstance = new CollectionsApi();
Long collectionId = 789L; // Long | Collection unique identifier
CategoriesCreator categories = new CategoriesCreator(); // CategoriesCreator | Categories list
try {
    apiInstance.privateCollectionCategoriesReplace(collectionId, categories);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#privateCollectionCategoriesReplace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Long**| Collection unique identifier |
 **categories** | [**CategoriesCreator**](CategoriesCreator.md)| Categories list |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="privateCollectionCategoryDelete"></a>
# **privateCollectionCategoryDelete**
> privateCollectionCategoryDelete(collectionId, categoryId)

Delete collection category

De-associate category from collection

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CollectionsApi apiInstance = new CollectionsApi();
Long collectionId = 789L; // Long | Collection unique identifier
Long categoryId = 789L; // Long | Collection category unique identifier
try {
    apiInstance.privateCollectionCategoryDelete(collectionId, categoryId);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#privateCollectionCategoryDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Long**| Collection unique identifier |
 **categoryId** | **Long**| Collection category unique identifier |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="privateCollectionCreate"></a>
# **privateCollectionCreate**
> LocationWarnings privateCollectionCreate(collection)

Create collection

Create a new Collection by sending collection information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CollectionsApi apiInstance = new CollectionsApi();
CollectionCreate collection = new CollectionCreate(); // CollectionCreate | Collection description
try {
    LocationWarnings result = apiInstance.privateCollectionCreate(collection);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#privateCollectionCreate");
    e.printStackTrace();
}
```

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

<a name="privateCollectionDelete"></a>
# **privateCollectionDelete**
> privateCollectionDelete(collectionId)

Delete collection

Delete n collection

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CollectionsApi apiInstance = new CollectionsApi();
Long collectionId = 789L; // Long | Collection Unique identifier
try {
    apiInstance.privateCollectionDelete(collectionId);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#privateCollectionDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Long**| Collection Unique identifier |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="privateCollectionDetails"></a>
# **privateCollectionDetails**
> CollectionCompletePrivate privateCollectionDetails(collectionId)

Collection details

View a collection

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CollectionsApi apiInstance = new CollectionsApi();
Long collectionId = 789L; // Long | Collection Unique identifier
try {
    CollectionCompletePrivate result = apiInstance.privateCollectionDetails(collectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#privateCollectionDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Long**| Collection Unique identifier |

### Return type

[**CollectionCompletePrivate**](CollectionCompletePrivate.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="privateCollectionPrivateLinkCreate"></a>
# **privateCollectionPrivateLinkCreate**
> PrivateLinkResponse privateCollectionPrivateLinkCreate(collectionId, privateLink)

Create collection private link

Create new private link

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CollectionsApi apiInstance = new CollectionsApi();
Long collectionId = 789L; // Long | Collection unique identifier
CollectionPrivateLinkCreator privateLink = new CollectionPrivateLinkCreator(); // CollectionPrivateLinkCreator | 
try {
    PrivateLinkResponse result = apiInstance.privateCollectionPrivateLinkCreate(collectionId, privateLink);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#privateCollectionPrivateLinkCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Long**| Collection unique identifier |
 **privateLink** | [**CollectionPrivateLinkCreator**](CollectionPrivateLinkCreator.md)|  | [optional]

### Return type

[**PrivateLinkResponse**](PrivateLinkResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="privateCollectionPrivateLinkDelete"></a>
# **privateCollectionPrivateLinkDelete**
> privateCollectionPrivateLinkDelete(collectionId, linkId)

Disable private link

Disable/delete private link for this collection

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CollectionsApi apiInstance = new CollectionsApi();
Long collectionId = 789L; // Long | Collection unique identifier
String linkId = "linkId_example"; // String | Private link token
try {
    apiInstance.privateCollectionPrivateLinkDelete(collectionId, linkId);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#privateCollectionPrivateLinkDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Long**| Collection unique identifier |
 **linkId** | **String**| Private link token |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="privateCollectionPrivateLinkUpdate"></a>
# **privateCollectionPrivateLinkUpdate**
> privateCollectionPrivateLinkUpdate(collectionId, linkId, privateLink)

Update collection private link

Update existing private link for this collection

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CollectionsApi apiInstance = new CollectionsApi();
Long collectionId = 789L; // Long | Collection unique identifier
String linkId = "linkId_example"; // String | Private link token
CollectionPrivateLinkCreator privateLink = new CollectionPrivateLinkCreator(); // CollectionPrivateLinkCreator | 
try {
    apiInstance.privateCollectionPrivateLinkUpdate(collectionId, linkId, privateLink);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#privateCollectionPrivateLinkUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Long**| Collection unique identifier |
 **linkId** | **String**| Private link token |
 **privateLink** | [**CollectionPrivateLinkCreator**](CollectionPrivateLinkCreator.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="privateCollectionPrivateLinksList"></a>
# **privateCollectionPrivateLinksList**
> List&lt;PrivateLink&gt; privateCollectionPrivateLinksList(collectionId)

List collection private links

List article private links

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CollectionsApi apiInstance = new CollectionsApi();
Long collectionId = 789L; // Long | Collection unique identifier
try {
    List<PrivateLink> result = apiInstance.privateCollectionPrivateLinksList(collectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#privateCollectionPrivateLinksList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Long**| Collection unique identifier |

### Return type

[**List&lt;PrivateLink&gt;**](PrivateLink.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="privateCollectionPublish"></a>
# **privateCollectionPublish**
> Location privateCollectionPublish(collectionId)

Private Collection Publish

When a collection is published, a new public version will be generated. Any further updates to the collection will affect the private collection data. In order to make these changes publicly visible, an explicit publish operation is needed.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CollectionsApi apiInstance = new CollectionsApi();
Long collectionId = 789L; // Long | Collection Unique identifier
try {
    Location result = apiInstance.privateCollectionPublish(collectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#privateCollectionPublish");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Long**| Collection Unique identifier |

### Return type

[**Location**](Location.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="privateCollectionReserveDoi"></a>
# **privateCollectionReserveDoi**
> CollectionDOI privateCollectionReserveDoi(collectionId)

Private Collection Reserve DOI

Reserve DOI for collection

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CollectionsApi apiInstance = new CollectionsApi();
Long collectionId = 789L; // Long | Collection Unique identifier
try {
    CollectionDOI result = apiInstance.privateCollectionReserveDoi(collectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#privateCollectionReserveDoi");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Long**| Collection Unique identifier |

### Return type

[**CollectionDOI**](CollectionDOI.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="privateCollectionReserveHandle"></a>
# **privateCollectionReserveHandle**
> CollectionHandle privateCollectionReserveHandle(collectionId)

Private Collection Reserve Handle

Reserve Handle for collection

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CollectionsApi apiInstance = new CollectionsApi();
Long collectionId = 789L; // Long | Collection Unique identifier
try {
    CollectionHandle result = apiInstance.privateCollectionReserveHandle(collectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#privateCollectionReserveHandle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Long**| Collection Unique identifier |

### Return type

[**CollectionHandle**](CollectionHandle.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="privateCollectionResource"></a>
# **privateCollectionResource**
> Location privateCollectionResource(collectionId, resource)

Private Collection Resource

Edit collection resource data.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CollectionsApi apiInstance = new CollectionsApi();
Long collectionId = 789L; // Long | Collection unique identifier
Resource resource = new Resource(); // Resource | Resource data
try {
    Location result = apiInstance.privateCollectionResource(collectionId, resource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#privateCollectionResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Long**| Collection unique identifier |
 **resource** | [**Resource**](Resource.md)| Resource data |

### Return type

[**Location**](Location.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="privateCollectionUpdate"></a>
# **privateCollectionUpdate**
> LocationWarningsUpdate privateCollectionUpdate(collectionId, collection)

Update collection

Update collection details; request can also be made with the PATCH method.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CollectionsApi apiInstance = new CollectionsApi();
Long collectionId = 789L; // Long | Collection Unique identifier
CollectionUpdate collection = new CollectionUpdate(); // CollectionUpdate | Collection description
try {
    LocationWarningsUpdate result = apiInstance.privateCollectionUpdate(collectionId, collection);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#privateCollectionUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **Long**| Collection Unique identifier |
 **collection** | [**CollectionUpdate**](CollectionUpdate.md)| Collection description |

### Return type

[**LocationWarningsUpdate**](LocationWarningsUpdate.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="privateCollectionsList"></a>
# **privateCollectionsList**
> List&lt;Collection&gt; privateCollectionsList(page, pageSize, limit, offset, order, orderDirection)

Private Collections List

List private collections

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CollectionsApi apiInstance = new CollectionsApi();
Long page = 789L; // Long | Page number. Used for pagination with page_size
Long pageSize = 10L; // Long | The number of results included on a page. Used for pagination with page
Long limit = 789L; // Long | Number of results included on a page. Used for pagination with query
Long offset = 789L; // Long | Where to start the listing(the offset of the first result). Used for pagination with limit
String order = "published_date"; // String | The field by which to order. Default varies by endpoint/resource.
String orderDirection = "desc"; // String | 
try {
    List<Collection> result = apiInstance.privateCollectionsList(page, pageSize, limit, offset, order, orderDirection);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#privateCollectionsList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Long**| Page number. Used for pagination with page_size | [optional]
 **pageSize** | **Long**| The number of results included on a page. Used for pagination with page | [optional] [default to 10]
 **limit** | **Long**| Number of results included on a page. Used for pagination with query | [optional]
 **offset** | **Long**| Where to start the listing(the offset of the first result). Used for pagination with limit | [optional]
 **order** | **String**| The field by which to order. Default varies by endpoint/resource. | [optional] [default to published_date] [enum: published_date, modified_date, views, shares, cites]
 **orderDirection** | **String**|  | [optional] [default to desc] [enum: asc, desc]

### Return type

[**List&lt;Collection&gt;**](Collection.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="privateCollectionsSearch"></a>
# **privateCollectionsSearch**
> List&lt;Collection&gt; privateCollectionsSearch(search)

Private Collections Search

Returns a list of private Collections

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CollectionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CollectionsApi apiInstance = new CollectionsApi();
PrivateCollectionSearch search = new PrivateCollectionSearch(); // PrivateCollectionSearch | Search Parameters
try {
    List<Collection> result = apiInstance.privateCollectionsSearch(search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionsApi#privateCollectionsSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | [**PrivateCollectionSearch**](PrivateCollectionSearch.md)| Search Parameters |

### Return type

[**List&lt;Collection&gt;**](Collection.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


# AuthorsApi

All URIs are relative to *https://api.figinternal.dev/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**privateAuthorDetails**](AuthorsApi.md#privateAuthorDetails) | **GET** /account/authors/{author_id} | Author details
[**privateAuthorsSearch**](AuthorsApi.md#privateAuthorsSearch) | **POST** /account/authors/search | Search Authors


<a name="privateAuthorDetails"></a>
# **privateAuthorDetails**
> AuthorComplete privateAuthorDetails(authorId)

Author details

View author details

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

AuthorsApi apiInstance = new AuthorsApi();
Long authorId = 789L; // Long | Author unique identifier
try {
    AuthorComplete result = apiInstance.privateAuthorDetails(authorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorsApi#privateAuthorDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorId** | **Long**| Author unique identifier |

### Return type

[**AuthorComplete**](AuthorComplete.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="privateAuthorsSearch"></a>
# **privateAuthorsSearch**
> List&lt;Author&gt; privateAuthorsSearch(search)

Search Authors

Search for authors

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

AuthorsApi apiInstance = new AuthorsApi();
PrivateAuthorsSearch search = new PrivateAuthorsSearch(); // PrivateAuthorsSearch | Search Parameters
try {
    List<Author> result = apiInstance.privateAuthorsSearch(search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorsApi#privateAuthorsSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | [**PrivateAuthorsSearch**](PrivateAuthorsSearch.md)| Search Parameters | [optional]

### Return type

[**List&lt;Author&gt;**](Author.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


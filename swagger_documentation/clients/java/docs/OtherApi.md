# OtherApi

All URIs are relative to *https://api.figinternal.dev/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**categoriesList**](OtherApi.md#categoriesList) | **GET** /categories | Public Categories
[**fileDownload**](OtherApi.md#fileDownload) | **GET** /file/download/{file_id} | Public File Download
[**itemTypesList**](OtherApi.md#itemTypesList) | **GET** /item_types | Item Types
[**licensesList**](OtherApi.md#licensesList) | **GET** /licenses | Public Licenses
[**privateAccount**](OtherApi.md#privateAccount) | **GET** /account | Private Account information
[**privateFundingSearch**](OtherApi.md#privateFundingSearch) | **POST** /account/funding/search | Search Funding
[**privateLicensesList**](OtherApi.md#privateLicensesList) | **GET** /account/licenses | Private Account Licenses


<a name="categoriesList"></a>
# **categoriesList**
> List&lt;Category&gt; categoriesList()

Public Categories

Returns a list of public categories

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OtherApi;


OtherApi apiInstance = new OtherApi();
try {
    List<Category> result = apiInstance.categoriesList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OtherApi#categoriesList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Category&gt;**](Category.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fileDownload"></a>
# **fileDownload**
> fileDownload(fileId)

Public File Download

Starts the download of a file

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OtherApi;


OtherApi apiInstance = new OtherApi();
Long fileId = 789L; // Long | 
try {
    apiInstance.fileDownload(fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling OtherApi#fileDownload");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **Long**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/force-download

<a name="itemTypesList"></a>
# **itemTypesList**
> List&lt;ItemType&gt; itemTypesList(groupId)

Item Types

Returns the list of Item Types of the requested group. If no user is authenticated, returns the item types available for Figshare.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OtherApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

OtherApi apiInstance = new OtherApi();
Long groupId = 0L; // Long | Identifier of the group for which the item types are requested
try {
    List<ItemType> result = apiInstance.itemTypesList(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OtherApi#itemTypesList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| Identifier of the group for which the item types are requested | [optional] [default to 0]

### Return type

[**List&lt;ItemType&gt;**](ItemType.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="licensesList"></a>
# **licensesList**
> List&lt;License&gt; licensesList()

Public Licenses

Returns a list of public licenses

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OtherApi;


OtherApi apiInstance = new OtherApi();
try {
    List<License> result = apiInstance.licensesList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OtherApi#licensesList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;License&gt;**](License.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="privateAccount"></a>
# **privateAccount**
> Account privateAccount()

Private Account information

Account information for token/personal token

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OtherApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

OtherApi apiInstance = new OtherApi();
try {
    Account result = apiInstance.privateAccount();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OtherApi#privateAccount");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Account**](Account.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="privateFundingSearch"></a>
# **privateFundingSearch**
> List&lt;FundingInformation&gt; privateFundingSearch(search)

Search Funding

Search for fundings

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OtherApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

OtherApi apiInstance = new OtherApi();
FundingSearch search = new FundingSearch(); // FundingSearch | Search Parameters
try {
    List<FundingInformation> result = apiInstance.privateFundingSearch(search);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OtherApi#privateFundingSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | [**FundingSearch**](FundingSearch.md)| Search Parameters | [optional]

### Return type

[**List&lt;FundingInformation&gt;**](FundingInformation.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="privateLicensesList"></a>
# **privateLicensesList**
> List&lt;License&gt; privateLicensesList()

Private Account Licenses

This is a private endpoint that requires OAuth. It will return a list with figshare public licenses AND licenses defined for account&#39;s institution.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OtherApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

OtherApi apiInstance = new OtherApi();
try {
    List<License> result = apiInstance.privateLicensesList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OtherApi#privateLicensesList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;License&gt;**](License.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


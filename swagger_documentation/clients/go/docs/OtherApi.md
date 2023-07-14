# \OtherApi

All URIs are relative to *https://api.figinternal.dev/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CategoriesList**](OtherApi.md#CategoriesList) | **Get** /categories | Public Categories
[**FileDownload**](OtherApi.md#FileDownload) | **Get** /file/download/{file_id} | Public File Download
[**ItemTypesList**](OtherApi.md#ItemTypesList) | **Get** /item_types | Item Types
[**LicensesList**](OtherApi.md#LicensesList) | **Get** /licenses | Public Licenses
[**PrivateAccount**](OtherApi.md#PrivateAccount) | **Get** /account | Private Account information
[**PrivateFundingSearch**](OtherApi.md#PrivateFundingSearch) | **Post** /account/funding/search | Search Funding
[**PrivateLicensesList**](OtherApi.md#PrivateLicensesList) | **Get** /account/licenses | Private Account Licenses


# **CategoriesList**
> []Category CategoriesList()

Public Categories

Returns a list of public categories


### Parameters
This endpoint does not need any parameter.

### Return type

[**[]Category**](Category.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **FileDownload**
> FileDownload($fileId)

Public File Download

Starts the download of a file


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **int64**|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/force-download

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ItemTypesList**
> []ItemType ItemTypesList($groupId)

Item Types

Returns the list of Item Types of the requested group. If no user is authenticated, returns the item types available for Figshare.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **int64**| Identifier of the group for which the item types are requested | [optional] [default to 0]

### Return type

[**[]ItemType**](ItemType.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **LicensesList**
> []License LicensesList()

Public Licenses

Returns a list of public licenses


### Parameters
This endpoint does not need any parameter.

### Return type

[**[]License**](License.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateAccount**
> Account PrivateAccount()

Private Account information

Account information for token/personal token


### Parameters
This endpoint does not need any parameter.

### Return type

[**Account**](Account.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateFundingSearch**
> []FundingInformation PrivateFundingSearch($search)

Search Funding

Search for fundings


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | [**FundingSearch**](FundingSearch.md)| Search Parameters | [optional] 

### Return type

[**[]FundingInformation**](FundingInformation.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateLicensesList**
> []License PrivateLicensesList()

Private Account Licenses

This is a private endpoint that requires OAuth. It will return a list with figshare public licenses AND licenses defined for account's institution.


### Parameters
This endpoint does not need any parameter.

### Return type

[**[]License**](License.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


# \AuthorsApi

All URIs are relative to *https://api.figinternal.dev/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PrivateAuthorDetails**](AuthorsApi.md#PrivateAuthorDetails) | **Get** /account/authors/{author_id} | Author details
[**PrivateAuthorsSearch**](AuthorsApi.md#PrivateAuthorsSearch) | **Post** /account/authors/search | Search Authors


# **PrivateAuthorDetails**
> AuthorComplete PrivateAuthorDetails($authorId)

Author details

View author details


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorId** | **int64**| Author unique identifier | 

### Return type

[**AuthorComplete**](AuthorComplete.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateAuthorsSearch**
> []Author PrivateAuthorsSearch($search)

Search Authors

Search for authors


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | [**PrivateAuthorsSearch**](PrivateAuthorsSearch.md)| Search Parameters | [optional] 

### Return type

[**[]Author**](Author.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


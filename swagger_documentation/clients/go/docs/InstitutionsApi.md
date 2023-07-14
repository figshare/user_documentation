# \InstitutionsApi

All URIs are relative to *https://api.figinternal.dev/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AccountInstitutionCuration**](InstitutionsApi.md#AccountInstitutionCuration) | **Get** /account/institution/review/{curation_id} | Institution Curation Review
[**AccountInstitutionCurationComments**](InstitutionsApi.md#AccountInstitutionCurationComments) | **Get** /account/institution/review/{curation_id}/comments | Institution Curation Review Comments
[**AccountInstitutionCurationComments_0**](InstitutionsApi.md#AccountInstitutionCurationComments_0) | **Post** /account/institution/review/{curation_id}/comments | POST Institution Curation Review Comment
[**AccountInstitutionCurations**](InstitutionsApi.md#AccountInstitutionCurations) | **Get** /account/institution/reviews | Institution Curation Reviews
[**CustomFieldsList**](InstitutionsApi.md#CustomFieldsList) | **Get** /account/institution/custom_fields | Private account institution group custom fields
[**CustomFieldsUpload**](InstitutionsApi.md#CustomFieldsUpload) | **Post** /account/institution/custom_fields/{custom_field_id}/items/upload | Custom fields values files upload
[**InstitutionArticles**](InstitutionsApi.md#InstitutionArticles) | **Get** /institutions/{institution_string_id}/articles/filter-by | Public Licenses
[**InstitutionHrfeedUpload**](InstitutionsApi.md#InstitutionHrfeedUpload) | **Post** /institution/hrfeed/upload | Private Institution HRfeed Upload
[**PrivateAccountInstitutionUser**](InstitutionsApi.md#PrivateAccountInstitutionUser) | **Get** /account/institution/users/{account_id} | Private Account Institution User
[**PrivateCategoriesList**](InstitutionsApi.md#PrivateCategoriesList) | **Get** /account/categories | Private Account Categories
[**PrivateGroupEmbargoOptionsDetails**](InstitutionsApi.md#PrivateGroupEmbargoOptionsDetails) | **Get** /account/institution/groups/{group_id}/embargo_options | Private Account Institution Group Embargo Options
[**PrivateInstitutionAccountGroupRoleDelete**](InstitutionsApi.md#PrivateInstitutionAccountGroupRoleDelete) | **Delete** /account/institution/roles/{account_id}/{group_id}/{role_id} | Delete Institution Account Group Role
[**PrivateInstitutionAccountGroupRoles**](InstitutionsApi.md#PrivateInstitutionAccountGroupRoles) | **Get** /account/institution/roles/{account_id} | List Institution Account Group Roles
[**PrivateInstitutionAccountGroupRolesCreate**](InstitutionsApi.md#PrivateInstitutionAccountGroupRolesCreate) | **Post** /account/institution/roles/{account_id} | Add Institution Account Group Roles
[**PrivateInstitutionAccountsCreate**](InstitutionsApi.md#PrivateInstitutionAccountsCreate) | **Post** /account/institution/accounts | Create new Institution Account
[**PrivateInstitutionAccountsList**](InstitutionsApi.md#PrivateInstitutionAccountsList) | **Get** /account/institution/accounts | Private Account Institution Accounts
[**PrivateInstitutionAccountsSearch**](InstitutionsApi.md#PrivateInstitutionAccountsSearch) | **Post** /account/institution/accounts/search | Private Account Institution Accounts Search
[**PrivateInstitutionAccountsUpdate**](InstitutionsApi.md#PrivateInstitutionAccountsUpdate) | **Put** /account/institution/accounts/{account_id} | Update Institution Account
[**PrivateInstitutionArticles**](InstitutionsApi.md#PrivateInstitutionArticles) | **Get** /account/institution/articles | Private Institution Articles
[**PrivateInstitutionDetails**](InstitutionsApi.md#PrivateInstitutionDetails) | **Get** /account/institution | Private Account Institutions
[**PrivateInstitutionEmbargoOptionsDetails**](InstitutionsApi.md#PrivateInstitutionEmbargoOptionsDetails) | **Get** /account/institution/embargo_options | Private Account Institution embargo options
[**PrivateInstitutionGroupsList**](InstitutionsApi.md#PrivateInstitutionGroupsList) | **Get** /account/institution/groups | Private Account Institution Groups
[**PrivateInstitutionRolesList**](InstitutionsApi.md#PrivateInstitutionRolesList) | **Get** /account/institution/roles | Private Account Institution Roles


# **AccountInstitutionCuration**
> CurationDetail AccountInstitutionCuration($curationId)

Institution Curation Review

Retrieve a certain curation review by its ID


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **curationId** | **int64**| ID of the curation | 

### Return type

[**CurationDetail**](CurationDetail.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AccountInstitutionCurationComments**
> CurationComment AccountInstitutionCurationComments($curationId, $limit, $offset)

Institution Curation Review Comments

Retrieve a certain curation review's comments.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **curationId** | **int64**| ID of the curation | 
 **limit** | **int64**| Number of results included on a page. Used for pagination with query | [optional] 
 **offset** | **int64**| Where to start the listing(the offset of the first result). Used for pagination with limit | [optional] 

### Return type

[**CurationComment**](CurationComment.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AccountInstitutionCurationComments_0**
> AccountInstitutionCurationComments_0($curationId, $curationComment)

POST Institution Curation Review Comment

Add a new comment to the review.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **curationId** | **int64**| ID of the curation | 
 **curationComment** | [**CurationCommentCreate**](CurationCommentCreate.md)| The content/value of the comment. | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **AccountInstitutionCurations**
> Curation AccountInstitutionCurations($groupId, $articleId, $status, $limit, $offset)

Institution Curation Reviews

Retrieve a list of curation reviews for this institution


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **int64**| Filter by the group ID | [optional] 
 **articleId** | **int64**| Retrieve the reviews for this article | [optional] 
 **status** | **string**| Filter by the status of the review | [optional] 
 **limit** | **int64**| Number of results included on a page. Used for pagination with query | [optional] 
 **offset** | **int64**| Where to start the listing(the offset of the first result). Used for pagination with limit | [optional] 

### Return type

[**Curation**](Curation.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CustomFieldsList**
> []ShortCustomField CustomFieldsList($groupId)

Private account institution group custom fields

Returns the custom fields in the group the user belongs to, or the ones in the group specified, if the user has access.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **int64**| Group_id | [optional] 

### Return type

[**[]ShortCustomField**](ShortCustomField.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CustomFieldsUpload**
> interface{} CustomFieldsUpload($customFieldId, $externalFile)

Custom fields values files upload

Uploads a CSV containing values for a specific custom field of type <b>dropdown_large_list</b>. More details in the <a href=\"#custom_fields\">Custom Fields section</a>


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customFieldId** | **int64**| Custom field identifier | 
 **externalFile** | ***os.File**| CSV file to be uploaded | [optional] 

### Return type

[**interface{}**](interface{}.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **InstitutionArticles**
> []Article InstitutionArticles($institutionStringId, $resourceId, $filename)

Public Licenses

Returns a list of articles belonging to the institution


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **institutionStringId** | **string**|  | 
 **resourceId** | **string**|  | 
 **filename** | **string**|  | 

### Return type

[**[]Article**](Article.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **InstitutionHrfeedUpload**
> ResponseMessage InstitutionHrfeedUpload($hrfeed)

Private Institution HRfeed Upload

More info in the <a href=\"#hr_feed\">HR Feed section</a>


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hrfeed** | ***os.File**| You can find an example in the Hr Feed section | [optional] 

### Return type

[**ResponseMessage**](ResponseMessage.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateAccountInstitutionUser**
> User PrivateAccountInstitutionUser($accountId)

Private Account Institution User

Retrieve institution user information using the account_id


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **int64**| Account identifier the user is associated to | 

### Return type

[**User**](User.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateCategoriesList**
> []Category PrivateCategoriesList()

Private Account Categories

List institution categories (including parent Categories)


### Parameters
This endpoint does not need any parameter.

### Return type

[**[]Category**](Category.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateGroupEmbargoOptionsDetails**
> []GroupEmbargoOptions PrivateGroupEmbargoOptionsDetails($groupId)

Private Account Institution Group Embargo Options

Account institution group embargo options details


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **int64**| Group identifier | 

### Return type

[**[]GroupEmbargoOptions**](GroupEmbargoOptions.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateInstitutionAccountGroupRoleDelete**
> PrivateInstitutionAccountGroupRoleDelete($accountId, $groupId, $roleId)

Delete Institution Account Group Role

Delete Institution Account Group Role


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **int64**| Account identifier for which to remove the role | 
 **groupId** | **int64**| Group identifier for which to remove the role | 
 **roleId** | **int64**| Role identifier | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateInstitutionAccountGroupRoles**
> AccountGroupRoles PrivateInstitutionAccountGroupRoles($accountId)

List Institution Account Group Roles

List Institution Account Group Roles


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **int64**| Account identifier the user is associated to | 

### Return type

[**AccountGroupRoles**](AccountGroupRoles.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateInstitutionAccountGroupRolesCreate**
> PrivateInstitutionAccountGroupRolesCreate($accountId, $account)

Add Institution Account Group Roles

Add Institution Account Group Roles


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **int64**| Account identifier the user is associated to | 
 **account** | [**AccountGroupRolesCreate**](AccountGroupRolesCreate.md)| Account description | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateInstitutionAccountsCreate**
> PrivateInstitutionAccountsCreate($account)

Create new Institution Account

Create a new Account by sending account information


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | [**AccountCreate**](AccountCreate.md)| Account description | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateInstitutionAccountsList**
> []ShortAccount PrivateInstitutionAccountsList($page, $pageSize, $limit, $offset, $isActive, $institutionUserId, $email, $idLte, $idGte)

Private Account Institution Accounts

Returns the accounts for which the account has administrative privileges (assigned and inherited).


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int64**| Page number. Used for pagination with page_size | [optional] 
 **pageSize** | **int64**| The number of results included on a page. Used for pagination with page | [optional] [default to 10]
 **limit** | **int64**| Number of results included on a page. Used for pagination with query | [optional] 
 **offset** | **int64**| Where to start the listing(the offset of the first result). Used for pagination with limit | [optional] 
 **isActive** | **int64**| Filter by active status | [optional] 
 **institutionUserId** | **string**| Filter by institution_user_id | [optional] 
 **email** | **string**| Filter by email | [optional] 
 **idLte** | **int64**| Retrieve accounts with an ID lower or equal to the specified value | [optional] 
 **idGte** | **int64**| Retrieve accounts with an ID greater or equal to the specified value | [optional] 

### Return type

[**[]ShortAccount**](ShortAccount.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateInstitutionAccountsSearch**
> []ShortAccount PrivateInstitutionAccountsSearch($search)

Private Account Institution Accounts Search

Returns the accounts for which the account has administrative privileges (assigned and inherited).


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | [**InstitutionAccountsSearch**](InstitutionAccountsSearch.md)| Search Parameters | 

### Return type

[**[]ShortAccount**](ShortAccount.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateInstitutionAccountsUpdate**
> PrivateInstitutionAccountsUpdate($accountId, $account)

Update Institution Account

Update Institution Account


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **int64**| Account identifier the user is associated to | 
 **account** | [**AccountUpdate**](AccountUpdate.md)| Account description | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateInstitutionArticles**
> []Article PrivateInstitutionArticles($page, $pageSize, $limit, $offset, $order, $orderDirection, $publishedSince, $modifiedSince, $status, $resourceDoi, $itemType)

Private Institution Articles

Get Articles from own institution. User must be administrator of the institution


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int64**| Page number. Used for pagination with page_size | [optional] 
 **pageSize** | **int64**| The number of results included on a page. Used for pagination with page | [optional] [default to 10]
 **limit** | **int64**| Number of results included on a page. Used for pagination with query | [optional] 
 **offset** | **int64**| Where to start the listing(the offset of the first result). Used for pagination with limit | [optional] 
 **order** | **string**| The field by which to order. Default varies by endpoint/resource. | [optional] [default to published_date]
 **orderDirection** | **string**|  | [optional] [default to desc]
 **publishedSince** | **string**| Filter by article publishing date. Will only return articles published after the date. date(ISO 8601) YYYY-MM-DD | [optional] 
 **modifiedSince** | **string**| Filter by article modified date. Will only return articles published after the date. date(ISO 8601) YYYY-MM-DD | [optional] 
 **status** | **int64**| only return collections with this status | [optional] 
 **resourceDoi** | **string**| only return collections with this resource_doi | [optional] 
 **itemType** | **int64**| Only return articles with the respective type. Mapping for item_type is: 1 - Figure, 2 - Media, 3 - Dataset, 5 - Poster, 6 - Journal contribution, 7 - Presentation, 8 - Thesis, 9 - Software, 11 - Online resource, 12 - Preprint, 13 - Book, 14 - Conference contribution, 15 - Chapter, 16 - Peer review, 17 - Educational resource, 18 - Report, 19 - Standard, 20 - Composition, 21 - Funding, 22 - Physical object, 23 - Data management plan, 24 - Workflow, 25 - Monograph, 26 - Performance, 27 - Event, 28 - Service, 29 - Model | [optional] 

### Return type

[**[]Article**](Article.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateInstitutionDetails**
> Institution PrivateInstitutionDetails()

Private Account Institutions

Account institution details


### Parameters
This endpoint does not need any parameter.

### Return type

[**Institution**](Institution.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateInstitutionEmbargoOptionsDetails**
> []GroupEmbargoOptions PrivateInstitutionEmbargoOptionsDetails()

Private Account Institution embargo options

Account institution embargo options details


### Parameters
This endpoint does not need any parameter.

### Return type

[**[]GroupEmbargoOptions**](GroupEmbargoOptions.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateInstitutionGroupsList**
> []Group PrivateInstitutionGroupsList()

Private Account Institution Groups

Returns the groups for which the account has administrative privileges (assigned and inherited).


### Parameters
This endpoint does not need any parameter.

### Return type

[**[]Group**](Group.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateInstitutionRolesList**
> []Role PrivateInstitutionRolesList()

Private Account Institution Roles

Returns the roles available for groups and the institution group.


### Parameters
This endpoint does not need any parameter.

### Return type

[**[]Role**](Role.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


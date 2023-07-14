# \ProjectsApi

All URIs are relative to *https://api.figinternal.dev/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PrivateProjectArticleDelete**](ProjectsApi.md#PrivateProjectArticleDelete) | **Delete** /account/projects/{project_id}/articles/{article_id} | Delete project article
[**PrivateProjectArticleDetails**](ProjectsApi.md#PrivateProjectArticleDetails) | **Get** /account/projects/{project_id}/articles/{article_id} | Project article details
[**PrivateProjectArticleFile**](ProjectsApi.md#PrivateProjectArticleFile) | **Get** /account/projects/{project_id}/articles/{article_id}/files/{file_id} | Project article file details
[**PrivateProjectArticleFiles**](ProjectsApi.md#PrivateProjectArticleFiles) | **Get** /account/projects/{project_id}/articles/{article_id}/files | Project article list files
[**PrivateProjectArticlesCreate**](ProjectsApi.md#PrivateProjectArticlesCreate) | **Post** /account/projects/{project_id}/articles | Create project article
[**PrivateProjectArticlesList**](ProjectsApi.md#PrivateProjectArticlesList) | **Get** /account/projects/{project_id}/articles | List project articles
[**PrivateProjectCollaboratorDelete**](ProjectsApi.md#PrivateProjectCollaboratorDelete) | **Delete** /account/projects/{project_id}/collaborators/{user_id} | Remove project collaborator
[**PrivateProjectCollaboratorsInvite**](ProjectsApi.md#PrivateProjectCollaboratorsInvite) | **Post** /account/projects/{project_id}/collaborators | Invite project collaborators
[**PrivateProjectCollaboratorsList**](ProjectsApi.md#PrivateProjectCollaboratorsList) | **Get** /account/projects/{project_id}/collaborators | List project collaborators
[**PrivateProjectCreate**](ProjectsApi.md#PrivateProjectCreate) | **Post** /account/projects | Create project
[**PrivateProjectDelete**](ProjectsApi.md#PrivateProjectDelete) | **Delete** /account/projects/{project_id} | Delete project
[**PrivateProjectDetails**](ProjectsApi.md#PrivateProjectDetails) | **Get** /account/projects/{project_id} | View project details
[**PrivateProjectLeave**](ProjectsApi.md#PrivateProjectLeave) | **Post** /account/projects/{project_id}/leave | Private Project Leave
[**PrivateProjectNote**](ProjectsApi.md#PrivateProjectNote) | **Get** /account/projects/{project_id}/notes/{note_id} | Project note details
[**PrivateProjectNoteDelete**](ProjectsApi.md#PrivateProjectNoteDelete) | **Delete** /account/projects/{project_id}/notes/{note_id} | Delete project note
[**PrivateProjectNoteUpdate**](ProjectsApi.md#PrivateProjectNoteUpdate) | **Put** /account/projects/{project_id}/notes/{note_id} | Update project note
[**PrivateProjectNotesCreate**](ProjectsApi.md#PrivateProjectNotesCreate) | **Post** /account/projects/{project_id}/notes | Create project note
[**PrivateProjectNotesList**](ProjectsApi.md#PrivateProjectNotesList) | **Get** /account/projects/{project_id}/notes | List project notes
[**PrivateProjectPublish**](ProjectsApi.md#PrivateProjectPublish) | **Post** /account/projects/{project_id}/publish | Private Project Publish
[**PrivateProjectUpdate**](ProjectsApi.md#PrivateProjectUpdate) | **Put** /account/projects/{project_id} | Update project
[**PrivateProjectsList**](ProjectsApi.md#PrivateProjectsList) | **Get** /account/projects | Private Projects
[**PrivateProjectsSearch**](ProjectsApi.md#PrivateProjectsSearch) | **Post** /account/projects/search | Private Projects search
[**ProjectArticles**](ProjectsApi.md#ProjectArticles) | **Get** /projects/{project_id}/articles | Public Project Articles
[**ProjectDetails**](ProjectsApi.md#ProjectDetails) | **Get** /projects/{project_id} | Public Project
[**ProjectsList**](ProjectsApi.md#ProjectsList) | **Get** /projects | Public Projects
[**ProjectsSearch**](ProjectsApi.md#ProjectsSearch) | **Post** /projects/search | Public Projects Search


# **PrivateProjectArticleDelete**
> PrivateProjectArticleDelete($projectId, $articleId)

Delete project article

Delete project article


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **int64**| Project unique identifier | 
 **articleId** | **int64**| Project Article unique identifier | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateProjectArticleDetails**
> ProjectArticle PrivateProjectArticleDetails($projectId, $articleId)

Project article details

Project article details


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **int64**| Project unique identifier | 
 **articleId** | **int64**| Project Article unique identifier | 

### Return type

[**ProjectArticle**](ProjectArticle.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateProjectArticleFile**
> PrivateFile PrivateProjectArticleFile($projectId, $articleId, $fileId)

Project article file details

Project article file details


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **int64**| Project unique identifier | 
 **articleId** | **int64**| Project Article unique identifier | 
 **fileId** | **int64**| File unique identifier | 

### Return type

[**PrivateFile**](PrivateFile.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateProjectArticleFiles**
> []PrivateFile PrivateProjectArticleFiles($projectId, $articleId)

Project article list files

List article files


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **int64**| Project unique identifier | 
 **articleId** | **int64**| Project Article unique identifier | 

### Return type

[**[]PrivateFile**](PrivateFile.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateProjectArticlesCreate**
> Location PrivateProjectArticlesCreate($projectId, $article, $page, $pageSize, $limit, $offset)

Create project article

Create a new Article and associate it with this project


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **int64**| Project unique identifier | 
 **article** | [**ArticleProjectCreate**](ArticleProjectCreate.md)| Article description | 
 **page** | **int64**| Page number. Used for pagination with page_size | [optional] 
 **pageSize** | **int64**| The number of results included on a page. Used for pagination with page | [optional] [default to 10]
 **limit** | **int64**| Number of results included on a page. Used for pagination with query | [optional] 
 **offset** | **int64**| Where to start the listing(the offset of the first result). Used for pagination with limit | [optional] 

### Return type

[**Location**](Location.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateProjectArticlesList**
> []Article PrivateProjectArticlesList($projectId, $page, $pageSize, $limit, $offset)

List project articles

List project articles


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **int64**| Project unique identifier | 
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

# **PrivateProjectCollaboratorDelete**
> PrivateProjectCollaboratorDelete($projectId, $userId)

Remove project collaborator

Remove project collaborator


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **int64**| Project unique identifier | 
 **userId** | **int64**| User unique identifier | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateProjectCollaboratorsInvite**
> ResponseMessage PrivateProjectCollaboratorsInvite($projectId, $collaborator)

Invite project collaborators

Invite users to collaborate on project or view the project


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **int64**| Project unique identifier | 
 **collaborator** | [**ProjectCollaboratorInvite**](ProjectCollaboratorInvite.md)| viewer or collaborator role. User user_id or email of user | 

### Return type

[**ResponseMessage**](ResponseMessage.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateProjectCollaboratorsList**
> []ProjectCollaborator PrivateProjectCollaboratorsList($projectId)

List project collaborators

List Project collaborators and invited users


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **int64**| Project unique identifier | 

### Return type

[**[]ProjectCollaborator**](ProjectCollaborator.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateProjectCreate**
> CreateProjectResponse PrivateProjectCreate($project)

Create project

Create a new project


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project** | [**ProjectCreate**](ProjectCreate.md)| Project  description | 

### Return type

[**CreateProjectResponse**](CreateProjectResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateProjectDelete**
> PrivateProjectDelete($projectId)

Delete project

A project can be deleted only if: - it is not public - it does not have public articles.  When an individual project is deleted, all the articles are moved to my data of each owner.  When a group project is deleted, all the articles and files are deleted as well. Only project owner, group admin and above can delete a project. 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **int64**| Project unique identifier | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateProjectDetails**
> ProjectCompletePrivate PrivateProjectDetails($projectId)

View project details

View a private project


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **int64**| Project unique identifier | 

### Return type

[**ProjectCompletePrivate**](ProjectCompletePrivate.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateProjectLeave**
> PrivateProjectLeave($projectId)

Private Project Leave

Please note: project's owner cannot leave the project.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **int64**| Project unique identifier | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateProjectNote**
> ProjectNotePrivate PrivateProjectNote($projectId, $noteId)

Project note details


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **int64**| Project unique identifier | 
 **noteId** | **int64**| Note unique identifier | 

### Return type

[**ProjectNotePrivate**](ProjectNotePrivate.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateProjectNoteDelete**
> PrivateProjectNoteDelete($projectId, $noteId)

Delete project note


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **int64**| Project unique identifier | 
 **noteId** | **int64**| Note unique identifier | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateProjectNoteUpdate**
> PrivateProjectNoteUpdate($projectId, $noteId, $note)

Update project note


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **int64**| Project unique identifier | 
 **noteId** | **int64**| Note unique identifier | 
 **note** | [**ProjectNoteCreate**](ProjectNoteCreate.md)| Note message | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateProjectNotesCreate**
> Location PrivateProjectNotesCreate($projectId, $note)

Create project note

Create a new project note


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **int64**| Project unique identifier | 
 **note** | [**ProjectNoteCreate**](ProjectNoteCreate.md)| Note message | 

### Return type

[**Location**](Location.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateProjectNotesList**
> []ProjectNote PrivateProjectNotesList($projectId, $page, $pageSize, $limit, $offset)

List project notes

List project notes


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **int64**| Project unique identifier | 
 **page** | **int64**| Page number. Used for pagination with page_size | [optional] 
 **pageSize** | **int64**| The number of results included on a page. Used for pagination with page | [optional] [default to 10]
 **limit** | **int64**| Number of results included on a page. Used for pagination with query | [optional] 
 **offset** | **int64**| Where to start the listing(the offset of the first result). Used for pagination with limit | [optional] 

### Return type

[**[]ProjectNote**](ProjectNote.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateProjectPublish**
> ResponseMessage PrivateProjectPublish($projectId)

Private Project Publish

Publish a project. Possible after all items inside it are public


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **int64**| Project unique identifier | 

### Return type

[**ResponseMessage**](ResponseMessage.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateProjectUpdate**
> PrivateProjectUpdate($projectId, $project)

Update project

Updating an project by passing body parameters; request can also be made with the PATCH method.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **int64**| Project unique identifier | 
 **project** | [**ProjectUpdate**](ProjectUpdate.md)| Project description | 

### Return type

void (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateProjectsList**
> []ProjectPrivate PrivateProjectsList($page, $pageSize, $limit, $offset, $order, $orderDirection, $storage, $roles)

Private Projects

List private projects


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int64**| Page number. Used for pagination with page_size | [optional] 
 **pageSize** | **int64**| The number of results included on a page. Used for pagination with page | [optional] [default to 10]
 **limit** | **int64**| Number of results included on a page. Used for pagination with query | [optional] 
 **offset** | **int64**| Where to start the listing(the offset of the first result). Used for pagination with limit | [optional] 
 **order** | **string**| The field by which to order. | [optional] [default to published_date]
 **orderDirection** | **string**|  | [optional] [default to desc]
 **storage** | **string**| only return collections from this institution | [optional] 
 **roles** | **string**| Any combination of owner, collaborator, viewer separated by comma. Examples: \&quot;owner\&quot; or \&quot;owner,collaborator\&quot;. | [optional] 

### Return type

[**[]ProjectPrivate**](ProjectPrivate.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PrivateProjectsSearch**
> []ProjectPrivate PrivateProjectsSearch($search)

Private Projects search

Search inside the private projects


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | [**ProjectsSearch**](ProjectsSearch.md)| Search Parameters | [optional] 

### Return type

[**[]ProjectPrivate**](ProjectPrivate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ProjectArticles**
> []Article ProjectArticles($projectId)

Public Project Articles

List articles in project


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **int64**| Project Unique identifier | 

### Return type

[**[]Article**](Article.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ProjectDetails**
> ProjectComplete ProjectDetails($projectId)

Public Project

View a project


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **int64**| Project Unique identifier | 

### Return type

[**ProjectComplete**](ProjectComplete.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ProjectsList**
> []Project ProjectsList($xCursor, $page, $pageSize, $limit, $offset, $order, $orderDirection, $institution, $publishedSince, $group)

Public Projects

Returns a list of public projects


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
 **publishedSince** | **string**| Filter by article publishing date. Will only return articles published after the date. date(ISO 8601) YYYY-MM-DD | [optional] 
 **group** | **int64**| only return collections from this group | [optional] 

### Return type

[**[]Project**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ProjectsSearch**
> []Project ProjectsSearch($xCursor, $search)

Public Projects Search

Returns a list of public articles


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xCursor** | **string**| Unique hash used for bypassing the item retrieval limit of 9,000 entities. When using this parameter, please note that the offset parameter will not be available, but the limit parameter will still work as expected. | [optional] 
 **search** | [**ProjectsSearch**](ProjectsSearch.md)| Search Parameters | [optional] 

### Return type

[**[]Project**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


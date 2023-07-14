# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ArticlesApi;

import java.io.File;
import java.util.*;

public class ArticlesApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        ArticlesApi apiInstance = new ArticlesApi();
        Long groupId = 789L; // Long | A group ID to filter by
        try {
            List<AccountReport> result = apiInstance.accountArticleReport(groupId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ArticlesApi#accountArticleReport");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.figinternal.dev/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ArticlesApi* | [**accountArticleReport**](docs/ArticlesApi.md#accountArticleReport) | **GET** /account/articles/export | Account Article Report
*ArticlesApi* | [**accountArticleReportGenerate**](docs/ArticlesApi.md#accountArticleReportGenerate) | **POST** /account/articles/export | Initiate a new Report
*ArticlesApi* | [**articleDetails**](docs/ArticlesApi.md#articleDetails) | **GET** /articles/{article_id} | View article details
*ArticlesApi* | [**articleFileDetails**](docs/ArticlesApi.md#articleFileDetails) | **GET** /articles/{article_id}/files/{file_id} | Article file details
*ArticlesApi* | [**articleFiles**](docs/ArticlesApi.md#articleFiles) | **GET** /articles/{article_id}/files | List article files
*ArticlesApi* | [**articleVersionConfidentiality**](docs/ArticlesApi.md#articleVersionConfidentiality) | **GET** /articles/{article_id}/versions/{v_number}/confidentiality | Public Article Confidentiality for article version
*ArticlesApi* | [**articleVersionDetails**](docs/ArticlesApi.md#articleVersionDetails) | **GET** /articles/{article_id}/versions/{v_number} | Article details for version
*ArticlesApi* | [**articleVersionEmbargo**](docs/ArticlesApi.md#articleVersionEmbargo) | **GET** /articles/{article_id}/versions/{v_number}/embargo | Public Article Embargo for article version
*ArticlesApi* | [**articleVersionUpdate**](docs/ArticlesApi.md#articleVersionUpdate) | **PUT** /account/articles/{article_id}/versions/{version_id}/ | Update article version
*ArticlesApi* | [**articleVersionUpdateThumb**](docs/ArticlesApi.md#articleVersionUpdateThumb) | **PUT** /account/articles/{article_id}/versions/{version_id}/update_thumb | Update article version thumbnail
*ArticlesApi* | [**articleVersions**](docs/ArticlesApi.md#articleVersions) | **GET** /articles/{article_id}/versions | List article versions
*ArticlesApi* | [**articlesList**](docs/ArticlesApi.md#articlesList) | **GET** /articles | Public Articles
*ArticlesApi* | [**articlesSearch**](docs/ArticlesApi.md#articlesSearch) | **POST** /articles/search | Public Articles Search
*ArticlesApi* | [**privateArticleAuthorDelete**](docs/ArticlesApi.md#privateArticleAuthorDelete) | **DELETE** /account/articles/{article_id}/authors/{author_id} | Delete article author
*ArticlesApi* | [**privateArticleAuthorsAdd**](docs/ArticlesApi.md#privateArticleAuthorsAdd) | **POST** /account/articles/{article_id}/authors | Add article authors
*ArticlesApi* | [**privateArticleAuthorsList**](docs/ArticlesApi.md#privateArticleAuthorsList) | **GET** /account/articles/{article_id}/authors | List article authors
*ArticlesApi* | [**privateArticleAuthorsReplace**](docs/ArticlesApi.md#privateArticleAuthorsReplace) | **PUT** /account/articles/{article_id}/authors | Replace article authors
*ArticlesApi* | [**privateArticleCategoriesAdd**](docs/ArticlesApi.md#privateArticleCategoriesAdd) | **POST** /account/articles/{article_id}/categories | Add article categories
*ArticlesApi* | [**privateArticleCategoriesList**](docs/ArticlesApi.md#privateArticleCategoriesList) | **GET** /account/articles/{article_id}/categories | List article categories
*ArticlesApi* | [**privateArticleCategoriesReplace**](docs/ArticlesApi.md#privateArticleCategoriesReplace) | **PUT** /account/articles/{article_id}/categories | Replace article categories
*ArticlesApi* | [**privateArticleCategoryDelete**](docs/ArticlesApi.md#privateArticleCategoryDelete) | **DELETE** /account/articles/{article_id}/categories/{category_id} | Delete article category
*ArticlesApi* | [**privateArticleConfidentialityDelete**](docs/ArticlesApi.md#privateArticleConfidentialityDelete) | **DELETE** /account/articles/{article_id}/confidentiality | Delete article confidentiality
*ArticlesApi* | [**privateArticleConfidentialityDetails**](docs/ArticlesApi.md#privateArticleConfidentialityDetails) | **GET** /account/articles/{article_id}/confidentiality | Article confidentiality details
*ArticlesApi* | [**privateArticleConfidentialityUpdate**](docs/ArticlesApi.md#privateArticleConfidentialityUpdate) | **PUT** /account/articles/{article_id}/confidentiality | Update article confidentiality
*ArticlesApi* | [**privateArticleCreate**](docs/ArticlesApi.md#privateArticleCreate) | **POST** /account/articles | Create new Article
*ArticlesApi* | [**privateArticleDelete**](docs/ArticlesApi.md#privateArticleDelete) | **DELETE** /account/articles/{article_id} | Delete article
*ArticlesApi* | [**privateArticleDetails**](docs/ArticlesApi.md#privateArticleDetails) | **GET** /account/articles/{article_id} | Article details
*ArticlesApi* | [**privateArticleEmbargoDelete**](docs/ArticlesApi.md#privateArticleEmbargoDelete) | **DELETE** /account/articles/{article_id}/embargo | Delete Article Embargo
*ArticlesApi* | [**privateArticleEmbargoDetails**](docs/ArticlesApi.md#privateArticleEmbargoDetails) | **GET** /account/articles/{article_id}/embargo | Article Embargo Details
*ArticlesApi* | [**privateArticleEmbargoUpdate**](docs/ArticlesApi.md#privateArticleEmbargoUpdate) | **PUT** /account/articles/{article_id}/embargo | Update Article Embargo
*ArticlesApi* | [**privateArticleFile**](docs/ArticlesApi.md#privateArticleFile) | **GET** /account/articles/{article_id}/files/{file_id} | Single File
*ArticlesApi* | [**privateArticleFileDelete**](docs/ArticlesApi.md#privateArticleFileDelete) | **DELETE** /account/articles/{article_id}/files/{file_id} | File Delete
*ArticlesApi* | [**privateArticleFilesList**](docs/ArticlesApi.md#privateArticleFilesList) | **GET** /account/articles/{article_id}/files | List article files
*ArticlesApi* | [**privateArticlePrivateLink**](docs/ArticlesApi.md#privateArticlePrivateLink) | **GET** /account/articles/{article_id}/private_links | List private links
*ArticlesApi* | [**privateArticlePrivateLinkCreate**](docs/ArticlesApi.md#privateArticlePrivateLinkCreate) | **POST** /account/articles/{article_id}/private_links | Create private link
*ArticlesApi* | [**privateArticlePrivateLinkDelete**](docs/ArticlesApi.md#privateArticlePrivateLinkDelete) | **DELETE** /account/articles/{article_id}/private_links/{link_id} | Disable private link
*ArticlesApi* | [**privateArticlePrivateLinkUpdate**](docs/ArticlesApi.md#privateArticlePrivateLinkUpdate) | **PUT** /account/articles/{article_id}/private_links/{link_id} | Update private link
*ArticlesApi* | [**privateArticlePublish**](docs/ArticlesApi.md#privateArticlePublish) | **POST** /account/articles/{article_id}/publish | Private Article Publish
*ArticlesApi* | [**privateArticleReserveDoi**](docs/ArticlesApi.md#privateArticleReserveDoi) | **POST** /account/articles/{article_id}/reserve_doi | Private Article Reserve DOI
*ArticlesApi* | [**privateArticleReserveHandle**](docs/ArticlesApi.md#privateArticleReserveHandle) | **POST** /account/articles/{article_id}/reserve_handle | Private Article Reserve Handle
*ArticlesApi* | [**privateArticleResource**](docs/ArticlesApi.md#privateArticleResource) | **POST** /account/articles/{article_id}/resource | Private Article Resource
*ArticlesApi* | [**privateArticleUpdate**](docs/ArticlesApi.md#privateArticleUpdate) | **PUT** /account/articles/{article_id} | Update article
*ArticlesApi* | [**privateArticleUploadComplete**](docs/ArticlesApi.md#privateArticleUploadComplete) | **POST** /account/articles/{article_id}/files/{file_id} | Complete Upload
*ArticlesApi* | [**privateArticleUploadInitiate**](docs/ArticlesApi.md#privateArticleUploadInitiate) | **POST** /account/articles/{article_id}/files | Initiate Upload
*ArticlesApi* | [**privateArticlesList**](docs/ArticlesApi.md#privateArticlesList) | **GET** /account/articles | Private Articles
*ArticlesApi* | [**privateArticlesSearch**](docs/ArticlesApi.md#privateArticlesSearch) | **POST** /account/articles/search | Private Articles search
*AuthorsApi* | [**privateAuthorDetails**](docs/AuthorsApi.md#privateAuthorDetails) | **GET** /account/authors/{author_id} | Author details
*AuthorsApi* | [**privateAuthorsSearch**](docs/AuthorsApi.md#privateAuthorsSearch) | **POST** /account/authors/search | Search Authors
*CollectionsApi* | [**collectionArticles**](docs/CollectionsApi.md#collectionArticles) | **GET** /collections/{collection_id}/articles | Public Collection Articles
*CollectionsApi* | [**collectionDetails**](docs/CollectionsApi.md#collectionDetails) | **GET** /collections/{collection_id} | Collection details
*CollectionsApi* | [**collectionVersionDetails**](docs/CollectionsApi.md#collectionVersionDetails) | **GET** /collections/{collection_id}/versions/{version_id} | Collection Version details
*CollectionsApi* | [**collectionVersions**](docs/CollectionsApi.md#collectionVersions) | **GET** /collections/{collection_id}/versions | Collection Versions list
*CollectionsApi* | [**collectionsList**](docs/CollectionsApi.md#collectionsList) | **GET** /collections | Public Collections
*CollectionsApi* | [**collectionsSearch**](docs/CollectionsApi.md#collectionsSearch) | **POST** /collections/search | Public Collections Search
*CollectionsApi* | [**privateCollectionArticleDelete**](docs/CollectionsApi.md#privateCollectionArticleDelete) | **DELETE** /account/collections/{collection_id}/articles/{article_id} | Delete collection article
*CollectionsApi* | [**privateCollectionArticlesAdd**](docs/CollectionsApi.md#privateCollectionArticlesAdd) | **POST** /account/collections/{collection_id}/articles | Add collection articles
*CollectionsApi* | [**privateCollectionArticlesList**](docs/CollectionsApi.md#privateCollectionArticlesList) | **GET** /account/collections/{collection_id}/articles | List collection articles
*CollectionsApi* | [**privateCollectionArticlesReplace**](docs/CollectionsApi.md#privateCollectionArticlesReplace) | **PUT** /account/collections/{collection_id}/articles | Replace collection articles
*CollectionsApi* | [**privateCollectionAuthorDelete**](docs/CollectionsApi.md#privateCollectionAuthorDelete) | **DELETE** /account/collections/{collection_id}/authors/{author_id} | Delete collection author
*CollectionsApi* | [**privateCollectionAuthorsAdd**](docs/CollectionsApi.md#privateCollectionAuthorsAdd) | **POST** /account/collections/{collection_id}/authors | Add collection authors
*CollectionsApi* | [**privateCollectionAuthorsList**](docs/CollectionsApi.md#privateCollectionAuthorsList) | **GET** /account/collections/{collection_id}/authors | List collection authors
*CollectionsApi* | [**privateCollectionAuthorsReplace**](docs/CollectionsApi.md#privateCollectionAuthorsReplace) | **PUT** /account/collections/{collection_id}/authors | Replace collection authors
*CollectionsApi* | [**privateCollectionCategoriesAdd**](docs/CollectionsApi.md#privateCollectionCategoriesAdd) | **POST** /account/collections/{collection_id}/categories | Add collection categories
*CollectionsApi* | [**privateCollectionCategoriesList**](docs/CollectionsApi.md#privateCollectionCategoriesList) | **GET** /account/collections/{collection_id}/categories | List collection categories
*CollectionsApi* | [**privateCollectionCategoriesReplace**](docs/CollectionsApi.md#privateCollectionCategoriesReplace) | **PUT** /account/collections/{collection_id}/categories | Replace collection categories
*CollectionsApi* | [**privateCollectionCategoryDelete**](docs/CollectionsApi.md#privateCollectionCategoryDelete) | **DELETE** /account/collections/{collection_id}/categories/{category_id} | Delete collection category
*CollectionsApi* | [**privateCollectionCreate**](docs/CollectionsApi.md#privateCollectionCreate) | **POST** /account/collections | Create collection
*CollectionsApi* | [**privateCollectionDelete**](docs/CollectionsApi.md#privateCollectionDelete) | **DELETE** /account/collections/{collection_id} | Delete collection
*CollectionsApi* | [**privateCollectionDetails**](docs/CollectionsApi.md#privateCollectionDetails) | **GET** /account/collections/{collection_id} | Collection details
*CollectionsApi* | [**privateCollectionPrivateLinkCreate**](docs/CollectionsApi.md#privateCollectionPrivateLinkCreate) | **POST** /account/collections/{collection_id}/private_links | Create collection private link
*CollectionsApi* | [**privateCollectionPrivateLinkDelete**](docs/CollectionsApi.md#privateCollectionPrivateLinkDelete) | **DELETE** /account/collections/{collection_id}/private_links/{link_id} | Disable private link
*CollectionsApi* | [**privateCollectionPrivateLinkUpdate**](docs/CollectionsApi.md#privateCollectionPrivateLinkUpdate) | **PUT** /account/collections/{collection_id}/private_links/{link_id} | Update collection private link
*CollectionsApi* | [**privateCollectionPrivateLinksList**](docs/CollectionsApi.md#privateCollectionPrivateLinksList) | **GET** /account/collections/{collection_id}/private_links | List collection private links
*CollectionsApi* | [**privateCollectionPublish**](docs/CollectionsApi.md#privateCollectionPublish) | **POST** /account/collections/{collection_id}/publish | Private Collection Publish
*CollectionsApi* | [**privateCollectionReserveDoi**](docs/CollectionsApi.md#privateCollectionReserveDoi) | **POST** /account/collections/{collection_id}/reserve_doi | Private Collection Reserve DOI
*CollectionsApi* | [**privateCollectionReserveHandle**](docs/CollectionsApi.md#privateCollectionReserveHandle) | **POST** /account/collections/{collection_id}/reserve_handle | Private Collection Reserve Handle
*CollectionsApi* | [**privateCollectionResource**](docs/CollectionsApi.md#privateCollectionResource) | **POST** /account/collections/{collection_id}/resource | Private Collection Resource
*CollectionsApi* | [**privateCollectionUpdate**](docs/CollectionsApi.md#privateCollectionUpdate) | **PUT** /account/collections/{collection_id} | Update collection
*CollectionsApi* | [**privateCollectionsList**](docs/CollectionsApi.md#privateCollectionsList) | **GET** /account/collections | Private Collections List
*CollectionsApi* | [**privateCollectionsSearch**](docs/CollectionsApi.md#privateCollectionsSearch) | **POST** /account/collections/search | Private Collections Search
*InstitutionsApi* | [**accountInstitutionCuration**](docs/InstitutionsApi.md#accountInstitutionCuration) | **GET** /account/institution/review/{curation_id} | Institution Curation Review
*InstitutionsApi* | [**accountInstitutionCurationComments**](docs/InstitutionsApi.md#accountInstitutionCurationComments) | **GET** /account/institution/review/{curation_id}/comments | Institution Curation Review Comments
*InstitutionsApi* | [**accountInstitutionCurationComments_0**](docs/InstitutionsApi.md#accountInstitutionCurationComments_0) | **POST** /account/institution/review/{curation_id}/comments | POST Institution Curation Review Comment
*InstitutionsApi* | [**accountInstitutionCurations**](docs/InstitutionsApi.md#accountInstitutionCurations) | **GET** /account/institution/reviews | Institution Curation Reviews
*InstitutionsApi* | [**customFieldsList**](docs/InstitutionsApi.md#customFieldsList) | **GET** /account/institution/custom_fields | Private account institution group custom fields
*InstitutionsApi* | [**customFieldsUpload**](docs/InstitutionsApi.md#customFieldsUpload) | **POST** /account/institution/custom_fields/{custom_field_id}/items/upload | Custom fields values files upload
*InstitutionsApi* | [**institutionArticles**](docs/InstitutionsApi.md#institutionArticles) | **GET** /institutions/{institution_string_id}/articles/filter-by | Public Licenses
*InstitutionsApi* | [**institutionHrfeedUpload**](docs/InstitutionsApi.md#institutionHrfeedUpload) | **POST** /institution/hrfeed/upload | Private Institution HRfeed Upload
*InstitutionsApi* | [**privateAccountInstitutionUser**](docs/InstitutionsApi.md#privateAccountInstitutionUser) | **GET** /account/institution/users/{account_id} | Private Account Institution User
*InstitutionsApi* | [**privateCategoriesList**](docs/InstitutionsApi.md#privateCategoriesList) | **GET** /account/categories | Private Account Categories
*InstitutionsApi* | [**privateGroupEmbargoOptionsDetails**](docs/InstitutionsApi.md#privateGroupEmbargoOptionsDetails) | **GET** /account/institution/groups/{group_id}/embargo_options | Private Account Institution Group Embargo Options
*InstitutionsApi* | [**privateInstitutionAccountGroupRoleDelete**](docs/InstitutionsApi.md#privateInstitutionAccountGroupRoleDelete) | **DELETE** /account/institution/roles/{account_id}/{group_id}/{role_id} | Delete Institution Account Group Role
*InstitutionsApi* | [**privateInstitutionAccountGroupRoles**](docs/InstitutionsApi.md#privateInstitutionAccountGroupRoles) | **GET** /account/institution/roles/{account_id} | List Institution Account Group Roles
*InstitutionsApi* | [**privateInstitutionAccountGroupRolesCreate**](docs/InstitutionsApi.md#privateInstitutionAccountGroupRolesCreate) | **POST** /account/institution/roles/{account_id} | Add Institution Account Group Roles
*InstitutionsApi* | [**privateInstitutionAccountsCreate**](docs/InstitutionsApi.md#privateInstitutionAccountsCreate) | **POST** /account/institution/accounts | Create new Institution Account
*InstitutionsApi* | [**privateInstitutionAccountsList**](docs/InstitutionsApi.md#privateInstitutionAccountsList) | **GET** /account/institution/accounts | Private Account Institution Accounts
*InstitutionsApi* | [**privateInstitutionAccountsSearch**](docs/InstitutionsApi.md#privateInstitutionAccountsSearch) | **POST** /account/institution/accounts/search | Private Account Institution Accounts Search
*InstitutionsApi* | [**privateInstitutionAccountsUpdate**](docs/InstitutionsApi.md#privateInstitutionAccountsUpdate) | **PUT** /account/institution/accounts/{account_id} | Update Institution Account
*InstitutionsApi* | [**privateInstitutionArticles**](docs/InstitutionsApi.md#privateInstitutionArticles) | **GET** /account/institution/articles | Private Institution Articles
*InstitutionsApi* | [**privateInstitutionDetails**](docs/InstitutionsApi.md#privateInstitutionDetails) | **GET** /account/institution | Private Account Institutions
*InstitutionsApi* | [**privateInstitutionEmbargoOptionsDetails**](docs/InstitutionsApi.md#privateInstitutionEmbargoOptionsDetails) | **GET** /account/institution/embargo_options | Private Account Institution embargo options
*InstitutionsApi* | [**privateInstitutionGroupsList**](docs/InstitutionsApi.md#privateInstitutionGroupsList) | **GET** /account/institution/groups | Private Account Institution Groups
*InstitutionsApi* | [**privateInstitutionRolesList**](docs/InstitutionsApi.md#privateInstitutionRolesList) | **GET** /account/institution/roles | Private Account Institution Roles
*OtherApi* | [**categoriesList**](docs/OtherApi.md#categoriesList) | **GET** /categories | Public Categories
*OtherApi* | [**fileDownload**](docs/OtherApi.md#fileDownload) | **GET** /file/download/{file_id} | Public File Download
*OtherApi* | [**itemTypesList**](docs/OtherApi.md#itemTypesList) | **GET** /item_types | Item Types
*OtherApi* | [**licensesList**](docs/OtherApi.md#licensesList) | **GET** /licenses | Public Licenses
*OtherApi* | [**privateAccount**](docs/OtherApi.md#privateAccount) | **GET** /account | Private Account information
*OtherApi* | [**privateFundingSearch**](docs/OtherApi.md#privateFundingSearch) | **POST** /account/funding/search | Search Funding
*OtherApi* | [**privateLicensesList**](docs/OtherApi.md#privateLicensesList) | **GET** /account/licenses | Private Account Licenses
*ProjectsApi* | [**privateProjectArticleDelete**](docs/ProjectsApi.md#privateProjectArticleDelete) | **DELETE** /account/projects/{project_id}/articles/{article_id} | Delete project article
*ProjectsApi* | [**privateProjectArticleDetails**](docs/ProjectsApi.md#privateProjectArticleDetails) | **GET** /account/projects/{project_id}/articles/{article_id} | Project article details
*ProjectsApi* | [**privateProjectArticleFile**](docs/ProjectsApi.md#privateProjectArticleFile) | **GET** /account/projects/{project_id}/articles/{article_id}/files/{file_id} | Project article file details
*ProjectsApi* | [**privateProjectArticleFiles**](docs/ProjectsApi.md#privateProjectArticleFiles) | **GET** /account/projects/{project_id}/articles/{article_id}/files | Project article list files
*ProjectsApi* | [**privateProjectArticlesCreate**](docs/ProjectsApi.md#privateProjectArticlesCreate) | **POST** /account/projects/{project_id}/articles | Create project article
*ProjectsApi* | [**privateProjectArticlesList**](docs/ProjectsApi.md#privateProjectArticlesList) | **GET** /account/projects/{project_id}/articles | List project articles
*ProjectsApi* | [**privateProjectCollaboratorDelete**](docs/ProjectsApi.md#privateProjectCollaboratorDelete) | **DELETE** /account/projects/{project_id}/collaborators/{user_id} | Remove project collaborator
*ProjectsApi* | [**privateProjectCollaboratorsInvite**](docs/ProjectsApi.md#privateProjectCollaboratorsInvite) | **POST** /account/projects/{project_id}/collaborators | Invite project collaborators
*ProjectsApi* | [**privateProjectCollaboratorsList**](docs/ProjectsApi.md#privateProjectCollaboratorsList) | **GET** /account/projects/{project_id}/collaborators | List project collaborators
*ProjectsApi* | [**privateProjectCreate**](docs/ProjectsApi.md#privateProjectCreate) | **POST** /account/projects | Create project
*ProjectsApi* | [**privateProjectDelete**](docs/ProjectsApi.md#privateProjectDelete) | **DELETE** /account/projects/{project_id} | Delete project
*ProjectsApi* | [**privateProjectDetails**](docs/ProjectsApi.md#privateProjectDetails) | **GET** /account/projects/{project_id} | View project details
*ProjectsApi* | [**privateProjectLeave**](docs/ProjectsApi.md#privateProjectLeave) | **POST** /account/projects/{project_id}/leave | Private Project Leave
*ProjectsApi* | [**privateProjectNote**](docs/ProjectsApi.md#privateProjectNote) | **GET** /account/projects/{project_id}/notes/{note_id} | Project note details
*ProjectsApi* | [**privateProjectNoteDelete**](docs/ProjectsApi.md#privateProjectNoteDelete) | **DELETE** /account/projects/{project_id}/notes/{note_id} | Delete project note
*ProjectsApi* | [**privateProjectNoteUpdate**](docs/ProjectsApi.md#privateProjectNoteUpdate) | **PUT** /account/projects/{project_id}/notes/{note_id} | Update project note
*ProjectsApi* | [**privateProjectNotesCreate**](docs/ProjectsApi.md#privateProjectNotesCreate) | **POST** /account/projects/{project_id}/notes | Create project note
*ProjectsApi* | [**privateProjectNotesList**](docs/ProjectsApi.md#privateProjectNotesList) | **GET** /account/projects/{project_id}/notes | List project notes
*ProjectsApi* | [**privateProjectPublish**](docs/ProjectsApi.md#privateProjectPublish) | **POST** /account/projects/{project_id}/publish | Private Project Publish
*ProjectsApi* | [**privateProjectUpdate**](docs/ProjectsApi.md#privateProjectUpdate) | **PUT** /account/projects/{project_id} | Update project
*ProjectsApi* | [**privateProjectsList**](docs/ProjectsApi.md#privateProjectsList) | **GET** /account/projects | Private Projects
*ProjectsApi* | [**privateProjectsSearch**](docs/ProjectsApi.md#privateProjectsSearch) | **POST** /account/projects/search | Private Projects search
*ProjectsApi* | [**projectArticles**](docs/ProjectsApi.md#projectArticles) | **GET** /projects/{project_id}/articles | Public Project Articles
*ProjectsApi* | [**projectDetails**](docs/ProjectsApi.md#projectDetails) | **GET** /projects/{project_id} | Public Project
*ProjectsApi* | [**projectsList**](docs/ProjectsApi.md#projectsList) | **GET** /projects | Public Projects
*ProjectsApi* | [**projectsSearch**](docs/ProjectsApi.md#projectsSearch) | **POST** /projects/search | Public Projects Search


## Documentation for Models

 - [Account](docs/Account.md)
 - [AccountCreate](docs/AccountCreate.md)
 - [AccountGroupRoles](docs/AccountGroupRoles.md)
 - [AccountGroupRolesCreate](docs/AccountGroupRolesCreate.md)
 - [AccountReport](docs/AccountReport.md)
 - [AccountUpdate](docs/AccountUpdate.md)
 - [Article](docs/Article.md)
 - [ArticleConfidentiality](docs/ArticleConfidentiality.md)
 - [ArticleCreate](docs/ArticleCreate.md)
 - [ArticleDOI](docs/ArticleDOI.md)
 - [ArticleEmbargo](docs/ArticleEmbargo.md)
 - [ArticleEmbargoUpdater](docs/ArticleEmbargoUpdater.md)
 - [ArticleHandle](docs/ArticleHandle.md)
 - [ArticleProjectCreate](docs/ArticleProjectCreate.md)
 - [ArticleUpdate](docs/ArticleUpdate.md)
 - [ArticleVersions](docs/ArticleVersions.md)
 - [ArticlesCreator](docs/ArticlesCreator.md)
 - [Author](docs/Author.md)
 - [AuthorsCreator](docs/AuthorsCreator.md)
 - [CategoriesCreator](docs/CategoriesCreator.md)
 - [Category](docs/Category.md)
 - [Collaborator](docs/Collaborator.md)
 - [Collection](docs/Collection.md)
 - [CollectionCreate](docs/CollectionCreate.md)
 - [CollectionDOI](docs/CollectionDOI.md)
 - [CollectionHandle](docs/CollectionHandle.md)
 - [CollectionPrivateLinkCreator](docs/CollectionPrivateLinkCreator.md)
 - [CollectionUpdate](docs/CollectionUpdate.md)
 - [CollectionVersions](docs/CollectionVersions.md)
 - [CommonSearch](docs/CommonSearch.md)
 - [ConfidentialityCreator](docs/ConfidentialityCreator.md)
 - [CreateProjectResponse](docs/CreateProjectResponse.md)
 - [Curation](docs/Curation.md)
 - [CurationComment](docs/CurationComment.md)
 - [CurationCommentCreate](docs/CurationCommentCreate.md)
 - [CustomArticleField](docs/CustomArticleField.md)
 - [CustomArticleFieldAdd](docs/CustomArticleFieldAdd.md)
 - [ErrorMessage](docs/ErrorMessage.md)
 - [FileCreator](docs/FileCreator.md)
 - [FileId](docs/FileId.md)
 - [FundingCreate](docs/FundingCreate.md)
 - [FundingInformation](docs/FundingInformation.md)
 - [FundingSearch](docs/FundingSearch.md)
 - [Group](docs/Group.md)
 - [GroupEmbargoOptions](docs/GroupEmbargoOptions.md)
 - [Institution](docs/Institution.md)
 - [InstitutionAccountsSearch](docs/InstitutionAccountsSearch.md)
 - [ItemType](docs/ItemType.md)
 - [License](docs/License.md)
 - [Location](docs/Location.md)
 - [LocationWarnings](docs/LocationWarnings.md)
 - [LocationWarningsUpdate](docs/LocationWarningsUpdate.md)
 - [PrivateAuthorsSearch](docs/PrivateAuthorsSearch.md)
 - [PrivateLink](docs/PrivateLink.md)
 - [PrivateLinkCreator](docs/PrivateLinkCreator.md)
 - [PrivateLinkResponse](docs/PrivateLinkResponse.md)
 - [Project](docs/Project.md)
 - [ProjectCollaborator](docs/ProjectCollaborator.md)
 - [ProjectCollaboratorInvite](docs/ProjectCollaboratorInvite.md)
 - [ProjectCreate](docs/ProjectCreate.md)
 - [ProjectNote](docs/ProjectNote.md)
 - [ProjectNoteCreate](docs/ProjectNoteCreate.md)
 - [ProjectUpdate](docs/ProjectUpdate.md)
 - [PublicFile](docs/PublicFile.md)
 - [RelatedMaterial](docs/RelatedMaterial.md)
 - [Resource](docs/Resource.md)
 - [ResponseMessage](docs/ResponseMessage.md)
 - [Role](docs/Role.md)
 - [ShortAccount](docs/ShortAccount.md)
 - [ShortCustomField](docs/ShortCustomField.md)
 - [TimelineUpdate](docs/TimelineUpdate.md)
 - [UploadFilePart](docs/UploadFilePart.md)
 - [UploadInfo](docs/UploadInfo.md)
 - [User](docs/User.md)
 - [ArticleSearch](docs/ArticleSearch.md)
 - [ArticleWithProject](docs/ArticleWithProject.md)
 - [AuthorComplete](docs/AuthorComplete.md)
 - [CollectionComplete](docs/CollectionComplete.md)
 - [CollectionCompletePrivate](docs/CollectionCompletePrivate.md)
 - [CollectionSearch](docs/CollectionSearch.md)
 - [CurationDetail](docs/CurationDetail.md)
 - [PrivateFile](docs/PrivateFile.md)
 - [ProjectArticle](docs/ProjectArticle.md)
 - [ProjectComplete](docs/ProjectComplete.md)
 - [ProjectNotePrivate](docs/ProjectNotePrivate.md)
 - [ProjectPrivate](docs/ProjectPrivate.md)
 - [ProjectsSearch](docs/ProjectsSearch.md)
 - [Timeline](docs/Timeline.md)
 - [ArticleComplete](docs/ArticleComplete.md)
 - [PrivateArticleSearch](docs/PrivateArticleSearch.md)
 - [PrivateCollectionSearch](docs/PrivateCollectionSearch.md)
 - [ProjectCompletePrivate](docs/ProjectCompletePrivate.md)
 - [ArticleCompletePrivate](docs/ArticleCompletePrivate.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### OAuth2

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://figshare.com/account/applications/authorize
- **Scopes**: 
  - all: Grants all access


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author




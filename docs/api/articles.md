# Article endpoints

* **[Public](#article-public-endpoints)**
  - [list public articles](#list-public-articles)
  - [search public articles](#search-public-articles)
  - [read public article](#read-public-article)
  - [article versions](#article-versions-subsection)
    - [list versions](#list-versions)
    - [read public article version](#read-public-article-version)
    - [read public article version embargo](#read-public-article-version-embargo)
    - [read public article version confidentiality](#read-public-article-version-confidentiality)


* **[Private](#article-private-endpoints-oauth-required)**
  - [get own articles](#get-own-articles)
  - [search own articles](#search-own-articles)
  - [create a new article](#create-a-new-article)
  - [read own article](#read-own-article)
  - [update article](#update-article)
  - [delete own private article](#delete-own-private-article)
  - [reserve doi for article](#reserve-doi-for-article)
  - [publish article](#publish-article)
  - [article authors](#article-authors-subsection)
    - [list authors](#list-authors)
    - [associate new authors](#associate-new-authors-with-the-article)
    - [associate and replace authors](#associate-and-replace-existing-authors-of-this-article)
    - [de-associate author](#de-associate-author-from-article)
  - [article categories](#article-categories-subsection)
    - [list categories](#list-categories)
    - [associate new categories](#associate-new-categories-with-the-article)
    - [associate and replace categories](#associate-and-replace-existing-categories-of-this-article)
    - [de-associate category](#de-associate-category-from-article)
  - [article files](#article-files-subsection)
    - [list files](#list-files)
    - [initiate new file upload](#initiate-new-file-upload-within-the-article)
    - [upload file content](#upload-file-content)
    - [complete file upload](#complete-file-upload)
    - [view file information](#view-file-information)
    - [delete file from article](#delete-file--from-article)
  - [article private links](#article-private-links-subsection)
    - [list private links](#list-private-links)
    - [create new private link](#create-new-private-link-for-this-article)
    - [update existing private link](#update-existing-private-link-for-this--article)
    - [disable/delete private link](#disabledelete-private-link-for-article)
  - [article embargo](#article-embargo-subsection)
    - [view embargo settings](#view-embargo-settings)
    - [update embargo settings](#update-embargo-settings)
    - [delete embargo settings](#delete-embargo-settings)
  - [article confidentiality](#article-confidentiality-subsection)
    - [view confidentiality settings](#view-confidentiality-settings)
    - [update confidentiality settings](#update-confidentiality-settings)
    - [delete confidentiality settings](#delete-confidentiality-settings)


# Article public endpoints

##List public articles

    GET /v2/articles

**Input**

Accepts `pagination`, `sorting`, `filtering` params. See [API feature list](index.md#api-feature-list) for details.

Accepted filters:

|field|type|notes|
|-----|----|-----|
|`institution`|int|only return collections from this institution|
|`group`|int|only return collections from this group|
|`published_since`|date(ISO 8601)|Only collections published after the date|
|`modified_since`|date(ISO 8601)|Only collections published after the date|

Defaults:

|field|value|
|-----|-----|
|`order`|`published_date`|
|`order_direction`|`desc`|
|`page_size`|`10`|


**Success Response (list of articles)**
Status: 200 OK

[[ArticlePresenter](presenters/article.md#articlepresenter)]

**Error Response (Max page number reached)**

```
Status: 400 Bad request
```
```json
{"message": "Max page reached. Please narrow down your search"}
```


##Search public articles

    POST /v2/articles/search

**Input**

Accepts `pagination`, `sorting`, `filtering` and `search` params. See [API feature list](index.md#api-feature-list) for details.

Filters and defaults are the same as for  the
[list public articles](#list-public-articles)

**Success Response (list of articles)**
Status: 200 OK

[[ArticlePresenter](presenters/article.md#articlepresenter)]

**Error Response (invalid input)**
```
Status: 400 Bad request
```
```json
{"message": "Invalid value received for order"}
```
**Error Response (Max page number reached)**
```
Status: 400 Bad request
```
```json
{"message": "Max page reached. Please narrow down your search"}
```


##Read public article

    GET /v2/articles/{id}


**Success Response (article object)**
Status: 200 OK

[ArticlePresenter.L2](presenters/article.md#articlepresenterl2)

**Error Response (article not found)**
```
Status: 404 Not Found
```
```json
{"message": "Article with specified ID does not exist"}
```


##Article versions subsection

###List versions

    GET /v2/articles/{id}/versions

**Success Response**

Status: 200 OK

[[ArticleVersionPresenter](presenters/article.md#articleversionpresenter)]

**Error Response (article ID not found)**
```
Status: 404 Not found
```
```json
{"message": "article with ID not found"}
```

##Read public article version

Read public article that has {id} and {v_number}

    GET /v2/articles/{id}/versions/{v_number}


**Success Response (article object for specified version)**

Status: 200 OK

[ArticlePresenter.L2](presenters/article.md#articlepresenterl2)

**Error Response (Version not found)**
```
Status: 404 Not Found
```
```json
{"message": "Version does not exist"}
```


##Read public article version embargo

Read public article embargo that has {id} and {v_number}

    GET /v2/articles/{id}/versions/{v_number}/embargo


**Success Response (article object for specified version)**

Status: 200 OK

[ArticleEmbargoPresenter](presenters/article.md#articleembargopresenter)

**Error Response (Version not found)**
```
Status: 404 Not Found
```
```json
{"message": "Version does not exist"}
```


##Read public article version confidentiality

Read public article confidentiality that has {id} and {v_number}

    GET /v2/articles/{id}/versions/{v_number}/confidentiality


**Success Response (article object for specified version)**

Status: 200 OK

[ArticleConfidentialityPresenter](presenters/article.md#articleconfidentialitypresenter)

**Error Response (Version not found)**
```
Status: 404 Not Found
```
```json
{"message": "Version does not exist"}
```

#Article private endpoints (OAuth required)

##Get own articles

    GET /v2/account/articles


**Input**

|Name        |Type |Description|
|------------|-----|-----------|
|`page`      |`int`|Show specified page only. Default is 1. Max page is 100. To see more then 100 pages, the search endpoint must be used to narrow down the results|
|`page_size` |`int`|How many entries per page to show. Default is 10.|

*OR*

|Name      |Type |Description|
|----------|-----|-----------|
|`offset`  |`int`|The first entry to return. The offset of the initial entry is 0 (not 1).|
|`limit`   |`int`|The number of returned entries. Default is 10.|

By default the items are sorted by `created_date`, not `published_date`.

**Success Response (list of articles)**
Status: 200 OK

[[ArticlePresenter](presenters/article.md#articlepresenter)]


**Error Response (Max page number reached)**
```
Status: 400 Bad request
```
```json
{"message": "Max page reached. Please narrow down your search"}
```

##Search own articles

    POST /v2/account/articles/search


**Input**

|Name               |Type   |Description|
|-------------------|-------|-----------|
|`page`             |`int`  |Show specified page only. Default is 1. Max is 100|
|`page_size`         |`int` |How many entries per page to show. Default is 10. Max is 100|
|`search_for`       |`str`  |(query)String to perform search for. Minimum of 4 characters|
|`published_since`  |`date` |(filter)Narrow search  to articles published since the specified date|
|`modified_since`   |`date` |(filter)Narrow search  to articles modified since the specified date|
|`institution`      |`int`  |(filter)Filter results for this instritution only|
|`group`            |`int`  |(filter)Filter results for this institution group only|
|`order`         |`str`  |(sort)Perform a sort using the `order`. Valid values are: `published_date`, `modified_date`|
|`order_direction`     |`str`  |(sort)How to sort. Descending or ascending. Valid values are: `desc`, `asc`|


Alternatively, instead of `page` and `page_size`, one can use the following params for pagination:

|Name      |Type |Description|
|----------|-----|-----------|
|`offset`  |`int`|The first entry to return. The offset of the initial entry is 0 (not 1).|
|`limit`   |`int`|The number of returned entries. Default is 10.|


**Success Response (list of articles)**
```
Status: 200 OK
```
[[ArticlePresenter](presenters/article.md#articlepresenter)]


**Error Response (invalid input)**
```
Status: 400 Bad request
```
```json
{"message": "Invalid value received for order"}
```
**Error Response (Max page number reached)**
```
Status: 400 Bad request
```
```json
{"message": "Max page reached. Please narrow down your search"}
```


##Create a new article

    POST /v2/account/articles


**Input**

|Name               |Type                   |Description                                |
|-------------------|-----------------------|-------------------------------------------|
|`title`            |`str`                  |The title for this article|
|`description`      |`str`                  |The article description. In a publisher case, usually this is the remote article description|
|`tags`             |`array of str`         |List of tags to be associated with the article (e.g ['tag1', 'tag2', 'tagn'])|
|`references`            |`array of str`         |List of links to be associated with the article (e.g ['http://link1', 'http://link2', 'http://link3'])|
|`categories`       |`array of int`         |List of category ids to be associated with the article(e.g [1, 23, 33, 66])|
|`authors`          |`array`                |List of authors to be assosciated with the article. The list can contain author ids or author names [{"id": 12121}, {"id": 34345}, {"name": "John Doe"}]. No more then 10 authors. For adding more authors use the specific authors endpoint|
|`custom_fields`  |`dict`                 |List of key, values pairs to be associated with the article|
|`defined_type`   |`str`                  |Article type, one of ['figure', 'media', 'dataset', 'fileset', 'poster', 'paper', 'presentation', 'thesis', 'code', 'metadata']|
|`funding` | `str` | Grant number or funding authority |
|`license` | `int` | License id for this article. Licenses listing endpoints are described [here](licenses.md). |
|`resource_doi` |`str` | Not applicable to regular users. In a publisher case, this is the publisher article DOI. |
|`resource_title` |`str` | Not applicable to regular users. In a publisher case, this is the publisher article title. |

**Success Response**
```
Status: 201 Created
Location: https://api.figshare.com/v2/account/articles/123
```


##Read own article

    GET /v2/account/articles/{id}


**Success Response**
Status: 200 OK

[ArticlePresenterL2](presenters/article.md#articlepresenterl2)

**Error Response (Id not found)**
```
Status: 404 Not found
```
```json
{"message": "Article not found"}
```

##Update article

    PUT /v2/account/articles/{id}


**Input**

|Name             |Type                   |Description                                |
|-----------------|-----------------------|-------------------------------------------|
|`title`          |`str`                  |The title for this article - `mandatory`|
|`description`    |`str`                  |The article description. In a publisher case, usually this is the remote article description|
|`tags`           |`array of str`         |List of tags to be associated with the article (e.g ['tag1', 'tag2', 'tagn'])|
|`references`      |`array of str`         |List of links to be associated with the article (e.g ['http://link1', 'http://link2', 'http://link3'])|
|`categories`       |`array of int`         |List of category ids to be associated with the article(e.g [1, 23, 33, 66])|
|`authors`          |`array`                |List of authors to be assosciated with the article. The list can contain author ids or author names [{"id": 12121}, {"id": 34345}, {"name": "John Doe"}]. No more then 10 authors. For adding more authors use the specific authors endpoint|
|`custom_fields`  |`dict`                 |List of key, values pairs to be associated with the article|
|`defined_type`   |`str`                  |Article type, one of ['figure', 'media', 'dataset', 'fileset', 'poster', 'paper', 'presentation', 'thesis', 'code', 'stub', 'metadata']|
|`funding` | `str` | Grant number or funding authority |
|`license` | `int` | License id for this article. Licenses listing endpoints are described [here](licenses.md). |
|`resource_doi` |`str` | Not applicable to regular users. In a publisher case, this is the publisher article DOI. |
|`resource_title` |`str` | Not applicable to regular users. In a publisher case, this is the publisher article title. |



**Success Response**
```
Status: 205 Reset Content
Location: https://api.figshare.com/v2/account/articles/123
```
**Error Response (Id not found)**
```
Status: 404 Not found
```
```json
    {"message": "Article not found"}
```


##Delete own private article

    DELETE /v2/account/articles/{id}

**Success Response**
```
Status: 204 No Content
```

**Error Response (Id not found)**
```
Status: 404 Not found
```
```json
    {"message": "article not found"}
```


##Reserve DOI for article**

    POST /v2/account/articles/{id}/reserve_doi

**Success Response**
```
Status: 200 OK
```
```json
{"doi": "10.5072/FK2.FIGSHARE.20345"}
```
**Error Response (Id not found)**
```
Status: 404 Not found
```
```json
{"message": "article not found"}
```

##Publish article

    POST /v2/account/articles/{id}/publish

**Notes**: 
- If the whole article is under *embargo*, it will not be published immediatly, but when the embargo expires or is lifted.  
- When an article is published, a new public version will be generated.
Any further updates to the article will affect the private article data.
In order to make these changes publicly visible, an explicit publish operation is needed.


**Success Response**
```
Status: 201 Created
Location: https://api.figshare.com/v2/articles/123
```

**Error Response (Id not found)**
```
Status: 404 Not found
```
```json
{"message": "article not found"}
```

**Error Response (Missing mandatory fields for publish (e.g authors))**
```
Status: 400 Bad request
```
```json
{"message": "Missing mandatory field for publication - authors"}
```


##article authors subsection

###List authors

    GET /v2/account/articles/{id}/authors

**Success Response**

Status: 200 OK

[[AuthorPresenter](presenters/author.md#authorpresenter)]

**Error Response (article Id not found)**
```
Status: 404 Not found
```
```json
{"message": "article not found"}
```

###Associate new authors with the article

    POST /v2/account/articles/{id}/authors


**Input**

|Name               |Type                   |Description                                |
|-------------------|-----------------------|-------------------------------------------|
|`authors`          |`array`                |List of authors to be assosciated with the article. The list can contain author ids or author names [{"id": 12121}, {"id": 34345}, {"name": "John Doe"}]. No more then 10 authors. For adding more authors use the specific authors endpoint|


**Success Response**
```
Status: 205 Reset Content
Location: https://api.figshare.com/v2/account/articles/123/authors
```

**Error Response (Author(s) id not found)**
```
Status: 400 Bad request
```
```json
{"message": "Author with ID not found"}
```


###Associate and replace existing authors of this article

    PUT /v2/account/articles/{id}/authors

**Input**

|Name               |Type                   |Description                                |
|-------------------|-----------------------|-------------------------------------------|
|`authors`          |`array`                |List of authors to be assosciated with the article. The list can contain author ids or author names [{"id": 12121}, {"id": 34345}, {"name": "John Doe"}]. No more then 10 authors. For adding more authors use the specific authors endpoint|


**Success Response**
```
Status: 205 Reset Content
Location: https://api.figshare.com/v2/account/articles/123/authors
```

**Error Response (Author(s) id not found)**
```
Status: 400 Bad request
```
```json
{"message": "Author with ID  not found"}
```


###De-associate author from article

    DELETE /v2/account/articles/{id}/authors/{author_id}

**Success Response**
```
Status: 204 No Content
```

**Error Response (Author(s) id not found)**
```
Status: 400 Bad request
```
```json
{"message": "Author with ID  not found"}
```


##article categories subsection

###List categories

    GET /v2/account/articles/{id}/categories

**Success Response**

Status: 200 OK

[[CategoryPresenter](presenters/category.md#categorypresenter)]

###Associate new categories with the article

    POST /v2/account/articles/{id}/categories


**Input**

|Name               |Type                   |Description                                |
|-------------------|-----------------------|-------------------------------------------|
|`categories`       |`array of int`         |List of new categories to be assosciated with the article|


**Success Response**

Status: 205 Reset Content

[CategoryPresenter](presenters/category.md#categorypresenter)

**Error Response (Category ID not found)**
```
Status: 400 Bad request
```
```json
{"message": "Category with ID not found"}
```


###Associate and replace existing categories of this article

    PUT /v2/account/articles/{id}/categories

**Input**

|Name               |Type                   |Description                                |
|-------------------|-----------------------|-------------------------------------------|
|`categories`       |`array of int`         |List of categories to be assosciated with the article. Existing categories will be replaced|


**Success Response**

Status: 205 Reset Content

[CategoryPresenter](presenters/category.md#categorypresenter)

**Error Response (Catgeory ID not found)**
```
Status: 400 Bad request
```
```json
{"message": "Category with ID  not found"}
```


###De-associate category from article

    DELETE /v2/account/articles/{id}/categories/{category_id}

**Success Response**
```
Status: 204 No Content
```

**Error Response (Category id not found)**
```
Status: 404 Bad request
```
```json
{"message": "Category with ID  not found"}
```


##Article files subsection

###Steps to upload file

* [Initiate file upload](#initiate-new-file-upload-within-the-article) - this request returns an endpoint with file data
* Send a `GET` request to the [Uploader Service](file_uploader.md) with the `upload_url` (which also contains the`upload_token`) provided in previous step and receive the number of file parts
* Upload / Delete / Retry uploading file parts until all parts are uploaded successfully
* [Complete file upload](#complete-file-upload)

###List files

    GET /v2/account/articles/{id}/files

**Success Response**

Status: 200 OK

[[FilePresenter](presenters/file.md#filepresenter)]

###Initiate new file upload within the article

    POST /v2/account/articles/{id}/files


**Input**

|Name               |Type                   |Description                                |
|-------------------|-----------------------|-------------------------------------------|
|`link`              |`str`                  |Url for an existing file that will not be uploaded on figshare |

*or*

|Name               |Type                   |Description                                |
|-------------------|-----------------------|-------------------------------------------|
|`md5`              |`str`                  |MD5 sum pre computed on the client side|
|`name`              |`str`                  |File name including the exception|
|`size`              |`int`                  |File size in bytes|


**Success Response**
```
Status: 201 Created
Location: /v2/account/articles/{id}/files/{file_id}
```

###Upload file content
[Figshare Upload Service](file_uploader.md)



###Complete file upload

    POST /v2/account/articles/{id}/files/{file_id}

**Success Response**
```
Status: 202 Accepted
```

**Error Response (File_id not found)**
```
Status: 404 Not found
```
```json
{"message": "File not found"}
```


###View file information

    GET /v2/account/articles/{id}/files/{file_id}

**Success Response**

Status: 200 OK

[FilePresenter.L1](presenters/file.md#filepresenterl1)

**Error Response (File_id not found)**
```
Status: 404 Not found
```
```json
{"message": "File not found"}
```




###Delete file  from article

    DELETE /v2/account/articles/{id}/files/{file_id}

**Success Response**
```
Status: 204 No Content
```

**Error Response (File_id not found)**
```
Status: 404 Not found
```
```json
{"message": "File not found"}
```


## Article private links subsection

### List private links

    GET /v2/account/articles/{id}/private_links

**Success Response**

Status: 200 OK

[[PrivateLinkPresenter](presenters/private_link.md#privatelinkpresenter)]

### Create new private link for this article

    POST /v2/account/articles/{id}/private_links


**Input**

|Name               |Type                   |Description                                |
|-------------------|-----------------------|-------------------------------------------|
|`expires_date`      |`date`                 |Date when this private link should expire - optional.  By default private links expire in 365 days.|



**Success Response**

```
Status: 201 OK
Location: https://api.figshare.com/v2/account/articles/123/private_links/kjkjhg234k53o4i45p2o3i456..
```


### Update existing private link for this  article

    PUT /v2/account/articles/{id}/private_links/{private_link_token}

**Input**

|Name               |Type                   |Description                                |
|-------------------|-----------------------|-------------------------------------------|
|`expires_date`      |`date`                 |Date when this private link should expire - optional. By default private links expire in 365 days.|



**Success Response**
```
Status: 205 Reset Content
Location: https://api.figshare.com/v2/account/articles/123/private_links/kjkjhg234k53o4i45p2o3i456..
```

**Error Response (Private Link ID not found)**
```
Status: 404 Not found
```
```json
{"message": "Private Link with ID  not found"}
```


### Disable/delete private link for article

    DELETE /v2/account/articles/{id}/private_links/{private_link_id}

**Success Response**
```
Status: 204 No Content
```

**Error Response (Private link ID not found)**
```
Status: 404 Not found
```
```json
{"message": "Private link with ID not in article"}
```


##Article embargo subsection

###View embargo settings

    GET /v2/account/articles/{id}/embargo

**Success Response**

Status: 200 OK

[ArticleEmbargoPresenter](presenters/article.md#articleembargopresenter)

###Update embargo settings

    PUT /v2/account/articles/{id}/embargo

**Note**: setting an article under *whole embargo* does not imply that the article will be published when the embargo will expire. You must explicitly call the **publish** endpoint to enable this functionality.

**Input**

|Name              |Type    |Description                                |
|------------------|--------|-------------------------------------------|
|`is_embargoed`    |`bool`  |Confidentiality status. True, False|
|`embargo_type`    |`str`   |Embargo can be enabled at the `article` or the `file` level. Possible values: `article`, `file`|
|`embargo_date`    |`date`  |Date when the embargo expires and the article gets published|
|`embargo_reason`  |`str`   |Reason for setting embargo|


**Success Response**
```
Status: 205 Reset Content
Location: http://api.figshare.com/v2/account/articles/2000688/embargo
```

**Input error**
```
Status: 400 Bad request
```
```json
{"message": "Invalid expires date"}
```


###Delete embargo settings

    DELETE /v2/account/articles/{id}/embargo

**Success Response**
```
Status: 204 No Content
```



##Article confidentiality subsection

###View confidentiality settings

    GET /v2/account/articles/{id}/confidentiality

**Success Response**

Status: 200 OK

[ArticleConfidentialityPresenter](presenters/article.md#articleconfidentialitypresenter)


###Update confidentiality settings

    PUT /v2/account/articles/{id}/confidentiality


**Input**

|Name               |Type                   |Description                                |
|-------------------|-----------------------|-------------------------------------------|
|`reason`           |`str`                 |Confidentiality reason|


**Success Response**
```
Status: 200 OK
Location: http://api.figshare.com/v2/account/articles/2000688/confidentiality
```

###Delete confidentiality settings

    DELETE /v2/account/articles/{id}/confidentiality

**Success Response**
```
Status: 204 No Content
```

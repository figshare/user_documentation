# Article public endpoints


##List public articles

    GET /v2/articles


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

|Name               |Type   |Description|
|-------------------|-------|-----------|
|`page`             |`int`  |Show specified page only. Default is 1. Max is 100|
|`page_size`        |`int`  |How many entries per page to show. Default is 10. Max is 100|
|`search_for`       |`str`  |(query)String to perform search for. Minimum of 4 characters|
|`published_since`  |`date` |(filter)Narrow search  to articles published since the specified date|
|`modified_since`   |`date` |(filter)Narrow search  to articles modified since the specified date|
|`institution`      |`str`  |(filter)Filter results for this instritution only|
|`group`            |`str`  |(filter)Filter results for this institution group only|
|`order_by`         |`str`  |(sort)Perform a sort using the `order_by`. Valid values are: `published_date`, `modified_date`, `views`, `shares`|
|`order_method`     |`str`  |(sort)How to sort. Descending or ascending. Valid values are: `desc`, 'asc'|

Alternatively, instead of `page` and `page_size`, one can use the following params for pagination:

|Name     |Type |Description|
|---------|-----|-----------|
|`offset` |`int`|The first entry to return. The offset of the initial entry is 0 (not 1).|
|`limit`  |`int`|The number of returned entries. Default is 10.|


**Success Response (list of articles)**
Status: 200 OK

[[ArticlePresenter](presenters/article.md#articlepresenter)]

**Error Response (invalid input)**
```
Status: 400 Bad request
```
```json
{"message": "Invalid value received for order_by"}
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

    GET /v2/account/articles/{id}/versions

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
|`institution`      |`str`  |(filter)Filter results for this instritution only|
|`group`            |`str`  |(filter)Filter results for this institution group only|
|`order_by`         |`str`  |(sort)Perform a sort using the `order_by`. Valid values are: `published_date`, `modified_date`, `views`, `shares`|
|`order_method`     |`str`  |(sort)How to sort. Descending or ascending. Valid values are: `desc`, 'asc'|


Alternatively, instead of `page` and `page_size`, one can use the following params for pagination:

|Name      |Type |Description|
|----------|-----|-----------|
|`offset`  |`int`|The first entry to return. The offset of the initial entry is 0 (not 1).|
|`limit`   |`int`|The number of returned entries. Default is 10.|


**Success Response (list of articles)**
```
Status: 200 OK
```
```json
[{object},{object}...{object}]
```

**Error Response (invalid input)**
```
Status: 400 Bad request
```
```json
{"message": "Invalid value received for order_by"}
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
|`title`            |`str`                  |The title for this article - `mandatory`|
|`description`      |`str`                  |The article description. In a publisher case, usually this is the remote article description|
|`tags`             |`array of str`         |List of tags to be associated with the article (e.g ['tag1', 'tag2', 'tagn'])|
|`references`            |`array of str`         |List of links to be associated with the article (e.g ['http://link1', 'http://link2', 'http://link3'])|
|`categories`       |`array of int`         |List of category ids to be associated with the article(e.g [1, 23, 33, 66])|
|`authors`          |`array of int|str`     |List of authors to be assosciated with the article. The list can contain author ids ([12121, 34345, 233323]) or author names([1212, 'John Doe']). No more then 10 authors. For adding more authors use the specific authors endpoint|
|`custom_fields`  |`dict`                 |List of key, values pairs to be associated with the article|
|defined_type       |`str`                  |Article type, one of ['figure', 'media', 'dataset', 'fileset', 'poster', 'paper', 'presentation', 'thesis', 'code', 'stub', 'metadata']|


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

|Name               |Type                   |Description                                |
|-------------------|-----------------------|-------------------------------------------|
|`title`            |`str`                  |The title for this article - `mandatory`|
|`description`      |`str`                  |The article description. In a publisher case, usually this is the remote article description|
|`tags`             |`array of str`         |List of tags to be associated with the article (e.g ['tag1', 'tag2', 'tagn'])|
|`references`            |`array of str`         |List of links to be associated with the article (e.g ['http://link1', 'http://link2', 'http://link3'])|
|`categories`       |`array of int`         |List of category ids to be associated with the article(e.g [1, 23, 33, 66])|
|`authors`          |`array of int|str`     |List of authors to be assosciated with the article. The list can contain author ids ([12121, 34345, 233323]) or author names([1212, 'John Doe']). No more then 10 authors. For adding more authors use the specific authors endpoint|
|`custom_fields`  |`dict`                 |List of key, values pairs to be associated with the article|
|defined_type       |`str`                  |Article type, one of ['figure', 'media', 'dataset', 'fileset', 'poster', 'paper', 'presentation', 'thesis', 'code', 'stub', 'metadata']|


**Success Response**
```
Status: 205 OK
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
Status: 204 No content
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

**Success Response**
```
Status: 201 Created
Location: https://api.figshare.com/v2/articles/123
```
```json
{object}
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
|`authors`          |`array of int|str`     |List of new authors to be assosciated with the article. The list can contain author ids ([12121, 34345, 233323]) or author names([1212, 'John Doe'])|


**Success Response**
```
Status: 205 OK
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
|`authors`          |`array of int|str`     |List of authors to be assosciated with the article. The list can contain author ids ([12121, 34345, 233323]) or author names([1212, 'John Doe']). Existing authors will be replaced|


**Success Response**
```
Status: 205 OK
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
Status: 204 No content
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

[[CategoryPresenter](category.md#categorypresenter)]

###Associate new categories with the article

    POST /v2/account/articles/{id}/categories


**Input**

|Name               |Type                   |Description                                |
|-------------------|-----------------------|-------------------------------------------|
|`categories`       |`array of int`         |List of new categories to be assosciated with the article|


**Success Response**

Status: 205 OK

[CategoryPresenter](category.md#categorypresenter)

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

Status: 205 OK

[CategoryPresenter](category.md#categorypresenter)

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
Status: 204 OK
```
```json
{object}
```

**Error Response (Category id not found)**
```
Status: 404 Bad request
```
```json
{"message": "Category with ID  not found"}
```


##article files subsection

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
|`md5`              |`str`                  |MD5 sum pre computed on the client side|
|`name`              |`str`                  |File name including the exception|
|`size`              |`int`                  |File size in bytes|


**Success Response**
```
Status: 201 OK

Location: https://uploads.figshare.com/9dfc5fe3-d617-4d93-ac11-8afe7e984a4


###Complete file upload

    POST /v2/account/articles/{id}/files/{file_id}

**Success Response**
```
Status: 200 OK
```
```json
{object}
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

    DELETE /v2/account/articles/{id}/articles/{file_id}

**Success Response**
```
Status: 204 OK
```

**Error Response (File_id not found)**
```
Status: 404 Not found
```
```json
{"message": "File not found"}
```


##article private links subsection

###List private links

    GET /v2/account/articles/{id}/private_links

**Success Response**

Status: 200 OK

[[PrivateLinkPresenter](presenters/private_link.md#privatelinkpresenter)]

###Create new private link for this article

    POST /v2/account/articles/{id}/private_links


**Input**

|Name               |Type                   |Description                                |
|-------------------|-----------------------|-------------------------------------------|
|`expires_date`      |`date`                 |Date when this private link should expire - option. By default private links do not expire|



**Success Response**

```
Status: 201 OK
Location: https://api.figshare.com/v2/account/articles/123/private_links/kjkjhg234k53o4i45p2o3i456..
```


###Update existing private link for this  article

    PUT /v2/account/articles/{id}/private_links

**Input**

|Name               |Type                   |Description                                |
|-------------------|-----------------------|-------------------------------------------|
|`expires_date`      |`date`                 |Date when this private link should expire - option. By default private links do not expire|



**Success Response**
```
Status: 205 OK
Location: https://api.figshare.com/v2/account/articles/123/private_links/kjkjhg234k53o4i45p2o3i456..
```

**Error Response (Private Link ID not found)**
```
Status: 404 Not found
```
```json
{"message": "Private Link with ID  not found"}
```


###Disable/delete private link for article

    DELETE /v2/account/articles/{id}/private_links/{private_link_id}

**Success Response**
```
Status: 204 OK
```
```json
{object}
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

**Input**

|Name               |Type                   |Description                                |
|-------------------|-----------------------|-------------------------------------------|
|`is_embargoed`           |`bool`                 |Confidentiality status. True, False|
|`embargo_type`            |`str`                  |Embargo can be enabled at the `article` or the `file` level. Possible values: `article`, `file`|
|`embargo_date`          |`date`                 |Date when the embargo expires and the article gets published|
|`embargo_reason`          |`str`                 |Reason for setting embargo|


**Success Response**
```
Status: 205 OK
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
Status: 204 No content
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
Status: 204 No content
```

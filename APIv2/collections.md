# Collection public endpoints

* Public
  - [list collections](#list-public-endpoints)
  - [search collections](#search-public-collections)
  - [read collection](#read-collections)
  - list public collection versions
  - read public ocllection verison

* Private
  - [list own collections](#list-own-collections)
  - [read own collection](#read-own-collection)
  - create new collection
  - update collection

## Public endpoints

The following _public_ endpoints don't require
authentication/authorization.


===========================
### List public collections

#### Request

    GET /v2/collections

Accepts `pagination`, `sorting`, `filtering` params. Accepted filters:

|field|type|notes|
|-----|----|-----|
|`institution`|int|only return collections from this institution|
|`group`|int|only return collections from this group|
|`published_since`|date(ISO 8601)|Only collections published after the date|

Defaults:

|field|value|
|-----|-----|
|`order`|`published_date desc`|
|`order_direction`|`desc`|
|`page_size`|`10`|


#### Response

* Status: `200 OK`
* Body: List of [CollectionPresenter](presenters/collection.md#collectionpresenter)


#### Errors

Standard [error responses](index.md#errors).


=============================
### Search public collections

#### Request

    POST /v2/collections/search

Search public collections. Accepts `pagination`, `sorting`, `filtering`
and `search` params.

Filterse and defaults are the same as for  the
[list public collections](#list-public-collections)

The response body will use the collection `light` presenter.

#### Response

* status: `200 OK`
* body: List of [CollectionPresenter](presenters/collection.md#collectionpresenter)


#### Errors

Standard [error responses](index.md#errors).


==========================
### Read public collection

#### Request

    GET /v2/collections/{id}


#### Response

The collection `detailed` presenter will be used.

* Status: `200 OK`
* Body: [detailed CollectionPresenter(L1)](presenters/collection.md#collectionpresenterl1)


#### Errors

Standard [error responses](index.md#errors).

===================================
### List public collection versions

#### Request

    GET /v2/collections/{id}/versions

#### Response

* Status: `200 OK`
* Body: List of [CollectionVersionPresenter (light)](presenters/collection.md#collectionversionpresenter)

#### Errors

Standard [error responses](index.md#errors).


===================================
### Read public collection version

    GET /v2/collections/{id}/versions/{version_number}


#### Response
* Status: `200 OK`
* Body: [CollectionPresenter (detailed)](presenters/collection.md#collectionpresenterl1)

#### Errors:

Standard [error responses](index.md#errors).


## Private endpoints

These requests require authorization/authentication. Missing valid auth
will result in 403 and 401 errors.

The attribute **own** means resources owned(created or authored) by the
authenticated account.


==========================
### List _own_ collections

    GET /v2/account/collections

Identical to [list public collections](#list-public-collections)

==========================
### Create a new collection

    POST /v2/account/collections

#### Request

|Name               |Type                   |Description                                |
|-------------------|-----------------------|-------------------------------------------|
|`title`            |`str`                  |The title for this collection - `mandatory`|
|`description`      |`str`                  |The collection description. In a publisher case, usually this is the resource article description|
|`tags`             |`array of str`         |List of tags to be associated with the collection (e.g ['tag1', 'tag2', 'tagn'])|
|`categories`       | `array of int`        |List of category ids to be associated with the collection (e.g [5, 7, 9])|
|`authors`          | `array of int`        |List of author ids to be associated with the collection (e.g [4, 8, 16])|
|`resource_doi`     |`str`                  |Not applicable to regular users. In a publisher case, this is the publisher article DOI|
|`resource_link`    |`str`                  |Not applicable to regular users. In a publisher case, this is the publisher article link|
|`resource_title`   |`str`                  |Not applicable to regular users. In a publisher case, this is the publisher article title|
|`resource_version` |`int`                  |Not applicable to regular users. In a publisher case, this is the publisher article version|
|`custom_fields`    |`dict`                 |List of key, values pairs to be associated with the collection. Similar to custom article fields|


#### Response

* Status: `201 Created`
* Headers:
    ```
        Location: https://api.figshare.com/v2/account/collections/123
    ```
* Body: [CollectionPresenter (detailed)](presenters/collection.md#collectionpresenterl1)

#### Errors

Standard [error responses](index.md#errors).

=======================
### Read _own_ collection

    GET /v2/account/collections/{id}


#### Response

* Status: `200 OK`
* Body: [CollectionPresenter (detailed)](presenters/collection.md#collectionpresenterl1)

#### Errors

Standard [error responses](index.md#errors).


##Update collection

    PUT /v2/account/collections/{id}


**Input**

|Name               |Type                   |Description                                |
|-------------------|-----------------------|-------------------------------------------|
|`title`            |`str`                  |The title for this collection |
|`description`      |`str`                  |The collection description. In a publisher case, usually this is the resource article description|
|`tags`             |`array of str`         |List of tags to be associated with the collection (e.g ['tag1', 'tag2', 'tagn'])|
|`categories`       | `array of int`        |List of category ids to be associated with the collection (e.g [5, 7, 9])|
|`authors`          | `array of int`        |List of author ids to be associated with the collection (e.g [4, 8, 16])|
|`resource_doi`     |`str`                  |Not applicable to regular users. In a publisher case, this is the publisher article DOI|
|`resource_title`   |`str`                  |Not applicable to regular users. In a publisher case, this is the publisher article title|
|`resource_version` |`int`                  |Not applicable to regular users. In a publisher case, this is the publisher article version|
|`references`       |`array of str`         |List of URLs to be assosciated with the collection|
|`custom_fields`  |`dict`                 |List of key, values pairs to be associated with the collection. Similar to custom article fields|


**Success Response**
```
Status: 205 Reset Content
Location: https://api.figshare.com/v2/account/collections/123
```

**Error Response (Id not found)**
```
Status: 404 Not found
```
```json
{"message": "Collection not found"}
```


##Delete own private collection

    DELETE /v2/account/collections/{id}

**Success Response**
```
Status: 204 No content
```

**Error Response (Id not found)**
```
Status: 404 Not found
```
```json
{"message": "Collection not found"}
```


##Reserve DOI for collection**

    POST /v2/account/collections/{id}/reserve_doi

**Success Response**
```
Status: 200 OK
```
```json
{"doi": "doi link"}
```
**Error Response (Id not found)**
```
Status: 404 Not found
```
```json
{"message": "Collection not found"}
```

##Publish collection

    POST /v2/account/collections/{id}/publish

**Success Response**
```
Status: 201 Created
Location: https://api.figshare.com/v2/collections/123
```

**Error Response (Missing mandatory fields for publish (e.g authors))**
```
Status: 428 Precondition failed
```
```json
{
    "message": "Collection has no associated authors",
    "code": "MissingMandatoryFieldException",
    "data": {}
}
```


##Collection authors subsection

###List authors

    GET /v2/account/collections/{id}/authors

To represent the authors, the author's `light` presenter will be used.

**Success Response**
```
Status: 200 OK
```
[[AuthorPresenter](presenters/author.md#authorpresenter)]


###Associate new authors with the collection

    POST /v2/account/collections/{id}/authors


**Input**

|Name               |Type                   |Description                                |
|-------------------|-----------------------|-------------------------------------------|
|`authors`          |`array of dictionaries {'id':int} or {'name':str}`|List of new authors to be assosciated with the collection. The list can contain author ids ([12121, 34345, 233323]) or author names([1212, 'John Doe'])|


**Success Response**
```
Status: 201 Created
Location: https://api.figshare.com/v2/account/collections/123/authors
```

**Error Response (Author(s) id not found)**
```
Status: 422 Unprocessable Entity
```
```json
{
    "message": "Author not found",
    "code": "EntityNotFoundException",
    "data": {}
}
```

###Associate and replace existing authors of this collection

    PUT /v2/account/collections/{id}/authors

**Input**

|Name               |Type                   |Description                                |
|-------------------|-----------------------|-------------------------------------------|
|`authors`          | `array of dictionaries {'id':int} or {'name':str}`|List of authors to be assosciated with the collection. The list can contain author ids ([12121, 34345, 233323]) or author names([1212, 'John Doe']). Existing authors will be replaced|

To represent the author entity, the `light` presenter will be used.

**Success Response**
```
Status: 205 Reset Content
Location: https://api.figshare.com/v2/account/collections/123/authors
```

**Error Response (Author(s) id not found)**
```
Status: 422 Unprocessable Entity
```
```json
{
    "message": "Author not found",
    "code": "EntityNotFoundException",
    "data": {}
}
```


###De-associate author from collection

    DELETE /v2/account/collections/{id}/authors/{author_id}

**Success Response**
```
Status: 204 No content
```

**Error Response (Author id not found)**
```
Status: 422 Unprocessable Entity
```
```json
{
    "message": "Author not found",
    "code": "EntityNotFoundException",
    "data": {}
}
```


##Collection categories subsection

###List categories

    GET /v2/account/collections/{id}/categories

**Success Response**
```
Status: 200 OK
```
[[CategoryPresenter](presenters/category.md#categorypresenter)]


###Associate new categories with the collection

    POST /v2/account/collections/{id}/categories


**Input**

|Name               |Type                   |Description                                |
|-------------------|-----------------------|-------------------------------------------|
|`categories`       |`array of int`         |List of new categories to be assosciated with the collection|


**Success Response**
```
Status: 201 Created
Location: https://api.figshare.com/v2/account/collections/123/categories
```

**Error Response (Category ID not found)**
```
Status: 422 Unprocessable Entity
```
```json
{
    "message": "Category not found",
    "code": "EntityNotFoundException",
    "data": {}
}
```



###Associate and replace existing categories of this collection

    PUT /v2/account/collections/{id}/categories

**Input**

|Name               |Type                   |Description                                |
|-------------------|-----------------------|-------------------------------------------|
|`categories`       |`array of int`         |List of categories to be assosciated with the collection. Existing categories will be replaced|


**Success Response**
```
Status: 205 Reset Content
Location: https://api.figshare.com/v2/account/collections/123/categories
```

**Error Response (Category ID not found)**
```
Status: 422 Unprocessable Entity
```
```json
{
    "message": "Category not found",
    "code": "EntityNotFoundException",
    "data": {}
}
```


###De-associate category from collection

    DELETE /v2/account/collections/{id}/categories/{category_id}

**Success Response**
```
Status: 204 No Content
```

**Error Response (Category id not found)**
```
Status: 404 Not found
```
```json
{
    "message": "Category not found",
    "code": "EntityNotFoundException",
    "data": {}
}
```


##Collection articles subsection

###List articles

    GET /v2/account/collections/{id}/articles

**Success Response**
```
Status: 200 OK
```
[[ArticlePresenter](presenters/article.md#articlepresenter)]

###Associate new articles with the collection

    POST /v2/account/collections/{id}/articles


**Input**

|Name               |Type                   |Description                                |
|-------------------|-----------------------|-------------------------------------------|
|`articles`         |`array of int`         |List of new articles to be assosciated with the collection. No more then 10 article IDs per request|


**Success Response**
```
Status: 201 Created
Location: https://api.figshare.com/v2/account/collections/123/articles
```

**Error Response (Article ID not found)**
```
Status: 422 Unprocessable Entity
```
```json
{
    "message": "Article not found",
    "code": "EntityNotFoundException",
    "data": {}
}
```


###Associate and replace existing articles of this collection

    PUT /v2/account/collections/{id}/articles

**Input**

|Name               |Type                   |Description                                |
|-------------------|-----------------------|-------------------------------------------|
|`articles`         |`array of int`         |List of articles to be assosciated with the collection. Existing articles will be replaced. No more then 10 article IDs|

To represent the article entity, the `light` presenter will be used.

**Success Response**
```
Status: 205 Reset Content
Location: https://api.figshare.com/v2/account/collections/123/articles
```

**Error Response (Article ID not found in collection)**
```
Status: 422 Unprocessable Entity
```
```json
{
    "message": "Article not found",
    "code": "EntityNotFoundException",
    "data": {}
}
```


###De-associate article from collection

    DELETE /v2/account/collections/{id}/articles/{article_id}

**Success Response**
```
Status: 204 No content
```

**Error Response (Article ID not found in collection)**
```
Status: 404 Not found
```
```json
{
    "message": "Private link not found in collection",
    "code": "EntityNotFoundException",
    "data": {}
}
```

##Collection private links subsection

###List private links

    GET /v2/account/collections/{id}/private_links

**Success Response**
```
Status: 200 OK
```
[[PrivateLinkPresenter](presenters/collection.md#privatelinkpresenter)]

###Create new private link for this collection

    POST /v2/account/collections/{id}/private_links


**Input**

|Name               |Type                   |Description                                |
|-------------------|-----------------------|-------------------------------------------|
|`expires_date`      |`date`                 |Date when this private link should expire - option. By default private links do not expire|



**Success Response**
```
Status: 201 Created
Location: https://api.figshare.com/v2/account/collections/123/private_links
```


###Update existing private link for this  collection

    PUT /v2/account/collections/{id}/private_links/{p_id}

**Input**

|Name               |Type                   |Description                                |
|-------------------|-----------------------|-------------------------------------------|
|`expires_date`      |`date`                 |Date when this private link should expire - option. By default private links do not expire|



**Success Response**
```
Status: 205 Reset Content
Location: https://api.figshare.com/v2/account/collections/123/private_links
```


**Error Response (Private Link ID not found)**
```
Status: 404 Not found
```
```json
{
    "message": "Private link not found",
    "code": "EntityNotFoundException",
    "data": {}
}
```


###Disable/delete private link for collection

    DELETE /v2/account/collections/{id}/private_links/{private_link_id}

**Success Response**
```
Status: 204 No content
```

**Error Response (Private link ID not found)**
```
Status: 404 Not found
```
```json
{
    "message": "Private link not found",
    "code": "EntityNotFoundException",
    "data": {}
}
```

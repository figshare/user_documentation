# Collection public endpoints


##List public collections

    GET /v2/collections


**Input**

|Name         |Type |Description|
|-------------|-----|-----------|
|`page`       |`int`|Show specified page only. Default is 1. Max page is 100. To see more then 100 pages, the search endpoint must be used to narrow down the results|
|`page_size`  |`int`|How many entries per page to show. Default is 10.|

*OR*

|Name      |Type |Description|
|----------|-----|-----------|
|`offset`  |`int`|The first entry to return. The offset of the initial entry is 0 (not 1).|
|`limit`   |`int`|The number of returned entries. Default is 10.|


**Success Response (list of collections)**
```
Status: 200 OK
```
[[CollectionPresenter](presenters/collection.md#collectionpresenter)]


**Error Response (Max page number reached)**

```
Status: 422 Unprocessable Entity
```
```json
{
    "message": "Max page reached. Please narrow down your search",
    "code": "PageLimitExceededException",
    "data": {}
}
```


##Search public collections

Search public collections. Ordered by published date desc

    POST /v2/collections/search


**Input**

|Name               |Type   |Description|
|-------------------|-------|-----------|
|`page`             |`int`  |Show specified page only. Default is 1. Max is 100|
|`page_size`        |`int`  |How many entries per page to show. Default is 10. Max is 100|
|`search_for`       |`str`  |(query)String to perform search for. Minimum of 4 characters|
|`published_since`  |`date` |(filter)Narrow search  to collections published since the specified date|
|`modified_since`   |`date` |(filter)Narrow search  to collections modified since the specified date|
|`resource_doi`     |`str`  |(filter)DOI(resource DOI) to search for|
|`institution`      |`str`  |(filter)Filter results for this instritution only|
|`group`            |`str`  |(filter)Filter results for this institution group only|
|`order_by`         |`str`  |(sort)Perform a sort using the `order_by`. Valid values are: `published_date`, `modified_date`, `views`, `shares`|
|`order_method`     |`str`  |(sort)How to sort. Descending or ascending. Valid values are: `desc`, 'asc'|

Alternatively, instead of `page` and `page_size`, one can use the following params for pagination:

|Name      |Type |Description|
|----------|-----|-----------|
|`offset`  |`int`|The first entry to return. The offset of the initial entry is 0 (not 1).|
|`limit`   |`int`|The number of returned entries. Default is 10.|


The response body will use the collection `light` presenter.
**Success Response (list of collections)**
```
Status: 200 OK
```
[[CollectionPresenter](presenters/collection.md#collectionpresenter)]

**Error Response (Invalid order_by)**
```
Status: 422 Unprocessable Entity
```
```json
{
    "message": "Invalid value received for order_by",
    "code": "InvalidValueReceivedException",
    "data": {}
}
```

##Read public collection

    GET /v2/collections/{id}


**Success Response (collection object)**
The collection `detailed` presenter will be used.
```
Status: 200 OK
```

[CollectionPresenter.L1](presenters/collection.md#collectionpresenterl1)


**Error Response (collection not found)**
```
Status: 404 Not Found
```
```json
{
    "message": "Collection not found",
    "code": "EntityNotFoundException",
    "data": {}
}
```

##Collection versions subsection

###List versions

    GET /v2/collections/{id}/versions

The collection version `light` presenter will be used.

**Success Response**
```
Status: 200 OK
```
[[CollectionVersionPresenter](presenters/collection.md#collectionversionpresenter)]

###Read public collection version

Read public collection that has {id} and {v_number}

    GET /v2/collections/{id}/versions/{v_number}


**Success Response (collection object for specified version)**
```
Status: 200 OK
```
[CollectionPresenter.L1](presenters/collection.md#collectionpresenterl1)

**Error Response (Version not found)**
```
Status: 404 Not Found
```
```json
{
    "message": "Version not found",
    "code": "EntityVersionNotFoundException",
    "data": {}
}
```


#Collection private endpoints (OAuth required)

##Get own collections

    GET /v2/account/collections

**Input**

|Name         |Type |Description|
|-------------|-----|-----------|
|`page`       |`int`|Show specified page only. Default is 1. Max page is 100. To see more then 100 pages, the search endpoint must be used to narrow down the results|
|`page_size`  |`int`|How many entries per page to show. Default is 10.|

*OR*

|Name      |Type |Description|
|----------|-----|-----------|
|`offset`  |`int`|The first entry to return. The offset of the initial entry is 0 (not 1).|
|`limit`   |`int`|The number of returned entries. Default is 10.|


**Success Response**
```
Status: 200 OK
```
[[CollectionPresenter](presenters/collection.md#collectionpresenter)]


**Error Response (Max page number reached)**
```
Status: 422 Unprocessable Entity
```
```json
{
    "message": "Max page reached. Please narrow down your search",
    "code": "PageLimitExceededException",
    "data": {}
}
```


##Search own collections

    POST /v2/account/collections/search


**Input**

|Name               |Type   |Description|
|-------------------|-------|-----------|
|`page`             |`int`  |Show specified page only. Default is 1. Max is 100|
|`page_size`        |`int`  |How many entries per page to show. Default is 10. Max is 100|
|`search_for`       |`str`  |(query)String to perform search for. Minimum of 4 characters|
|`published_since`  |`date` |(filter)Narrow search  to collections published since the specified date|
|`modified_since`   |`date` |(filter)Narrow search  to collections modified since the specified date|
|`resource_doi`     |`str`  |(filter)DOI(resource DOI) to search for|
|`institution`      |`str`  |(filter)Filter results for this instritution only|
|`group`            |`str`  |(filter)Filter results for this institution group only|
|`order_by`         |`str`  |(sort)Perform a sort using the `order_by`. Valid values are: `published_date`, `modified_date`, `views`, `shares`|
|`order_method`     |`str`  |(sort)How to sort. Descending or ascending. Valid values are: `desc`, 'asc'|

Alternatively, instead of `page` and `page_size`, one can use the following params for pagination:

|Name      |Type |Description|
|----------|-----|-----------|
|`offset`  |`int`|The first entry to return. The offset of the initial entry is 0 (not 1).|
|`limit`   |`int`|The number of returned entries. Default is 10.|


**Success Response (list of collections)**
```
Status: 200 OK
```
[[CollectionPresenter](presenters/collection.md#collectionpresenter)]


**Error Response (invalid input)**
```
Status: 400 Bad request
```
```json
{"message": "Invalid value received for order_by"}
```
**Error Response (Max page number reached)**
```
Status: 422 Unprocessable Entity
```
```json
{
    "message": "Max page reached. Please narrow down your search",
    "code": "PageLimitExceededException",
    "data": {}
}
```

##Create a new collection

    POST /v2/account/collections


**Input**

|Name               |Type                   |Description                                |
|-------------------|-----------------------|-------------------------------------------|
|`title`            |`str`                  |The title for this collection - `mandatory`|
|`description`      |`str`                  |The collection description. In a publisher case, usually this is the resource article description|
|`tags`             |`array of str`         |List of tags to be associated with the collection (e.g ['tag1', 'tag2', 'tagn'])|
|`categories`       | `array of int`        |List of category ids to be associated with the collection (e.g [5, 7, 9])|
|`authors`          | `array of int`        |List of author ids to be associated with the collection (e.g [4, 8, 16])|
|`resource_doi`       |`str`                  |Not applicable to regular users. In a publisher case, this is the publisher article DOI|
|`resource_link`      |`str`                  |Not applicable to regular users. In a publisher case, this is the publisher article link|
|`resource_title`     |`str`                  |Not applicable to regular users. In a publisher case, this is the publisher article title|
|`resource_version`   |`int`                  |Not applicable to regular users. In a publisher case, this is the publisher article version|
|`custom_fields`  |`dict`                 |List of key, values pairs to be associated with the collection. Similar to custom article fields|

In the success response the  `detailed` collection presenter will be used.

**Success Response**
```
Status: 201 Created
Location: https://api.figshare.com/v2/account/collections/123
```

**Error Response (Missing mandatory field)**
```
Status: 422 Unprocessable Entity
```
```json
{
    "message": "Missing mandatory field",
    "cpde": "MissingMandatoryField",
    "data": {}
}
```


##Read own collection

    GET /v2/account/collections/{id}


**Success Response**
```
Status: 200 OK
```
[CollectionPresenter.L1](presenters/collection.md#collectionpresenterl1)


**Error Response (Collection not found)**
```
Status: 404 Not Found
```
```json
{
    "message": "Collection not found",
    "code": "EntityNotFoundException",
    "data": {}
}
```


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

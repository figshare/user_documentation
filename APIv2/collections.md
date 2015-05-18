# Collection public endpoints


##List public collections

    GET /v2/collections


**Input**

|Name             |Type|Description|
|-----------------|----|-----------|
|`page`             | `int`|Show specified page only. Default is 1. Max page is 100. To see more then 100 pages, the search endpoint must be used to narrow down the results|
|`size`             | `int`|How many entries per page to show. Default is 10.|


**Success Response (list of collections)**
```
Status: 200 OK
```
```json
[
    {
        "id": 123,
        "title": "Sample collection",
        "doi": "http://dx.doi.org/10.6084/m9.figshare.123",
        "url": "https://figshare.com/v2/collections/123"
    },
    {
        "id": 124,
        "title": "Sample collection",
        "doi": "http://dx.doi.org/10.6084/m9.figshare.124",
        "url": "https://figshare.com/v2/collections/124"
    },
    {
        "id": 123,
        "title": "Sample collection",
        "doi": "http://dx.doi.org/10.6084/m9.figshare.123",
        "url": "https://figshare.com/v2/collections/123"
    },

]
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


##Search public collections

Search public collections. Ordered by published date desc

    POST /v2/collections/search


**Input**

|Name               |Type   |Description|
|-------------------|-------|-----------|
|`page`             |`int`  |(offset)Show specified page only. Default is 1. Max is 100|
|`size`             |`int`  |(limit)How many entries per page to show. Default is 10. Max is 100|
|`search_for`       |`str`  |(query)String to perform search for. Minimum of 4 characters|
|`published_since`  |`date` |(filter)Narrow search  to collections published since the specified date|
|`modified_since`   |`date` |(filter)Narrow search  to collections modified since the specified date|
|`resource_doi`     |`str`  |(filter)DOI(resource DOI) to search for|
|`institution`      |`str`  |(filter)Filter results for this instritution only|
|`group`            |`str`  |(filter)Filter results for this institution group only|
|`order_by`         |`str`  |(sort)Perform a sort using the `order_by`. Valid values are: `published_date`, `modified_date`, `views`, `shares`|
|`order_method`     |`str`  |(sort)How to sort. Descending or ascending. Valid values are: `desc`, 'asc'|



The response body will use the collection `light` presenter.
**Success Response (list of collections)**
```
Status: 200 OK
```
```json
[
    {
        "id": 123,
        "title": "Sample collection",
        "doi": "http://dx.doi.org/10.6084/m9.figshare.123",
        "url": "https://figshare.com/v2/collections/123"
    },
    {
        "id": 124,
        "title": "Sample collection",
        "doi": "http://dx.doi.org/10.6084/m9.figshare.124",
        "url": "https://figshare.com/v2/collections/124"
    },
    {
        "id": 123,
        "title": "Sample collection",
        "doi": "http://dx.doi.org/10.6084/m9.figshare.123",
        "url": "https://figshare.com/v2/collections/123"
    },

]
```

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
```json
{
    "id": 123,
    "title": "Sample collection",
    "doi": "http://dx.doi.org/10.6084/m9.figshare.123",
    "resource_id": "AS124056",
    "resource_version": 1,
    "resource_doi": "http://dx.doi.org/10.608/m9.pub.7481",
    "description": "Sample description",
    "categories": [
        {
            "id": 1,
            "name": "Chemistry"
        },
        {
            "id": 10,
            "name": "Science"
        }
    ],
    "references": [
        "http://link1",
        "http://link2"
    ],
    "tags": [
        "tag1",
        "tag2"
    ],
    "authors": [
        {
            "id":1258,
            "full_name": "John Doe",
            "active": 1,
            "url": "https://figshare.com/v2/authors/1258"
        },
        {
            "id":1259,
            "full_name": "John Smith",
            "active": 1,
            "url": "https://figshare.com/v2/authors/1259"
        },
        {
            "id":1260,
            "full_name": "John Dark",
            "active": 0,
            "url": ""
        }
    ],
    "institution_id": 154,
    "group_id": 445,
    "article_count": 100,
    "public": 1,
    "articles": [
        {
            "id": 88855,
            "title": "Article 1 from collection",
            "public": 1,
            "doi": "http://dx.doi.org/10.6084/m9.figshare.88855",
            "url": "https://figshare.com/v2/articles/88855"
        },
        {
            "id": 88856,
            "title": "Article 2 from collection",
            "public": 1,
            "doi": "http://dx.doi.org/10.6084/m9.figshare.88856",
            "url": "https://figshare.com/v2/articles/88856"
        }
    ],
    "custom_metadata": [
        {
            "location": "Paris"
        },
        {
            "size": "1 feet"
        },
    ]
}
```

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

##Read public collection version

Read public collection that has {id} and {v_number}

    GET /v2/collections/{id}/versions/{v_number}


**Success Response (collection object for specified version)**
```
Status: 200 OK
```
```json
{
    "id": 123,
    "title": "Sample collection",
    "doi": "http://dx.doi.org/10.6084/m9.figshare.123",
    "resource_id": "AS124056",
    "resource_version": 1,
    "resource_doi": "http://dx.doi.org/10.608/m9.pub.7481",
    "description": "Sample description",
    "categories": [
        {
            "id": 1,
            "name": "Chemistry"
        },
        {
            "id": 10,
            "name": "Science"
        }
    ],
    "references": [
        "http://link1",
        "http://link2"
    ],
    "tags": [
        "tag1",
        "tag2"
    ],
    "authors": [
        {
            "id":1258,
            "full_name": "John Doe",
            "active": 1,
            "url": "https://figshare.com/v2/authors/1258"
        },
        {
            "id":1259,
            "full_name": "John Smith",
            "active": 1,
            "url": "https://figshare.com/v2/authors/1259"
        },
        {
            "id":1260,
            "full_name": "John Dark",
            "active": 0,
            "url": ""
        }
    ],
    "institution_id": 154,
    "group_id": 445,
    "article_count": 100,
    "public": 1,
    "articles": [
        {
            "id": 88855,
            "title": "Article 1 from collection",
            "public": 1,
            "doi": "http://dx.doi.org/10.6084/m9.figshare.88855",
            "url": "https://figshare.com/v2/articles/88855"
        },
        {
            "id": 88856,
            "title": "Article 2 from collection",
            "public": 1,
            "doi": "http://dx.doi.org/10.6084/m9.figshare.88856",
            "url": "https://figshare.com/v2/articles/88856"
        }
    ],
    "custom_metadata": [
        {
            "location": "Paris"
        },
        {
            "size": "1 feet"
        },
    ]

}
```

**Error Response (Version not found)**
```
Status: 404 Not Found
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

|Name               |Type   |Description|
|-------------------|-------|-----------|
|`page`             |`int`  |Show specified page only. Default is 1. Max page is 100. After 100 an error is raise and user is instructed to use the search endpoint|
|`size`             |`int`  |How many entries per page to show. Default is 10. Max is 100|


**Success Response**
```
Status: 200 OK
```
```json
[
    {
        "id": 123,
        "title": "Sample collection",
        "doi": "http://dx.doi.org/10.6084/m9.figshare.123",
        "url": "https://figshare.com/v2/collections/123"
    },
    {
        "id": 124,
        "title": "Sample collection",
        "doi": "http://dx.doi.org/10.6084/m9.figshare.124",
        "url": "https://figshare.com/v2/collections/124"
    },
    {
        "id": 123,
        "title": "Sample collection",
        "doi": "http://dx.doi.org/10.6084/m9.figshare.123",
        "url": "https://figshare.com/v2/collections/123"
    },

]
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


##Search own collections

    POST /v2/account/collections/search


**Input**

|Name               |Type   |Description|
|-------------------|-------|-----------|
|`page`             |`int`  |(offset)Show specified page only. Default is 1. Max is 100|
|`size`             |`int`  |(limit)How many entries per page to show. Default is 10. Max is 100|
|`search_for`       |`str`  |(query)String to perform search for. Minimum of 4 characters|
|`published_since`  |`date` |(filter)Narrow search  to collections published since the specified date|
|`modified_since`   |`date` |(filter)Narrow search  to collections modified since the specified date|
|`resource_doi`     |`str`  |(filter)DOI(resource DOI) to search for|
|`institution`      |`str`  |(filter)Filter results for this instritution only|
|`group`            |`str`  |(filter)Filter results for this institution group only|
|`order_by`         |`str`  |(sort)Perform a sort using the `order_by`. Valid values are: `published_date`, `modified_date`, `views`, `shares`|
|`order_method`     |`str`  |(sort)How to sort. Descending or ascending. Valid values are: `desc`, 'asc'|


**Success Response (list of collections)**
```
Status: 200 OK
```
```json
[
    {
        "id": 123,
        "title": "Sample collection",
        "doi": "http://dx.doi.org/10.6084/m9.figshare.123",
        "url": "https://figshare.com/v2/collections/123"
    },
    {
        "id": 124,
        "title": "Sample collection",
        "doi": "http://dx.doi.org/10.6084/m9.figshare.124",
        "url": "https://figshare.com/v2/collections/124"
    },
    {
        "id": 123,
        "title": "Sample collection",
        "doi": "http://dx.doi.org/10.6084/m9.figshare.123",
        "url": "https://figshare.com/v2/collections/123"
    },

]
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
|`resource_doi`       |`str`                  |Not applicable to regular users. In a publisher case, this is the publisher article DOI|
|`resource_link`      |`str`                  |Not applicable to regular users. In a publisher case, this is the publisher article link|
|`resource_title`     |`str`                  |Not applicable to regular users. In a publisher case, this is the publisher article title|
|`resource_version`   |`int`                  |Not applicable to regular users. In a publisher case, this is the publisher article version|
|`custom_metadata`  |`dict`                 |List of key, values pairs to be associated with the collection. Similar to custom article fields|

In the success response the  `detailed` collection presenter will be used.

**Success Response**
```
Status: 201 Created
Location: https://api.figshare.com/v2/account/collections/123
```
```json
{
    "id": 123,
    "title": "Sample collection",
    "doi": "http://dx.doi.org/10.6084/m9.figshare.123",
    "resource_id": "AS124056",
    "resource_version": 1,
    "resource_doi": "http://dx.doi.org/10.608/m9.pub.7481",
    "description": "Sample description",
    "categories": [
        {
            "id": 1,
            "name": "Chemistry"
        },
        {
            "id": 10,
            "name": "Science"
        }
    ],
    "references": [
        "http://link1",
        "http://link2"
    ],
    "tags": [
        "tag1",
        "tag2"
    ],
    "authors": [
        {
            "id":1258,
            "full_name": "John Doe",
            "active": 1,
            "url": "https://figshare.com/v2/authors/1258"
        },
        {
            "id":1259,
            "full_name": "John Smith",
            "active": 1,
            "url": "https://figshare.com/v2/authors/1259"
        },
        {
            "id":1260,
            "full_name": "John Dark",
            "active": 0,
            "url": ""
        }
    ],
    "institution_id": 154,
    "group_id": 445,
    "article_count": 100,
    "public": 1,
    "articles": [
        {
            "id": 88855,
            "title": "Article 1 from collection",
            "public": 1,
            "doi": "http://dx.doi.org/10.6084/m9.figshare.88855",
            "url": "https://figshare.com/v2/articles/88855"
        },
        {
            "id": 88856,
            "title": "Article 2 from collection",
            "public": 1,
            "doi": "http://dx.doi.org/10.6084/m9.figshare.88856",
            "url": "https://figshare.com/v2/articles/88856"
        }
    ],
    "custom_metadata": [
        {
            "location": "Paris"
        },
        {
            "size": "1 feet"
        },

}
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
```json
{
    "id": 123,
    "title": "Sample collection",
    "doi": "http://dx.doi.org/10.6084/m9.figshare.123",
    "resource_id": "AS124056",
    "resource_version": 1,
    "resource_doi": "http://dx.doi.org/10.608/m9.pub.7481",
    "description": "Sample description",
    "categories": [
        {
            "id": 1,
            "name": "Chemistry"
        },
        {
            "id": 10,
            "name": "Science"
        }
    ],
    "references": [
        "http://link1",
        "http://link2"
    ],
    "tags": [
        "tag1",
        "tag2"
    ],
    "authors": [
        {
            "id":1258,
            "full_name": "John Doe",
            "active": 1,
            "url": "https://figshare.com/v2/authors/1258"
        },
        {
            "id":1259,
            "full_name": "John Smith",
            "active": 1,
            "url": "https://figshare.com/v2/authors/1259"
        },
        {
            "id":1260,
            "full_name": "John Dark",
            "active": 0,
            "url": ""
        }
    ],
    "institution_id": 154,
    "group_id": 445,
    "article_count": 100,
    "public": 1,
    "articles": [
        {
            "id": 88855,
            "title": "Article 1 from collection",
            "public": 1,
            "doi": "http://dx.doi.org/10.6084/m9.figshare.88855",
            "url": "https://figshare.com/v2/articles/88855"
        },
        {
            "id": 88856,
            "title": "Article 2 from collection",
            "public": 1,
            "doi": "http://dx.doi.org/10.6084/m9.figshare.88856",
            "url": "https://figshare.com/v2/articles/88856"
        }
    ],
    "custom_metadata": [
        {
            "location": "Paris"
        },
        {
            "size": "1 feet"
        },

}
```

**Error Response (Collection not found)**
```
Status: 404 Not Found
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
|`resource_doi`     |`str`                  |Not applicable to regular users. In a publisher case, this is the publisher article DOI|
|`resource_title`   |`str`                  |Not applicable to regular users. In a publisher case, this is the publisher article title|
|`resource_version` |`int`                  |Not applicable to regular users. In a publisher case, this is the publisher article version|
|`tags`             |`array of str`         |List of tags to be associated with the collection (e.g ['tag1', 'tag2', 'tagn'])|
|`references`       |`array of str`         |List of URLs to be assosciated with the collection|
|`custom_metadata`  |`dict`                 |List of key, values pairs to be associated with the collection. Similar to custom article fields|


**Success Response**
```
Status: 200 OK
```
```json
{
    "id": 123,
    "title": "Sample collection",
    "doi": "http://dx.doi.org/10.6084/m9.figshare.123",
    "resource_id": "AS124056",
    "resource_version": 1,
    "resource_doi": "http://dx.doi.org/10.608/m9.pub.7481",
    "description": "Sample description",
    "categories": [
        {
            "id": 1,
            "name": "Chemistry"
        },
        {
            "id": 10,
            "name": "Science"
        }
    ],
    "references": [
        "http://link1",
        "http://link2"
    ],
    "tags": [
        "tag1",
        "tag2"
    ],
    "authors": [
        {
            "id":1258,
            "full_name": "John Doe",
            "active": 1,
            "url": "https://figshare.com/v2/authors/1258"
        },
        {
            "id":1259,
            "full_name": "John Smith",
            "active": 1,
            "url": "https://figshare.com/v2/authors/1259"
        },
        {
            "id":1260,
            "full_name": "John Dark",
            "active": 0,
            "url": ""
        }
    ],
    "institution_id": 154,
    "group_id": 445,
    "article_count": 100,
    "public": 1,
    "articles": [
        {
            "id": 88855,
            "title": "Article 1 from collection",
            "public": 1,
            "doi": "http://dx.doi.org/10.6084/m9.figshare.88855",
            "url": "https://figshare.com/v2/articles/88855"
        },
        {
            "id": 88856,
            "title": "Article 2 from collection",
            "public": 1,
            "doi": "http://dx.doi.org/10.6084/m9.figshare.88856",
            "url": "https://figshare.com/v2/articles/88856"
        }
    ],
    "custom_metadata": [
        {
            "location": "Paris"
        },
        {
            "size": "1 feet"
        },
}
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
```json
{
    "id": 123,
    "title": "Sample collection",
    "doi": "http://dx.doi.org/10.6084/m9.figshare.123",
    "resource_id": "AS124056",
    "resource_version": 1,
    "resource_doi": "http://dx.doi.org/10.608/m9.pub.7481",
    "description": "Sample description",
    "categories": [
        {
            "id": 1,
            "name": "Chemistry"
        },
        {
            "id": 10,
            "name": "Science"
        }
    ],
    "references": [
        "http://link1",
        "http://link2"
    ],
    "tags": [
        "tag1",
        "tag2"
    ],
    "authors": [
        {
            "id":1258,
            "full_name": "John Doe",
            "active": 1,
            "url": "https://figshare.com/v2/authors/1258"
        },
        {
            "id":1259,
            "full_name": "John Smith",
            "active": 1,
            "url": "https://figshare.com/v2/authors/1259"
        },
        {
            "id":1260,
            "full_name": "John Dark",
            "active": 0,
            "url": ""
        }
    ],
    "institution_id": 154,
    "group_id": 445,
    "article_count": 100,
    "public": 1,
    "articles": [
        {
            "id": 88855,
            "title": "Article 1 from collection",
            "public": 1,
            "doi": "http://dx.doi.org/10.6084/m9.figshare.88855",
            "url": "https://figshare.com/v2/articles/88855"
        },
        {
            "id": 88856,
            "title": "Article 2 from collection",
            "public": 1,
            "doi": "http://dx.doi.org/10.6084/m9.figshare.88856",
            "url": "https://figshare.com/v2/articles/88856"
        }
    ],
    "custom_metadata": [
        {
            "location": "Paris"
        },
        {
            "size": "1 feet"
        },

}
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
```json
[
    {
        "id":1258,
        "full_name": "John Doe",
        "active": 1,
        "url": "https://figshare.com/v2/authors/1258"
    },
    {
        "id":1259,
        "full_name": "John Smith",
        "active": 1,
        "url": "https://figshare.com/v2/authors/1259"
    },
    {
        "id":1260,
        "full_name": "John Dark",
        "active": 0,
        "url": ""
    }


]
```

###Associate new authors with the collection

    POST /v2/account/collections/{id}/authors


**Input**

|Name               |Type                   |Description                                |
|-------------------|-----------------------|-------------------------------------------|
|`authors`          |`array of int|str`     |List of new authors to be assosciated with the collection. The list can contain author ids ([12121, 34345, 233323]) or author names([1212, 'John Doe'])|


**Success Response**
```
Status: 200 OK
```
```json
[
    {
        "id":1258,
        "full_name": "John Doe",
        "active": 1,
        "url": "https://figshare.com/v2/authors/1258"
    },
    {
        "id":1259,
        "full_name": "John Smith",
        "active": 1,
        "url": "https://figshare.com/v2/authors/1259"
    },
    {
        "id":1260,
        "full_name": "John Dark",
        "active": 0,
        "url": ""
    }


]
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
|`authors`          |`array of int|str`     |List of authors to be assosciated with the collection. The list can contain author ids ([12121, 34345, 233323]) or author names([1212, 'John Doe']). Existing authors will be replaced|

To represent the author entity, the `light` presenter will be used.

**Success Response**
```
Status: 200 OK
```
```json
[
    {
        "id":1258,
        "full_name": "John Doe",
        "active": 1,
        "url": "https://figshare.com/v2/authors/1258"
    },
    {
        "id":1259,
        "full_name": "John Smith",
        "active": 1,
        "url": "https://figshare.com/v2/authors/1259"
    },
    {
        "id":1260,
        "full_name": "John Dark",
        "active": 0,
        "url": ""
    }

]

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
```json
[
    {
        "id": 123,
        "title": "Sample collection",
        "doi": "http://dx.doi.org/10.6084/m9.figshare.123",
        "url": "https://figshare.com/v2/collections/123"
    },
    {
        "id": 124,
        "title": "Sample collection",
        "doi": "http://dx.doi.org/10.6084/m9.figshare.124",
        "url": "https://figshare.com/v2/articles/124"
    },
    {
        "id": 125,
        "title": "Sample collection",
        "doi": "http://dx.doi.org/10.6084/m9.figshare.125",
        "url": "https://figshare.com/v2/articles/125"
    }
]

```

###Associate new categories with the collection

    POST /v2/account/collections/{id}/categories


**Input**

|Name               |Type                   |Description                                |
|-------------------|-----------------------|-------------------------------------------|
|`categories`       |`array of int`         |List of new categories to be assosciated with the collection|


**Success Response**
```
Status: 200 OK
```
```json
[
    {
        "id": 123,
        "title": "Sample collection",
        "doi": "http://dx.doi.org/10.6084/m9.figshare.123",
        "url": "https://figshare.com/v2/collections/123"
    },
    {
        "id": 124,
        "title": "Sample collection",
        "doi": "http://dx.doi.org/10.6084/m9.figshare.124",
        "url": "https://figshare.com/v2/articles/124"
    },
    {
        "id": 125,
        "title": "Sample collection",
        "doi": "http://dx.doi.org/10.6084/m9.figshare.125",
        "url": "https://figshare.com/v2/articles/125"
    }
]
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
Status: 200 OK
```
```json
[
    {
        "id": 123,
        "title": "Sample collection",
        "doi": "http://dx.doi.org/10.6084/m9.figshare.123",
        "url": "https://figshare.com/v2/collections/123"
    },
    {
        "id": 124,
        "title": "Sample collection",
        "doi": "http://dx.doi.org/10.6084/m9.figshare.124",
        "url": "https://figshare.com/v2/articles/124"
    },
    {
        "id": 125,
        "title": "Sample collection",
        "doi": "http://dx.doi.org/10.6084/m9.figshare.125",
        "url": "https://figshare.com/v2/articles/125"
    }
]
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
Status: 200 OK
```
```json
{object}
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
```json
[
    {
        "id": 123,
        "title": "Sample collection",
        "doi": "http://dx.doi.org/10.6084/m9.figshare.123",
        "url": "https://figshare.com/v2/collections/123"
    },
    {
        "id": 124,
        "title": "Sample collection",
        "doi": "http://dx.doi.org/10.6084/m9.figshare.124",
        "url": "https://figshare.com/v2/articles/124"
    },
    {
        "id": 125,
        "title": "Sample collection",
        "doi": "http://dx.doi.org/10.6084/m9.figshare.125",
        "url": "https://figshare.com/v2/articles/125"
    }
]
```

###Associate new articles with the collection

    POST /v2/account/collections/{id}/articles


**Input**

|Name               |Type                   |Description                                |
|-------------------|-----------------------|-------------------------------------------|
|`articles`         |`array of int`         |List of new articles to be assosciated with the collection. No more then 10 article IDs per request|


**Success Response**
```
Status: 200 OK
```
```json
[
    {
        "id": 123,
        "title": "Sample collection",
        "doi": "http://dx.doi.org/10.6084/m9.figshare.123",
        "url": "https://figshare.com/v2/collections/123"
    },
    {
        "id": 124,
        "title": "Sample collection",
        "doi": "http://dx.doi.org/10.6084/m9.figshare.124",
        "url": "https://figshare.com/v2/articles/124"
    },
    {
        "id": 125,
        "title": "Sample collection",
        "doi": "http://dx.doi.org/10.6084/m9.figshare.125",
        "url": "https://figshare.com/v2/articles/125"
    }
]
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
Status: 200 OK
```
```json
[
    {
        "id": 123,
        "title": "Sample collection",
        "doi": "http://dx.doi.org/10.6084/m9.figshare.123",
        "url": "https://figshare.com/v2/collections/123"
    },
    {
        "id": 124,
        "title": "Sample collection",
        "doi": "http://dx.doi.org/10.6084/m9.figshare.124",
        "url": "https://figshare.com/v2/articles/124"
    },
    {
        "id": 125,
        "title": "Sample collection",
        "doi": "http://dx.doi.org/10.6084/m9.figshare.125",
        "url": "https://figshare.com/v2/articles/125"
    }
]
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
```json
[
    {
        "id": "asasa549as4as4as8a7s4aasasasasasasa5788a",
        "valid_until": "2015-12-22 12:14",
        "scope": "collection",
        "user": 0
    },
    {
        "id": "asasa549as4a4444444444444444sa6s4a56s53a",
        "valid_until": "2015-12-23 12:14",
        "scope": "collection",
        "user": 0
    },
    {
        "id": "a89999999999999999999999999999994a56s53a",
        "valid_until": "2015-12-24 12:14",
        "scope": "collection",
        "user": 0
    },
]
```

###Create new private link for this collection

    POST /v2/account/collections/{id}/private_links


**Input**

|Name               |Type                   |Description                                |
|-------------------|-----------------------|-------------------------------------------|
|`valid_until`      |`date`                 |Date when this private link should expire - option. By default private links do not expire|
|`scope`            |`str`                  |Private links can be accessed by public users or logged in users. Scope `public` implies that anyone can access the link. Scope `private` implies that only logged in users can access the link|
|`user`             |`int`                  |Private links with `private` scope can be generated for specific users|



**Success Response**
```
Status: 201 OK
```
```json
{
    "id": "asasa549as4as4as8a7s4as4asa4sa6s4a56s53a",
    "valid_until": "2015-12-22 12:14",
    "scope": "collection",
    "user": 0
}
```


###Update existing private link for this  collection

    PUT /v2/account/collections/{id}/private_links/{p_id}

**Input**

|Name               |Type                   |Description                                |
|-------------------|-----------------------|-------------------------------------------|
|`valid_until`      |`date`                 |Date when this private link should expire - option. By default private links do not expire|
|`scope`            |`str`                  |Private links can be accessed by public users or logged in users. Scope `public` implies that anyone can access the link. Scope `private` implies that only logged in users can access the link|
|`user`             |`int`                  |Private links with `private` scope can be generated for specific users|



**Success Response**
```
Status: 200 OK
```
```json
{
    "id": "asasa549as4as4as8a7s4as4asa4sa6s4a56s53a",
    "valid_until": "2015-12-22 12:14",
    "scope": "collection",
    "user": 0
}
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


##Collection versions subsection

###List versions

    GET /v2/account/collections/{id}/versions

The collection version `light` presenter will be used.

**Success Response**
```
Status: 200 OK
```
```json
[
    {
        "version": 1,
        "url": ""
    },
    {
        "version": 2,
        "url": ""
    }
]
```

###View collection version

    GET /v2/account/collections/{id}/versions/{v_nr}


**Success Response**
```
Status: 200 OK
```
```json
{
    "id": 123,
    "version": 3,
    "title": "Sample collection",
    "doi": "http://dx.doi.org/10.6084/m9.figshare.123",
    "resource_id": "AS124056",
    "resource_version": 1,
    "resource_doi": "http://dx.doi.org/10.608/m9.pub.7481",
    "description": "Sample description",
    "categories": [
        {
            "id": 1,
            "name": "Chemistry"
        },
        {
            "id": 10,
            "name": "Science"
        }
    ],
    "references": [
        "http://link1",
        "http://link2"
    ],
    "tags": [
        "tag1",
        "tag2"
    ],
    "authors": [
        {
            "id":1258,
            "full_name": "John Doe",
            "active": 1,
            "url": "https://figshare.com/v2/authors/1258"
        },
        {
            "id":1259,
            "full_name": "John Smith",
            "active": 1,
            "url": "https://figshare.com/v2/authors/1259"
        },
        {
            "id":1260,
            "full_name": "John Dark",
            "active": 0,
            "url": ""
        }
    ],
    "institution_id": 154,
    "group_id": 445,
    "article_count": 100,
    "public": 1,
    "articles": [
        {
            "id": 88855,
            "title": "Article 1 from collection",
            "public": 1,
            "doi": "http://dx.doi.org/10.6084/m9.figshare.88855",
            "url": "https://figshare.com/v2/articles/88855"
        },
        {
            "id": 88856,
            "title": "Article 2 from collection",
            "public": 1,
            "doi": "http://dx.doi.org/10.6084/m9.figshare.88856",
            "url": "https://figshare.com/v2/articles/88856"
        }
    ],
    "custom_metadata": [
        {
            "location": "Paris"
        },
        {
            "size": "1 feet"
        },
    ]
}
```

**Error Response (Collection version not found)**
```
Status: 404 Not Found
```
```json
{
    "message": "Collection version not found",
    "code": "EntityVersionNotFoundException",
    "data": {}
}
```


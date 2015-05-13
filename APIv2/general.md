#API feature list

##Public endpoints:
- list and search articles (`end of May release`)
- list and search collections (`end of May release`)
- list and search projects (`end of July release`)
- read public entities(articles, collections, projects) (`end of May/July release`)
- list and search authors (`end of June release`)

##Private endpoints
###Manage articles 
- reserve DOI(`end of May release`)
- manage private links(`end of May release`)
- versioning(`end of May release`)
- manage file uploads (resume, parallel uploads)(`end of May release`)
    
###Manage collections
- reserve DOI (`end of May release`)
- manage private links (`end of May release`)
- versioning (`end of May release`)

###Manage projects (`end of June release`)

###HR Feed ingest (`available`)



##Schema

All API access is over HTTPS, and accessed from the api.figshare.com domain (/v2 path). All data is sent and received as JSON.



##Entity representations

Evert entity has associated a list of presenters. Usually these are: `light`, `detailed`.

When you retrieve a list of entities, the response includes a subset of the attributes for that entity.
This is called the `light` presenter.

The `light` presenter usually excludes attributes that are expensive to retrieve/compute. Other attributes could also be excluded in order to reduce the response time.

For example, when you retrieve the list of recently published collections, the `light` presenter is used to display each entity:

```
GET /v2/collections
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
        "title": "Test collection",
        "doi": "http://dx.doi.org/10.6084/m9.figshare.124",
        "url": "https://figshare.com/v2/collections/124"
    },

]
```

When you retrieve an individual entity, usually the `detailed` presenter will be used and it will contain all attributes for the entity.

```
GET /v2/collections/123
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



##Parameters

Most of the API endpoints take optional request parameters.

For GET requests these are usually passsed in HTTP query string.

For POST, PUT and DELETE requests, parameters and sent in the request body and they should be encoded as JSON with a Content-Type `application/json`.


##Client errors

There are 3 types of possible errors that the API could return.

###404 Not found
Trying to access resources that do not exist, will trigger this response from the API.
For example, when trying to access an unexisting author in the collection's authors subsection, the API will return a 404 Response

```
GET /v2/collections/123/authors/111
```


###400 Bad request
Sending invalid structured JSON will return a `400 Bad request`. The API response will also contain a body:

```
Status: 400 Bad request
```
```json
{
    "message": "Unable to load/parse json body."
}
```

###422 Unprocessable Entity
Sending valid structured JSON with invalid values return a `422 Unprocessable Entity`. The API response will also contain a body:

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

|Field|Description|
|-----|-----------|
|field|The field in the json data that caused the error|
|exception| The exception name raised by the API|
|string| The exception's string representation. This usually is what provides the most meaningfull information|





##Pagination
Requests that return a list of entities will pe paginated by default to `10` items. You can specify further pages using the `page` parameter.
You should be able to also set a custom page size up to 100 entities per page. The page size can be specified using the `size` param.

Note that while you can specify further pages, this is limited to 100. This is for technical reasons. You can however the search endpoint to narrow down the list.
Usually endpoints that return lists of entities also have a nested search endpoint:

```
GET /v2/collections
POST /v2/collections/search
```

##Authentication

The API is using OAuth2 as the authorization/authentication layer.
The OAuth2 Token should be sent only in the request header.


Private endpoints usually require authentication. If no OAuth2 token is sent, the API will return a `401 Unauthorized` error.
If an invalid OAuth token is sent, the API will return a `403 Forbidden` error.


##Rate limiting
No information available.



##ETag and Last-Modified
Most responses should return an ETag header and a Last-Modified header.
You can use the values of these headers to create condiditional requests.
We encourage  to use these whenever possible.



##CORS policy
The API supports CORS for AJAX requests from any origin.




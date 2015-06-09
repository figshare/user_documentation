Symplectic/Figshare integration API documentation
=================================================

Phase 1 aims to make Figshare a standard Elements data source, providing Loughborough with ongoing 
visibility within Elements of all of its Figshare for Institutions metadata, including all article 
and file metadata, and all workflow status relevant to the experience of publishing a Figshare 
article/file.


## Authentication and trust

All Symplectic endpoints are secured with [OAuth 1.0](https://tools.ietf.org/html/rfc5849).  
The `oauth_consumer_key`, `oauth_consumer_secret`, `oauth_token` and `oauth_token_secret` params 
will be transmitted by email.  
The oauth_signature_method is `HMAC-SHA1`.

When the OAuth request headers are missing or invalid, the response status code is 
`400 Bad Request`.  
The response body contains the error code and message, for example:

```
{
  "message": "Bad request. Expired timestamp.",
  "errcode": "BadRequest"
}
```

When the OAuth request headers are valid, the request is correctly signed, but the access token
is disabled or it does not exist, the response status code is `401 Unauthorized`.  
The response body contains the error code and detailed message, for example:

```
{
  "message": "Unauthorized. Unknown or disabled access token.",
  "errcode": "Unauthorized"
}
```


## Cache control 

All Symplectic endpoints support `ETag(If-None-Match)` cache mechanism.

When the response status code is `200 OK`, the response headers will contain the server-side 
computed checksum to be used with `If-None-Match` client cache mechanism.  
Example: `ETag: "6adf97f83acf6453d4a6a4b1070f3754"`.

When the client provides a value for `If-None-Match` request header, if that value matches the
server-side computed `ETag`, the reponse status code will be `304 Not Modified` and the response
will not contain a body.


## Endpoints

The base URL for symplectic API endpoints is `https://api.figsh.com/v1`.


## List identifiers for changed accounts

    GET /symplectic/accounts

**Query Parameters**

|Name    | Mandatory|Type       |Description |
|--------|----------|-----------|----------------------------------------------------------------|
|`since` | mandatory|`datetime` |Last known change to an account. Example: `2014-02-31 23:59:09`.|
|`offset`|    no    |`int`      |The first entry to return. The offset of the initial entry is 0.|
|`count` |    no    |`int`      |The number of returned entries. Only in combination with `offset`.|

**Success response**

Returns a list of identifiers (institution user id) for accounts that have been changed since the
specified datetime.

```
Status: 200 OK
```

Example:

```json
[
  "institution user identifier 1",
  "institution user identifier 2"
]
```


## List ids for changed articles

    GET /symplectic/articles

**Query Parameters**

|Name          | Mandatory|Type       |Description |
|--------------|----------|-----------|----------------------------------------------------------|
|`since`       |yes|`datetime` |Last known change to an article. Example: `2014-02-31 23:59:09`.|
|`offset`      |no |`int`      |The first entry to return. The offset of the initial entry is 0.|
|`count`       |no |`int`      |The number of returned entries. Only in combination with `offset`.|
|`is_embargoed`|no |`string`   |Filter articles by their embargo. `true` or `false`.|
|`status`      |no | `string`  |Filter articles by their status. `public` or `private`.|

**Success response**

Returns a list of identifiers (integer ids) for articles that have been changed since the
specified datetime.

```
Status: 200 OK
```

Example:

```json
[
  20010, 30014
]
```


## List article ids for a specified account

    GET /symplectic/accounts/{institution_user_id}/articles

**URL parameters**

`institution_user_id` unique user identifier provided by the institution

**Query Parameters**

|Name          | Mandatory|Type       |Description |
|--------------|----------|-----------|------------------------------------------------|
|`is_embargoed`|no |`string`   |Filter articles by their embargo. `true` or `false`.   |
|`status`      |no | `string`  |Filter articles by their status. `public` or `private`.|


**Success response**

Returns a list of identifiers (integer ids) for articles owned by the specified user

```
Status: 200 OK
```

Example:

```json
[
  20010, 30014
]
```


## Get a specified article

    GET /symplectic/articles/{article_id}

**URL parameters**

`article_id` integer identifier for the article

**Success response**

Returns a JSON with article data.

``` Status: 200 OK ```

Example:

```json
{
  "status": "draft",
  "version": 0,
  "filesCount": 0,
  "authors": [
    {
      "lastName": "Mayert",
      "id": 1000034,
      "firstName": "Dian",
      "name": "Dian Mayert"
    },
    {
      "lastName": "Hintz",
      "id": 1000250,
      "firstName": "Roger",
      "name": "Roger Hintz"
    },
    {
      "lastName": "Rowe",
      "id": 1000248,
      "firstName": "Coby",
      "name": "Coby Rowe"
    },
    {
      "lastName": "Veum",
      "id": 1000249,
      "firstName": "Collis",
      "name": "Collis Veum"
    }
  ],
  "confidentialReason": "",
  "licenseId": 1,
  "embargoType": 0,
  "isMetadataRecord": false,
  "id": 2000079,
  "size": 0,
  "projectIsIndividual": false,
  "funding": "",
  "title": "Cross-group transitional infrastructure",
  "projectId": 10015,
  "publishedDate": null,
  "downloadsCount": 0,
  "institutionId": 1,
  "tags": [
    "non",
    "fugit",
    "rerum"
  ],
  "categories": [
    {
      "id": 18,
      "title": "Psychology"
    },
    {
      "id": 143,
      "title": "Solid Earth Sciences"
    },
    {
      "id": 161,
      "title": "Disability Studies"
    }
  ],
  "isConfidential": false,
  "files": [],
  "systemDefinedType": "dataset",
  "description": "engineer synergistic technologies",
  "isEmbargoed": false,
  "embargoDate": null,
  "isPublic": false,
  "detectedLicenseId": 0,
  "pageViewsCount": 0,
  "modifiedDate": null,
  "createdDate": "2015-06-05T11:52:05",
  "groupId": 8,
  "isActive": true,
  "embargo": null,
  "doi": "",
  "license": "CC-BY",
  "url": "_",
  "definedType": "dataset",
  "embargoReason": "",
  "references": [
    "http://daugherty.info/",
    "http://mclaughlin-prosacco.info/",
    "http://www.lind.com/"
  ],
  "likesCount": 0
}
```

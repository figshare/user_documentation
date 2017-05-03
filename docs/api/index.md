# API feature list

The figshare api v2 is accessible at https://api.figshare.com/v2. All
communication is done through *https* and all data is encoded as `JSON`.

* [Sending parameters](#sending-parameters)
* [Resource representations](#resource-representations)
* [Authentication](#authentication)
* [Errors](#errors)
* [Searching, filtering and pagination](#searching-filtering-and-pagination)
* [Rate limiting](#rate-limiting)
* [Conditional requests](#conditional-requests)
* [CORS policy](#cors-policy)
* Endpoints
  - [collections](collections.md)
  - [items](articles.md)
  - [projects](projects.md)


## Sending parameters

More often than not you need to send parameters to an endpoint. For
`GET` requests these are usualy sent in the query string but for `POST`
and `PUT` requests they are usually in the body of the request.

### Query string

Query strings can contain parameters encoded as `application/x-www-form-urlencoded`. Very common for `GET` requests.

**Example**: Sending `page` parameter when listing articles:

```http
GET /v2/articles?page=3 HTTP/1.1
Host: api.figshare.com
Authorization: token a287ab8c7ebdbe6
```

### Request json body

`POST` and `PUT` request usualy read their params from the body of the
http request. Our API only understands `application/json` encoded
bodies.

**Example**: Sending `search_for` parameter when searching for articles:

```http
POST /v2/articles/search HTTP/1.1
Host: api.figshare.com
Authorization: token a287ab8c7ebdbe6

{
    "search_for": "figshare"
}
```

## Resource representations

Resources can be presented differently across endpoints. Usually
endpoints that return a list of resources will send a _lighter_
representation of each resource while an endpoint for an individual
resource will use a more _detailed_ and _complete_ representation.

Representations for each resource type are documented [here](https://github.com/figshare/user_documentation/tree/master/APIv2/presenters) and the
documentation for each endpoint will specify what kind of representation
it's using.

Blank resource fields are included in the representation as `null` instead
of being omitted.


## Authentication

The v2 API supports OAuth2 access tokens, issued as
described in the [oauth documentation page](../oauth.md).

In addition to oauth access tokens, you can also use a _personal token_
which grants you full access to your account. Personal tokens can be
created and managed from the [applications
page](https://figshare.com/account/applications) at figshare.

Any of these tokens can be used to authenticate and there are 2 options
to include them in requests:

### HTTP header (_recommended_)

```http
GET /v2/token HTTP/1.1
Host: api.figshare.com
Authorization: token ACCESS_TOKEN
```

Example with `curl`:

```bash
curl -H "Authorization: token ACCESS_TOKEN" https://api.figshare.com/v2
```

### Query param:

```http
GET /v2/token?access_token=ACCESS_TOKEN HTTP/1.1
Host: api.figshare.com
```

Example with `curl`:

```bash
curl https://api.figshare.com/v2?access_token=ACCESS_TOKEN
```

## Errors

Endpoints can respond with error responses. The common error responses
for all endpoints are presented below and errors specific to individual
enpoints are documented along with the endpoint.

Each error response will have a specific HTTP status code and a JSON
body with the following fields:


|Field|Description|
|-----|-----------|
|message|A human friendly message explaining the error.|
|code|A machine friendly error code, used by the dev team to identify the error.|
|data|An object containing extra information about the error. Documented for each error.|


### 404 Not found

Trying to access resources that do not exist, will trigger this response
from the API.

This is also returned if you try to access a resource on which you don't
have a `read` permission.


### 400 Bad request

Sending a body that cannot be parsed as JSON will result in  this error
response.


### 422 Unprocessable Entity

Sending an invalid data structure in the body will trigger this error.
Invalid data can be any of the following:

* missing field
* invalid value for a field
* any other rules specific to an endpoint


### 401 Unauthorized

This error is returned when the authorization was unsuccessfull. This can
be either due to:

* missing authorization info in the request
* invalid or unknown authorization info
* expired or disabled account


### 403 Forbidden

This response is presented whenever you try to do something which is not
permitted for your current authorization.
authorization info


## Searching, filtering and pagination

Endpoints that list items usually support any of the following features:

* pagination
* ordering
* searching
* filtering


#### Pagination params

Pagination can be done by specifing either `page` and `page_size` params
pair or the `limit` and `offset` params pair. If confusing combinations
appear in a request, a `422 Unprocessable Entity` will be returned.

|field|type|default|description|
|-----|----|-------|-----------|
|`page`|int|1|Page number|
|`page_size`|int|10|The number of results included on a page|
|`limit`|int|10|Number of results included on a page|
|`offset`|int|0|Where to start the listing(the offset of the first result)|

Please note that there's a limit on the maximum offset or page number  you can require.
The offset is currently limited at 1000 and if exceeded a `422 Unprocessable Entity` error will be returned. For pages, it depends on the `page_size`
but for a `page_size` of `10`, the maximum page would be `1000 / 10 = 100`

#### Ordering params

Ordering is done via the `order` and `order_direction` params.

|field|type|default|description|
|-----|----|-------|-----------|
|`order`|string|_varies_|The field by which to order. Default varies by endpoint/resource. For articles and collections, valid values are: `published_date`, `modified_date`, `views`, `shares`, `downloads` and `cites`. |
|`order_direction`|string|_varies_|Only `asc` and `desc` values are supported. Default varies by endpoint/resource|

#### Searching params

|field|type|description|
|-----|----|-----------|
|`search_for`|string|Search endpoints require this field.  Usually min length is 3|

#### Filtering params

Some endpoints allow filtering results. Filters are extra fields in the
body and the documentation for each endpoint will present them in detail.


## Rate limiting

Not implemented at this point.


## Conditional requests

Most responses should return an ETag header and a Last-Modified header.
You can use the values of these headers to create conditional requests.
We encourage  to use these whenever possible.


## CORS policy

The API supports CORS for AJAX requests from any origin.




fig**share** statistics service
===============================

The fig**share** statistics service is available at https://stats.figshare.com and
it supports retrieving information about the number of *views*, *downloads* and *shares*
related to items available of fig**share**. From here on, an event is one of *view*,
*download* or *share*.

All communication with the service is done through *https* and all data is encoded as *json*.
Optional authorization for specific endpoints is done through basic access authentication.

* [Authentication](#authentication)
* [Errors](#errors)
* [Endpoints](#endpoints)


## Authentication

For some specialized endpoints, access to institution specific statistics requires
sending a `base64`-encoded pair of `username:password` in the basic authorization header:

```http
GET https://stats.figshare.com/lboro/top/views/article
Authorization: Basic dGhpcyBpcyBub3QgdGhlIHJlYWwgcGFzc3dvcmQsIGZvb2wh
```

Please note that the analogous endpoint for retrieving statistics for items outside
the institutional scope, requires no authentication:
```http
GET https://stats.figshare.com/top/views/article
```

## Errors

Error responses are common for all endpoints and are presented below.

Each error response will have a specific HTTP status code and a JSON body with the
following fields

|Field|Description|
|-----|-----------|
|message|A human friendly message explaining the error.|
|code|A machine friendly error code, used by the dev team to identify the error.|
|data|An object containing extra information about the error.|


### 400 Bad Request

This error response will be raised when an invalid field is sent in the parameters of the
request or when a field is missing from the parameters of the request. Required and
optional fields in the body are documented for each endpoint, where applicable.


### 403 Forbidden

This error response is presented when attempting to retrieve information from a protected endpoint
without the appropriate `Authorization` header.


### 404 Not Found

This error response is presented when attempting to access a non existing endpoint. Please note
that it will not be raised when attempting to gather statistics for an item which doesn't
exist on **fig**share, instead an appropriate empty result will be returned.


## Endpoints

The statistics service endpoints can be classified in 4 categories:

* [Totals](#totals)
* [Timeline](#timeline)
* [Breakdown](#breakdown)
* [Tops](#tops)

### Scope
All endpoints are applicable for the following items:

* **group**: events on items inside the specified group
* **author**: events on items authored by the specified user
* **article**: events on the specified article
* **project**: events on the specified project
* **collection**: events on the specified collection


### Totals

This type of endpoint enables the retrieval of the total number of events for a specific item.
More details and examples are provided [here](totals.md).


### Timeline

This type of endpoint enables the retrieval of a timeline of the number of events for a specific
item, with a specified granularity. More details and examples are provided [here](timeline.md).


### Breakdown

This type of endpoint enables the retrieval of a geo-location breakdown of the number of events for a specific
item, with a specified granularity. More details and examples are provided [here](breakdown.md).


### Tops

This type of endpoint enables the retrieval of rankings of the most viewed, downloaded or shared items,
over a specific period of time. More details and examples are provided [here](tops.md).

Endpoints for retrieving **totals**
===================================

This type of endpoint provides the total number of *views*, *downloads* or *shares*.


* [Authorization](#authorization)
* [Endpoint format](#endpoint-format)
* [Examples](#examples)


## Authorization

No authorization is required.


## Endpoint format

For items outside an institution scope the endpoints have the format:

```
/total/{counter}/{item}/{item_id}
```

and inside an institution scope they have the format:

```
/{institution}/total/{counter}/{item}/{item_id}
```

where **counter** is one of `views`, `downloads` or `shares`.


## Examples


### Number of views for an unaffiliated article

**Request**

```http
GET https://stats.figshare.com/total/views/article/23
```

**Response**

```http
HTTP/1.1 200 OK
Content-Type: application/json; charset=UTF-8

{
  "totals": 231
}
```


### Number of shares for items authored by a specific user

**Request**

```http
GET https://stats.figshare.com/total/shares/author/15
```

**Response**

```http
HTTP/1.1 200 OK
Content-Type: application/json; charset=UTF-8

{
  "totals": 134
}
```


### Number of downloads for items in an institutional group

**Request**

```http
GET https://stats.figshare.com/monash/total/downloads/group/10
```

**Response**

```http
HTTP/1.1 200 OK
Content-Type: application/json; charset=UTF-8

{
  "totals": 5
}
```


### Number of views for a collection associated to an institution

**Request**

```http
GET https://stats.figshare.com/lboro/total/views/collection/15
```

**Response**

```http
HTTP/1.1 200 OK
Content-Type: application/json; charset=UTF-8

{
  "totals": 3
}
```


### Number of likes for an unaffiliated article

**Request**

```http
GET https://stats.figshare.com/total/likes/article/215
```

**Response**

```http
HTTP/1.1 400 Bad Request
Content-Type: application/json; charset=UTF-8

{
  "data": {
    "extra": "Counter type not supported: likes",
    "invalid_params": "counter"
  },
  "code": "InvalidParams",
  "message": "Invalid or unsupported params: counter"
}
```

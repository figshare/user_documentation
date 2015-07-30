Endpoints for retrieving **tops**
=================================

This type of endpoints enables the retrieval or rankings of the most viewed, downloaded or shared
items, over a specific period of time.


* [Authorization](#authorization)
* [Endpoint format](#endpoint-format)
* [Request parameters](#request-parameters)
* [Examples](#examples)


## Authorization

Basic HTTP authentication is required for timeline endpoints within the scope of an institution.


## Endpoint format

For items outside an institution scope the endpoints have the format:

```
/top/{counter}/{item}
```

and inside and institution scope they have the format:

```
/{institution}/top/{counter}/{item}
```

where **counter** is one of `view`, `share` or `download`.

The results on this endpoint can be filtered further by a `start_date` and `end_date`
and a specified sub-item which can be one of: `category`, `item_type` or `referral`.
By default, `start_date` and `end_date` are set to reflect the events of the last month.
Also the number of results in the ranking can be specified as the `count` parameter which
by default is set to`10`. The supplementary filters and options can be provided in the query
parameters of the request.


## Request parameters

The following table describes the optional parameters:

|Parameter    | Comments|
|-------------|---------|
|`start_date` | By default this is set to the 1st of the current month.|
|`end_date`   | By default this is set to today.|
|`sub_item`   | Can be one of `category`, `item_type` or `referral`. Acts as a filter on the result.|
|`count`      | By default this is set to 10.|



## Examples


### Top 10 most viewed unaffiliated articles in the last month

**Request**
```http
GET https://stats.figshare.com/top/views/article
```

**Response**
```http
HTTP/1.1 200 OK
Content-Type: application/json; charset=UTF-8

{
  "top": {
    "200341": 2341,
    "200134": 2111,
    "201342": 2001,
    "23144": 1930,
    "1998": 1900,
    "20023": 1802,
    "200321": 1720,
    "101342": 1517,
    "213454": 1516,
    "19341": 1516,
  }
}
```


### Top 3 most viewed categories in a specified institutional group in 2014

**Request**
```http
GET https://stats.figshare.com/monash/top/views/group?item_id=2&sub_item=category&count=3&start_date=2014-01-01&end_date=2014-12-31
Authorization: Basic dGhpcyBpcyBub3QgdGhlIHJlYWwgcGFzc3dvcmQsIGZvb2wh
```

**Response**
```http
HTTP/1.1 200 OK
Content-Type: application/json; charset=UTF-8

{
  "top": {
    "2": 12351,
    "7": 11001,
    "3": 10435
  }
}
```


### Top 2 referrals for a specific unaffiliated project in the last month

**Request**
```http
GET https://stats.figshare.com/top/views/project?item_id=13&count=2&sub_item=referral
```

**Response**
```http
HTTP/1.1 200 OK
Content-Type: application/json; charset=UTF-8

{
  "www.google.com": 212,
  "www.figshare.com": 175
}
```


### Top 3 item types for shares related to a specific unaffiliated author

**Request**
```http
GET https://stats.figshare.com/top/shares/author?item_id=13456&count=3&sub_item=item_type
```

**Response**
```http
HTTP/1.1 200 OK
Content-Type: application/json; charset=UTF-8

{
  "fileset": 135,
  "collection": 120,
  "figure": 98
}
```

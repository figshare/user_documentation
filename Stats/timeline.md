Endpoints for retrieving a **timeline**
=======================================

This type of endpoint enables the retrieval of a timeline of the number of *views*, *downloads*
or *shares* for a specific item.


* [Authorization](#authorization)
* [Endpoint format](#endpoint-format)
* [Request parameters](#request-parameters)
* [Examples](#examples)


## Authorization

Basic HTTP authentication is required for timeline endpoints within the scope of an institution.


## Endpoint format

For items outside an institution scope the endpoints have the format:

```
/timeline/{granularity}/{counter}/{item}/{item_id}

```

and inside an institution scope they have the format:

```
/{institution}/timeline/{granularity}{counter}/{item}/{item_id}
```

where **granularity** is one of `year`, `month`, `day` or `total`
and **counter** is one of `views`, `downloads` or `shares`.


The results on this endpoint can be filtered further by a `start_date` and `end_date` and
a specified `category` or `item_type`. By default, `start_date` and `end_date` are set
to reflect the events of the last month. The supplementary filters can be provided in the
request parameters.


## Request parameters

The following table describes the optional parameters:

|Parameter    |Comments|
|-------------|--------|
|`start_date` | By default this is set to the 1st of the current month.|
|`end_date`   | By default this is set to today.|
|`sub_item`   | Can be one of `category` and `item_type`. Acts as a filter on the result.|
|`sub_item_id`| Required if `sub_item` is also specified.|


## Examples


### Daily timeline of downloads for an unaffiliated article

**Request**
```http
GET https://stats.figshare.com/timeline/day/downloads/article/23
```

**Response**
```http
HTTP/1.1 200 OK
Content-Type: application/json; charset=UTF-8

{
  "timeline": {
    "2015-07-01": 7,
    "2015-07-02": 3,
    "2015-07-09": 1,
    "2015-07-15": 3,
    "2015-07-16": 2,
    "2015-07-18": 1
  }
}
```


### Yearly timeline of views for an article associated to an institution

**Request**
```http
GET https://stats.figshare.com/monash/timeline/year/views/article/2000000?start_date=2013-01-01&end_date=2015-08-01
Authorization: Basic dGhpcyBpcyBub3QgdGhlIHJlYWwgcGFzc3dvcmQsIGZvb2wh
```

**Response**
```http
HTTP/1.1 200 OK
Content-Type: application/json; charset=UTF-8

{
  "timeline": {
    "2013": 16,
    "2014": 23,
    "2015": 12
  }
}
```


### Monthly timeline of shares for items in a specified institutional group, matching a specified category

**Request**
```http
GET https://stats.figshare.com/monash/timeline/month/shares/group/10?sub_item=category&sub_item_id=2&start_date=2014-01-03&end_date=2014-05-12
Authorization: Basic dGhpcyBpcyBub3QgdGhlIHJlYWwgcGFzc3dvcmQsIGZvb2wh
```
**Response**
```http
HTTP/1.1 200 OK
Content-Type: application/json; charset=UTF-8

{
  "timeline": {
    "2014-01": 3,
    "2014-02": 5,
    "2014-03": 18,
    "2014-04": 4,
    "2014-05": 2
  }
}
```


### Daily timeline of views for datasets found in a specified institutional group

**Request**
```http
GET https://stats.figshare.com/monash/timeline/day/views/group/10?sub_item=item_type&sub_item_id=dataset&start_date=2014-03-01&end_date=2014-03-04
Authorization: Basic dGhpcyBpcyBub3QgdGhlIHJlYWwgcGFzc3dvcmQsIGZvb2wh
```

**Response**
```http
HTTP/1.1 200 OK
Content-Type: application/json; charset=UTF-8

{
  "timeline": {
    "2014-03-01": 10,
    "2014-03-02": 14,
    "2014-03-03": 15,
    "2014-03-04": 9
  }
}
```


### Total timeline of views for a collection associated to an institution

**Request**
```http
GET https://stats.figshare.com/lboro/timeline/total/views/collection/15?start_date=2014-01-02&end_date=2014-03-05
Authorization: Basic dGhpcyBpcyBub3QgdGhlIHJlYWwgcGFzc3dvcmQsIGZvb2wh
```

**Response**
```http
HTTP/1.1 200 OK
Content-Type: application/json; charset=UTF-8

{
  "timeline": {
    "total": 10
  }
}
```


### Timeline with missing request parameter

**Request***
```http
GET https://stats.figshare.com/lboro/timeline/month/views/group/1?sub_item=category&start_date=2014-01-01&end_date=2015-02-03
Authorization: Basic dGhpcyBpcyBub3QgdGhlIHJlYWwgcGFzc3dvcmQsIGZvb2wh
```

**Response**
```http
HTTP/1.1 400 Bad Request
Content-Type: application/json; charset=UTF-8

{
  "data": {
    "missing_params": "sub_item_id",
    "parameters": {
      "end_date": "2015-02-03",
      "start_date": "2014-01-01",
      "sub_item": "category"
    },
    "path": "/lboro/timeline/month/views/group/1"
  },
  "code": "MissingParams",
  "message": "Missing required params: sub_item_id"
}
```

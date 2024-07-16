Endpoints for retrieving a **breakdown**
========================================

This type of endpoint enables the retrieval of a geo-location breakdown of the number
of *views*, *downloads* or *shares* for a specific item.


* [Authorization](#authorization)
* [Endpoint format](#endpoint-format)
* [Request parameters](#request-parameters)
* [Examples](#examples)


## Authorization

Basic HTTP authentication is required for timeline endpoints within the scope of an institution.


## Endpoint format

For items outside an institution scope the endpoints have the format:

```
/breakdown/{granularity}/{counter}/{item}/{item_id}
```

and inside an institution scope they have the format:

```
/{institution}/breakdown/{granularity}{counter}/{item}/{item_id}
```

where **granularity** is one of `year`, `month`, `day` or `total`,
**counter** is one of `views`, `downloads` or `shares`
and **item** is one of `article`, `author`, `collection`, `group` or `project`.



The results on this endpoint can be filtered further by a `start_date` and `end_date` and
a specified `category` or `item_type`. By default, `start_date` and `end_date` are set
to reflect the events of the last month. The supplementary filters can be provided in the
query parameters of the request.


## Request parameters

The following table describes the optional parameters:

|Parameter    |Comments|
|-------------|--------|
|`start_date` | By default this is set to the 1st of the current month.|
|`end_date`   | By default this is set to today.|
|`sub_item`   | Can be one of `category` and `item_type`. Acts as a filter on the result.|
|`sub_item_id`| Required if `sub_item` is also specified.|


### Date intervals

When `start_date` and `end_date` are both specified, a number of limitations are added depending 
on the granularity:

| Granularity    | Limits |
|----------------|--------|
|`day`           | `end_date` cannot be set to more than 1 year from the `start_date`|
|`month`         | `end_date` cannot be set to more than 2 years from the `start_date`|
|`year`          | `end_date` cannot be set to more than 5 years from the `start_date`|

In case the specified `end_date` exceeds the allowed interval, it will simply be ignored
 and the maximum allowed date will be used instead.


## Examples

### Daily breakdown of shares for an unaffiliated article

**Request**
```http
GET https://stats.figshare.com/breakdown/day/shares/article/23?start_date=2014-03-08&end_date=2014-05-21
```

**Response**
```http
HTTP/1.1 200 OK
Content-Type: application/json; charset=UTF-8

{
  "breakdown": {
    "2014-03-08": {
      "Spain": {
        "Seville": 8,
        "Madrid": 11,
        "total": 19
      }
    },
    "2014-02-20": {
      "Spain": {
        "Seville": 3,
        "total": 3
      }
    },
    "2014-05-04": {
      "China": {
        "Fuzhou": 7,
        "Chengdu": 3,
        "total": 10
      }
    }
  }
}
```


### Yearly breakdown of views for a project associated to an institution

**Request**
```http
GET https://stats.figshare.com/monash/breakdown/year/views/project/1345?start_date=2013-01-01&end_date=2015-01-01
Authorization: Basic dGhpcyBpcyBub3QgdGhlIHJlYWwgcGFzc3dvcmQsIGZvb2wh
```

**Response**
```http
HTTP/1.1 200 OK
Content-Type: application/json; charset=UTF-8

{
  "breakdown": {
    "2013": {
      "Spain": {
        "Seville": 5,
        "Madrid": 3,
        "total": 8
      },
      "China": {
        "Fuzhou": 2,
        "Chengdu": 3,
        "total": 5
      }
    },
    "2014": {
      "United States": {
        "Kansas City": 3,
        "Orlando": 1,
        "total": 4
      },
      "Venezuela": {
        "Caracas": 5,
        "total": 5
      },
      "Brazil": {
        "total": 7,
        "Indaiatuba": 4,
        "Campinas": 3
      }
    }
  }
}
```


### Total breakdown of downloads from filesets found in a specified institutional group

**Request**
```http
GET https://stats.figshare.com/lboro/breakdown/total/downloads/group/17?sub_item=item_type&sub_item_id=fileset&start_date=2015-02-11&end_date=2015-05-17
Authorization: Basic dGhpcyBpcyBub3QgdGhlIHJlYWwgcGFzc3dvcmQsIGZvb2wh
```

**Response**
```http
HTTP/1.1 200 OK
Content-Type: application/json; charset=UTF-8

{
  "breakdown": {
    "total": {
      "Spain": {
        "Seville": 6,
        "Barcelona": 7,
        "Madrid": 3,
        "total": 16
      },
      "China": {
        "Chengdu": 7,
        "Fuzhou": 4,
        "total": 11
      },
      "United States": {
        "Kansas City": 3,
        "Orlando": 7,
        "total": 10
      },
      "Brazil": {
        "total": 2,
        "Indaiatuba": 2
      }
    }
  }
}
```


### Monthly breakdown of views from projects found in a specified institutional group

**Request**
```http
GET https://stats.figshare.com/melbourne/breakdown/month/views/group/234&sub_item=item_type&sub_item_id=project&start_date=2015-02-11&end_date=2015-03-17
Authorization: Basic dGhpcyBpcyBub3QgdGhlIHJlYWwgcGFzc3dvcmQsIGZvb2wh
```

**Response**
```http
HTTP/1.1 200 OK
Content-Type: application/json; charset=UTF-8

{
  "breakdown": {
    "2015-02": {
      "France": {
        "Paris": 12,
        "Montpellier": 7,
        "total": 19
      },
      "Germany": {
        "Munich": 13,
        "Frankfurt": 2,
        "total": 15
      }
    },
    "2015-03": {
      "Spain": {
        "Madrid": 3,
        "Mallorca": 5,
        "total": 8
      }
    }
  }
}
```


### Breakdown of institutional statistics with missing authorization

***Request***
```http
GET https://stats.figshare.com/melbourne/breakdown/month/views/group/234
```

***Response***
```http
HTTP/1.1 403 Forbidden
Content-Type: application/json; charset=UTF-8

{
  "data": null,
  "code": "Forbidden",
  "message": "Unauthorized request"
}
```


# ArticleSearch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**searchFor** | **String** | Search term |  [optional]
**page** | **Long** | Page number. Used for pagination with page_size |  [optional]
**pageSize** | **Long** | The number of results included on a page. Used for pagination with page |  [optional]
**limit** | **Long** | Number of results included on a page. Used for pagination with query |  [optional]
**offset** | **Long** | Where to start the listing(the offset of the first result). Used for pagination with limit |  [optional]
**orderDirection** | [**OrderDirectionEnum**](#OrderDirectionEnum) | Direction of ordering |  [optional]
**institution** | **Integer** | only return collections from this institution |  [optional]
**publishedSince** | **String** | Filter by article publishing date. Will only return articles published after the date. date(ISO 8601) YYYY-MM-DD |  [optional]
**modifiedSince** | **String** | Filter by article modified date. Will only return articles published after the date. date(ISO 8601) YYYY-MM-DD |  [optional]
**group** | **Integer** | only return collections from this group |  [optional]


<a name="OrderDirectionEnum"></a>
## Enum: OrderDirectionEnum
Name | Value
---- | -----
ASC | &quot;asc&quot;
DESC | &quot;desc&quot;




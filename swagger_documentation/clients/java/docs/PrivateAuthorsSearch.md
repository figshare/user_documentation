
# PrivateAuthorsSearch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**searchFor** | **String** | Search term |  [optional]
**page** | **Long** | Page number. Used for pagination with page_size |  [optional]
**pageSize** | **Long** | The number of results included on a page. Used for pagination with page |  [optional]
**limit** | **Long** | Number of results included on a page. Used for pagination with query |  [optional]
**offset** | **Long** | Where to start the listing(the offset of the first result). Used for pagination with limit |  [optional]
**order** | [**OrderEnum**](#OrderEnum) | The field by which to order. Default varies by endpoint/resource. |  [optional]
**orderDirection** | [**OrderDirectionEnum**](#OrderDirectionEnum) | Direction of ordering |  [optional]
**institutionId** | **Long** | Return only authors associated to this institution |  [optional]
**orcid** | **String** | Orcid of author |  [optional]
**groupId** | **Long** | Return only authors in this group or subgroups of the group |  [optional]
**isActive** | **Boolean** | Return only active authors if True |  [optional]
**isPublic** | **Boolean** | Return only authors that have published items if True |  [optional]


<a name="OrderEnum"></a>
## Enum: OrderEnum
Name | Value
---- | -----
PUBLISHED_DATE | &quot;published_date&quot;
MODIFIED_DATE | &quot;modified_date&quot;
VIEWS | &quot;views&quot;
SHARES | &quot;shares&quot;
DOWNLOADS | &quot;downloads&quot;
CITES | &quot;cites&quot;


<a name="OrderDirectionEnum"></a>
## Enum: OrderDirectionEnum
Name | Value
---- | -----
ASC | &quot;asc&quot;
DESC | &quot;desc&quot;




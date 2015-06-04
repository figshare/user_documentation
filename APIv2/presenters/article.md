# ArticlePresenter

```json
{
    "id": 1434614,
    "title": "Test article title",
    "doi": "http://dx.doi.org/10.6084/m9.figshare.1434614",
    "url": "http://api.figshare.com/articles/1434614"
}
```


# ArticlePresenter.L1

* [CategoryPresenter](category.md#categorypresenter)
* [LicensePresenter](license.md#licensepresenter)

[ArticlePresenter](article.md#articlepresenter) +
```json
{
    "citation": "Hand, Demario; (): title1. figshare.\n\n Retrieved 12:32, Jun 03, 2015 (GMT)",
    "confidentialReason": "",
    "embargoType": 0,
    "isConfidential": 0,
    "size": 0,
    "funding": "",
    "tags": ["t1", "t2"],
    "version": 0,
    "isActive": 1,
    "isMetadataRecord": false,
    "metadataReason": "",
    "status": "draft",
    "description": "desc2",
    "isEmbargoed": 0,
    "embargoDate": null,
    "isPublic": false,
    "modifiedDate": null,
    "createdDate": "2015-06-03T09:09:39",
    "hasLinkedFile": false,
    "categories": [CategoryPresenter],
    "isEmbargoedPublished": 0,
    "license": LicensePresenter,
    "definedType": 3,
    "publishedDate": null,
    "embargoReason": "",
    "references": ["http://link1", "http://link2", "http://link3"]
}
```


# ArticlePresenter.L2

* [FilePresenter](file.md#filepresenter)
* [AuthorPresenter](author.md#authorpresenter)
* [ArticleVersionPresenter](article.md#articleversionpresenter)
* [CustomArticleFieldPresenter](custon_field.md#customarticlefieldpresenter)

[ArticlePresenter.L1](article.md#articlepresenterl1) +
```json
{
    "files": [FilePresenter],
    "authors": [AuthorPresenter],
    "versions": [ArticleVersionPresenter],
    "customFields": [CustomArticleFieldPresenter]
}
```


# ArticleVersionPresenter

```json
{
    "version": 3
    "url": "http://api.figshare.com/v2/articles/6547/versions/3"
}
```


# ArticleEmbargoPresenter

```json
{
    "is_embargoed": 1,
    "embargo_date": null,
    "embargo_type": "file",
    "embargo_reason": "just because"
}
```


# ArticleConfidentialityPresenter

```json
{
    "active": 1,
    "reason": "just because"
}
```

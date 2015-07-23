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
    "confidential_reason": "",
    "embargo_type": "file",
    "is_confidential": false,
    "size": 0,
    "funding": "",
    "tags": ["t1", "t2"],
    "version": 0,
    "is_active": 1,
    "is_metadata_record": false,
    "metadata_reason": "",
    "status": "draft",
    "description": "desc2",
    "is_embargoed": false,
    "embargo_date": null,
    "is_public": false,
    "modified_date": null,
    "created_date": "2015-06-03T09:09:39",
    "has_linked_file": false,
    "categories": [CategoryPresenter],
    "license": LicensePresenter,
    "defined_type": 3,
    "published_date": null,
    "embargo_reason": "",
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
    "custom_fields": [CustomArticleFieldPresenter]
}
```
**Note**: On **public** endpoints, if the article is under *file embargo*, or is *confidential*, the `files` field will be missing from the JSON.


# ArticleVersionPresenter

```json
{
    "version": 3,
    "url": "http://api.figshare.com/v2/articles/6547/versions/3"
}
```


# ArticleEmbargoPresenter

```json
{
    "is_embargoed": 1,
    "embargo_date": null,
    "embargo_type": "file",
    "embargo_reason": "privacy requirements"
}
```


# ArticleConfidentialityPresenter

```json
{
    "active": true,
    "reason": "privacy requirements"
}
```

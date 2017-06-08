**Important**:

Please use a presenter as an `associative array` - a collection of (key, value) pairs,
not as a class with a fixed number of fields.

The presenters should be interpreted as a guarantee of what data would be presented by our API.
While we avoid removing key value pairs, we reserve the right to add new data at any time and
eventually commit to the new fields by documenting and guaranteeing them.


# ArticlePresenter

```json
{
    "id": 1434614,
    "title": "Test article title",
    "doi": "10.6084/m9.figshare.1434614",
    "group_id": 1234,
    "url": "http://api.figshare.com/articles/1434614",
    "url_public_html": "https://figshare.com/articles/Test_article_title/1434614",
    "url_public_api": "https://api.figshare.com/articles/1434614",
    "url_private_html": "https://figshare.com/account/articles/1434614",
    "url_private_api": "https://api.figshare.com/account/articles/1434614",
    "published_date": "2015-12-31T23:59:59Z",
    "thumb": "https://ndownloader.figshare.com/files/123456789/preview/12345678/thumb.png",
    "defined_type": 3
}
```

Note:
> `url` will eventually be deprecated in favour of the `url_(private|public)_(api|html)` flavours.  
> It is here for backwards compatibility.


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
    "is_active": true,
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
    "published_date": null,
    "embargo_reason": "",
    "references": ["http://link1", "http://link2", "http://link3"]
}
```


# ArticlePresenter.L2

* [PublicFilePresenter](file.md#publicfilepresenter)
* [AuthorPresenter](author.md#authorpresenter)
* [ArticleVersionPresenter](article.md#articleversionpresenter)
* [CustomArticleFieldPresenter](custom_field.md#customarticlefieldpresenter)

[ArticlePresenter.L1](article.md#articlepresenterl1) +
```json
{
    "figshare_url": "https://figshare.com/articles/article_title/123456789",
    "files": [PublicFilePresenter],
    "authors": [AuthorPresenter],
    "custom_fields": [CustomArticleFieldPresenter],
    "resource_title": "Resource title",
    "resource_doi": "10.1000/xyz123"
}
```

**Notes**:
* On **public** endpoints, if the article is under *file embargo*, or is *confidential*, the `files` field will be missing from the JSON.
* `resource_title` and `resource_doi` are the title and doi of the published item which is supplemented by this figshare item

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
    "is_confidential": true,
    "reason": "privacy requirements"
}
```

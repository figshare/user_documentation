**Important**:

Please use a presenter as an `associative array` - a collection of (key, value) pairs,
not as a class with a fixed number of fields.

The presenters should be interpreted as a guarantee of what data would be presented by our API.
While we avoid removing key value pairs, we reserve the right to add new data at any time and
eventually commit to the new fields by documenting and guaranteeing them.


# CollectionPresenter

```json
{
    "id": 123,
    "title": "Sample collection",
    "doi": "http://dx.doi.org/10.6084/m9.figshare.123",
    "url": "https://figshare.com/v2/collections/123",
    "published_date": "2015-08-12T00:39:55"
}
```


# CollectionVersionPresenter

```json
{
    "version": 1,
    "url": ""
}
```


# CollectionPresenter.L1

* [CategoryPresenter](category.md#categorypresenter)
* [AuthorPresenter](author.md#authorpresenter)
* [ArticlePresenter](article.md#articlepresenter)


[CollectionPresenter](presenters/collection.md#collectionpresenter)

+

```json
{
    "resource_id": "AS124056",
    "resource_doi": "http://dx.doi.org/10.608/m9.pub.7481",
    "resource_title": "demo title",
    "resource_link": "http://dx.doi.org/10.321/m9.pub.1231",
    "resource_version": "1",
    "version": 1,
    "description": "Sample description",
    "categories": [CategoryPresenter],
    "references": [
        "http://link1",
        "http://link2"
    ],
    "tags": [
        "tag1",
        "tag2"
    ],
    "authors": [AuthorPresenter],
    "institution_id": 154,
    "group_id": 445,
    "articles_count": 100,
    "public": 1,
    "custom_metadata": [
        {
            "location": "Paris"
        },
        {
            "size": "1 feet"
        }
    ],
    "citation": "citation string"
}
```

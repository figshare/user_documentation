# Categories public endpoint (no OAuth required)

## List categories

    GET /v2/categories

**Success Response**

Status: 200 OK

A list of [Category Presenters](presenters/category.md#categorypresenter)


# Categories private endpoint (OAuth required)

## List institution categories (including parent Categories)

    GET /v2/account/categories

**Success Response**

Status: 200 OK

A list of [Category Presenters](presenters/category.md#categorypresenter)


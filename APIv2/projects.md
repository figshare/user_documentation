Projects API endpoints
======================

* **[Public](#public-endpoints)**
  - [list public projects](#list-public-projects)
  - [search public projects](#search-public-projects)
  - [view project details](#view-project-details)
  - [list project articles](#list-project-articles)
* **[Private](#private-endpoints)**
  - [list private projects](#list-private-projects)
  - [search private projects](#search-private-projects)
  - [create new project](#create-a-new-project)
  - [read project information](#get-project-information)
  - [update project information](#update-project-information)
  - [publish project](#publish-project)
  - [delete own project](#delete-own-project)
  - [articles](#project-articles-subsection)
    - [list articles](#list-articles)
    - [retrieve article](#get-article)
    - [create article](#create-a-new-project-article)
    - [delete article](#delete-project-article)
  - [files](#project-files-subsection)
    - [list article files](#list-article-files)
    - [get article file](#get-article-file)
  - [collaborators](#project-collaborators-subsection)
    - [list collaborators](#list-collaborators-and-invited-users)
    - [invite collaborator](#invite-collaborator)
    - [remove collaborator](#remove-collaborator)
    - [leave project](#leave-project)
  - [notes](#project-notes-subsection)
    - [list notes](#list-notes)
    - [add note](#add-note)
    - [update note](#update-note)
    - [delete note](#delete-note)


## Public endpoints

### List public projects

    GET /v2/projects

**Input**

Accepts `pagination`, `sorting`, `filtering` params. See [API feature list](index.md#api-feature-list) for details.

Accepted filters:

| Field           | Type         | Description                                 |
|-----------------|--------------|---------------------------------------------|
|`institution`    |int           | Only return projects from this institution  |
|`group`          |int           | Only return projects from this group        |
|`published_since`|date(ISO 8601)| Only projects published after the date      |


Defaults:

| Field           | Value          |
|-----------------|----------------|
|`order`          |`published_date`|
|`order_direction`|`desc`          |
|`page_size`      |`10`            |


**Call example**

    curl "https://api.figshare.com/v2/projects?page=2&page_size=3&published_since=2016-01-01"


**Success Response**

Status: `200 OK`

Body: List of [Public Project Lite Presenter](presenters/project.md#public-project-lite-presenter)


### Search public projects

    POST /v2/projects/search

**Input**

Accepts `pagination`, `sorting`, `filtering` and `search` params.
See [API feature list](index.md#api-feature-list) for details.

Filters and defaults are the same as for  the [list public projects](#list-public-projects) endpoint.

**Success Response**

Status: `200 OK`

Body: List of [Public Project Lite Presenter](presenters/project.md#public-project-lite-presenter)


### View project details

    GET /v2/projects/{id}

**Success Response**

Status: `200 OK`

Body: [Public Project Full Presenter](presenters/project.md#public-project-full-presenter)


### List project articles

    GET /v2/projects/{id}/articles

Accepts `pagination` params (`page` and `page_size`).
See [API feature list](index.md#api-feature-list) for details.

**Success Response**

Status: `200 OK`

Body: List of [Article Presenter](presenters/article.md#articlepresenter)



## Private endpoints

These endpoints require authorization/authentication. Missing valid auth will
result in 403 and 401 errors.


### List private projects

    GET /v2/account/projects

**Input**

Accepts `pagination`, `sorting` and `filtering` params, sent as *request parameters*.
See [API feature list](index.md#api-feature-list) for details.

Accepted filters:

| Field     | Type  | Description                                              |
|-----------|-------|----------------------------------------------------------|
|`storage`  | `str` | `group` or `individual`.                                 |
|`roles`     | `str` | Any combination of `owner`, `collaborator`, `viewer` separated by comma. Examples: "owner" or "owner,collaborator". |


**Success Response (list of projects)**

Status: `200 OK`

Body: List of [Private Project Lite Presenter](presenters/project.md#private-project-lite-presenter)


### Search private projects

    POST /v2/account/projects/search

**Input**

Accepts `pagination`, `sorting`, `filtering` and `search` params.
See [API feature list](index.md#api-feature-list) for details.

Accepted filters:

| Field    | Type  | Description                                              |
|----------|-------|----------------------------------------------------------|
|`storage` | `str` | `group` or `individual`.                                 |
|`roles`   | `str` | Any combination of `owner`, `collaborator`, `viewer` separated by comma. Examples: "owner" or "owner,collaborator". |
|`published_since`|date(ISO 8601)| Only projects published after the date     |
|`modified_since` |date(ISO 8601)| Only projects published after the date     |
|`status`  | `int` | `1` for public projects, `0` for private projects. |

**Success Response**

Status: `200 OK`

Body: List of [Private Project Lite Presenter](presenters/project.md#private-project-lite-presenter)


### Create a new project

    POST /v2/account/projects

**Input**

Accepted parameters sent as JSON request body:

| Name                  | Type    | Description                                                   |
|-----------------------|---------|---------------------------------------------------------------|
| `title`               | `str`   | The title for this project - `mandatory`. 3 - 500 characters. |
| `description`         | `str`   | Project's description                                         |
| `funding`             | `str`   | Grant number or organization(s) that funded this project.     |
| `group_id`            | `int`   | Only of project type is `group`.                              |

**Success Response**

Status: `201 Created`

Headers: `Location: https://api.figshare.com/v2/account/projects/123`


### Get project information

    GET /v2/account/projects/{id}

**Success Response**

Status: `200 OK`

Body: [Private Project Full Presenter](presenters/project.md#private-project-full-presenter)


### Update project information

    PUT /v2/account/projects/{id}

**Input**

Accepted parameters sent as JSON request body:

| Name                  | Type    | Description                               |
|-----------------------|---------|-------------------------------------------|
| `title`               | `str`   | The title for this project.               |
| `description`         | `str`   | The project description.                  |
| `funding`             | `str`   | Grant number or organization(s) that funded this project. |


**Success Response**

Status: `205 Reset Content`

Headers: `Location: https://api.figshare.com/v2/account/projects/123`


### Publish project

    POST /v2/account/projects/{id}

**Success Response**

Status: `201 Created`
Body: `Project {id} has been published.`



### Delete own project

	DELETE /v2/account/projects/{id}

A project can be deleted only if:
- it is not public
- it does not have public articles

When an **individual** project is  deleted, all the articles are *moved* to
**my data** of each owner*.

When a **group** project is deleted, all the articles and files are *deleted*
as well. Only project owner, group admin and above can delete a project.

**Success Response**

Status: `204 No content`



## Project articles subsection

### List articles

    GET /v2/account/projects/{id}/articles

Accepts `pagination`, `sorting` and `filtering` params, sent as *request parameters*.
See [API feature list](index.md#api-feature-list) for details.

**Success Response**

Status: `200 OK`

Body: List of [Project Article Presenter](<presenters/project_article.md#projectarticlepresenter>)


### Get article

    GET /v2/account/projects/{id}/articles/{article_id}

**Success Response**

Status: `200 OK`

Body: [ArticlePresenter](<presenters/article.md#articlepresenter>)


### Create a new project article

    POST /v2/account/projects/{id}/articles

**Input**

Accepted parameters sent as JSON request body:

|Name            |Type            |Description                                |
|----------------|----------------|-------------------------------------------|
|`title`         |`str`           |Article title - `mandatory`.               |
|`description`   |`str`           |Article description.                       |
|`tags`          |`array of str`  |Tags to be associated with the article (e.g ['tag1', 'tag2', 'tagn'])|
|`references`    |`array of str`  |List of links to be associated with the article (e.g ['http://link1', 'http://link2', 'http://link3'])|
|`categories`    |`array of int`  |List of category ids to be associated with the article (e.g [1, 23, 33, 66])|
|`authors`       |`array of dict` |List of authors to be assosciated with the article. The list can contain author ids or author names [{"id": 12121}, {"id": 34345}, {"name": "John Doe"}]. No more then 10 authors. For adding more authors use the specific authors endpoint|
|`custom_fields` |`dict`          |List of key, values pairs to be associated with the article|
|`defined_type`  |`str`           |Article type, one of ['figure', 'media', 'dataset', 'fileset', 'poster', 'paper', 'presentation', 'thesis', 'code', 'metadata']|


**Success Response**

Status: `201 Created`

Headers: `Location: https://api.figshare.com/v2/account/project/1234/articles/456`


### Delete project article

    DELETE /v2/account/projects/{id}/articles/{article_id}

**Success Response**

Status: `204 No content`


## Project files subsection

### List article files

    GET /v2/account/projects/{id}/articles/{article_id}/files

Accepts `pagination`, `sorting` and `filtering` params, sent as *request parameters*.
See [API feature list](index.md#api-feature-list) for details.

**Success Response**

Status: `200 OK`

Body: [[FilePresenter](<presenters/file.md#filepresenter>)]


### Get article file

    GET /v2/account/projects/{id}/articles/{article_id}/files/{file_id}

**Success Response**

Status: `200 OK`

Body: [FilePresenter](<presenters/file.md#filepresenter>)


## Project collaborators subsection

### List collaborators and invited users

    GET /v2/account/projects/{id}/collaborators

**Success Response**

Status: `200 OK`

Body: A list with [CollaboratorPresenter](<presenters/collaborator.md#collaboratorpresenter>)s and [InvitedUserPresenter](<presenters/collaborator.md#inviteduserpresenter>)s

### Invite collaborator

    POST /v2/account/projects/{id}/collaborators

**Input**

Accepted parameters sent as JSON request body:

|Name        |Type    |Description                                           |
|------------|--------|------------------------------------------------------|
|`role_name` |`str`   | Valid roles: `viewer`, `collaborator` - `mandatory`  |
|`user_id`   |`int`   | |
|`email`     |`str`   | |
|`comment`   |`str`   | Text sent when inviting the user to the project - `optional`|

Please note that is mandatory to send _either_ `user_id` or `email` JSON parameters.


**Success Response**

Status: `201 Created`

Body: `{"message": "User invited to project"}`


### Remove collaborator 

    DELETE /v2/account/projects/{id}/collaborators/{user_id}

**Success Response**

Status: `204 No content`


### Leave project 

    POST /v2/account/projects/{id}/leave

Please note: project's owner cannot leave the project.

**Success Response**

Status: `204 No content`



## Project notes subsection

### List notes

    GET /v2/account/projects/{id}/notes

Accepts `pagination` params (`page` and `page_size`), sent as *request parameters*.
See [API feature list](index.md#api-feature-list) for details.

**Success Response**

Status: `200 OK`

Body: [ProjectNotePresenter](<presenters/note.md#projectnotepresenter>)


### Get note

    GET /v2/account/projects/{id}/notes/{note_id}

**Success Response**

Status: `200 OK`

Body: [ProjectNotePresenterL1](<presenters/note.md#projectnotepresenterl1>)

### Add note

    POST /v2/account/projects/{id}/notes

**Input**

Accepted parameter sent as JSON request body:

|Name   |Type    |Description                          |
|-------|--------|-------------------------------------|
|`text` |`str`   | Mandatory. At least 3 characters.   |


**Success Response**

Status: `201 Created`

Headers: `Location: https://api.figshare.com/v2/account/projects/1/notes/2`


### Update note

    PUT /v2/account/projects/{id}/notes/{note_id}

**Input**

Accepted parameter sent as JSON request body:

|Name   |Type    |Description                         |
|-------|--------|------------------------------------|
|`text` |`str`   | Mandatory. At least 3 characters.  |


**Success Response**

Status: `205 Reset Content`

Headers: `Location: https://api.figshare.com/v2/account/projects/1/notes/2`


### Delete note

    DELETE /v2/account/projects/{id}/notes/{note_id}

**Success Response**

Status: `204 No Content`


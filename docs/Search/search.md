figshare SEARCH
===============

How to find data on figshare
---------------------------

Data appears on the portal homepage with the newest uploads appearing first, you also have the option to browse by Popular content and Categories. Categories will only appear available for browsing if there are public items with the category assigned.

=========================


Search operators
---------------------------

figshare supports a predefined set of characters for the main search operators and for phrase searches.

|Operator|Supported characters|
|--------|--------------------|
|AND|AND|
|OR|OR|
|NOT|NOT|
|field delimiter|:|
|phrase search delimiter|""|
|grouping|()|

=========================



Searchable attributes
---------------------------

You can build queries based on the following attributes:

- :title: - string (exact match),
- :description: - string (exact match),
- :tag: - string (exact match), the tag is the keyword used to describe an item such as ":tag: artificial intelligence"
- :category: - string (exact match),
- :author: - string (exact match),
- :item_type: - string, can be one of the following: [article, project, collection, dataset, figure, poster, media, presentation, paper, fileset, thesis, code]
- :search_term: - string (will search in all fields and match phrase)
- :orcid: - string (exact match)
- :extension: - string (exact match for the file extensions)
- :references: - string (exact match)
- :doi: - string (exact match)
- :institution: - string, this is only for institutions that have figshare and you would use the string id from the URL (for example, Loughborough University has the URL https://lboro.figshare.com/ and you would type ":institutions: lboro" into the search bar)
- :project: - string (exact match)
- :published_before: - string (exact match)
- :published_after: - string (exact match)
- :licence: - string (exact match), for example ":licence: CCBY"
- :resource_doi: - string (exact match)
- :resource_title: - string (exact match)
- :resource_link: - string (exact match)

In order for the search to filter the attribute the user must use the following syntax: :tag: cell

=========================


Quick Search
----------------------------
### Simple search
#### Search string: cell
As a result of this search you will see all figshare articles that will contain the word "cell" in any of the metadata fields. The search will also return the articles that contain the term cells or all inflected words derived from the common stem.
### Phrase search - phase 2
#### Search string: "stem cell"
As a result of this search you will see all figshare articles that will contain the exact phrase "stem cell" in any of the metadata fields.
### Multi term search
#### Search string: cancer cells treatment
As a result of this search you will see all figshare articles that contain at least one of the query terms. The results will be ordered by relevance first ones being the ones that would be found in a phrase search if available.
As explained also in the table above the space is used by the figshare search as an OR operator. The search will also return the articles that contain all inflected words derived from the common stems.

=========================



Advanced Search
---------------------------
As the tags might contain special characters they will have a special treatment within the figshare search, where we would do an exact match. The examples below will illustrate how field search works in general and how is customised for tags.

#### Search string: :tag: cancer cell
This search will return all articles with the exact tag cancer cell.
#### Search string: :tag: music and puppets
This search will return all articles with the exact tag music and puppets. Only the operator AND will work as search delimiter.
#### Search string: :tag: "scrf=(cpcm,solvent=benzene)"
This search will return all articles with the exact tag.
#### Search string: :tag: cancer category chemistry
This search will return all articles with the exact tag "cancer category chemistry". If the user wants to break the tag and search also for a specific category please see Combined field search below.
#### Search string: :title: environmental science
This search will return all articles that have at least one of the words in the title working as in field multi-term search by relevance.
#### Search string: :title: Line balancing for improving production
Figshare engine will add the space where needed between the operator and the actual term
This search will return only the articles that have the specified phrase included in the title. As usual the search will return also with a lower priority results containing all inflected words derived from the common stems.
#### Search string: :description: growth of Indian manufacturing sector
This search will return all articles that have at least one of the words from above contained in the description from the list above as multi-term search ordered by relevance. As usual, the search will return also with a lower priority results containing all inflected words derived from the common stems.
#### Search string: description: "industrial case study"
This search will return all articles that have the phrase from above contained in the description. As usual, the search will return also with a lower priority results containing all inflected words derived from the common stems.

=========================


Combined field search
---------------------------

#### Search string: :author: M. Hahnel OR :author: J. Smith OR :Author: Albert Einstein
This search will return all articles that have at least one of the authors from the list above.
#### Search string: :title: Line balancing for improving production AND :tag: cancer cell
This search will return all results where the title matches phrase (multi term search by relevance) from above and has the "cancer cell" tag. As usual the search will return also with a lower priority results containing all inflected words derived from the common stems.
#### Search string: :tag: chemistry applied AND :category: biochemistry
This search will return all results where the tag is chemistry applied and the category is biochemistry. As usual the search will return also with a lower priority results containing all inflected words derived from the common stems.

=========================


Complex searches
---------------------------

#### Search string: :title: science AND :tag: cell AND :search term: private research
This search will return articles that have the word science in the title and the tag cell and has the expression private research in any metadata field.
#### Search string: :title: law OR :tag: democrat AND :search term: respect
This search will return all articles that contain law in title or the tag democrat but also contain the word respect in any of the metadata fields.


=========================

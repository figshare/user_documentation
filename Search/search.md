figshare SEARCH
===============

Introductory considerations
---------------------------

Searching the figshare website can be performed either by using the front-end interface or by using the API we provide. Either way, the search query will be analyzed and sent to a search engine built by figshare on top of the open source [Elasticsearch](https://www.elastic.co/products/elasticsearch) server. 
In the following document, we will try to detail the type of searches one may perform and the results one should expect from the search engine. The environment used for demonstrating the figshare search feature is comprised of six research documents, scraped for this purpose from the archives of the [Public Library of Open Science](https://www.plos.org/). For reference purposes, we provide the links to the articles below:
* [Article 1](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0127223)
* [Article 2](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0120350)
* [Article 3](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0014098)
* [Article 4](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0000620)
* [Article 5](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0111421)
* [Article 6](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0112540)

The actual article content is indexed and analyzed from the first part of each article's introduction, the tags are the subject areas, and the categories are parsed from the article's .xml file, and are the same as the categories that appear on the figshare page corresponding to the article.

=========================


General search engine features/characteristics
----------------------------------------------

1. *__Stemming__* of words:
  - All indexed words are stemmed, so, search queries like _process_/_processes_/_processing_ are equivalent.
2. *__Stopword__* elimination:
  - Stopwords like prepositions for instance are not indexed by the search engine, so, search queries like "just in time"/"just on time"/"just of time" are equivalent.
  
> Please note however that, even if the stopwords do not get indexed, in the case of the phrase search detailed below, the fact that a stopword exists somewhere in the actual phrase does matter. Thus, search queries like "standing on the table"/"standing table" are not equivalent. 

=========================


Search types and expected results
---------------------------------

### General term search
This is the basic type of search one can perform on the figshare website or API, and it works pretty much as expected, with documents returned in the order of relevance as follows: documents where the query term appears more times are ranked higher. All article fields (in this case: title, description, tags, categories) are taken into consideration.
#### Example: 
##### Query string: "therapy"
##### Return results with relevant paragraphs/tags/categories:
1. [Article 4](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0000620)
  - *Title*: A National Survey of Teachers on Antiretroviral *__Therapy__* in Malawi: Access, Retention in *__Therapy__* and Survival
  - *Description*: [...] Malawi is scaling up antiretroviral *__therapy__* (ART) (...)
  - *Description*: [...] retention in *__therapy__* and survival (...)
  - *Tags*: Antiretroviral *__therapy__*
2. [Article 2](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0120350)
  - *Title*: Uptake of WHO Recommendations for First-Line Antiretroviral *__Therapy__* in Kenya, Uganda, and Zambia
  - *Description*: [...] first-line antiretroviral *__therapies__* (ART) (...)
  - *Description*: [...] TDF combined *__therapy__* offers (...) 
  - *Description*: [...] TDF-based *__therapy__* as the preferred option with AZT-based *__therapies__* listed as alternatives. (...)
  - *Description*: [...] triple combination *__therapies__* containing AZT and TDF. (...)
  - *Description*: [...] lower prices for AZT and TDF combination *__therapy__*, (...)
  - *Description*: [...] more expensive than d4T-based *__therapies__*, respectively.  (...)
  - *Description*: [...] AZT- and TDF-based *__therapies__*, (...)
  - *Tags*: Antiretroviral *__therapy__*
3. [Article 3](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0014098)
  - *Description*: [...] access to antiretroviral *__therapy__* (ART) (...)
  - *Description*: [...] life-long HIV *__therapy__* with limited (...)
  - *Tags*: Antiretroviral *__therapy__*
4. [Article 5](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0111421)
  - *Description*: [...] Antiretroviral *__therapy__* (ART) is effective (...)
  - *Tags*: Antiretroviral *__therapy__*
5. [Article 1](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0127223)
  - *Tags*: Antiretroviral *__therapy__*


> Please note that [Article 4](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0000620) is ranked higher than [Article 2](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0120350), even though the latter has more occurences of our search term. The reason for this is that the former has two of those occurences in the title, and the scoring is weighed rather heavily towards the title field. 

--------------------------------------------------

### Field term search
This works exactly as the general term search described above, however, it is a bit more specialized, in that it allows selecting the field(s) in which to perform the search. As in the general term search above, documents where the query term appears more times are ranked higher. This type of search works on the figshare website, as well as in the API.
#### Example: 
##### Query string: "title: therapy"
##### Return results with relevant paragraphs/tags/categories:
1. [Article 4](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0000620)
  - *Title*: A National Survey of Teachers on Antiretroviral *__Therapy__* in Malawi: Access, Retention in *__Therapy__* and Survival
2. [Article 2](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0120350)
  - *Title*: Uptake of WHO Recommendations for First-Line Antiretroviral *__Therapy__* in Kenya, Uganda, and Zambia


> Please note that articles 1, 3 and 5 do not appear in the search results anymore, as just the items with the word *therapy* in the title are returned.

--------------------------------------------------

### General multi-term search
This is the general multi-word search that returns documents that contain at least one of the query terms. This works like a boolean "OR" search, and ranking rules are the same as the types of searches listed above. This type of search works on the figshare website, as well as in the API.
#### Example: 
##### Query string: "verticality endorse progress"
##### Return results with relevant paragraphs/tags/categories:
1. [Article 1](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0127223)
  - *Description*: [...] Initially, the South African National Department of Health *__endorsed__* a *__vertical__* ART (...)
  - *Description*: [...] system able to signpost programme *__progress__* and performance (...)
  - *Description*: [...] These *__vertical__* M&E systems ran parallel (...)
  - *Description*: [...] Kawonga and colleagues discuss the limitations inherent to such a *__vertical__* (...)
2. [Article 2](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0120350)
  - *Description*: [...] this recommendation, stating that countries should take steps to *__progressively__* reduce (...)

--------------------------------------------------

### Field multi-term search
This works like the general multi-term search described above, only it allows specifying the field(s) on which to perform the search. Ranking rules are the same as the types of searches listed above. This type of search works on the figshare website, as well as in the API.
#### Example: 
##### Query string: "title: antiretroviral therapies"
##### Return results with relevant paragraphs/tags/categories:
1. [Article 4](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0000620)
  - *Title*: A National Survey of Teachers on *__Antiretroviral Therapy__* in Malawi: Access, Retention in *__Therapy__* and Survival
2. [Article 2](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0120350)
  - *Title*: Uptake of WHO Recommendations for First-Line *__Antiretroviral Therapy__* in Kenya, Uganda, and Zambia
3. [Article 1](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0127223)
  - *Title*: Implementation of an Electronic Monitoring and Evaluation System for the *__Antiretroviral__* Treatment Programme in the Cape Winelands District, South Africa: A Qualitative Evaluation
4. [Article 3](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0014098)
  - *Title*: Diminishing Availability of Publicly Funded Slots for *__Antiretroviral__* Initiation among HIV-Infected ART-Eligible Patients in Uganda

--------------------------------------------------

### General compound term search
This is the equivalent of a boolean "AND" search and returns only the documents with occurences of all of the words contained in the search string. Ranking rules are unchanged with regard to the search types described above. This type of search works on the figshare website, as well as in the API.
#### Example: 
##### Query string: "antiretroviral, therapies"
##### Return results with relevant paragraphs/tags/categories:
1. [Article 4](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0000620)
  - *Title*: A National Survey of Teachers on *__Antiretroviral Therapy__* in Malawi: Access, Retention in *__Therapy__* and Survival
  - *Description*: [...] *__antiretroviral therapy__* (ART) (...)
  - *Description*: [...] access, retention in *__therapy__* and survival for subgroups of the population. We have (...)
  - *Tags*: *__Antiretroviral therapy__*
2. [Article 2](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0120350)
  - *Title*: Uptake of WHO Recommendations for First-Line *__Antiretroviral Therapy__* in Kenya, Uganda, and Zambia
  - *Description*: [...] to transition away from first-line *__antiretroviral therapies__* (ART) containing stavudine (...)
  - *Description*: [...] the likelihood of drug resistance. TDF combined *__therapy__* offers an additional benefit (...)
  - *Description*: [...] WHO consolidated guidelines on the use of ART named a TDF-based *__therapy__* (...)
  - *Description*: [...] AZT-based *__therapies__* listed as alternatives (...)
  - *Description*: [...] combination *__therapies__* containing AZT and TDF
  - *Tags*: *__Antiretroviral therapy__*
3. [Article 1](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0127223)
  - *Title*: Implementation of an Electronic Monitoring and Evaluation System for the *__Antiretroviral__* Treatment Programme in the Cape Winelands District, South Africa: A Qualitative Evaluation
  - *Description*: [...] South Africa's *__antiretroviral__* treatment (ART) programme (...)
  - *Tags*: *__Antiretroviral therapy__*
  - *Tags*: *__antiretrovirals__*
4. [Article 3](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0014098)
  - *Title*: Diminishing Availability of Publicly Funded Slots for *__Antiretroviral__* Initiation among HIV-Infected ART-Eligible Patients in Uganda
  - *Description*: [...] about the future of access to *__antiretroviral therapy__* (...)
  - *Description*: [...] the feasibility of implementing life-long HIV *__therapy__* with limited health care infrastructure (...)
  - *Tags*: *__Antiretroviral therapy__*
5. [Article 5](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0111421)
  - *Description*: [...] *__Antiretroviral therapy__* (ART) is effective in reducing maternal (...)
  - *Tags*: *__Antiretroviral therapy__*

> Please note that, just like in the case of the general term search, [Article 4](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0000620) is ranked higher than [Article 2](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0120350), even though we can see more occurences of the query string words in the latter. The reason, just like above, is the weighing applied on the title field, deemed more important than the description field.

--------------------------------------------------

### Field compound term search
This works like the general compound term search above, only it allows specifying the field(s) on which to perform the search. Ranking rules are unchanged with regard to the search types described above. This type of search works on the figshare website, as well as in the API.
#### Example: 
##### Query string: "title: antiretroviral, therapies"
##### Return results with relevant paragraphs/tags/categories:
1. [Article 4](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0000620)
  - *Title*: A National Survey of Teachers on *__Antiretroviral Therapy__* in Malawi: Access, Retention in *__Therapy__* and Survival
2. [Article 2](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0120350)
  - *Title*: Uptake of WHO Recommendations for First-Line *__Antiretroviral Therapy__* in Kenya, Uganda, and Zambia

--------------------------------------------------

### General phrase search
This is the most restrictive type of search, as it returns only those documents in which an occurence of the full query string (word ordering matters) is found. Ranking rules are unchanged with regard to the search types described above. This type of search works on the figshare website, as well as in the API.
#### Example: 
##### Query string: " 'antiretroviral therapy (ART)' "
##### Return results with relevant paragraphs/tags/categories:
1. [Article 4](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0000620)
  - *Description*: [...] *__antiretroviral therapy (ART)__* [6]. Data on all ART patients (...)
2. [Article 2](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0120350)
  - *Description*: [...] to transition away from first-line *__antiretroviral therapies (ART)__* containing stavudine (...)
3. [Article 5](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0111421)
  - *Description*: [...] service needs. *__Antiretroviral therapy (ART)__* is effective in reducing maternal (...)
4. [Article 3](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0014098)
  - *Description*: [...] have raised uncertainty about the future of access to *__antiretroviral therapy (ART)__* and the goal of universal access. (...)

> Please note that the ranking, in this case, takes into consideration individual term occurences in the documents, hence the ordering (remarkably similar to the ordering in the case of the general term search)

--------------------------------------------------

### Field phrase search
This works like the general phrase search above, only it allows specifying the field(s) on which to perform the search. Ranking rules are unchanged with regard to the search types described above. This type of search works on the figshare website, as well as in the API.
#### Example: 
##### Query string: "title 'therapy and survival' "
##### Return results with relevant paragraphs/tags/categories:
1. [Article 4](http://journals.plos.org/plosone/article?id=10.1371/journal.pone.0000620)
  - *Title*: A National Survey of Teachers on Antiretroviral Therapy in Malawi: Access, Retention in *__Therapy and Survival__*

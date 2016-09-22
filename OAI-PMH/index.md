# OAI-PMH

fig**share** supports the Open Archives Initiative (OAI) and implements the
**OAI-PMH** service to provide access to public articles metadata.
For more detailed information, please refer to the
[protocol specification](https://www.openarchives.org/OAI/openarchivesprotocol.html).


## Base URL

fig**share** OAI-PMH v2.0 implementation has at the following __baseURL__:
[https://api.figshare.com/v2/oai](https://api.figshare.com/v2/oai)


## Item == Article

An Item in the OAI-PMH interface is the most recent version of an article.


## Metadata formats

Currently, the supported formats are: **Dublin Core** (*oai_dc*), **Datacite** (*oai_datacite*) and **RDF** (*rdf*).


## Datestamps

Every record has a datestamp which is the published datetime of that article. 
The earliest datestamp is given in the `<earliestDatestamp>` element of the
[Identify](https://api.figshare.com/v2/oai?verb=Identify) response.


## Sets

You can get a list of all the sets supported with the
[ListSets](https://api.figshare.com/v2/oai?verb=ListSets) verb.

At this moment selectieve harvesting can be performed using sets representing:

- an [item type](https://api.figshare.com/v2/oai?verb=ListIdentifiers&metadataPrefix=oai_dc&set=item_type_7)
  ```
    <set>
      <setSpec>item_type_7</setSpec>
      <setName>Article type: presentation</setName>
    </set>
  ```

- a [portal/institution](https://api.figshare.com/v2/oai?verb=ListIdentifiers&metadataPrefix=oai_dc&set=portal_63)
  ```
    <set>
      <setSpec>portal_63</setSpec>
      <setName>American Chemical Society</setName>
  </set>
  ```

- or a [category](https://api.figshare.com/v2/oai?verb=ListIdentifiers&metadataPrefix=oai_dc&set=category_150):
  ```
    <set>
      <setSpec>category_150</setSpec>
      <setName>Extragalactic Astronomy</setName>
    </set>
  ```



## Update schedule

Usually, metadata for a published article becomes available in a few moments
after its publication on fig**share**.


## Pagination & Resumption Token Expiration

Results for **ListSets**, **ListIdentifiers**, **ListRecords** are paginated.
To request the next page, use the resumptionToken value provided for the
current page. You can read more
[here](https://www.openarchives.org/OAI/openarchivesprotocol.html#FlowControl),
but your harvesting software system should be able to use resumption tokens with
no problem.

Be aware of the fact that due to a known limitation on content pagination, results above a 10000 limit (offset) cannot be displayed.
We are looking at adding a new ListSet (month_year) that will allow you to pre-filter the result set by month.

One particularity on fig**share** OAI-PMH is the expiration datetime (UTC) for
resumption tokens. Thus, a token expires after an hour.


## Rate limit

Currently no rate limiting is implemented.
We recommend you to make no more than one request per second.


## Future development

Please [let us know](https://figshare.com/contact) that you are harvesting us.
Your input will drive the future development of the OAI-PMH protocol at figshare.


## Some examples


**Identify**

    curl https://api.figshare.com/v2/oai?verb=Identify

    <?xml version='1.0' encoding='utf-8'?>
    <?xml-stylesheet type="text/xsl" href="/v2/static/oai2.xsl"?>
    <OAI-PMH xmlns="http://www.openarchives.org/OAI/2.0/" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://www.openarchives.org/OAI/2.0/ http://www.openarchives.org/OAI/2.0/OAI-PMH.xsd">
        <responseDate>2016-04-29T11:58:28Z</responseDate>
        <request verb="Identify">https://api.figshare.com/v2/oai</request>
        <Identify>
            <repositoryName>figshare</repositoryName>
            <baseURL>https://api.figshare.com/v2/oai</baseURL>
            <protocolVersion>2.0</protocolVersion>
            <adminEmail>info@figshare.com</adminEmail>
            <earliestDatestamp>2003-08-18T08:32:56Z</earliestDatestamp>
            <deletedRecord>transient</deletedRecord>
            <granularity>YYYY-MM-DDThh:mm:ssZ</granularity>
        </Identify>
    </OAI-PMH>

___

**ListSets**

    curl https://api.figshare.com/v2/oai?verb=ListSets

    <?xml version='1.0' encoding='utf-8'?>
    <?xml-stylesheet type="text/xsl" href="/v2/static/oai2.xsl"?>
    <OAI-PMH xmlns="http://www.openarchives.org/OAI/2.0/" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://www.openarchives.org/OAI/2.0/ http://www.openarchives.org/OAI/2.0/OAI-PMH.xsd">
         <responseDate>2016-04-29T12:00:46Z</responseDate>
         <request verb="ListSets">https://api.figshare.com/v2/oai</request>
         <ListSets>
             <set>
                 <setSpec>portal_147</setSpec>
                 <setName>Karger Publishers</setName>
             </set>
             <set>
                 <setSpec>portal_144</setSpec>
                 <setName>Digital Science</setName>
             </set>
             <!-- ... ->
             <set>
                 <setSpec>portal_102</setSpec>
                 <setName>Wiley</setName>
             </set>
             <resumptionToken expirationDate="2016-04-29T13:00:46Z">dmVyYj1MaXN0U2V0cyZwYWdlPTI=</resumptionToken>
        </ListSets>
    </OAI-PMH>

___

**ListIdentifiers**

Selective harvesting: using set `category_539` (Chemical Engineering Design).

    curl "https://api.figshare.com/v2/oai?verb=ListIdentifiers&metadataPrefix=oai_dc&set=category_539"

    <?xml version='1.0' encoding='utf-8'?>
    <?xml-stylesheet type="text/xsl" href="/v2/static/oai2.xsl"?>
    <OAI-PMH xmlns="http://www.openarchives.org/OAI/2.0/" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://www.openarchives.org/OAI/2.0/ http://www.openarchives.org/OAI/2.0/OAI-PMH.xsd">
    <responseDate>2016-04-29T12:11:18Z</responseDate>
    <request metadataPrefix="oai_dc" set="category_539" verb="ListIdentifiers">https://api.figshare.com/v2/oai</request>
        <ListIdentifiers>
            <header>
                <identifier>oai:figshare.com:article/2060079</identifier>
                <datestamp>2016-01-04T08:32:32Z</datestamp>
                <setSpec>category_539</setSpec>
                <setSpec>category_614</setSpec>
                <setSpec>category_1094</setSpec>
                <setSpec>category_1100</setSpec>
            </header>
        </ListIdentifiers>
    </OAI-PMH>

___

**ListRecords**

Selective harvesting: only articles published `until` 2003-08-18T08:33:01Z.

    curl "https://api.figshare.com/v2/oai?verb=ListRecords&metadataPrefix=oai_dc&until=2003-08-18T08:33:01Z"

    <?xml version='1.0' encoding='utf-8'?>
    <?xml-stylesheet type="text/xsl" href="/v2/static/oai2.xsl"?>
    <OAI-PMH xmlns="http://www.openarchives.org/OAI/2.0/" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://www.openarchives.org/OAI/2.0/ http://www.openarchives.org/OAI/2.0/OAI-PMH.xsd">
      <responseDate>2016-04-29T12:15:55Z</responseDate>
      <request metadataPrefix="oai_dc" until="2003-08-18T08:33:01Z" verb="ListRecords">https://api.figshare.com/v2/oai</request>
      <ListRecords>
        <record>
          <header>
            <identifier>oai:figshare.com:article/1069659</identifier>
            <datestamp>2003-08-18T08:32:56Z</datestamp>
            <setSpec>category_13</setSpec>
            <setSpec>category_24</setSpec>
            <setSpec>category_39</setSpec>
            <setSpec>portal_5</setSpec>
          </header>
          <metadata>
            <oai_dc:dc xmlns:dc="http://purl.org/dc/elements/1.1/" xmlns:oai_dc="http://www.openarchives.org/OAI/2.0/oai_dc/"
                       xsi:schemaLocation="http://purl.org/dc/elements/1.1/ http://www.openarchives.org/OAI/2.0/oai_dc.xsd">
                <dc:title>Borneo elephant</dc:title>
                <dc:creator>The PLOS Biology Staff</dc:creator>
                <dc:subject>ecology</dc:subject>
                <dc:subject>Evolutionary biology</dc:subject>
                <dc:subject>genetics and genomics</dc:subject>
                <dc:description>&lt;p&gt;Borneo elephant&lt;/p&gt;</dc:description>
                <dc:identifier>10.1371/journal.pbio.0000007.g001</dc:identifier>
                <dc:relation>https://figshare.com/articles/_Borneo_elephant_/1069659</dc:relation>
            </oai_dc:dc>
          </metadata>
        </record>
      </ListRecords>
    </OAI-PMH>


## Changes

**May, 2016**
Initial release of OAI-PMH API

**July, 2016**
Datacite and RDF Metadata Formats are added

**August, 2016**
Keywords and Licences tags are added

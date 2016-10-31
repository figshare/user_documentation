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
    ...
    <header>
      <identifier>oai:figshare.com:article/2001969</identifier>
      <datestamp>2015-08-17T14:09:33Z</datestamp>
      <setSpec>category_184</setSpec>
      <setSpec>category_185</setSpec>
      <setSpec>portal_15</setSpec>
      <setSpec>item_type_7</setSpec>
    </header>
    ...
  ```

- a [portal/institution](https://api.figshare.com/v2/oai?verb=ListIdentifiers&metadataPrefix=oai_dc&set=portal_63)
  ```
    ...
    <header>
      <identifier>oai:figshare.com:article/2009490</identifier>
      <datestamp>2015-12-16T14:30:27Z</datestamp>
      <setSpec>category_1</setSpec>
      <setSpec>category_4</setSpec>
      <setSpec>category_12</setSpec>
      <setSpec>category_14</setSpec>
      <setSpec>category_19</setSpec>
      <setSpec>category_21</setSpec>
      <setSpec>category_128</setSpec>
      <setSpec>category_133</setSpec>
      <setSpec>category_272</setSpec>
      <setSpec>category_873</setSpec>
      <setSpec>category_931</setSpec>
      <setSpec>portal_63</setSpec>
      <setSpec>item_type_6</setSpec>
    </header>
    ...
  ```

- a [category](https://api.figshare.com/v2/oai?verb=ListIdentifiers&metadataPrefix=oai_dc&set=category_150):
  ```
    ...
    <header>
      <identifier>oai:figshare.com:article/2058654</identifier>
      <datestamp>2015-12-27T23:40:01Z</datestamp>
      <setSpec>category_54</setSpec>
      <setSpec>category_55</setSpec>
      <setSpec>category_56</setSpec>
      <setSpec>category_57</setSpec>
      <setSpec>category_58</setSpec>
      <setSpec>category_59</setSpec>
      <setSpec>category_145</setSpec>
      <setSpec>category_146</setSpec>
      <setSpec>category_147</setSpec>
      <setSpec>category_148</setSpec>
      <setSpec>category_149</setSpec>
      <setSpec>category_150</setSpec>
      <setSpec>category_492</setSpec>
      <setSpec>category_493</setSpec>
      <setSpec>category_494</setSpec>
      <setSpec>category_496</setSpec>
      <setSpec>category_497</setSpec>
      <setSpec>category_498</setSpec>
      <setSpec>category_499</setSpec>
      <setSpec>category_500</setSpec>
      <setSpec>category_501</setSpec>
      <setSpec>category_502</setSpec>
      <setSpec>item_type_6</setSpec>
    </header>
    ...
  ```

- or a [month\_year](https://api.figshare.com/v2/oai?verb=ListIdentifiers&metadataPrefix=oai_dc&set=month_year_10_2016):
  ```
    ...
    <header>
      <identifier>oai:figshare.com:article/2004335</identifier>
      <datestamp>2016-10-31T11:14:47Z</datestamp>
      <setSpec>category_215</setSpec>
      <setSpec>category_239</setSpec>
      <setSpec>portal_15</setSpec>
      <setSpec>item_type_11</setSpec>
    </header>
    ...
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
            <earliestDatestamp>2010-01-08T01:24:54Z</earliestDatestamp>
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
                <setSpec>item_type_6</setSpec>
            </header>
        </ListIdentifiers>
    </OAI-PMH>

___

**ListRecords**

Selective harvesting: only articles published `until` 2010-08-18T08:33:01Z.

    curl "https://api.figshare.com/v2/oai?verb=ListRecords&metadataPrefix=oai_dc&until=2010-08-18T08:33:01Z"

    <?xml version='1.0' encoding='utf-8'?>
    <?xml-stylesheet type="text/xsl" href="/v2/static/oai2.xsl"?>
    <OAI-PMH xmlns="http://www.openarchives.org/OAI/2.0/" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://www.openarchives.org/OAI/2.0/ http://www.openarchives.org/OAI/2.0/OAI-PMH.xsd">
      <responseDate>2016-09-29T08:03:12Z</responseDate>
      <request metadataPrefix="oai_dc" until="2010-08-18T08:33:01Z" verb="ListRecords">https://api.figshare.com/v2/oai</request>
      <ListRecords>
        <record>
          <header>
            <identifier>oai:figshare.com:article/145088</identifier>
            <datestamp>2010-01-08T01:24:54Z</datestamp>
            <setSpec>category_4</setSpec>
            <setSpec>category_12</setSpec>
            <setSpec>portal_5</setSpec>
            <setSpec>item_type_3</setSpec>
          </header>
          <metadata>
            <oai_dc:dc xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"  xmlns:dc="http://purl.org/dc/terms/" xmlns:oai_dc="http://www.openarchives.org/OAI/2.0/oai_dc/" xsi:schemaLocation="http://www.openarchives.org/OAI/2.0/oai_dc/ http://www.openarchives.org/OAI/2.0/oai_dc.xsd">
                <dc:title>A Modular BAM Complex in the Outer Membrane of the α-Proteobacterium &lt;em&gt;Caulobacter crescentus&lt;/em&gt;</dc:title>
                <dc:creator>Anthony W. Purcell (105036)</dc:creator>
                <dc:creator>Trevor Lithgow (105055)</dc:creator>
                <dc:creator>Kipros Gabriel (189246)</dc:creator>
                <dc:creator>Nicholas Noinaj (216256)</dc:creator>
                <dc:creator>Sebastian Poggio (251019)</dc:creator>
                <dc:creator>Khatira Anwari (254980)</dc:creator>
                <dc:creator>Andrew Perry (254989)</dc:creator>
                <dc:creator>Xenia Gatsos (254994)</dc:creator>
                <dc:creator>Sri Harsha Ramarathinam (255001)</dc:creator>
                <dc:creator>Nicholas A. Williamson (255006)</dc:creator>
                <dc:creator>Susan Buchanan (255012)</dc:creator>
                <dc:creator>Christine Jacobs-Wagner (255016)</dc:creator>
                <dc:subject>Biochemistry</dc:subject>
                <dc:subject>Cell Biology</dc:subject>
                <dc:subject>modular</dc:subject>
                <dc:subject>bam</dc:subject>
                <dc:subject>membrane</dc:subject>
                <dc:description>&lt;div&gt;&lt;p&gt;Mitochondria are organelles derived from an intracellular α-proteobacterium. The biogenesis of mitochondria relies on the assembly of β-barrel proteins into the mitochondrial outer membrane, a process inherited from the bacterial ancestor. &lt;em&gt;Caulobacter crescentus&lt;/em&gt; is an α-proteobacterium, and the BAM (β-barrel assembly machinery) complex was purified and characterized from this model organism. Like the mitochondrial sorting and assembly machinery complex, we find the BAM complex to be modular in nature. A ∼150 kDa core BAM complex containing BamA, BamB, BamD, and BamE associates with additional modules in the outer membrane. One of these modules, Pal, is a lipoprotein that provides a means for anchorage to the peptidoglycan layer of the cell wall. We suggest the modular design of the BAM complex facilitates access to substrates from the protein translocase in the inner membrane.&lt;/p&gt;&lt;/div&gt;</dc:description>
                <dc:date>2010-01-08T01:24:48Z</dc:date>
                <dc:type>Dataset</dc:type>
                <dc:identifier>10.1371/journal.pone.0008619</dc:identifier>
                <dc:relation>https://figshare.com/articles/A_Modular_BAM_Complex_in_the_Outer_Membrane_of_the_Proteobacterium_em_Caulobacter_crescentus_em_/145088</dc:relation>
            </oai_dc:dc>
          </metadata>
         </record>
      </ListRecords>
    </OAI-PMH>


## Changes

**October, 2016**
Add correct output for ListIdentifiers
Add month_year set / param
Add user IDs in the <creator> tags

**May, 2016**
Initial release of OAI-PMH API

**July, 2016**
Datacite and RDF Metadata Formats are added

**August, 2016**
Keywords and Licences tags are added

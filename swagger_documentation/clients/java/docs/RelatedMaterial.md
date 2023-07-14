
# RelatedMaterial

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The ID of the related material; can be used to add existing materials of the same account to items. |  [optional]
**identifier** | **String** | The related material identifier (e.g., DOI, Handle, ISBN) |  [optional]
**title** | **String** | The related material title |  [optional]
**relation** | [**RelationEnum**](#RelationEnum) | The relation between the item and the related material; defaults to &#39;References&#39; |  [optional]
**identifierType** | [**IdentifierTypeEnum**](#IdentifierTypeEnum) | The type of the identifier of the related material; defaults to &#39;URL&#39; |  [optional]
**isLinkout** | **Boolean** | Flag for highlighting this related material in the call-out box |  [optional]
**link** | **String** | The full hyperlink for the identifier |  [optional]


<a name="RelationEnum"></a>
## Enum: RelationEnum
Name | Value
---- | -----
ISCITEDBY | &quot;IsCitedBy&quot;
CITES | &quot;Cites&quot;
ISSUPPLEMENTTO | &quot;IsSupplementTo&quot;
ISSUPPLEMENTEDBY | &quot;IsSupplementedBy&quot;
ISCONTINUEDBY | &quot;IsContinuedBy&quot;
CONTINUES | &quot;Continues&quot;
DESCRIBES | &quot;Describes&quot;
ISDESCRIBEDBY | &quot;IsDescribedBy&quot;
HASMETADATA | &quot;HasMetadata&quot;
ISMETADATAFOR | &quot;IsMetadataFor&quot;
HASVERSION | &quot;HasVersion&quot;
ISVERSIONOF | &quot;IsVersionOf&quot;
ISNEWVERSIONOF | &quot;IsNewVersionOf&quot;
ISPREVIOUSVERSIONOF | &quot;IsPreviousVersionOf&quot;
ISPARTOF | &quot;IsPartOf&quot;
HASPART | &quot;HasPart&quot;
ISPUBLISHEDIN | &quot;IsPublishedIn&quot;
ISREFERENCEDBY | &quot;IsReferencedBy&quot;
REFERENCES | &quot;References&quot;
ISDOCUMENTEDBY | &quot;IsDocumentedBy&quot;
DOCUMENTS | &quot;Documents&quot;
ISCOMPILEDBY | &quot;IsCompiledBy&quot;
COMPILES | &quot;Compiles&quot;
ISVARIANTFORMOF | &quot;IsVariantFormOf&quot;
ISORIGINALFORMOF | &quot;IsOriginalFormOf&quot;
ISIDENTICALTO | &quot;IsIdenticalTo&quot;
ISREVIEWEDBY | &quot;IsReviewedBy&quot;
REVIEWS | &quot;Reviews&quot;
ISDERIVEDFROM | &quot;IsDerivedFrom&quot;
ISSOURCEOF | &quot;IsSourceOf&quot;
ISREQUIREDBY | &quot;IsRequiredBy&quot;
REQUIRES | &quot;Requires&quot;
ISOBSOLETEDBY | &quot;IsObsoletedBy&quot;
OBSOLETES | &quot;Obsoletes&quot;


<a name="IdentifierTypeEnum"></a>
## Enum: IdentifierTypeEnum
Name | Value
---- | -----
ARK | &quot;ARK&quot;
ARXIV | &quot;arXiv&quot;
BIBCODE | &quot;bibcode&quot;
DOI | &quot;DOI&quot;
EAN13 | &quot;EAN13&quot;
EISSN | &quot;EISSN&quot;
HANDLE | &quot;Handle&quot;
IGSN | &quot;IGSN&quot;
ISBN | &quot;ISBN&quot;
ISSN | &quot;ISSN&quot;
ISTC | &quot;ISTC&quot;
LISSN | &quot;LISSN&quot;
LSID | &quot;LSID&quot;
PMID | &quot;PMID&quot;
PURL | &quot;PURL&quot;
UPC | &quot;UPC&quot;
URL | &quot;URL&quot;
URN | &quot;URN&quot;
W3ID | &quot;w3id&quot;




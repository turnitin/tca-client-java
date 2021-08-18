

# SimilarityGenerationSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**searchRepositories** | [**List&lt;SearchRepositoriesEnum&gt;**](#List&lt;SearchRepositoriesEnum&gt;) | List of repositories to search | 
**submissionAutoExcludes** | **List&lt;UUID&gt;** | List of submission IDs to exclude from report |  [optional]
**autoExcludeSelfMatchingScope** | [**AutoExcludeSelfMatchingScopeEnum**](#AutoExcludeSelfMatchingScopeEnum) | self matching submissions to exclude from report |  [optional]
**priority** | [**PriorityEnum**](#PriorityEnum) | Priority level of report generation |  [optional]



## Enum: List&lt;SearchRepositoriesEnum&gt;

Name | Value
---- | -----
INTERNET | &quot;INTERNET&quot;
PUBLICATION | &quot;PUBLICATION&quot;
SUBMITTED_WORK | &quot;SUBMITTED_WORK&quot;
PRIVATE | &quot;PRIVATE&quot;
CROSSREF | &quot;CROSSREF&quot;
CROSSREF_POSTED_CONTENT | &quot;CROSSREF_POSTED_CONTENT&quot;



## Enum: AutoExcludeSelfMatchingScopeEnum

Name | Value
---- | -----
ALL | &quot;ALL&quot;
GROUP | &quot;GROUP&quot;
GROUP_CONTEXT | &quot;GROUP_CONTEXT&quot;
NONE | &quot;NONE&quot;



## Enum: PriorityEnum

Name | Value
---- | -----
FALSE | &quot;false&quot;




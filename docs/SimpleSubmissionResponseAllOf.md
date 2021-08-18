

# SimpleSubmissionResponseAllOf


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | the unique ID of the submission |  [optional]
**owner** | **String** | the owner of the submission |  [optional]
**title** | **String** | the title of the submission |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | the current status of the Submission |  [optional]
**createdTime** | **OffsetDateTime** | RFC3339 timestamp of when this submission was initially created. This is the time at which the POST to /submissions was made.  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
CREATED | &quot;CREATED&quot;
PROCESSING | &quot;PROCESSING&quot;
COMPLETE | &quot;COMPLETE&quot;




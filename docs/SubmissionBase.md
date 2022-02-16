

# SubmissionBase

A Submission is the base object on which other services (such as similarity) are offered. In order to use other services a Submission must first be created and successfully process, then other service objects can be created. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Object** | Submission id, optional field |  [optional]
**owner** | **String** | ID of the owning user |  [optional]
**ownerDefaultPermissionSet** | [**OwnerDefaultPermissionSetEnum**](#OwnerDefaultPermissionSetEnum) | Default viewer permission set, accepts INSTRUCTOR, LEARNER, EDITOR, USER, APPLICANT, ADMINISTRATOR, UNDEFINED |  [optional]
**title** | **String** | the title of the submission |  [optional]
**submitter** | **String** | (optional) ID of the submitting user, if different from the owning user |  [optional]
**submitterDefaultPermissionSet** | [**SubmitterDefaultPermissionSetEnum**](#SubmitterDefaultPermissionSetEnum) | Default submitter permission set, accepts INSTRUCTOR, LEARNER, EDITOR, USER, APPLICANT, ADMINISTRATOR, UNDEFINED |  [optional]
**eula** | [**Eula**](Eula.md) |  |  [optional]
**metadata** | [**SubmissionBaseMetadata**](SubmissionBaseMetadata.md) |  |  [optional]
**extractTextOnly** | **Boolean** | (optional) indicates if the submission should be treated as a text only submission. A text only submission cannot generate full reports or be viewed in the viewer, but can use the index only endpoint to be indexed |  [optional]



## Enum: OwnerDefaultPermissionSetEnum

Name | Value
---- | -----
INSTRUCTOR | &quot;INSTRUCTOR&quot;
LEARNER | &quot;LEARNER&quot;
EDITOR | &quot;EDITOR&quot;
USER | &quot;USER&quot;
APPLICANT | &quot;APPLICANT&quot;
ADMINISTRATOR | &quot;ADMINISTRATOR&quot;
UNDEFINED | &quot;UNDEFINED&quot;



## Enum: SubmitterDefaultPermissionSetEnum

Name | Value
---- | -----
INSTRUCTOR | &quot;INSTRUCTOR&quot;
LEARNER | &quot;LEARNER&quot;
EDITOR | &quot;EDITOR&quot;
USER | &quot;USER&quot;
APPLICANT | &quot;APPLICANT&quot;
ADMINISTRATOR | &quot;ADMINISTRATOR&quot;
UNDEFINED | &quot;UNDEFINED&quot;




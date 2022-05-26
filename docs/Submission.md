

# Submission


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**owner** | **String** | the owner of the submission |  [optional] |
|**title** | **String** | the title of the submission |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | the current status of the Submission |  [optional] |
|**id** | **String** | the unique ID of the submission |  [optional] |
|**contentType** | **String** | the content type of the submission |  [optional] |
|**pageCount** | **Integer** | the number of pages in the submission |  [optional] |
|**wordCount** | **Integer** | the number of words in the submission |  [optional] |
|**characterCount** | **Integer** | the number of characters in the submission |  [optional] |
|**errorCode** | [**ErrorCodeEnum**](#ErrorCodeEnum) | an error code representing the type of error encountered (if applicable)  |  [optional] |
|**createdTime** | **OffsetDateTime** | RFC3339 timestamp of when this submission was initially created. This is the time at which the POST to /submissions was made.  |  [optional] |
|**capabilities** | [**List&lt;CapabilitiesEnum&gt;**](#List&lt;CapabilitiesEnum&gt;) | Set of capabilities available to the current submission |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;CREATED&quot; |
| PROCESSING | &quot;PROCESSING&quot; |
| COMPLETE | &quot;COMPLETE&quot; |
| DELETED | &quot;DELETED&quot; |
| ERROR | &quot;ERROR&quot; |



## Enum: ErrorCodeEnum

| Name | Value |
|---- | -----|
| UNSUPPORTED_FILETYPE | &quot;UNSUPPORTED_FILETYPE&quot; |
| PROCESSING_ERROR | &quot;PROCESSING_ERROR&quot; |
| CANNOT_EXTRACT_TEXT | &quot;CANNOT_EXTRACT_TEXT&quot; |
| TOO_LITTLE_TEXT | &quot;TOO_LITTLE_TEXT&quot; |
| TOO_MUCH_TEXT | &quot;TOO_MUCH_TEXT&quot; |
| TOO_MANY_PAGES | &quot;TOO_MANY_PAGES&quot; |
| FILE_LOCKED | &quot;FILE_LOCKED&quot; |
| CORRUPT_FILE | &quot;CORRUPT_FILE&quot; |



## Enum: List&lt;CapabilitiesEnum&gt;

| Name | Value |
|---- | -----|
| INDEX | &quot;INDEX&quot; |
| SIMILARITY | &quot;SIMILARITY&quot; |
| VIEWER | &quot;VIEWER&quot; |




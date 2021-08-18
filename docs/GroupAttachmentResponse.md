

# GroupAttachmentResponse

Object returned for group attachment.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | uuid |  [optional]
**title** | **String** | title |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | status |  [optional]
**template** | **Boolean** | template |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
CREATED | &quot;CREATED&quot;
PROCESSING | &quot;PROCESSING&quot;
COMPLETE | &quot;COMPLETE&quot;
ERROR | &quot;ERROR&quot;
DELETE | &quot;DELETE&quot;




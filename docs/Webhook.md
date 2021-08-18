

# Webhook


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | unique id of webhook | 
**createdTime** | **OffsetDateTime** | RFC3339  timestamp of when this Webhook was initially created. This is the time at which the POST to /webhooks was made.  |  [optional]
**description** | **String** | a human readable description of the webhook |  [optional]
**url** | **String** | the URL to callback with events, this must be https unless (allow_insecure is true) | 
**allowInsecure** | **Boolean** | if using an non https url, this must be set to true |  [optional]
**eventTypes** | [**List&lt;EventTypesEnum&gt;**](#List&lt;EventTypesEnum&gt;) | an array of the types of callbacks that will be sent to this webhook | 



## Enum: List&lt;EventTypesEnum&gt;

Name | Value
---- | -----
SUBMISSION_COMPLETE | &quot;SUBMISSION_COMPLETE&quot;
SIMILARITY_COMPLETE | &quot;SIMILARITY_COMPLETE&quot;
SIMILARITY_UPDATED | &quot;SIMILARITY_UPDATED&quot;
PDF_STATUS | &quot;PDF_STATUS&quot;
GROUP_ATTACHMENT_COMPLETE | &quot;GROUP_ATTACHMENT_COMPLETE&quot;




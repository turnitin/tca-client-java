

# AggregateGroup


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | (required)  |  [optional]
**name** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**groupContext** | [**GroupContext**](GroupContext.md) |  |  [optional]
**dueDate** | **LocalDate** | due date for the group |  [optional]
**reportGeneration** | [**ReportGenerationEnum**](#ReportGenerationEnum) |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
ASSIGNMENT | &quot;ASSIGNMENT&quot;
FOLDER | &quot;FOLDER&quot;



## Enum: ReportGenerationEnum

Name | Value
---- | -----
IMMEDIATELY | &quot;IMMEDIATELY&quot;
IMMEDIATELY_AND_DUE_DATE | &quot;IMMEDIATELY_AND_DUE_DATE&quot;




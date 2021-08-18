

# SimilarityMetadata


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**overallMatchPercentage** | **Integer** | Represents the percentage match against all sources | 
**internetMatchPercentage** | **Integer** | Represents the percentage match against internet |  [optional]
**publicationMatchPercentage** | **Integer** | Represents the percentage match against all publications |  [optional]
**submittedWorksMatchPercentage** | **Integer** | Represents the percentage match against all submitted works |  [optional]
**submissionId** | **String** |  | 
**status** | **String** | possible values PENDING, COMPLETE | 
**timeGenerated** | **String** | Time the report finished generating.  If not set the report has not finished generating | 
**timeRequested** | **String** | Time the report was requested | 
**topMatches** | [**List&lt;SimilarityMetadataAllOfTopMatches&gt;**](SimilarityMetadataAllOfTopMatches.md) | Top matches | 
**topSourceLargestMatchedWordCount** | **Integer** | Largest individual matched word count, 0 if there isn&#39;t a match to this submission. | 




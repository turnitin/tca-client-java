/*
 * Turnitin Core API
 * Turnitin Core API (TCA) provides direct API access to the core functionality provided by Turnitin. It supports file submission, similarity report generation, group management, and visualization of report matches via Cloud Viewer or PDF download. Below is the full flow to successfully set up an integration scope, an API Key, and make calls to TCA. Integration Scope and API Key management is done via the Admin Console UI, by logging in as an admin user. For more details, go to our [developer portal documentation page](https://developers.turnitin.com/docs). ## Integration Scope and API Key Management TCA API calls must provide an API Key for authentication, so you must first have at least one integration scope associated with at least one API Key to use TCA. ### Admin Console UI First, login to Admin Console UI as an *Admin* user with permission to create Integration Scopes, under a tenant that is licensed to use the TCA product Integration Scopes (you can create a new one, or add keys to existing)    * Click `Integrations` in the side bar --> `+ Add Integration` at top the top of the page --> Enter a name --> `Add` Button   API Keys   * Click `Integrations` in the side bar --> `Create API Key` Button next to a given Integration Scope -->   Enter a name --> click `Create and View button`   * Copy/Save the key manually or click save to clipboard button to copy it (this is the only time it will show)  ## TCA Flow    *  Register a webhook   *  Create a submission   *  Upload a file to the submission   *  Wait for the submission upload to process      * If you registered a webhook, a callback will be sent to it when upload is complete      * The status of the *submission* will also update to `COMPLETE`   *  Request a Similarity Report   *  Wait for similarity report to process      * If you registered a webhook, a callback will be sent to it when report is complete      * The status of the *report* will also be updated to `COMPLETE`   *  Request a URL with parameters to view the Similarity Report 
 *
 * The version of the OpenAPI document: 1.0.220
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * SimilarityMetadataAllOfTopMatches
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-18T14:13:09.743898-04:00[America/New_York]")
public class SimilarityMetadataAllOfTopMatches {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PERCENTAGE = "percentage";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE)
  private BigDecimal percentage;

  public static final String SERIALIZED_NAME_SUBMISSION_ID = "submission_id";
  @SerializedName(SERIALIZED_NAME_SUBMISSION_ID)
  private String submissionId;

  public static final String SERIALIZED_NAME_SOURCE_TYPE = "source_type";
  @SerializedName(SERIALIZED_NAME_SOURCE_TYPE)
  private String sourceType;

  public static final String SERIALIZED_NAME_MATCHED_WORD_COUNT_TOTAL = "matched_word_count_total";
  @SerializedName(SERIALIZED_NAME_MATCHED_WORD_COUNT_TOTAL)
  private BigDecimal matchedWordCountTotal;

  public static final String SERIALIZED_NAME_SUBMITTED_DATE = "submitted_date";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_DATE)
  private String submittedDate;

  public static final String SERIALIZED_NAME_INSTITUTION_NAME = "institution_name";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_NAME)
  private String institutionName;


  public SimilarityMetadataAllOfTopMatches name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Source name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Source name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SimilarityMetadataAllOfTopMatches percentage(BigDecimal percentage) {
    
    this.percentage = percentage;
    return this;
  }

   /**
   * Match percentage
   * @return percentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Match percentage")

  public BigDecimal getPercentage() {
    return percentage;
  }


  public void setPercentage(BigDecimal percentage) {
    this.percentage = percentage;
  }


  public SimilarityMetadataAllOfTopMatches submissionId(String submissionId) {
    
    this.submissionId = submissionId;
    return this;
  }

   /**
   * Matching submission id
   * @return submissionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Matching submission id")

  public String getSubmissionId() {
    return submissionId;
  }


  public void setSubmissionId(String submissionId) {
    this.submissionId = submissionId;
  }


  public SimilarityMetadataAllOfTopMatches sourceType(String sourceType) {
    
    this.sourceType = sourceType;
    return this;
  }

   /**
   * Matching submission source type (INTERNET, PUBLICATION, SUBMITTED_WORK)
   * @return sourceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Matching submission source type (INTERNET, PUBLICATION, SUBMITTED_WORK)")

  public String getSourceType() {
    return sourceType;
  }


  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }


  public SimilarityMetadataAllOfTopMatches matchedWordCountTotal(BigDecimal matchedWordCountTotal) {
    
    this.matchedWordCountTotal = matchedWordCountTotal;
    return this;
  }

   /**
   * number of matching words
   * @return matchedWordCountTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "number of matching words")

  public BigDecimal getMatchedWordCountTotal() {
    return matchedWordCountTotal;
  }


  public void setMatchedWordCountTotal(BigDecimal matchedWordCountTotal) {
    this.matchedWordCountTotal = matchedWordCountTotal;
  }


  public SimilarityMetadataAllOfTopMatches submittedDate(String submittedDate) {
    
    this.submittedDate = submittedDate;
    return this;
  }

   /**
   * date match was submitted
   * @return submittedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "date match was submitted")

  public String getSubmittedDate() {
    return submittedDate;
  }


  public void setSubmittedDate(String submittedDate) {
    this.submittedDate = submittedDate;
  }


  public SimilarityMetadataAllOfTopMatches institutionName(String institutionName) {
    
    this.institutionName = institutionName;
    return this;
  }

   /**
   * intitution name for matched SUBMITTED_WORK types
   * @return institutionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "intitution name for matched SUBMITTED_WORK types")

  public String getInstitutionName() {
    return institutionName;
  }


  public void setInstitutionName(String institutionName) {
    this.institutionName = institutionName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimilarityMetadataAllOfTopMatches similarityMetadataAllOfTopMatches = (SimilarityMetadataAllOfTopMatches) o;
    return Objects.equals(this.name, similarityMetadataAllOfTopMatches.name) &&
        Objects.equals(this.percentage, similarityMetadataAllOfTopMatches.percentage) &&
        Objects.equals(this.submissionId, similarityMetadataAllOfTopMatches.submissionId) &&
        Objects.equals(this.sourceType, similarityMetadataAllOfTopMatches.sourceType) &&
        Objects.equals(this.matchedWordCountTotal, similarityMetadataAllOfTopMatches.matchedWordCountTotal) &&
        Objects.equals(this.submittedDate, similarityMetadataAllOfTopMatches.submittedDate) &&
        Objects.equals(this.institutionName, similarityMetadataAllOfTopMatches.institutionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, percentage, submissionId, sourceType, matchedWordCountTotal, submittedDate, institutionName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimilarityMetadataAllOfTopMatches {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    matchedWordCountTotal: ").append(toIndentedString(matchedWordCountTotal)).append("\n");
    sb.append("    submittedDate: ").append(toIndentedString(submittedDate)).append("\n");
    sb.append("    institutionName: ").append(toIndentedString(institutionName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


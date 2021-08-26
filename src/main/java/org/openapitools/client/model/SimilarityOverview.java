/*
 * Turnitin Core API
 * Turnitin Core API (TCA) provides direct API access to the core functionality provided by Turnitin. TCA supports file submission, similarity report generation, group management, and visualization of report matches via Cloud Viewer or PDF download. Below is the full flow to successfully set up an integration scope, an API Key, and make calls to TCA. Integration Scope and API Key management is done via the Admin Console UI by logging in as an admin user. For more details, go to our [developer portal documentation page](https://developers.turnitin.com/docs). ## Integration Scope and API Key Management TCA API calls must provide an API Key for authentication, so you must first have at least one integration scope associated with at least one API Key to use TCA. ### Admin Console UI First, login to Admin Console UI as an *Admin* user with permission to create Integration Scopes, under a tenant that is licensed to use the TCA product Integration Scopes (you can create a new one, or add keys to existing)    * Click `Integrations` in the side bar --> `+ Add Integration` at top the top of the page --> Enter a name --> `Add` Button   API Keys   * Click `Integrations` in the side bar --> `Create API Key` Button next to a given Integration Scope -->   Enter a name --> click `Create and View button`   * Copy/Save the key manually or click save to clipboard button to copy it (this is the only time it will show)  ## TCA Flow    *  Register a webhook   *  Create a submission   *  Upload a file to the submission   *  Wait for the submission upload to process      * If you registered a webhook, a callback will be sent to it when upload is complete      * The status of the *submission* will also update to `COMPLETE`   *  Request a Similarity Report   *  Wait for similarity report to process      * If you registered a webhook, a callback will be sent to it when report is complete      * The status of the *report* will also be updated to `COMPLETE`   *  Request a URL with parameters to view the Similarity Report 
 *
 * The version of the OpenAPI document: 1.0.223
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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.SimilarityOverviewMatchAggregate;

/**
 * SimilarityOverview
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-26T19:18:43.739499Z[Etc/UTC]")
public class SimilarityOverview {
  public static final String SERIALIZED_NAME_SUBMISSION_ID = "submission_id";
  @SerializedName(SERIALIZED_NAME_SUBMISSION_ID)
  private String submissionId;

  public static final String SERIALIZED_NAME_OVERALL_MATCH_PERCENTAGE = "overall_match_percentage";
  @SerializedName(SERIALIZED_NAME_OVERALL_MATCH_PERCENTAGE)
  private BigDecimal overallMatchPercentage;

  public static final String SERIALIZED_NAME_SUBMISSION_TEXT = "submission_text";
  @SerializedName(SERIALIZED_NAME_SUBMISSION_TEXT)
  private String submissionText;

  public static final String SERIALIZED_NAME_MATCH_AGGREGATES = "match_aggregates";
  @SerializedName(SERIALIZED_NAME_MATCH_AGGREGATES)
  private List<SimilarityOverviewMatchAggregate> matchAggregates = null;


  public SimilarityOverview submissionId(String submissionId) {
    
    this.submissionId = submissionId;
    return this;
  }

   /**
   * Get submissionId
   * @return submissionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubmissionId() {
    return submissionId;
  }


  public void setSubmissionId(String submissionId) {
    this.submissionId = submissionId;
  }


  public SimilarityOverview overallMatchPercentage(BigDecimal overallMatchPercentage) {
    
    this.overallMatchPercentage = overallMatchPercentage;
    return this;
  }

   /**
   * Get overallMatchPercentage
   * @return overallMatchPercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getOverallMatchPercentage() {
    return overallMatchPercentage;
  }


  public void setOverallMatchPercentage(BigDecimal overallMatchPercentage) {
    this.overallMatchPercentage = overallMatchPercentage;
  }


  public SimilarityOverview submissionText(String submissionText) {
    
    this.submissionText = submissionText;
    return this;
  }

   /**
   * Get submissionText
   * @return submissionText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubmissionText() {
    return submissionText;
  }


  public void setSubmissionText(String submissionText) {
    this.submissionText = submissionText;
  }


  public SimilarityOverview matchAggregates(List<SimilarityOverviewMatchAggregate> matchAggregates) {
    
    this.matchAggregates = matchAggregates;
    return this;
  }

  public SimilarityOverview addMatchAggregatesItem(SimilarityOverviewMatchAggregate matchAggregatesItem) {
    if (this.matchAggregates == null) {
      this.matchAggregates = new ArrayList<SimilarityOverviewMatchAggregate>();
    }
    this.matchAggregates.add(matchAggregatesItem);
    return this;
  }

   /**
   * Get matchAggregates
   * @return matchAggregates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SimilarityOverviewMatchAggregate> getMatchAggregates() {
    return matchAggregates;
  }


  public void setMatchAggregates(List<SimilarityOverviewMatchAggregate> matchAggregates) {
    this.matchAggregates = matchAggregates;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimilarityOverview similarityOverview = (SimilarityOverview) o;
    return Objects.equals(this.submissionId, similarityOverview.submissionId) &&
        Objects.equals(this.overallMatchPercentage, similarityOverview.overallMatchPercentage) &&
        Objects.equals(this.submissionText, similarityOverview.submissionText) &&
        Objects.equals(this.matchAggregates, similarityOverview.matchAggregates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submissionId, overallMatchPercentage, submissionText, matchAggregates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimilarityOverview {\n");
    sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
    sb.append("    overallMatchPercentage: ").append(toIndentedString(overallMatchPercentage)).append("\n");
    sb.append("    submissionText: ").append(toIndentedString(submissionText)).append("\n");
    sb.append("    matchAggregates: ").append(toIndentedString(matchAggregates)).append("\n");
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


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
import org.openapitools.client.model.SimilarityOverviewMatchSource;

/**
 * SimilarityOverviewMatchAggregate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-26T19:18:43.739499Z[Etc/UTC]")
public class SimilarityOverviewMatchAggregate {
  public static final String SERIALIZED_NAME_SOURCE_TYPE = "source_type";
  @SerializedName(SERIALIZED_NAME_SOURCE_TYPE)
  private String sourceType;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PERCENT = "percent";
  @SerializedName(SERIALIZED_NAME_PERCENT)
  private BigDecimal percent;

  public static final String SERIALIZED_NAME_AGGREGATE_ID = "aggregate_id";
  @SerializedName(SERIALIZED_NAME_AGGREGATE_ID)
  private String aggregateId;

  public static final String SERIALIZED_NAME_MATCH_SOURCES = "match_sources";
  @SerializedName(SERIALIZED_NAME_MATCH_SOURCES)
  private List<SimilarityOverviewMatchSource> matchSources = null;


  public SimilarityOverviewMatchAggregate sourceType(String sourceType) {
    
    this.sourceType = sourceType;
    return this;
  }

   /**
   * Get sourceType
   * @return sourceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSourceType() {
    return sourceType;
  }


  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }


  public SimilarityOverviewMatchAggregate description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public SimilarityOverviewMatchAggregate percent(BigDecimal percent) {
    
    this.percent = percent;
    return this;
  }

   /**
   * Get percent
   * @return percent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getPercent() {
    return percent;
  }


  public void setPercent(BigDecimal percent) {
    this.percent = percent;
  }


  public SimilarityOverviewMatchAggregate aggregateId(String aggregateId) {
    
    this.aggregateId = aggregateId;
    return this;
  }

   /**
   * Get aggregateId
   * @return aggregateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAggregateId() {
    return aggregateId;
  }


  public void setAggregateId(String aggregateId) {
    this.aggregateId = aggregateId;
  }


  public SimilarityOverviewMatchAggregate matchSources(List<SimilarityOverviewMatchSource> matchSources) {
    
    this.matchSources = matchSources;
    return this;
  }

  public SimilarityOverviewMatchAggregate addMatchSourcesItem(SimilarityOverviewMatchSource matchSourcesItem) {
    if (this.matchSources == null) {
      this.matchSources = new ArrayList<SimilarityOverviewMatchSource>();
    }
    this.matchSources.add(matchSourcesItem);
    return this;
  }

   /**
   * Get matchSources
   * @return matchSources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SimilarityOverviewMatchSource> getMatchSources() {
    return matchSources;
  }


  public void setMatchSources(List<SimilarityOverviewMatchSource> matchSources) {
    this.matchSources = matchSources;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimilarityOverviewMatchAggregate similarityOverviewMatchAggregate = (SimilarityOverviewMatchAggregate) o;
    return Objects.equals(this.sourceType, similarityOverviewMatchAggregate.sourceType) &&
        Objects.equals(this.description, similarityOverviewMatchAggregate.description) &&
        Objects.equals(this.percent, similarityOverviewMatchAggregate.percent) &&
        Objects.equals(this.aggregateId, similarityOverviewMatchAggregate.aggregateId) &&
        Objects.equals(this.matchSources, similarityOverviewMatchAggregate.matchSources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceType, description, percent, aggregateId, matchSources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimilarityOverviewMatchAggregate {\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
    sb.append("    aggregateId: ").append(toIndentedString(aggregateId)).append("\n");
    sb.append("    matchSources: ").append(toIndentedString(matchSources)).append("\n");
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


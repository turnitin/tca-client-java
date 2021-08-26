/*
 * Turnitin Core API
 * Turnitin Core API (TCA) provides direct API access to the core functionality provided by Turnitin. It supports file submission, similarity report generation, group management, and visualization of report matches via Cloud Viewer or PDF download. Below is the full flow to successfully set up an integration scope, an API Key, and make calls to TCA. Integration Scope and API Key management is done via the Admin Console UI by logging in as an admin user. For more details, go to our [developer portal documentation page](https://developers.turnitin.com/docs). ## Integration Scope and API Key Management TCA API calls must provide an API Key for authentication, so you must first have at least one integration scope associated with at least one API Key to use TCA. ### Admin Console UI First, login to Admin Console UI as an *Admin* user with permission to create Integration Scopes, under a tenant that is licensed to use the TCA product Integration Scopes (you can create a new one, or add keys to existing)    * Click `Integrations` in the side bar --> `+ Add Integration` at top the top of the page --> Enter a name --> `Add` Button   API Keys   * Click `Integrations` in the side bar --> `Create API Key` Button next to a given Integration Scope -->   Enter a name --> click `Create and View button`   * Copy/Save the key manually or click save to clipboard button to copy it (this is the only time it will show)  ## TCA Flow    *  Register a webhook   *  Create a submission   *  Upload a file to the submission   *  Wait for the submission upload to process      * If you registered a webhook, a callback will be sent to it when upload is complete      * The status of the *submission* will also update to `COMPLETE`   *  Request a Similarity Report   *  Wait for similarity report to process      * If you registered a webhook, a callback will be sent to it when report is complete      * The status of the *report* will also be updated to `COMPLETE`   *  Request a URL with parameters to view the Similarity Report 
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

/**
 * SimilaritySettingsModes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-26T18:42:10.874644Z[Etc/UTC]")
public class SimilaritySettingsModes {
  public static final String SERIALIZED_NAME_MATCH_OVERVIEW = "match_overview";
  @SerializedName(SERIALIZED_NAME_MATCH_OVERVIEW)
  private Boolean matchOverview;

  public static final String SERIALIZED_NAME_ALL_SOURCES = "all_sources";
  @SerializedName(SERIALIZED_NAME_ALL_SOURCES)
  private Boolean allSources;


  public SimilaritySettingsModes matchOverview(Boolean matchOverview) {
    
    this.matchOverview = matchOverview;
    return this;
  }

   /**
   * Used to enable use of the match overview mode in the viewer
   * @return matchOverview
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used to enable use of the match overview mode in the viewer")

  public Boolean getMatchOverview() {
    return matchOverview;
  }


  public void setMatchOverview(Boolean matchOverview) {
    this.matchOverview = matchOverview;
  }


  public SimilaritySettingsModes allSources(Boolean allSources) {
    
    this.allSources = allSources;
    return this;
  }

   /**
   * Used to enable use of the all sources mode in the viewer
   * @return allSources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used to enable use of the all sources mode in the viewer")

  public Boolean getAllSources() {
    return allSources;
  }


  public void setAllSources(Boolean allSources) {
    this.allSources = allSources;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimilaritySettingsModes similaritySettingsModes = (SimilaritySettingsModes) o;
    return Objects.equals(this.matchOverview, similaritySettingsModes.matchOverview) &&
        Objects.equals(this.allSources, similaritySettingsModes.allSources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchOverview, allSources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimilaritySettingsModes {\n");
    sb.append("    matchOverview: ").append(toIndentedString(matchOverview)).append("\n");
    sb.append("    allSources: ").append(toIndentedString(allSources)).append("\n");
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


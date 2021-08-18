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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * SimilarityScoreData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-18T14:13:09.743898-04:00[America/New_York]")
public class SimilarityScoreData {
  public static final String SERIALIZED_NAME_OVERALL_MATCH_PERCENTAGE = "overall_match_percentage";
  @SerializedName(SERIALIZED_NAME_OVERALL_MATCH_PERCENTAGE)
  private Integer overallMatchPercentage;

  public static final String SERIALIZED_NAME_INTERNET_MATCH_PERCENTAGE = "internet_match_percentage";
  @SerializedName(SERIALIZED_NAME_INTERNET_MATCH_PERCENTAGE)
  private Integer internetMatchPercentage;

  public static final String SERIALIZED_NAME_PUBLICATION_MATCH_PERCENTAGE = "publication_match_percentage";
  @SerializedName(SERIALIZED_NAME_PUBLICATION_MATCH_PERCENTAGE)
  private Integer publicationMatchPercentage;

  public static final String SERIALIZED_NAME_SUBMITTED_WORKS_MATCH_PERCENTAGE = "submitted_works_match_percentage";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_WORKS_MATCH_PERCENTAGE)
  private Integer submittedWorksMatchPercentage;


  public SimilarityScoreData overallMatchPercentage(Integer overallMatchPercentage) {
    
    this.overallMatchPercentage = overallMatchPercentage;
    return this;
  }

   /**
   * Represents the percentage match against all sources
   * @return overallMatchPercentage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents the percentage match against all sources")

  public Integer getOverallMatchPercentage() {
    return overallMatchPercentage;
  }


  public void setOverallMatchPercentage(Integer overallMatchPercentage) {
    this.overallMatchPercentage = overallMatchPercentage;
  }


  public SimilarityScoreData internetMatchPercentage(Integer internetMatchPercentage) {
    
    this.internetMatchPercentage = internetMatchPercentage;
    return this;
  }

   /**
   * Represents the percentage match against internet
   * @return internetMatchPercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Represents the percentage match against internet")

  public Integer getInternetMatchPercentage() {
    return internetMatchPercentage;
  }


  public void setInternetMatchPercentage(Integer internetMatchPercentage) {
    this.internetMatchPercentage = internetMatchPercentage;
  }


  public SimilarityScoreData publicationMatchPercentage(Integer publicationMatchPercentage) {
    
    this.publicationMatchPercentage = publicationMatchPercentage;
    return this;
  }

   /**
   * Represents the percentage match against all publications
   * @return publicationMatchPercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Represents the percentage match against all publications")

  public Integer getPublicationMatchPercentage() {
    return publicationMatchPercentage;
  }


  public void setPublicationMatchPercentage(Integer publicationMatchPercentage) {
    this.publicationMatchPercentage = publicationMatchPercentage;
  }


  public SimilarityScoreData submittedWorksMatchPercentage(Integer submittedWorksMatchPercentage) {
    
    this.submittedWorksMatchPercentage = submittedWorksMatchPercentage;
    return this;
  }

   /**
   * Represents the percentage match against all submitted works
   * @return submittedWorksMatchPercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Represents the percentage match against all submitted works")

  public Integer getSubmittedWorksMatchPercentage() {
    return submittedWorksMatchPercentage;
  }


  public void setSubmittedWorksMatchPercentage(Integer submittedWorksMatchPercentage) {
    this.submittedWorksMatchPercentage = submittedWorksMatchPercentage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimilarityScoreData similarityScoreData = (SimilarityScoreData) o;
    return Objects.equals(this.overallMatchPercentage, similarityScoreData.overallMatchPercentage) &&
        Objects.equals(this.internetMatchPercentage, similarityScoreData.internetMatchPercentage) &&
        Objects.equals(this.publicationMatchPercentage, similarityScoreData.publicationMatchPercentage) &&
        Objects.equals(this.submittedWorksMatchPercentage, similarityScoreData.submittedWorksMatchPercentage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && a.get().getClass().isArray() ? Arrays.equals((T[])a.get(), (T[])b.get()) : Objects.equals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(overallMatchPercentage, internetMatchPercentage, publicationMatchPercentage, submittedWorksMatchPercentage);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent()
      ? (a.get().getClass().isArray() ? Arrays.hashCode((T[])a.get()) : Objects.hashCode(a.get()))
      : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimilarityScoreData {\n");
    sb.append("    overallMatchPercentage: ").append(toIndentedString(overallMatchPercentage)).append("\n");
    sb.append("    internetMatchPercentage: ").append(toIndentedString(internetMatchPercentage)).append("\n");
    sb.append("    publicationMatchPercentage: ").append(toIndentedString(publicationMatchPercentage)).append("\n");
    sb.append("    submittedWorksMatchPercentage: ").append(toIndentedString(submittedWorksMatchPercentage)).append("\n");
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

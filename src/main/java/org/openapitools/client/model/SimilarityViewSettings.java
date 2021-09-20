/*
 * Turnitin Core API
 * Turnitin Core API (TCA) provides direct API access to the core functionality provided by Turnitin. TCA supports file submission, similarity report generation, group management, and visualization of report matches via Cloud Viewer or PDF download. Below is the full flow to successfully set up an integration scope, an API Key, and make calls to TCA. Integration Scope and API Key management is done via the Admin Console UI by logging in as an admin user. For more details, go to our [developer portal documentation page](https://developers.turnitin.com/docs). ## Integration Scope and API Key Management TCA API calls must provide an API Key for authentication, so you must first have at least one integration scope associated with at least one API Key to use TCA. ### Admin Console UI First, login to Admin Console UI as an *Admin* user with permission to create Integration Scopes, under a tenant that is licensed to use the TCA product Integration Scopes (you can create a new one, or add keys to existing)    * Click `Integrations` in the side bar --> `+ Add Integration` at top the top of the page --> Enter a name --> `Add` Button   API Keys   * Click `Integrations` in the side bar --> `Create API Key` Button next to a given Integration Scope -->   Enter a name --> click `Create and View button`   * Copy/Save the key manually or click save to clipboard button to copy it (this is the only time it will show)  ## TCA Flow    *  Register a webhook   *  Create a submission   *  Upload a file for the submission   *  Wait for the submission upload to process      * If you registered a webhook, a callback will be sent to it when upload is complete      * The status of the *submission* will also update to `COMPLETE`   *  Request a Similarity Report   *  Wait for similarity report to process      * If you registered a webhook, a callback will be sent to it when report is complete      * The status of the *report* will also be updated to `COMPLETE`   *  Request a URL with parameters to view the Similarity Report 
 *
 * The version of the OpenAPI document: 1.0.225
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
 * SimilarityViewSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-20T15:00:46.785538Z[Etc/UTC]")
public class SimilarityViewSettings {
  public static final String SERIALIZED_NAME_EXCLUDE_QUOTES = "exclude_quotes";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_QUOTES)
  private Boolean excludeQuotes;

  public static final String SERIALIZED_NAME_EXCLUDE_BIBLIOGRAPHY = "exclude_bibliography";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_BIBLIOGRAPHY)
  private Boolean excludeBibliography;

  public static final String SERIALIZED_NAME_EXCLUDE_CITATIONS = "exclude_citations";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_CITATIONS)
  private Boolean excludeCitations;

  public static final String SERIALIZED_NAME_EXCLUDE_ABSTRACT = "exclude_abstract";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_ABSTRACT)
  private Boolean excludeAbstract;

  public static final String SERIALIZED_NAME_EXCLUDE_METHODS = "exclude_methods";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_METHODS)
  private Boolean excludeMethods;

  public static final String SERIALIZED_NAME_EXCLUDE_SMALL_MATCHES = "exclude_small_matches";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_SMALL_MATCHES)
  private Integer excludeSmallMatches;

  public static final String SERIALIZED_NAME_EXCLUDE_INTERNET = "exclude_internet";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_INTERNET)
  private Boolean excludeInternet;

  public static final String SERIALIZED_NAME_EXCLUDE_PUBLICATIONS = "exclude_publications";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_PUBLICATIONS)
  private Boolean excludePublications;

  public static final String SERIALIZED_NAME_EXCLUDE_CROSSREF = "exclude_crossref";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_CROSSREF)
  private Boolean excludeCrossref;

  public static final String SERIALIZED_NAME_EXCLUDE_CROSSREF_POSTED_CONTENT = "exclude_crossref_posted_content";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_CROSSREF_POSTED_CONTENT)
  private Boolean excludeCrossrefPostedContent;

  public static final String SERIALIZED_NAME_EXCLUDE_SUBMITTED_WORKS = "exclude_submitted_works";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_SUBMITTED_WORKS)
  private Boolean excludeSubmittedWorks;

  public static final String SERIALIZED_NAME_EXCLUDE_CUSTOM_SECTIONS = "exclude_custom_sections";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_CUSTOM_SECTIONS)
  private Boolean excludeCustomSections;

  public static final String SERIALIZED_NAME_EXCLUDE_PREPRINTS = "exclude_preprints";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_PREPRINTS)
  private Boolean excludePreprints;


  public SimilarityViewSettings excludeQuotes(Boolean excludeQuotes) {
    
    this.excludeQuotes = excludeQuotes;
    return this;
  }

   /**
   * If set to true, text in quotes will not count as similar content 
   * @return excludeQuotes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If set to true, text in quotes will not count as similar content ")

  public Boolean getExcludeQuotes() {
    return excludeQuotes;
  }


  public void setExcludeQuotes(Boolean excludeQuotes) {
    this.excludeQuotes = excludeQuotes;
  }


  public SimilarityViewSettings excludeBibliography(Boolean excludeBibliography) {
    
    this.excludeBibliography = excludeBibliography;
    return this;
  }

   /**
   * If set to true, text in a bibliography section will not count as similar content 
   * @return excludeBibliography
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If set to true, text in a bibliography section will not count as similar content ")

  public Boolean getExcludeBibliography() {
    return excludeBibliography;
  }


  public void setExcludeBibliography(Boolean excludeBibliography) {
    this.excludeBibliography = excludeBibliography;
  }


  public SimilarityViewSettings excludeCitations(Boolean excludeCitations) {
    
    this.excludeCitations = excludeCitations;
    return this;
  }

   /**
   * If set to true, text in citations will not count as similar content 
   * @return excludeCitations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If set to true, text in citations will not count as similar content ")

  public Boolean getExcludeCitations() {
    return excludeCitations;
  }


  public void setExcludeCitations(Boolean excludeCitations) {
    this.excludeCitations = excludeCitations;
  }


  public SimilarityViewSettings excludeAbstract(Boolean excludeAbstract) {
    
    this.excludeAbstract = excludeAbstract;
    return this;
  }

   /**
   * If set to true, text in the abstract section of the submission will not count as similar content 
   * @return excludeAbstract
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If set to true, text in the abstract section of the submission will not count as similar content ")

  public Boolean getExcludeAbstract() {
    return excludeAbstract;
  }


  public void setExcludeAbstract(Boolean excludeAbstract) {
    this.excludeAbstract = excludeAbstract;
  }


  public SimilarityViewSettings excludeMethods(Boolean excludeMethods) {
    
    this.excludeMethods = excludeMethods;
    return this;
  }

   /**
   * If set to true, text in the method section of the submission will not count as similar content 
   * @return excludeMethods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If set to true, text in the method section of the submission will not count as similar content ")

  public Boolean getExcludeMethods() {
    return excludeMethods;
  }


  public void setExcludeMethods(Boolean excludeMethods) {
    this.excludeMethods = excludeMethods;
  }


  public SimilarityViewSettings excludeSmallMatches(Integer excludeSmallMatches) {
    
    this.excludeSmallMatches = excludeSmallMatches;
    return this;
  }

   /**
   * If set, similarity matches that match less than the specified amount of words will not count as similar content 
   * @return excludeSmallMatches
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "If set, similarity matches that match less than the specified amount of words will not count as similar content ")

  public Integer getExcludeSmallMatches() {
    return excludeSmallMatches;
  }


  public void setExcludeSmallMatches(Integer excludeSmallMatches) {
    this.excludeSmallMatches = excludeSmallMatches;
  }


  public SimilarityViewSettings excludeInternet(Boolean excludeInternet) {
    
    this.excludeInternet = excludeInternet;
    return this;
  }

   /**
   * If set to true, text matched to the internet collection will not count as similar content 
   * @return excludeInternet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If set to true, text matched to the internet collection will not count as similar content ")

  public Boolean getExcludeInternet() {
    return excludeInternet;
  }


  public void setExcludeInternet(Boolean excludeInternet) {
    this.excludeInternet = excludeInternet;
  }


  public SimilarityViewSettings excludePublications(Boolean excludePublications) {
    
    this.excludePublications = excludePublications;
    return this;
  }

   /**
   * If set to true, text matched to the publications collection will not count as similar content 
   * @return excludePublications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If set to true, text matched to the publications collection will not count as similar content ")

  public Boolean getExcludePublications() {
    return excludePublications;
  }


  public void setExcludePublications(Boolean excludePublications) {
    this.excludePublications = excludePublications;
  }


  public SimilarityViewSettings excludeCrossref(Boolean excludeCrossref) {
    
    this.excludeCrossref = excludeCrossref;
    return this;
  }

   /**
   * If set to true, text matched to the Crossref collection will not count as similar content 
   * @return excludeCrossref
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If set to true, text matched to the Crossref collection will not count as similar content ")

  public Boolean getExcludeCrossref() {
    return excludeCrossref;
  }


  public void setExcludeCrossref(Boolean excludeCrossref) {
    this.excludeCrossref = excludeCrossref;
  }


  public SimilarityViewSettings excludeCrossrefPostedContent(Boolean excludeCrossrefPostedContent) {
    
    this.excludeCrossrefPostedContent = excludeCrossrefPostedContent;
    return this;
  }

   /**
   * If set to true, text matched to the Crossref Posted Content collection will not count as similar content 
   * @return excludeCrossrefPostedContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If set to true, text matched to the Crossref Posted Content collection will not count as similar content ")

  public Boolean getExcludeCrossrefPostedContent() {
    return excludeCrossrefPostedContent;
  }


  public void setExcludeCrossrefPostedContent(Boolean excludeCrossrefPostedContent) {
    this.excludeCrossrefPostedContent = excludeCrossrefPostedContent;
  }


  public SimilarityViewSettings excludeSubmittedWorks(Boolean excludeSubmittedWorks) {
    
    this.excludeSubmittedWorks = excludeSubmittedWorks;
    return this;
  }

   /**
   * If set to true, text matched to the submitted works collection will not count as similar content calculated as if submitted work was not part of the paper 
   * @return excludeSubmittedWorks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If set to true, text matched to the submitted works collection will not count as similar content calculated as if submitted work was not part of the paper ")

  public Boolean getExcludeSubmittedWorks() {
    return excludeSubmittedWorks;
  }


  public void setExcludeSubmittedWorks(Boolean excludeSubmittedWorks) {
    this.excludeSubmittedWorks = excludeSubmittedWorks;
  }


  public SimilarityViewSettings excludeCustomSections(Boolean excludeCustomSections) {
    
    this.excludeCustomSections = excludeCustomSections;
    return this;
  }

   /**
   * If set to true, text matched to the custom sections defined in the admin settings will not count as similar content calculated as if section was not part of the paper 
   * @return excludeCustomSections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If set to true, text matched to the custom sections defined in the admin settings will not count as similar content calculated as if section was not part of the paper ")

  public Boolean getExcludeCustomSections() {
    return excludeCustomSections;
  }


  public void setExcludeCustomSections(Boolean excludeCustomSections) {
    this.excludeCustomSections = excludeCustomSections;
  }


  public SimilarityViewSettings excludePreprints(Boolean excludePreprints) {
    
    this.excludePreprints = excludePreprints;
    return this;
  }

   /**
   * If set to true, it will exclude preprints. A preprint is a version of a scholarly or scientific paper that precedes formal peer review and publication in a peer-reviewed scholarly or scientific journal. 
   * @return excludePreprints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If set to true, it will exclude preprints. A preprint is a version of a scholarly or scientific paper that precedes formal peer review and publication in a peer-reviewed scholarly or scientific journal. ")

  public Boolean getExcludePreprints() {
    return excludePreprints;
  }


  public void setExcludePreprints(Boolean excludePreprints) {
    this.excludePreprints = excludePreprints;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimilarityViewSettings similarityViewSettings = (SimilarityViewSettings) o;
    return Objects.equals(this.excludeQuotes, similarityViewSettings.excludeQuotes) &&
        Objects.equals(this.excludeBibliography, similarityViewSettings.excludeBibliography) &&
        Objects.equals(this.excludeCitations, similarityViewSettings.excludeCitations) &&
        Objects.equals(this.excludeAbstract, similarityViewSettings.excludeAbstract) &&
        Objects.equals(this.excludeMethods, similarityViewSettings.excludeMethods) &&
        Objects.equals(this.excludeSmallMatches, similarityViewSettings.excludeSmallMatches) &&
        Objects.equals(this.excludeInternet, similarityViewSettings.excludeInternet) &&
        Objects.equals(this.excludePublications, similarityViewSettings.excludePublications) &&
        Objects.equals(this.excludeCrossref, similarityViewSettings.excludeCrossref) &&
        Objects.equals(this.excludeCrossrefPostedContent, similarityViewSettings.excludeCrossrefPostedContent) &&
        Objects.equals(this.excludeSubmittedWorks, similarityViewSettings.excludeSubmittedWorks) &&
        Objects.equals(this.excludeCustomSections, similarityViewSettings.excludeCustomSections) &&
        Objects.equals(this.excludePreprints, similarityViewSettings.excludePreprints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excludeQuotes, excludeBibliography, excludeCitations, excludeAbstract, excludeMethods, excludeSmallMatches, excludeInternet, excludePublications, excludeCrossref, excludeCrossrefPostedContent, excludeSubmittedWorks, excludeCustomSections, excludePreprints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimilarityViewSettings {\n");
    sb.append("    excludeQuotes: ").append(toIndentedString(excludeQuotes)).append("\n");
    sb.append("    excludeBibliography: ").append(toIndentedString(excludeBibliography)).append("\n");
    sb.append("    excludeCitations: ").append(toIndentedString(excludeCitations)).append("\n");
    sb.append("    excludeAbstract: ").append(toIndentedString(excludeAbstract)).append("\n");
    sb.append("    excludeMethods: ").append(toIndentedString(excludeMethods)).append("\n");
    sb.append("    excludeSmallMatches: ").append(toIndentedString(excludeSmallMatches)).append("\n");
    sb.append("    excludeInternet: ").append(toIndentedString(excludeInternet)).append("\n");
    sb.append("    excludePublications: ").append(toIndentedString(excludePublications)).append("\n");
    sb.append("    excludeCrossref: ").append(toIndentedString(excludeCrossref)).append("\n");
    sb.append("    excludeCrossrefPostedContent: ").append(toIndentedString(excludeCrossrefPostedContent)).append("\n");
    sb.append("    excludeSubmittedWorks: ").append(toIndentedString(excludeSubmittedWorks)).append("\n");
    sb.append("    excludeCustomSections: ").append(toIndentedString(excludeCustomSections)).append("\n");
    sb.append("    excludePreprints: ").append(toIndentedString(excludePreprints)).append("\n");
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


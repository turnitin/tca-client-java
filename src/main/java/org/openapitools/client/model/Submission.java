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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.SubmissionAllOf;
import org.threeten.bp.OffsetDateTime;

/**
 * Submission
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-26T18:42:10.874644Z[Etc/UTC]")
public class Submission {
  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  /**
   * the current status of the Submission
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    CREATED("CREATED"),
    
    PROCESSING("PROCESSING"),
    
    COMPLETED("COMPLETED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "content_type";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_PAGE_COUNT = "page_count";
  @SerializedName(SERIALIZED_NAME_PAGE_COUNT)
  private Integer pageCount;

  public static final String SERIALIZED_NAME_WORD_COUNT = "word_count";
  @SerializedName(SERIALIZED_NAME_WORD_COUNT)
  private Integer wordCount;

  public static final String SERIALIZED_NAME_CHARACTER_COUNT = "character_count";
  @SerializedName(SERIALIZED_NAME_CHARACTER_COUNT)
  private Integer characterCount;

  /**
   * an error code representing the type of error encountered (if applicable) 
   */
  @JsonAdapter(ErrorCodeEnum.Adapter.class)
  public enum ErrorCodeEnum {
    UNSUPPORTED_FILETYPE("UNSUPPORTED_FILETYPE"),
    
    PROCESSING_ERROR("PROCESSING_ERROR"),
    
    CANNOT_EXTRACT_TEXT("CANNOT_EXTRACT_TEXT"),
    
    TOO_LITTLE_TEXT("TOO_LITTLE_TEXT"),
    
    TOO_MUCH_TEXT("TOO_MUCH_TEXT"),
    
    TOO_MANY_PAGES("TOO_MANY_PAGES"),
    
    FILE_LOCKED("FILE_LOCKED"),
    
    CORRUPT_FILE("CORRUPT_FILE");

    private String value;

    ErrorCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ErrorCodeEnum fromValue(String value) {
      for (ErrorCodeEnum b : ErrorCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ErrorCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ErrorCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ErrorCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ErrorCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ERROR_CODE = "error_code";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private ErrorCodeEnum errorCode;

  public static final String SERIALIZED_NAME_CREATED_TIME = "created_time";
  @SerializedName(SERIALIZED_NAME_CREATED_TIME)
  private OffsetDateTime createdTime;

  /**
   * Gets or Sets capabilities
   */
  @JsonAdapter(CapabilitiesEnum.Adapter.class)
  public enum CapabilitiesEnum {
    INDEX("INDEX"),
    
    SIMILARITY("SIMILARITY"),
    
    VIEWER("VIEWER");

    private String value;

    CapabilitiesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CapabilitiesEnum fromValue(String value) {
      for (CapabilitiesEnum b : CapabilitiesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CapabilitiesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CapabilitiesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CapabilitiesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CapabilitiesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CAPABILITIES = "capabilities";
  @SerializedName(SERIALIZED_NAME_CAPABILITIES)
  private List<CapabilitiesEnum> capabilities = null;


  public Submission owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * the owner of the submission
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the owner of the submission")

  public String getOwner() {
    return owner;
  }


  public void setOwner(String owner) {
    this.owner = owner;
  }


  public Submission title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * the title of the submission
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the title of the submission")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public Submission status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * the current status of the Submission
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the current status of the Submission")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Submission id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * the unique ID of the submission
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the unique ID of the submission")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Submission contentType(String contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * the content type of the submission
   * @return contentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the content type of the submission")

  public String getContentType() {
    return contentType;
  }


  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public Submission pageCount(Integer pageCount) {
    
    this.pageCount = pageCount;
    return this;
  }

   /**
   * the number of pages in the submission
   * @return pageCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the number of pages in the submission")

  public Integer getPageCount() {
    return pageCount;
  }


  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }


  public Submission wordCount(Integer wordCount) {
    
    this.wordCount = wordCount;
    return this;
  }

   /**
   * the number of words in the submission
   * @return wordCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the number of words in the submission")

  public Integer getWordCount() {
    return wordCount;
  }


  public void setWordCount(Integer wordCount) {
    this.wordCount = wordCount;
  }


  public Submission characterCount(Integer characterCount) {
    
    this.characterCount = characterCount;
    return this;
  }

   /**
   * the number of characters in the submission
   * @return characterCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the number of characters in the submission")

  public Integer getCharacterCount() {
    return characterCount;
  }


  public void setCharacterCount(Integer characterCount) {
    this.characterCount = characterCount;
  }


  public Submission errorCode(ErrorCodeEnum errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * an error code representing the type of error encountered (if applicable) 
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "an error code representing the type of error encountered (if applicable) ")

  public ErrorCodeEnum getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
  }


  public Submission createdTime(OffsetDateTime createdTime) {
    
    this.createdTime = createdTime;
    return this;
  }

   /**
   * RFC3339 timestamp of when this submission was initially created. This is the time at which the POST to /submissions was made. 
   * @return createdTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RFC3339 timestamp of when this submission was initially created. This is the time at which the POST to /submissions was made. ")

  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }


  public void setCreatedTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
  }


  public Submission capabilities(List<CapabilitiesEnum> capabilities) {
    
    this.capabilities = capabilities;
    return this;
  }

  public Submission addCapabilitiesItem(CapabilitiesEnum capabilitiesItem) {
    if (this.capabilities == null) {
      this.capabilities = new ArrayList<CapabilitiesEnum>();
    }
    this.capabilities.add(capabilitiesItem);
    return this;
  }

   /**
   * Set of capabilities available to the current submission
   * @return capabilities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set of capabilities available to the current submission")

  public List<CapabilitiesEnum> getCapabilities() {
    return capabilities;
  }


  public void setCapabilities(List<CapabilitiesEnum> capabilities) {
    this.capabilities = capabilities;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Submission submission = (Submission) o;
    return Objects.equals(this.owner, submission.owner) &&
        Objects.equals(this.title, submission.title) &&
        Objects.equals(this.status, submission.status) &&
        Objects.equals(this.id, submission.id) &&
        Objects.equals(this.contentType, submission.contentType) &&
        Objects.equals(this.pageCount, submission.pageCount) &&
        Objects.equals(this.wordCount, submission.wordCount) &&
        Objects.equals(this.characterCount, submission.characterCount) &&
        Objects.equals(this.errorCode, submission.errorCode) &&
        Objects.equals(this.createdTime, submission.createdTime) &&
        Objects.equals(this.capabilities, submission.capabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, title, status, id, contentType, pageCount, wordCount, characterCount, errorCode, createdTime, capabilities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Submission {\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    wordCount: ").append(toIndentedString(wordCount)).append("\n");
    sb.append("    characterCount: ").append(toIndentedString(characterCount)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
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


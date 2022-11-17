/*
 * Turnitin Core API
 * Turnitin Core API (TCA) provides direct API access to the core functionality provided by Turnitin. TCA supports file submission, similarity report generation, group management, and visualization of report matches via Cloud Viewer or PDF download. Below is the full flow to successfully set up an integration scope, an API Key, and make calls to TCA. Integration Scope and API Key management is done via the Admin Console UI by logging in as an admin user. For more details, go to our [developer portal documentation page](https://developers.turnitin.com/docs). ## Integration Scope and API Key Management TCA API calls must provide an API Key for authentication, so you must first have at least one integration scope associated with at least one API Key to use TCA. ### Admin Console UI First, login to Admin Console UI as an *Admin* user with permission to create Integration Scopes, under a tenant that is licensed to use the TCA product Integration Scopes (you can create a new one, or add keys to existing)    * Click `Integrations` in the side bar --> `+ Add Integration` at top the top of the page --> Enter a name --> `Add` Button   API Keys   * Click `Integrations` in the side bar --> `Create API Key` Button next to a given Integration Scope -->   Enter a name --> click `Create and View button`   * Copy/Save the key manually or click save to clipboard button to copy it (this is the only time it will show)  ## TCA Flow    *  Register a webhook   *  Create a submission   *  Upload a file for the submission   *  Wait for the submission upload to process      * If you registered a webhook, a callback will be sent to it when upload is complete      * The status of the *submission* will also update to `COMPLETE`   *  Request a Similarity Report   *  Wait for similarity report to process      * If you registered a webhook, a callback will be sent to it when report is complete      * The status of the *report* will also be updated to `COMPLETE`   *  Request a URL with parameters to view the Similarity Report 
 *
 * The version of the OpenAPI document: 1.0.258
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
import java.io.IOException;
import org.openapitools.client.model.Eula;
import org.openapitools.client.model.SubmissionBaseMetadata;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * A Submission is the base object on which other services (such as similarity) are offered. In order to use other services a Submission must first be created and successfully process, then other service objects can be created. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-17T18:44:23.150387Z[Etc/UTC]")
public class SubmissionBase {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Object id = null;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  /**
   * Default viewer permission set, accepts INSTRUCTOR, LEARNER, EDITOR, USER, APPLICANT, ADMINISTRATOR, UNDEFINED
   */
  @JsonAdapter(OwnerDefaultPermissionSetEnum.Adapter.class)
  public enum OwnerDefaultPermissionSetEnum {
    INSTRUCTOR("INSTRUCTOR"),
    
    LEARNER("LEARNER"),
    
    EDITOR("EDITOR"),
    
    USER("USER"),
    
    APPLICANT("APPLICANT"),
    
    ADMINISTRATOR("ADMINISTRATOR"),
    
    UNDEFINED("UNDEFINED");

    private String value;

    OwnerDefaultPermissionSetEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OwnerDefaultPermissionSetEnum fromValue(String value) {
      for (OwnerDefaultPermissionSetEnum b : OwnerDefaultPermissionSetEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OwnerDefaultPermissionSetEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OwnerDefaultPermissionSetEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OwnerDefaultPermissionSetEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OwnerDefaultPermissionSetEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OWNER_DEFAULT_PERMISSION_SET = "owner_default_permission_set";
  @SerializedName(SERIALIZED_NAME_OWNER_DEFAULT_PERMISSION_SET)
  private OwnerDefaultPermissionSetEnum ownerDefaultPermissionSet;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_SUBMITTER = "submitter";
  @SerializedName(SERIALIZED_NAME_SUBMITTER)
  private String submitter;

  /**
   * Default submitter permission set, accepts INSTRUCTOR, LEARNER, EDITOR, USER, APPLICANT, ADMINISTRATOR, UNDEFINED
   */
  @JsonAdapter(SubmitterDefaultPermissionSetEnum.Adapter.class)
  public enum SubmitterDefaultPermissionSetEnum {
    INSTRUCTOR("INSTRUCTOR"),
    
    LEARNER("LEARNER"),
    
    EDITOR("EDITOR"),
    
    USER("USER"),
    
    APPLICANT("APPLICANT"),
    
    ADMINISTRATOR("ADMINISTRATOR"),
    
    UNDEFINED("UNDEFINED");

    private String value;

    SubmitterDefaultPermissionSetEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubmitterDefaultPermissionSetEnum fromValue(String value) {
      for (SubmitterDefaultPermissionSetEnum b : SubmitterDefaultPermissionSetEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SubmitterDefaultPermissionSetEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubmitterDefaultPermissionSetEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubmitterDefaultPermissionSetEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SubmitterDefaultPermissionSetEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SUBMITTER_DEFAULT_PERMISSION_SET = "submitter_default_permission_set";
  @SerializedName(SERIALIZED_NAME_SUBMITTER_DEFAULT_PERMISSION_SET)
  private SubmitterDefaultPermissionSetEnum submitterDefaultPermissionSet;

  public static final String SERIALIZED_NAME_EULA = "eula";
  @SerializedName(SERIALIZED_NAME_EULA)
  private Eula eula;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private SubmissionBaseMetadata metadata;

  public static final String SERIALIZED_NAME_EXTRACT_TEXT_ONLY = "extract_text_only";
  @SerializedName(SERIALIZED_NAME_EXTRACT_TEXT_ONLY)
  private Boolean extractTextOnly;

  public SubmissionBase() {
  }

  public SubmissionBase id(Object id) {
    
    this.id = id;
    return this;
  }

   /**
   * Submission id, optional field
   * @return id
  **/
  @javax.annotation.Nullable

  public Object getId() {
    return id;
  }


  public void setId(Object id) {
    this.id = id;
  }


  public SubmissionBase owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * ID of the owning user
   * @return owner
  **/
  @javax.annotation.Nullable

  public String getOwner() {
    return owner;
  }


  public void setOwner(String owner) {
    this.owner = owner;
  }


  public SubmissionBase ownerDefaultPermissionSet(OwnerDefaultPermissionSetEnum ownerDefaultPermissionSet) {
    
    this.ownerDefaultPermissionSet = ownerDefaultPermissionSet;
    return this;
  }

   /**
   * Default viewer permission set, accepts INSTRUCTOR, LEARNER, EDITOR, USER, APPLICANT, ADMINISTRATOR, UNDEFINED
   * @return ownerDefaultPermissionSet
  **/
  @javax.annotation.Nullable

  public OwnerDefaultPermissionSetEnum getOwnerDefaultPermissionSet() {
    return ownerDefaultPermissionSet;
  }


  public void setOwnerDefaultPermissionSet(OwnerDefaultPermissionSetEnum ownerDefaultPermissionSet) {
    this.ownerDefaultPermissionSet = ownerDefaultPermissionSet;
  }


  public SubmissionBase title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * the title of the submission
   * @return title
  **/
  @javax.annotation.Nullable

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public SubmissionBase submitter(String submitter) {
    
    this.submitter = submitter;
    return this;
  }

   /**
   * (optional) ID of the submitting user, if different from the owning user
   * @return submitter
  **/
  @javax.annotation.Nullable

  public String getSubmitter() {
    return submitter;
  }


  public void setSubmitter(String submitter) {
    this.submitter = submitter;
  }


  public SubmissionBase submitterDefaultPermissionSet(SubmitterDefaultPermissionSetEnum submitterDefaultPermissionSet) {
    
    this.submitterDefaultPermissionSet = submitterDefaultPermissionSet;
    return this;
  }

   /**
   * Default submitter permission set, accepts INSTRUCTOR, LEARNER, EDITOR, USER, APPLICANT, ADMINISTRATOR, UNDEFINED
   * @return submitterDefaultPermissionSet
  **/
  @javax.annotation.Nullable

  public SubmitterDefaultPermissionSetEnum getSubmitterDefaultPermissionSet() {
    return submitterDefaultPermissionSet;
  }


  public void setSubmitterDefaultPermissionSet(SubmitterDefaultPermissionSetEnum submitterDefaultPermissionSet) {
    this.submitterDefaultPermissionSet = submitterDefaultPermissionSet;
  }


  public SubmissionBase eula(Eula eula) {
    
    this.eula = eula;
    return this;
  }

   /**
   * Get eula
   * @return eula
  **/
  @javax.annotation.Nullable

  public Eula getEula() {
    return eula;
  }


  public void setEula(Eula eula) {
    this.eula = eula;
  }


  public SubmissionBase metadata(SubmissionBaseMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable

  public SubmissionBaseMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(SubmissionBaseMetadata metadata) {
    this.metadata = metadata;
  }


  public SubmissionBase extractTextOnly(Boolean extractTextOnly) {
    
    this.extractTextOnly = extractTextOnly;
    return this;
  }

   /**
   * (optional) indicates if the submission should be treated as a text only submission. A text only submission cannot generate full reports or be viewed in the viewer, but can use the index only endpoint to be indexed
   * @return extractTextOnly
  **/
  @javax.annotation.Nullable

  public Boolean getExtractTextOnly() {
    return extractTextOnly;
  }


  public void setExtractTextOnly(Boolean extractTextOnly) {
    this.extractTextOnly = extractTextOnly;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmissionBase submissionBase = (SubmissionBase) o;
    return Objects.equals(this.id, submissionBase.id) &&
        Objects.equals(this.owner, submissionBase.owner) &&
        Objects.equals(this.ownerDefaultPermissionSet, submissionBase.ownerDefaultPermissionSet) &&
        Objects.equals(this.title, submissionBase.title) &&
        Objects.equals(this.submitter, submissionBase.submitter) &&
        Objects.equals(this.submitterDefaultPermissionSet, submissionBase.submitterDefaultPermissionSet) &&
        Objects.equals(this.eula, submissionBase.eula) &&
        Objects.equals(this.metadata, submissionBase.metadata) &&
        Objects.equals(this.extractTextOnly, submissionBase.extractTextOnly);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, owner, ownerDefaultPermissionSet, title, submitter, submitterDefaultPermissionSet, eula, metadata, extractTextOnly);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionBase {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    ownerDefaultPermissionSet: ").append(toIndentedString(ownerDefaultPermissionSet)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    submitter: ").append(toIndentedString(submitter)).append("\n");
    sb.append("    submitterDefaultPermissionSet: ").append(toIndentedString(submitterDefaultPermissionSet)).append("\n");
    sb.append("    eula: ").append(toIndentedString(eula)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    extractTextOnly: ").append(toIndentedString(extractTextOnly)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("owner");
    openapiFields.add("owner_default_permission_set");
    openapiFields.add("title");
    openapiFields.add("submitter");
    openapiFields.add("submitter_default_permission_set");
    openapiFields.add("eula");
    openapiFields.add("metadata");
    openapiFields.add("extract_text_only");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubmissionBase
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SubmissionBase.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubmissionBase is not found in the empty JSON string", SubmissionBase.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SubmissionBase.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubmissionBase` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("owner") != null && !jsonObj.get("owner").isJsonNull()) && !jsonObj.get("owner").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner").toString()));
      }
      if ((jsonObj.get("owner_default_permission_set") != null && !jsonObj.get("owner_default_permission_set").isJsonNull()) && !jsonObj.get("owner_default_permission_set").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_default_permission_set` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner_default_permission_set").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("submitter") != null && !jsonObj.get("submitter").isJsonNull()) && !jsonObj.get("submitter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `submitter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("submitter").toString()));
      }
      if ((jsonObj.get("submitter_default_permission_set") != null && !jsonObj.get("submitter_default_permission_set").isJsonNull()) && !jsonObj.get("submitter_default_permission_set").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `submitter_default_permission_set` to be a primitive type in the JSON string but got `%s`", jsonObj.get("submitter_default_permission_set").toString()));
      }
      // validate the optional field `eula`
      if (jsonObj.get("eula") != null && !jsonObj.get("eula").isJsonNull()) {
        Eula.validateJsonObject(jsonObj.getAsJsonObject("eula"));
      }
      // validate the optional field `metadata`
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        SubmissionBaseMetadata.validateJsonObject(jsonObj.getAsJsonObject("metadata"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubmissionBase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubmissionBase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubmissionBase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubmissionBase.class));

       return (TypeAdapter<T>) new TypeAdapter<SubmissionBase>() {
           @Override
           public void write(JsonWriter out, SubmissionBase value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubmissionBase read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubmissionBase given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubmissionBase
  * @throws IOException if the JSON string is invalid with respect to SubmissionBase
  */
  public static SubmissionBase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubmissionBase.class);
  }

 /**
  * Convert an instance of SubmissionBase to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import org.openapitools.client.model.IndexingSettings;
import org.openapitools.client.model.SimilarityGenerationSettings;
import org.openapitools.client.model.SimilarityViewSettings;

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
 * SimilarityPutRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-17T18:44:23.150387Z[Etc/UTC]")
public class SimilarityPutRequest {
  public static final String SERIALIZED_NAME_INDEXING_SETTINGS = "indexing_settings";
  @SerializedName(SERIALIZED_NAME_INDEXING_SETTINGS)
  private IndexingSettings indexingSettings;

  public static final String SERIALIZED_NAME_GENERATION_SETTINGS = "generation_settings";
  @SerializedName(SERIALIZED_NAME_GENERATION_SETTINGS)
  private SimilarityGenerationSettings generationSettings;

  public static final String SERIALIZED_NAME_VIEW_SETTINGS = "view_settings";
  @SerializedName(SERIALIZED_NAME_VIEW_SETTINGS)
  private SimilarityViewSettings viewSettings;

  public SimilarityPutRequest() {
  }

  public SimilarityPutRequest indexingSettings(IndexingSettings indexingSettings) {
    
    this.indexingSettings = indexingSettings;
    return this;
  }

   /**
   * Get indexingSettings
   * @return indexingSettings
  **/
  @javax.annotation.Nullable

  public IndexingSettings getIndexingSettings() {
    return indexingSettings;
  }


  public void setIndexingSettings(IndexingSettings indexingSettings) {
    this.indexingSettings = indexingSettings;
  }


  public SimilarityPutRequest generationSettings(SimilarityGenerationSettings generationSettings) {
    
    this.generationSettings = generationSettings;
    return this;
  }

   /**
   * Get generationSettings
   * @return generationSettings
  **/
  @javax.annotation.Nonnull

  public SimilarityGenerationSettings getGenerationSettings() {
    return generationSettings;
  }


  public void setGenerationSettings(SimilarityGenerationSettings generationSettings) {
    this.generationSettings = generationSettings;
  }


  public SimilarityPutRequest viewSettings(SimilarityViewSettings viewSettings) {
    
    this.viewSettings = viewSettings;
    return this;
  }

   /**
   * Get viewSettings
   * @return viewSettings
  **/
  @javax.annotation.Nullable

  public SimilarityViewSettings getViewSettings() {
    return viewSettings;
  }


  public void setViewSettings(SimilarityViewSettings viewSettings) {
    this.viewSettings = viewSettings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimilarityPutRequest similarityPutRequest = (SimilarityPutRequest) o;
    return Objects.equals(this.indexingSettings, similarityPutRequest.indexingSettings) &&
        Objects.equals(this.generationSettings, similarityPutRequest.generationSettings) &&
        Objects.equals(this.viewSettings, similarityPutRequest.viewSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexingSettings, generationSettings, viewSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimilarityPutRequest {\n");
    sb.append("    indexingSettings: ").append(toIndentedString(indexingSettings)).append("\n");
    sb.append("    generationSettings: ").append(toIndentedString(generationSettings)).append("\n");
    sb.append("    viewSettings: ").append(toIndentedString(viewSettings)).append("\n");
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
    openapiFields.add("indexing_settings");
    openapiFields.add("generation_settings");
    openapiFields.add("view_settings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("generation_settings");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SimilarityPutRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SimilarityPutRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SimilarityPutRequest is not found in the empty JSON string", SimilarityPutRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SimilarityPutRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SimilarityPutRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SimilarityPutRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `indexing_settings`
      if (jsonObj.get("indexing_settings") != null && !jsonObj.get("indexing_settings").isJsonNull()) {
        IndexingSettings.validateJsonObject(jsonObj.getAsJsonObject("indexing_settings"));
      }
      // validate the required field `generation_settings`
      SimilarityGenerationSettings.validateJsonObject(jsonObj.getAsJsonObject("generation_settings"));
      // validate the optional field `view_settings`
      if (jsonObj.get("view_settings") != null && !jsonObj.get("view_settings").isJsonNull()) {
        SimilarityViewSettings.validateJsonObject(jsonObj.getAsJsonObject("view_settings"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SimilarityPutRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SimilarityPutRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SimilarityPutRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SimilarityPutRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SimilarityPutRequest>() {
           @Override
           public void write(JsonWriter out, SimilarityPutRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SimilarityPutRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SimilarityPutRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SimilarityPutRequest
  * @throws IOException if the JSON string is invalid with respect to SimilarityPutRequest
  */
  public static SimilarityPutRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SimilarityPutRequest.class);
  }

 /**
  * Convert an instance of SimilarityPutRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


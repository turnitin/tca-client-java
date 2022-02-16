/*
 * Turnitin Core API
 * Turnitin Core API (TCA) provides direct API access to the core functionality provided by Turnitin. TCA supports file submission, similarity report generation, group management, and visualization of report matches via Cloud Viewer or PDF download. Below is the full flow to successfully set up an integration scope, an API Key, and make calls to TCA. Integration Scope and API Key management is done via the Admin Console UI by logging in as an admin user. For more details, go to our [developer portal documentation page](https://developers.turnitin.com/docs). ## Integration Scope and API Key Management TCA API calls must provide an API Key for authentication, so you must first have at least one integration scope associated with at least one API Key to use TCA. ### Admin Console UI First, login to Admin Console UI as an *Admin* user with permission to create Integration Scopes, under a tenant that is licensed to use the TCA product Integration Scopes (you can create a new one, or add keys to existing)    * Click `Integrations` in the side bar --> `+ Add Integration` at top the top of the page --> Enter a name --> `Add` Button   API Keys   * Click `Integrations` in the side bar --> `Create API Key` Button next to a given Integration Scope -->   Enter a name --> click `Create and View button`   * Copy/Save the key manually or click save to clipboard button to copy it (this is the only time it will show)  ## TCA Flow    *  Register a webhook   *  Create a submission   *  Upload a file for the submission   *  Wait for the submission upload to process      * If you registered a webhook, a callback will be sent to it when upload is complete      * The status of the *submission* will also update to `COMPLETE`   *  Request a Similarity Report   *  Wait for similarity report to process      * If you registered a webhook, a callback will be sent to it when report is complete      * The status of the *report* will also be updated to `COMPLETE`   *  Request a URL with parameters to view the Similarity Report 
 *
 * The version of the OpenAPI document: 1.0.241
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
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * IndexStateSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-16T12:23:06.789415Z[Etc/UTC]")
public class IndexStateSettings {
  public static final String SERIALIZED_NAME_IS_INDEXED = "is_indexed";
  @SerializedName(SERIALIZED_NAME_IS_INDEXED)
  private Boolean isIndexed;

  public IndexStateSettings() { 
  }

  public IndexStateSettings isIndexed(Boolean isIndexed) {
    
    this.isIndexed = isIndexed;
    return this;
  }

   /**
   * If true, is_indexed displays the index state of submission. 
   * @return isIndexed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, is_indexed displays the index state of submission. ")

  public Boolean getIsIndexed() {
    return isIndexed;
  }


  public void setIsIndexed(Boolean isIndexed) {
    this.isIndexed = isIndexed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexStateSettings indexStateSettings = (IndexStateSettings) o;
    return Objects.equals(this.isIndexed, indexStateSettings.isIndexed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isIndexed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndexStateSettings {\n");
    sb.append("    isIndexed: ").append(toIndentedString(isIndexed)).append("\n");
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
    openapiFields.add("is_indexed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IndexStateSettings
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IndexStateSettings.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IndexStateSettings is not found in the empty JSON string", IndexStateSettings.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IndexStateSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IndexStateSettings` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IndexStateSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IndexStateSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IndexStateSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IndexStateSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<IndexStateSettings>() {
           @Override
           public void write(JsonWriter out, IndexStateSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IndexStateSettings read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IndexStateSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IndexStateSettings
  * @throws IOException if the JSON string is invalid with respect to IndexStateSettings
  */
  public static IndexStateSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IndexStateSettings.class);
  }

 /**
  * Convert an instance of IndexStateSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


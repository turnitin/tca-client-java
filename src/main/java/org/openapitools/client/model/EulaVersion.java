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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * EulaVersion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-18T14:13:09.743898-04:00[America/New_York]")
public class EulaVersion {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_VALID_FROM = "valid_from";
  @SerializedName(SERIALIZED_NAME_VALID_FROM)
  private OffsetDateTime validFrom;

  public static final String SERIALIZED_NAME_VALID_UNTIL = "valid_until";
  @SerializedName(SERIALIZED_NAME_VALID_UNTIL)
  private OffsetDateTime validUntil;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  /**
   * Gets or Sets availableLanguages
   */
  @JsonAdapter(AvailableLanguagesEnum.Adapter.class)
  public enum AvailableLanguagesEnum {
    AR_SA("ar-SA"),
    
    CS_CZ("cs-CZ"),
    
    DA_DK("da-DK"),
    
    DE_DE("de-DE"),
    
    EL_GR("el-GR"),
    
    EN_US("en-US"),
    
    ES_MX("es-MX"),
    
    FI_FI("fi-FI"),
    
    FR_FR("fr-FR"),
    
    IT_IT("it-IT"),
    
    JA_JP("ja-JP"),
    
    KO_KR("ko-KR"),
    
    NB_NO("nb-NO"),
    
    NL_NL("nl-NL"),
    
    PL_PL("pl-PL"),
    
    PT_BR("pt-BR"),
    
    RO_RO("ro-RO"),
    
    RU_RU("ru-RU"),
    
    SV_SE("sv-SE"),
    
    TR_TR("tr-TR"),
    
    VI_VN("vi-VN"),
    
    ZH_CN("zh-CN"),
    
    ZH_TW("zh-TW");

    private String value;

    AvailableLanguagesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AvailableLanguagesEnum fromValue(String value) {
      for (AvailableLanguagesEnum b : AvailableLanguagesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AvailableLanguagesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AvailableLanguagesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AvailableLanguagesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AvailableLanguagesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AVAILABLE_LANGUAGES = "available_languages";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_LANGUAGES)
  private List<AvailableLanguagesEnum> availableLanguages = null;


  public EulaVersion version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * The unique name of the EULA Version 
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique name of the EULA Version ")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public EulaVersion validFrom(OffsetDateTime validFrom) {
    
    this.validFrom = validFrom;
    return this;
  }

   /**
   * The starting date indicating when acceptence of this EULA is considered valid 
   * @return validFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The starting date indicating when acceptence of this EULA is considered valid ")

  public OffsetDateTime getValidFrom() {
    return validFrom;
  }


  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }


  public EulaVersion validUntil(OffsetDateTime validUntil) {
    
    this.validUntil = validUntil;
    return this;
  }

   /**
   * The ending date indicating when acceptence of this EULA is no longer valid 
   * @return validUntil
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ending date indicating when acceptence of this EULA is no longer valid ")

  public OffsetDateTime getValidUntil() {
    return validUntil;
  }


  public void setValidUntil(OffsetDateTime validUntil) {
    this.validUntil = validUntil;
  }


  public EulaVersion url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The url where the corresponding EULA page can be found 
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The url where the corresponding EULA page can be found ")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public EulaVersion availableLanguages(List<AvailableLanguagesEnum> availableLanguages) {
    
    this.availableLanguages = availableLanguages;
    return this;
  }

  public EulaVersion addAvailableLanguagesItem(AvailableLanguagesEnum availableLanguagesItem) {
    if (this.availableLanguages == null) {
      this.availableLanguages = new ArrayList<AvailableLanguagesEnum>();
    }
    this.availableLanguages.add(availableLanguagesItem);
    return this;
  }

   /**
   * The languages (instances) of this version. 21 language locales are currently supported. 
   * @return availableLanguages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The languages (instances) of this version. 21 language locales are currently supported. ")

  public List<AvailableLanguagesEnum> getAvailableLanguages() {
    return availableLanguages;
  }


  public void setAvailableLanguages(List<AvailableLanguagesEnum> availableLanguages) {
    this.availableLanguages = availableLanguages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EulaVersion eulaVersion = (EulaVersion) o;
    return Objects.equals(this.version, eulaVersion.version) &&
        Objects.equals(this.validFrom, eulaVersion.validFrom) &&
        Objects.equals(this.validUntil, eulaVersion.validUntil) &&
        Objects.equals(this.url, eulaVersion.url) &&
        Objects.equals(this.availableLanguages, eulaVersion.availableLanguages);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && a.get().getClass().isArray() ? Arrays.equals((T[])a.get(), (T[])b.get()) : Objects.equals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, validFrom, validUntil, url, availableLanguages);
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
    sb.append("class EulaVersion {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    availableLanguages: ").append(toIndentedString(availableLanguages)).append("\n");
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


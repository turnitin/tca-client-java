# EulaApi

All URIs are relative to *https://app-us.turnitin.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**eulaVersionIdAcceptPost**](EulaApi.md#eulaVersionIdAcceptPost) | **POST** /eula/{version_id}/accept | Accepts a particular EULA version on behalf of an external user |
| [**eulaVersionIdAcceptUserIdGet**](EulaApi.md#eulaVersionIdAcceptUserIdGet) | **GET** /eula/{version_id}/accept/{user_id} | Queries the acceptences of a particular EULA version on behalf of an external user |
| [**eulaVersionIdGet**](EulaApi.md#eulaVersionIdGet) | **GET** /eula/{version_id} | Gets information about a particular EULA version |
| [**eulaVersionIdViewGet**](EulaApi.md#eulaVersionIdViewGet) | **GET** /eula/{version_id}/view | Gets the text of a particular EULA version |


<a name="eulaVersionIdAcceptPost"></a>
# **eulaVersionIdAcceptPost**
> EulaAcceptListItem eulaVersionIdAcceptPost(xTurnitinIntegrationName, xTurnitinIntegrationVersion, versionId, data)

Accepts a particular EULA version on behalf of an external user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EulaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app-us.turnitin.com/api/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    EulaApi apiInstance = new EulaApi(defaultClient);
    String xTurnitinIntegrationName = "myintegration"; // String | a human readable string representing the type of integration being used
    String xTurnitinIntegrationVersion = "v1.0.2"; // String | the version of the integration platform being used
    String versionId = "latest"; // String | The EULA version ID (or `latest`) 
    EulaAcceptRequest data = new EulaAcceptRequest(); // EulaAcceptRequest | 
    try {
      EulaAcceptListItem result = apiInstance.eulaVersionIdAcceptPost(xTurnitinIntegrationName, xTurnitinIntegrationVersion, versionId, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EulaApi#eulaVersionIdAcceptPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xTurnitinIntegrationName** | **String**| a human readable string representing the type of integration being used | |
| **xTurnitinIntegrationVersion** | **String**| the version of the integration platform being used | |
| **versionId** | **String**| The EULA version ID (or &#x60;latest&#x60;)  | |
| **data** | [**EulaAcceptRequest**](EulaAcceptRequest.md)|  | |

### Return type

[**EulaAcceptListItem**](EulaAcceptListItem.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A EULA acceptence response |  -  |
| **400** | Request is malformed or missing required data |  -  |
| **403** | Not properly authenticated |  -  |
| **429** | Too many requests have been made in a short amount of time, please wait for a bit a try again.  |  -  |
| **0** | An Error Occurred |  -  |

<a name="eulaVersionIdAcceptUserIdGet"></a>
# **eulaVersionIdAcceptUserIdGet**
> List&lt;EulaAcceptListItem&gt; eulaVersionIdAcceptUserIdGet(xTurnitinIntegrationName, xTurnitinIntegrationVersion, versionId, userId)

Queries the acceptences of a particular EULA version on behalf of an external user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EulaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app-us.turnitin.com/api/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    EulaApi apiInstance = new EulaApi(defaultClient);
    String xTurnitinIntegrationName = "myintegration"; // String | a human readable string representing the type of integration being used
    String xTurnitinIntegrationVersion = "v1.0.2"; // String | the version of the integration platform being used
    String versionId = "latest"; // String | The EULA version ID (or `latest`) 
    String userId = "userId_example"; // String | The user associated with the EULA status 
    try {
      List<EulaAcceptListItem> result = apiInstance.eulaVersionIdAcceptUserIdGet(xTurnitinIntegrationName, xTurnitinIntegrationVersion, versionId, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EulaApi#eulaVersionIdAcceptUserIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xTurnitinIntegrationName** | **String**| a human readable string representing the type of integration being used | |
| **xTurnitinIntegrationVersion** | **String**| the version of the integration platform being used | |
| **versionId** | **String**| The EULA version ID (or &#x60;latest&#x60;)  | |
| **userId** | **String**| The user associated with the EULA status  | |

### Return type

[**List&lt;EulaAcceptListItem&gt;**](EulaAcceptListItem.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of EULA acceptence responses for the specified version (one per language) |  -  |
| **400** | Request is malformed or missing required data |  -  |
| **403** | Not properly authenticated |  -  |
| **429** | Too many requests have been made in a short amount of time, please wait for a bit a try again.  |  -  |
| **0** | An Error Occurred |  -  |

<a name="eulaVersionIdGet"></a>
# **eulaVersionIdGet**
> EulaVersion eulaVersionIdGet(xTurnitinIntegrationName, xTurnitinIntegrationVersion, versionId, lang)

Gets information about a particular EULA version

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EulaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app-us.turnitin.com/api/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    EulaApi apiInstance = new EulaApi(defaultClient);
    String xTurnitinIntegrationName = "myintegration"; // String | a human readable string representing the type of integration being used
    String xTurnitinIntegrationVersion = "v1.0.2"; // String | the version of the integration platform being used
    String versionId = "latest"; // String | The EULA version ID (or `latest`) 
    String lang = "en-US"; // String | The desired language of the specified EULA version
    try {
      EulaVersion result = apiInstance.eulaVersionIdGet(xTurnitinIntegrationName, xTurnitinIntegrationVersion, versionId, lang);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EulaApi#eulaVersionIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xTurnitinIntegrationName** | **String**| a human readable string representing the type of integration being used | |
| **xTurnitinIntegrationVersion** | **String**| the version of the integration platform being used | |
| **versionId** | **String**| The EULA version ID (or &#x60;latest&#x60;)  | |
| **lang** | **String**| The desired language of the specified EULA version | [optional] |

### Return type

[**EulaVersion**](EulaVersion.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Version data. A null value for valid_until indicates no expiration of the EULA version |  -  |
| **400** | Request is malformed or missing required data |  -  |
| **403** | Not properly authenticated |  -  |
| **429** | Too many requests have been made in a short amount of time, please wait for a bit a try again.  |  -  |
| **0** | An Error Occurred |  -  |

<a name="eulaVersionIdViewGet"></a>
# **eulaVersionIdViewGet**
> String eulaVersionIdViewGet(xTurnitinIntegrationName, xTurnitinIntegrationVersion, versionId, lang)

Gets the text of a particular EULA version

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EulaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app-us.turnitin.com/api/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    EulaApi apiInstance = new EulaApi(defaultClient);
    String xTurnitinIntegrationName = "myintegration"; // String | a human readable string representing the type of integration being used
    String xTurnitinIntegrationVersion = "v1.0.2"; // String | the version of the integration platform being used
    String versionId = "latest"; // String | The EULA version ID (or `latest`) 
    String lang = "en-US"; // String | The desired language of the specified EULA version
    try {
      String result = apiInstance.eulaVersionIdViewGet(xTurnitinIntegrationName, xTurnitinIntegrationVersion, versionId, lang);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EulaApi#eulaVersionIdViewGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xTurnitinIntegrationName** | **String**| a human readable string representing the type of integration being used | |
| **xTurnitinIntegrationVersion** | **String**| the version of the integration platform being used | |
| **versionId** | **String**| The EULA version ID (or &#x60;latest&#x60;)  | |
| **lang** | **String**| The desired language of the specified EULA version | [optional] |

### Return type

**String**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain; charset=utf-8, application/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | HTML Text of the desired EULA version |  -  |
| **400** | Request is malformed or missing required data |  -  |
| **403** | Not properly authenticated |  -  |
| **429** | Too many requests have been made in a short amount of time, please wait for a bit a try again.  |  -  |
| **0** | An Error Occurred |  -  |


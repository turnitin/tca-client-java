# IndexApi

All URIs are relative to *https://app-us.turnitin.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getIndexStatus**](IndexApi.md#getIndexStatus) | **GET** /submissions/{id}/index | Return index state of submission |
| [**indexSubmission**](IndexApi.md#indexSubmission) | **PUT** /submissions/{id}/index | Index and return index state of submission |


<a name="getIndexStatus"></a>
# **getIndexStatus**
> IndexStateSettings getIndexStatus(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id)

Return index state of submission

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IndexApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app-us.turnitin.com/api/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    IndexApi apiInstance = new IndexApi(defaultClient);
    String xTurnitinIntegrationName = "myintegration"; // String | a human readable string representing the type of integration being used
    String xTurnitinIntegrationVersion = "v1.0.2"; // String | the version of the integration platform being used
    String id = "id_example"; // String | The Submission ID (returned upon a successful POST to /submissions) 
    try {
      IndexStateSettings result = apiInstance.getIndexStatus(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IndexApi#getIndexStatus");
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
| **id** | **String**| The Submission ID (returned upon a successful POST to /submissions)  | |

### Return type

[**IndexStateSettings**](IndexStateSettings.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Index state of submission |  -  |
| **400** | Request is malformed or missing required data |  -  |
| **403** | Submission has not been completed yet |  -  |
| **0** | An Error Occurred |  -  |

<a name="indexSubmission"></a>
# **indexSubmission**
> IndexStateSettings indexSubmission(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id, asynchronous)

Index and return index state of submission

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IndexApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app-us.turnitin.com/api/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    IndexApi apiInstance = new IndexApi(defaultClient);
    String xTurnitinIntegrationName = "myintegration"; // String | a human readable string representing the type of integration being used
    String xTurnitinIntegrationVersion = "v1.0.2"; // String | the version of the integration platform being used
    String id = "id_example"; // String | The Submission ID (returned upon a successful POST to /submissions) 
    Boolean asynchronous = true; // Boolean | asynchronous request
    try {
      IndexStateSettings result = apiInstance.indexSubmission(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id, asynchronous);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IndexApi#indexSubmission");
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
| **id** | **String**| The Submission ID (returned upon a successful POST to /submissions)  | |
| **asynchronous** | **Boolean**| asynchronous request | [optional] |

### Return type

[**IndexStateSettings**](IndexStateSettings.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully indexed submission |  -  |
| **400** | Request is malformed or missing required data |  -  |
| **403** | Not properly authenticated |  -  |
| **429** | Too many requests have been made in a short amount of time, please wait for a bit a try again.  |  -  |
| **0** | An Error Occurred |  -  |


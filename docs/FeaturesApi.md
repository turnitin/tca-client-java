# FeaturesApi

All URIs are relative to *https://app-us.turnitin.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**featuresEnabledGet**](FeaturesApi.md#featuresEnabledGet) | **GET** /features-enabled | Get information about what features are allowed by the current license |


<a name="featuresEnabledGet"></a>
# **featuresEnabledGet**
> FeaturesEnabled featuresEnabledGet(xTurnitinIntegrationName, xTurnitinIntegrationVersion)

Get information about what features are allowed by the current license

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FeaturesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app-us.turnitin.com/api/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    FeaturesApi apiInstance = new FeaturesApi(defaultClient);
    String xTurnitinIntegrationName = "myintegration"; // String | a human readable string representing the type of integration being used
    String xTurnitinIntegrationVersion = "v1.0.2"; // String | the version of the integration platform being used
    try {
      FeaturesEnabled result = apiInstance.featuresEnabledGet(xTurnitinIntegrationName, xTurnitinIntegrationVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeaturesApi#featuresEnabledGet");
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

### Return type

[**FeaturesEnabled**](FeaturesEnabled.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of available features |  -  |
| **403** | Not properly authenticated |  -  |
| **429** | Too many requests have been made in a short amount of time, please wait for a bit a try again.  |  -  |
| **0** | An Error Occurred |  -  |


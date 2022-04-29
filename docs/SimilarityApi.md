# SimilarityApi

All URIs are relative to *https://app-us.turnitin.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadSimilarityReportPdf**](SimilarityApi.md#downloadSimilarityReportPdf) | **GET** /submissions/{id}/similarity/pdf/{pdf_id} | GET download pdf |
| [**getSimilarityReportPdfStatus**](SimilarityApi.md#getSimilarityReportPdfStatus) | **GET** /submissions/{id}/similarity/pdf/{pdf_id}/status | GET pdf download status |
| [**getSimilarityReportResults**](SimilarityApi.md#getSimilarityReportResults) | **GET** /submissions/{id}/similarity | Get Similarity Report Results |
| [**getSimilarityReportUrl**](SimilarityApi.md#getSimilarityReportUrl) | **POST** /submissions/{id}/viewer-url | Returns a URL to access Cloud Viewer |
| [**requestSimilarityReport**](SimilarityApi.md#requestSimilarityReport) | **PUT** /submissions/{id}/similarity | Request Similarity Report generation |
| [**requestSimilarityReportPdf**](SimilarityApi.md#requestSimilarityReportPdf) | **POST** /submissions/{id}/similarity/pdf | Request Pdf download and returns the Pdf Id |


<a name="downloadSimilarityReportPdf"></a>
# **downloadSimilarityReportPdf**
> File downloadSimilarityReportPdf(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id, pdfId)

GET download pdf

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SimilarityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app-us.turnitin.com/api/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    SimilarityApi apiInstance = new SimilarityApi(defaultClient);
    String xTurnitinIntegrationName = "myintegration"; // String | a human readable string representing the type of integration being used
    String xTurnitinIntegrationVersion = "v1.0.2"; // String | the version of the integration platform being used
    String id = "id_example"; // String | The Submission ID (returned upon a successful POST to /submissions) 
    String pdfId = "pdfId_example"; // String | The Pdf ID (returned upon a successful POST to /submissions/{submission_id}/similarity/pdf) 
    try {
      File result = apiInstance.downloadSimilarityReportPdf(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id, pdfId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimilarityApi#downloadSimilarityReportPdf");
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
| **pdfId** | **String**| The Pdf ID (returned upon a successful POST to /submissions/{submission_id}/similarity/pdf)  | |

### Return type

[**File**](File.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | StreamingResponseBody, Pdf binary |  -  |
| **202** | Status message indicating processing status for requested PDF  |  -  |
| **400** | Request is malformed or missing required data |  -  |
| **403** | Not properly authenticated |  -  |
| **404** | Submission not found for {id} or Pdf not found |  -  |
| **409** | A Similarity Report is already generating for this submission or Failed to generate PDF |  -  |
| **429** | Too many requests have been made in a short amount of time, please wait for a bit a try again.  |  -  |
| **0** | An Error Occurred |  -  |

<a name="getSimilarityReportPdfStatus"></a>
# **getSimilarityReportPdfStatus**
> PdfStatusResponse getSimilarityReportPdfStatus(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id, pdfId)

GET pdf download status

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SimilarityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app-us.turnitin.com/api/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    SimilarityApi apiInstance = new SimilarityApi(defaultClient);
    String xTurnitinIntegrationName = "myintegration"; // String | a human readable string representing the type of integration being used
    String xTurnitinIntegrationVersion = "v1.0.2"; // String | the version of the integration platform being used
    String id = "id_example"; // String | The Submission ID (returned upon a successful POST to /submissions) 
    String pdfId = "pdfId_example"; // String | The Pdf ID (returned upon a successful POST to /submissions/{submission_id}/similarity/pdf) 
    try {
      PdfStatusResponse result = apiInstance.getSimilarityReportPdfStatus(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id, pdfId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimilarityApi#getSimilarityReportPdfStatus");
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
| **pdfId** | **String**| The Pdf ID (returned upon a successful POST to /submissions/{submission_id}/similarity/pdf)  | |

### Return type

[**PdfStatusResponse**](PdfStatusResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Status message indicating processing status for requested PDF  |  -  |
| **202** | Status message indicating processing status for requested PDF  |  -  |
| **400** | Request is malformed or missing required data |  -  |
| **403** | Not properly authenticated |  -  |
| **404** | Submission not found for {id} or Pdf not found |  -  |
| **409** | A Similarity Report is already generating for this submission or Failed to generate PDF |  -  |
| **429** | Too many requests have been made in a short amount of time, please wait for a bit a try again.  |  -  |
| **0** | An Error Occurred |  -  |

<a name="getSimilarityReportResults"></a>
# **getSimilarityReportResults**
> SimilarityMetadata getSimilarityReportResults(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id)

Get Similarity Report Results

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SimilarityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app-us.turnitin.com/api/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    SimilarityApi apiInstance = new SimilarityApi(defaultClient);
    String xTurnitinIntegrationName = "myintegration"; // String | a human readable string representing the type of integration being used
    String xTurnitinIntegrationVersion = "v1.0.2"; // String | the version of the integration platform being used
    String id = "id_example"; // String | The Submission ID (returned upon a successful POST to /submissions) 
    try {
      SimilarityMetadata result = apiInstance.getSimilarityReportResults(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimilarityApi#getSimilarityReportResults");
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

[**SimilarityMetadata**](SimilarityMetadata.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved Similarity info |  -  |
| **400** | Request is malformed or missing required data |  -  |
| **403** | Not properly authenticated |  -  |
| **429** | Too many requests have been made in a short amount of time, please wait for a bit a try again.  |  -  |
| **0** | An Error Occurred |  -  |

<a name="getSimilarityReportUrl"></a>
# **getSimilarityReportUrl**
> SimilarityViewerUrlResponse getSimilarityReportUrl(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id, data)

Returns a URL to access Cloud Viewer

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SimilarityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app-us.turnitin.com/api/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    SimilarityApi apiInstance = new SimilarityApi(defaultClient);
    String xTurnitinIntegrationName = "myintegration"; // String | a human readable string representing the type of integration being used
    String xTurnitinIntegrationVersion = "v1.0.2"; // String | the version of the integration platform being used
    String id = "id_example"; // String | The Submission ID (returned upon a successful POST to /submissions) 
    SimilarityViewerUrlSettings data = new SimilarityViewerUrlSettings(); // SimilarityViewerUrlSettings | 
    try {
      SimilarityViewerUrlResponse result = apiInstance.getSimilarityReportUrl(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimilarityApi#getSimilarityReportUrl");
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
| **data** | [**SimilarityViewerUrlSettings**](SimilarityViewerUrlSettings.md)|  | |

### Return type

[**SimilarityViewerUrlResponse**](SimilarityViewerUrlResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success message indicating URL for launching similarity report  |  -  |
| **400** | Request is malformed or missing required data |  -  |
| **403** | Not properly authenticated |  -  |
| **429** | Too many requests have been made in a short amount of time, please wait for a bit a try again.  |  -  |
| **0** | An Error Occurred |  -  |

<a name="requestSimilarityReport"></a>
# **requestSimilarityReport**
> SuccessMessage requestSimilarityReport(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id, data)

Request Similarity Report generation

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SimilarityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app-us.turnitin.com/api/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    SimilarityApi apiInstance = new SimilarityApi(defaultClient);
    String xTurnitinIntegrationName = "myintegration"; // String | a human readable string representing the type of integration being used
    String xTurnitinIntegrationVersion = "v1.0.2"; // String | the version of the integration platform being used
    String id = "id_example"; // String | The Submission ID (returned upon a successful POST to /submissions) 
    SimilarityPutRequest data = new SimilarityPutRequest(); // SimilarityPutRequest | 
    try {
      SuccessMessage result = apiInstance.requestSimilarityReport(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimilarityApi#requestSimilarityReport");
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
| **data** | [**SimilarityPutRequest**](SimilarityPutRequest.md)|  | |

### Return type

[**SuccessMessage**](SuccessMessage.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Success message indicating successful scheduling of Similarity Report generation  |  -  |
| **400** | Request is malformed or missing required data |  -  |
| **403** | Not properly authenticated |  -  |
| **429** | Too many requests have been made in a short amount of time, please wait for a bit a try again.  |  -  |
| **0** | An Error Occurred |  -  |

<a name="requestSimilarityReportPdf"></a>
# **requestSimilarityReportPdf**
> RequestPdfResponse requestSimilarityReportPdf(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id)

Request Pdf download and returns the Pdf Id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SimilarityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app-us.turnitin.com/api/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    SimilarityApi apiInstance = new SimilarityApi(defaultClient);
    String xTurnitinIntegrationName = "myintegration"; // String | a human readable string representing the type of integration being used
    String xTurnitinIntegrationVersion = "v1.0.2"; // String | the version of the integration platform being used
    String id = "id_example"; // String | The Submission ID (returned upon a successful POST to /submissions) 
    try {
      RequestPdfResponse result = apiInstance.requestSimilarityReportPdf(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimilarityApi#requestSimilarityReportPdf");
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

[**RequestPdfResponse**](RequestPdfResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success message indicating ID for the PDF generation request  |  -  |
| **400** | Request is malformed or missing required data |  -  |
| **403** | Not properly authenticated |  -  |
| **404** | Submission not found for {id} |  -  |
| **409** | A Similarity Report is already generating for this submission |  -  |
| **429** | Too many requests have been made in a short amount of time, please wait for a bit a try again.  |  -  |
| **0** | An Error Occurred |  -  |


# SubmissionApi

All URIs are relative to *https://app-us.turnitin.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSubmission**](SubmissionApi.md#createSubmission) | **POST** /submissions | Create a new Submission |
| [**deleteSubmission**](SubmissionApi.md#deleteSubmission) | **DELETE** /submissions/{id} | Deletes a submission and associated similarity report. |
| [**getSubmiddionDetails**](SubmissionApi.md#getSubmiddionDetails) | **GET** /submissions/{id} | Get Submission Details |
| [**recoverSubmission**](SubmissionApi.md#recoverSubmission) | **PUT** /submissions/{id}/recover | Recover a soft deleted submission |
| [**uploadSubmittedFile**](SubmissionApi.md#uploadSubmittedFile) | **PUT** /submissions/{id}/original | Upload Submitted File |


<a name="createSubmission"></a>
# **createSubmission**
> SimpleSubmissionResponse createSubmission(xTurnitinIntegrationName, xTurnitinIntegrationVersion, data)

Create a new Submission

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubmissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app-us.turnitin.com/api/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    SubmissionApi apiInstance = new SubmissionApi(defaultClient);
    String xTurnitinIntegrationName = "myintegration"; // String | a human readable string representing the type of integration being used
    String xTurnitinIntegrationVersion = "v1.0.2"; // String | the version of the integration platform being used
    SubmissionBase data = new SubmissionBase(); // SubmissionBase | 
    try {
      SimpleSubmissionResponse result = apiInstance.createSubmission(xTurnitinIntegrationName, xTurnitinIntegrationVersion, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubmissionApi#createSubmission");
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
| **data** | [**SubmissionBase**](SubmissionBase.md)|  | |

### Return type

[**SimpleSubmissionResponse**](SimpleSubmissionResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Submission successfully created |  -  |
| **400** | Request is malformed or missing required data |  -  |
| **403** | Not properly authenticated |  -  |
| **429** | Too many requests have been made in a short amount of time, please wait for a bit a try again.  |  -  |
| **0** | An Error Occurred |  -  |

<a name="deleteSubmission"></a>
# **deleteSubmission**
> SuccessMessage deleteSubmission(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id, hard)

Deletes a submission and associated similarity report.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubmissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app-us.turnitin.com/api/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    SubmissionApi apiInstance = new SubmissionApi(defaultClient);
    String xTurnitinIntegrationName = "myintegration"; // String | a human readable string representing the type of integration being used
    String xTurnitinIntegrationVersion = "v1.0.2"; // String | the version of the integration platform being used
    String id = "id_example"; // String | The Submission ID (returned upon a successful POST to /submissions) 
    String hard = "false"; // String | Accepts true or false indicating either hard or soft delete. A soft delete removes the associated submission report/index and changes the saved submission state to DELETED. A hard deletion completely removes the submission information from Panda and TCA and removes the associated report/index, which can not be recovered. 
    try {
      SuccessMessage result = apiInstance.deleteSubmission(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id, hard);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubmissionApi#deleteSubmission");
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
| **hard** | **String**| Accepts true or false indicating either hard or soft delete. A soft delete removes the associated submission report/index and changes the saved submission state to DELETED. A hard deletion completely removes the submission information from Panda and TCA and removes the associated report/index, which can not be recovered.  | [optional] [default to false] |

### Return type

[**SuccessMessage**](SuccessMessage.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success message indicating successful Delete request for a submission  |  -  |
| **403** | Not properly authenticated |  -  |
| **404** | Submission not found for {id} |  -  |
| **409** | Deletion error |  -  |
| **0** | An Error Occurred |  -  |

<a name="getSubmiddionDetails"></a>
# **getSubmiddionDetails**
> Submission getSubmiddionDetails(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id)

Get Submission Details

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubmissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app-us.turnitin.com/api/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    SubmissionApi apiInstance = new SubmissionApi(defaultClient);
    String xTurnitinIntegrationName = "myintegration"; // String | a human readable string representing the type of integration being used
    String xTurnitinIntegrationVersion = "v1.0.2"; // String | the version of the integration platform being used
    String id = "id_example"; // String | The Submission ID (returned upon a successful POST to /submissions) 
    try {
      Submission result = apiInstance.getSubmiddionDetails(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubmissionApi#getSubmiddionDetails");
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

[**Submission**](Submission.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved Submission |  -  |
| **400** | Request is malformed or missing required data |  -  |
| **403** | Not properly authenticated |  -  |
| **429** | Too many requests have been made in a short amount of time, please wait for a bit a try again.  |  -  |
| **0** | An Error Occurred |  -  |

<a name="recoverSubmission"></a>
# **recoverSubmission**
> SimpleSubmissionResponse recoverSubmission(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id)

Recover a soft deleted submission

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubmissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app-us.turnitin.com/api/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    SubmissionApi apiInstance = new SubmissionApi(defaultClient);
    String xTurnitinIntegrationName = "myintegration"; // String | a human readable string representing the type of integration being used
    String xTurnitinIntegrationVersion = "v1.0.2"; // String | the version of the integration platform being used
    String id = "id_example"; // String | The Submission ID (returned upon a successful POST to /submissions) 
    try {
      SimpleSubmissionResponse result = apiInstance.recoverSubmission(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubmissionApi#recoverSubmission");
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

[**SimpleSubmissionResponse**](SimpleSubmissionResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully recovered Submission |  -  |
| **400** | Request is malformed or missing required data |  -  |
| **403** | Not properly authenticated |  -  |
| **429** | Too many requests have been made in a short amount of time, please wait for a bit a try again.  |  -  |
| **0** | An Error Occurred |  -  |

<a name="uploadSubmittedFile"></a>
# **uploadSubmittedFile**
> SuccessMessage uploadSubmittedFile(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id, contentType, contentDisposition, _file)

Upload Submitted File

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubmissionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app-us.turnitin.com/api/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    SubmissionApi apiInstance = new SubmissionApi(defaultClient);
    String xTurnitinIntegrationName = "myintegration"; // String | a human readable string representing the type of integration being used
    String xTurnitinIntegrationVersion = "v1.0.2"; // String | the version of the integration platform being used
    String id = "id_example"; // String | The Submission ID (returned upon a successful POST to /submissions) 
    String contentType = "contentType_example"; // String | *Must be 'binary/octet-stream' 
    String contentDisposition = "inline; filename=\"MyFile.docx\""; // String | *must include the \"filename\" parameter, e.g. `inline; filename=\"MyFile.docx\"`. To support UTF-8 filenames, you must URL encode the header 
    Object _file = null; // Object | the user's submitted file
    try {
      SuccessMessage result = apiInstance.uploadSubmittedFile(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id, contentType, contentDisposition, _file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubmissionApi#uploadSubmittedFile");
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
| **contentType** | **String**| *Must be &#39;binary/octet-stream&#39;  | |
| **contentDisposition** | **String**| *must include the \&quot;filename\&quot; parameter, e.g. &#x60;inline; filename&#x3D;\&quot;MyFile.docx\&quot;&#x60;. To support UTF-8 filenames, you must URL encode the header  | |
| **_file** | **Object**| the user&#39;s submitted file | |

### Return type

[**SuccessMessage**](SuccessMessage.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: binary/octet-stream
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Success message indicating successful PUT request for a submission upload  |  -  |
| **400** | Invalid submission file size, Submission file must be &gt; than 0 MB and &lt;&#x3D; to 100 MB |  -  |
| **403** | Not properly authenticated |  -  |
| **429** | Too many requests have been made in a short amount of time, please wait for a bit a try again.  |  -  |
| **0** | An Error Occurred |  -  |


# GroupsApi

All URIs are relative to *https://app-us.turnitin.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addGroupAttachment**](GroupsApi.md#addGroupAttachment) | **POST** /groups/{group_id}/attachments | Add attachment to a group. will create a group if it does not exist. |
| [**deleteGroupAttachment**](GroupsApi.md#deleteGroupAttachment) | **DELETE** /groups/{group_id}/attachments/{attach_id} | Hard delete group attachment |
| [**getGroup**](GroupsApi.md#getGroup) | **GET** /groups/{group_id} | Get group, group context and group context owners info |
| [**getGroupAttachment**](GroupsApi.md#getGroupAttachment) | **GET** /groups/{group_id}/attachments/{attach_id} | Get group attachment |
| [**getGroupAttachments**](GroupsApi.md#getGroupAttachments) | **GET** /groups/{group_id}/attachments | Get all attachments |
| [**groupsGroupIdPut**](GroupsApi.md#groupsGroupIdPut) | **PUT** /groups/{group_id} | upsert group, group context and group context owners info |
| [**updateGroupAttachment**](GroupsApi.md#updateGroupAttachment) | **PATCH** /groups/{group_id}/attachments/{attach_id} | Patch a group attachment |
| [**uploadGroupAttachment**](GroupsApi.md#uploadGroupAttachment) | **PUT** /groups/{group_id}/attachments/{attach_id}/original | Upload Submitted File |


<a name="addGroupAttachment"></a>
# **addGroupAttachment**
> AddGroupAttachmentResponse addGroupAttachment(xTurnitinIntegrationName, xTurnitinIntegrationVersion, groupId, data)

Add attachment to a group. will create a group if it does not exist.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app-us.turnitin.com/api/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String xTurnitinIntegrationName = "myintegration"; // String | a human readable string representing the type of integration being used
    String xTurnitinIntegrationVersion = "v1.0.2"; // String | the version of the integration platform being used
    String groupId = "groupId_example"; // String | group_id
    AddGroupAttachmentRequest data = new AddGroupAttachmentRequest(); // AddGroupAttachmentRequest | 
    try {
      AddGroupAttachmentResponse result = apiInstance.addGroupAttachment(xTurnitinIntegrationName, xTurnitinIntegrationVersion, groupId, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#addGroupAttachment");
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
| **groupId** | **String**| group_id | |
| **data** | [**AddGroupAttachmentRequest**](AddGroupAttachmentRequest.md)|  | |

### Return type

[**AddGroupAttachmentResponse**](AddGroupAttachmentResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully add attachment |  -  |
| **0** | An Error Occurred |  -  |

<a name="deleteGroupAttachment"></a>
# **deleteGroupAttachment**
> deleteGroupAttachment(xTurnitinIntegrationName, xTurnitinIntegrationVersion, groupId, attachId)

Hard delete group attachment

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app-us.turnitin.com/api/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String xTurnitinIntegrationName = "myintegration"; // String | a human readable string representing the type of integration being used
    String xTurnitinIntegrationVersion = "v1.0.2"; // String | the version of the integration platform being used
    String groupId = "groupId_example"; // String | group_id
    String attachId = "attachId_example"; // String | The attachment ID (returned from a successful group attachment request) 
    try {
      apiInstance.deleteGroupAttachment(xTurnitinIntegrationName, xTurnitinIntegrationVersion, groupId, attachId);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#deleteGroupAttachment");
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
| **groupId** | **String**| group_id | |
| **attachId** | **String**| The attachment ID (returned from a successful group attachment request)  | |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Attachment successfully deleted |  -  |
| **0** | An Error Occurred |  -  |

<a name="getGroup"></a>
# **getGroup**
> AggregateGroup getGroup(xTurnitinIntegrationName, xTurnitinIntegrationVersion, groupId)

Get group, group context and group context owners info

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app-us.turnitin.com/api/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String xTurnitinIntegrationName = "myintegration"; // String | a human readable string representing the type of integration being used
    String xTurnitinIntegrationVersion = "v1.0.2"; // String | the version of the integration platform being used
    String groupId = "groupId_example"; // String | group_id
    try {
      AggregateGroup result = apiInstance.getGroup(xTurnitinIntegrationName, xTurnitinIntegrationVersion, groupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getGroup");
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
| **groupId** | **String**| group_id | |

### Return type

[**AggregateGroup**](AggregateGroup.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully get AggregateGroup |  -  |
| **0** | An Error Occurred |  -  |

<a name="getGroupAttachment"></a>
# **getGroupAttachment**
> GroupAttachmentResponse getGroupAttachment(xTurnitinIntegrationName, xTurnitinIntegrationVersion, groupId, attachId)

Get group attachment

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app-us.turnitin.com/api/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String xTurnitinIntegrationName = "myintegration"; // String | a human readable string representing the type of integration being used
    String xTurnitinIntegrationVersion = "v1.0.2"; // String | the version of the integration platform being used
    String groupId = "groupId_example"; // String | group_id
    String attachId = "attachId_example"; // String | The attachment ID (returned from a successful group attachment request) 
    try {
      GroupAttachmentResponse result = apiInstance.getGroupAttachment(xTurnitinIntegrationName, xTurnitinIntegrationVersion, groupId, attachId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getGroupAttachment");
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
| **groupId** | **String**| group_id | |
| **attachId** | **String**| The attachment ID (returned from a successful group attachment request)  | |

### Return type

[**GroupAttachmentResponse**](GroupAttachmentResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully get attachment |  -  |
| **0** | An Error Occurred |  -  |

<a name="getGroupAttachments"></a>
# **getGroupAttachments**
> GetGroupAttachments200Response getGroupAttachments(xTurnitinIntegrationName, xTurnitinIntegrationVersion, groupId)

Get all attachments

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app-us.turnitin.com/api/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String xTurnitinIntegrationName = "myintegration"; // String | a human readable string representing the type of integration being used
    String xTurnitinIntegrationVersion = "v1.0.2"; // String | the version of the integration platform being used
    String groupId = "groupId_example"; // String | group_id
    try {
      GetGroupAttachments200Response result = apiInstance.getGroupAttachments(xTurnitinIntegrationName, xTurnitinIntegrationVersion, groupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#getGroupAttachments");
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
| **groupId** | **String**| group_id | |

### Return type

[**GetGroupAttachments200Response**](GetGroupAttachments200Response.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully get attachments |  -  |
| **0** | An Error Occurred |  -  |

<a name="groupsGroupIdPut"></a>
# **groupsGroupIdPut**
> AggregateGroup groupsGroupIdPut(xTurnitinIntegrationName, xTurnitinIntegrationVersion, groupId, data)

upsert group, group context and group context owners info

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app-us.turnitin.com/api/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String xTurnitinIntegrationName = "myintegration"; // String | a human readable string representing the type of integration being used
    String xTurnitinIntegrationVersion = "v1.0.2"; // String | the version of the integration platform being used
    String groupId = "groupId_example"; // String | group_id
    AggregateGroup data = new AggregateGroup(); // AggregateGroup | 
    try {
      AggregateGroup result = apiInstance.groupsGroupIdPut(xTurnitinIntegrationName, xTurnitinIntegrationVersion, groupId, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#groupsGroupIdPut");
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
| **groupId** | **String**| group_id | |
| **data** | [**AggregateGroup**](AggregateGroup.md)|  | |

### Return type

[**AggregateGroup**](AggregateGroup.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully upssert group, group context and group context owners |  -  |
| **0** | An Error Occurred |  -  |

<a name="updateGroupAttachment"></a>
# **updateGroupAttachment**
> GroupAttachmentResponse updateGroupAttachment(xTurnitinIntegrationName, xTurnitinIntegrationVersion, groupId, attachId, data)

Patch a group attachment

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app-us.turnitin.com/api/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String xTurnitinIntegrationName = "myintegration"; // String | a human readable string representing the type of integration being used
    String xTurnitinIntegrationVersion = "v1.0.2"; // String | the version of the integration platform being used
    String groupId = "groupId_example"; // String | group_id
    String attachId = "attachId_example"; // String | The attachment ID (returned from a successful group attachment request) 
    AddGroupAttachmentRequest data = new AddGroupAttachmentRequest(); // AddGroupAttachmentRequest | 
    try {
      GroupAttachmentResponse result = apiInstance.updateGroupAttachment(xTurnitinIntegrationName, xTurnitinIntegrationVersion, groupId, attachId, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#updateGroupAttachment");
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
| **groupId** | **String**| group_id | |
| **attachId** | **String**| The attachment ID (returned from a successful group attachment request)  | |
| **data** | [**AddGroupAttachmentRequest**](AddGroupAttachmentRequest.md)|  | |

### Return type

[**GroupAttachmentResponse**](GroupAttachmentResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully get attachment |  -  |
| **0** | An Error Occurred |  -  |

<a name="uploadGroupAttachment"></a>
# **uploadGroupAttachment**
> SuccessMessage uploadGroupAttachment(xTurnitinIntegrationName, xTurnitinIntegrationVersion, groupId, attachId, contentDisposition, _file)

Upload Submitted File

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app-us.turnitin.com/api/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    String xTurnitinIntegrationName = "myintegration"; // String | a human readable string representing the type of integration being used
    String xTurnitinIntegrationVersion = "v1.0.2"; // String | the version of the integration platform being used
    String groupId = "groupId_example"; // String | The Group ID (required to already exist) 
    String attachId = "attachId_example"; // String | The attachment ID (returned from a successful group attachment request) 
    String contentDisposition = "inline; filename=\"MyFile.docx\""; // String | *must include the \"filename\" parameter, e.g. `inline; filename=\"MyFile.docx\"` 
    Object _file = null; // Object | the attachment file
    try {
      SuccessMessage result = apiInstance.uploadGroupAttachment(xTurnitinIntegrationName, xTurnitinIntegrationVersion, groupId, attachId, contentDisposition, _file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#uploadGroupAttachment");
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
| **groupId** | **String**| The Group ID (required to already exist)  | |
| **attachId** | **String**| The attachment ID (returned from a successful group attachment request)  | |
| **contentDisposition** | **String**| *must include the \&quot;filename\&quot; parameter, e.g. &#x60;inline; filename&#x3D;\&quot;MyFile.docx\&quot;&#x60;  | |
| **_file** | **Object**| the attachment file | |

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


# HubApi

All URIs are relative to *http://env-0693795.jelastic.servint.net/DSTroubleTicket/api/troubleTicketManagement/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**hubCreate**](HubApi.md#hubCreate) | **POST** /hub | hubCreate
[**hubDelete**](HubApi.md#hubDelete) | **DELETE** /hub/{hubId} | hubDelete
[**hubFind**](HubApi.md#hubFind) | **GET** /hub | hubFind
[**hubGet**](HubApi.md#hubGet) | **GET** /hub/{hubId} | hubGet


<a name="hubCreate"></a>
# **hubCreate**
> Hub hubCreate(hub)

hubCreate



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HubApi;


HubApi apiInstance = new HubApi();
Hub hub = new Hub(); // Hub | 
try {
    Hub result = apiInstance.hubCreate(hub);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HubApi#hubCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hub** | [**Hub**](Hub.md)|  |

### Return type

[**Hub**](Hub.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="hubDelete"></a>
# **hubDelete**
> hubDelete(hubId)

hubDelete



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HubApi;


HubApi apiInstance = new HubApi();
String hubId = "hubId_example"; // String | 
try {
    apiInstance.hubDelete(hubId);
} catch (ApiException e) {
    System.err.println("Exception when calling HubApi#hubDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hubId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="hubFind"></a>
# **hubFind**
> List&lt;Hub&gt; hubFind()

hubFind



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HubApi;


HubApi apiInstance = new HubApi();
try {
    List<Hub> result = apiInstance.hubFind();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HubApi#hubFind");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Hub&gt;**](Hub.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="hubGet"></a>
# **hubGet**
> Hub hubGet(hubId)

hubGet



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HubApi;


HubApi apiInstance = new HubApi();
String hubId = "hubId_example"; // String | 
try {
    Hub result = apiInstance.hubGet(hubId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HubApi#hubGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hubId** | **String**|  |

### Return type

[**Hub**](Hub.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


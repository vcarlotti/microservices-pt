# TroubleTicketApi

All URIs are relative to *http://env-0693795.jelastic.servint.net/DSTroubleTicket/api/troubleTicketManagement/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**troubleTicketCreate**](TroubleTicketApi.md#troubleTicketCreate) | **POST** /troubleTicket | troubleTicketCreate
[**troubleTicketFind**](TroubleTicketApi.md#troubleTicketFind) | **GET** /troubleTicket | troubleTicketFind
[**troubleTicketGet**](TroubleTicketApi.md#troubleTicketGet) | **GET** /troubleTicket/{troubleTicketId} | troubleTicketGet
[**troubleTicketPatch**](TroubleTicketApi.md#troubleTicketPatch) | **PATCH** /troubleTicket/{troubleTicketId} | troubleTicketPatch
[**troubleTicketUpdate**](TroubleTicketApi.md#troubleTicketUpdate) | **PUT** /troubleTicket/{troubleTicketId} | troubleTicketUpdate


<a name="troubleTicketCreate"></a>
# **troubleTicketCreate**
> TroubleTicket troubleTicketCreate(troubleTicket)

troubleTicketCreate



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TroubleTicketApi;


TroubleTicketApi apiInstance = new TroubleTicketApi();
TroubleTicket troubleTicket = new TroubleTicket(); // TroubleTicket | 
try {
    TroubleTicket result = apiInstance.troubleTicketCreate(troubleTicket);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TroubleTicketApi#troubleTicketCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **troubleTicket** | [**TroubleTicket**](TroubleTicket.md)|  |

### Return type

[**TroubleTicket**](TroubleTicket.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="troubleTicketFind"></a>
# **troubleTicketFind**
> List&lt;TroubleTicket&gt; troubleTicketFind(fields)

troubleTicketFind



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TroubleTicketApi;


TroubleTicketApi apiInstance = new TroubleTicketApi();
String fields = "fields_example"; // String | 
try {
    List<TroubleTicket> result = apiInstance.troubleTicketFind(fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TroubleTicketApi#troubleTicketFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | **String**|  | [optional]

### Return type

[**List&lt;TroubleTicket&gt;**](TroubleTicket.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="troubleTicketGet"></a>
# **troubleTicketGet**
> TroubleTicket troubleTicketGet(troubleTicketId, fields)

troubleTicketGet



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TroubleTicketApi;


TroubleTicketApi apiInstance = new TroubleTicketApi();
String troubleTicketId = "troubleTicketId_example"; // String | 
String fields = "fields_example"; // String | 
try {
    TroubleTicket result = apiInstance.troubleTicketGet(troubleTicketId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TroubleTicketApi#troubleTicketGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **troubleTicketId** | **String**|  |
 **fields** | **String**|  | [optional]

### Return type

[**TroubleTicket**](TroubleTicket.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="troubleTicketPatch"></a>
# **troubleTicketPatch**
> TroubleTicket troubleTicketPatch(troubleTicketId, troubleTicket)

troubleTicketPatch



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TroubleTicketApi;


TroubleTicketApi apiInstance = new TroubleTicketApi();
String troubleTicketId = "troubleTicketId_example"; // String | 
TroubleTicket troubleTicket = new TroubleTicket(); // TroubleTicket | 
try {
    TroubleTicket result = apiInstance.troubleTicketPatch(troubleTicketId, troubleTicket);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TroubleTicketApi#troubleTicketPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **troubleTicketId** | **String**|  |
 **troubleTicket** | [**TroubleTicket**](TroubleTicket.md)|  |

### Return type

[**TroubleTicket**](TroubleTicket.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="troubleTicketUpdate"></a>
# **troubleTicketUpdate**
> TroubleTicket troubleTicketUpdate(troubleTicketId, troubleTicket)

troubleTicketUpdate



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TroubleTicketApi;


TroubleTicketApi apiInstance = new TroubleTicketApi();
String troubleTicketId = "troubleTicketId_example"; // String | 
TroubleTicket troubleTicket = new TroubleTicket(); // TroubleTicket | 
try {
    TroubleTicket result = apiInstance.troubleTicketUpdate(troubleTicketId, troubleTicket);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TroubleTicketApi#troubleTicketUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **troubleTicketId** | **String**|  |
 **troubleTicket** | [**TroubleTicket**](TroubleTicket.md)|  |

### Return type

[**TroubleTicket**](TroubleTicket.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.HubApi;

import java.io.File;
import java.util.*;

public class HubApiExample {

    public static void main(String[] args) {
        
        HubApi apiInstance = new HubApi();
        Hub hub = new Hub(); // Hub | 
        try {
            Hub result = apiInstance.hubCreate(hub);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HubApi#hubCreate");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://env-0693795.jelastic.servint.net/DSTroubleTicket/api/troubleTicketManagement/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*HubApi* | [**hubCreate**](docs/HubApi.md#hubCreate) | **POST** /hub | hubCreate
*HubApi* | [**hubDelete**](docs/HubApi.md#hubDelete) | **DELETE** /hub/{hubId} | hubDelete
*HubApi* | [**hubFind**](docs/HubApi.md#hubFind) | **GET** /hub | hubFind
*HubApi* | [**hubGet**](docs/HubApi.md#hubGet) | **GET** /hub/{hubId} | hubGet
*TroubleTicketApi* | [**troubleTicketCreate**](docs/TroubleTicketApi.md#troubleTicketCreate) | **POST** /troubleTicket | troubleTicketCreate
*TroubleTicketApi* | [**troubleTicketFind**](docs/TroubleTicketApi.md#troubleTicketFind) | **GET** /troubleTicket | troubleTicketFind
*TroubleTicketApi* | [**troubleTicketGet**](docs/TroubleTicketApi.md#troubleTicketGet) | **GET** /troubleTicket/{troubleTicketId} | troubleTicketGet
*TroubleTicketApi* | [**troubleTicketPatch**](docs/TroubleTicketApi.md#troubleTicketPatch) | **PATCH** /troubleTicket/{troubleTicketId} | troubleTicketPatch
*TroubleTicketApi* | [**troubleTicketUpdate**](docs/TroubleTicketApi.md#troubleTicketUpdate) | **PUT** /troubleTicket/{troubleTicketId} | troubleTicketUpdate


## Documentation for Models

 - [Hub](docs/Hub.md)
 - [Note](docs/Note.md)
 - [RelatedObject](docs/RelatedObject.md)
 - [RelatedParty](docs/RelatedParty.md)
 - [TroubleTicket](docs/TroubleTicket.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author




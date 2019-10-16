# microservices-pt

This is some codes that i worked in the last year inside Telecom Company


<b>poc-mig-legadoNETSMS:</b>

Because all integration projects were within the WebLogic integration (WLI) system, we needed to think of a modern solution that would not affect consumer systems in the first scenario.

We decided to bring the WSDL interfaces to microservices and through an API Gateway perform the transparent migration of services.

This proof of concept details how the first services were performed.

The API Gateway for the services exhibit was Oracle API Gateway.


<b>spring-boot-soap:</b>

The second code was made to define how the database abstraction layer would be made.

The Company has 8 databases and service consumption should transparently route the query to the correct database.

Solution: We reimplemented initDataSource by passing all linked databases (through a properties file), and at the time of service query, an interceptor is performed to verify through the client code to which database it belongs.

<b>microservices-architecture:</b>

This is the presetation that i made in FEB/2019 to show actions and future inside integration team.

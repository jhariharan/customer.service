This is a REST API (Customer service) that manages all details related to a Customer base

Technologies used 
Spring Boot
Spring
Maven
Java
Hibernate
HikariCP
H2 in-memory database
Junit

Existing operation 
   
Find customer details of based on a car id
GET : /api/v1/customers{id}    

Find details of all available customers
GET : /api/v1/cars

Add details for a new customer
POST : /api/v1/cars

Future enhancements
Add Oauth/jwt token based authentication
Add roles for this rest end point


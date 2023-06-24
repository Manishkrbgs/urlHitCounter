# project-UrlHitCounter
# contents
* frameworks and languages
* data flow
* project summary
* data structure
   ## frameworks and languages
* java: The primary programming language used for developing the application.
* Maven: A build automation tool and dependency management tool used for managing the project's
  dependencies and building the application.
* Spring Boot: A framework built on top of the Spring framework, providing rapid application development
  features for creating stand-alone, production-grade Spring-based applications.
  ## dataflow
  * The Url Hit Counterfollows the following data flow:

* Client Interaction: The client, such as Postman, sends requests to the Localhost server using url provider .

* Controller Layer: In the Spring Boot application, the incoming requests are handled by the Controller layer.
The Controller receives the requests and delegates them to the appropriate methods in the service layer.

* Service Layer: The Service layer contains the business logic of the application and handles Counting and Storing Part.
When a request is received from the Controller, the Service layer performs the necessary actions.

* Database: The database stores the username and count. This is done uing hashmap.

* Response: After the data operation is completed, the response flows back through the layers in the reverse order.
The Service layer receives the response from the Data Access layer, performs any necessary post-processing or formatting, and sends it back to the Controller.

* Controller Response: The Controller layer receives the response from the Service layer and returns
an appropriate HTTP response to the client, indicating the success or failure of the requested operation.
## Project Summary
This project is used as a simple url hit counting api and helps client perform url activity .

## data Structure
* HashMap : This is used for as a DataBase and stores the User InforMation in form of User class.

Run code using an ide and check workings on postman.

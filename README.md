# SpringBootSwagger2
This projects contains details on how do we configure an swagger2 api documentation in spring boot application

<pre>
Step 1 : Create a sample spring boot application using <a href="https://start.spring.io/">Spring Initilizr</a>

<hr/>
Step 2 : Create an Employee Model class to store necessary information.
         Declare necessary properties along with its getters and setters

<hr/>
Step 3 : Add a rest controller class in your package <b>com.arcagile.springbootswagger2</b>
         Name : EmployeeController.java and annotate the class with @RestController
         and create methods for performing different operations
         1. Method to get all employees details
         2. Method to add employee details
         3. Method to retrieve employee details by id
<hr/>

Step 4 : Run the application and access the url through postman to perform above operation
         1. To retrieve all employee details, hit url localhost:8080/employee/ in postman as GET request
         2. To save employee details, hit url localhost:8080/employee/ in postman as POST request
            and add the below payload as request body
            Headers : Content-type : application/json
            Body : {
                   	"id":"1",
                   	"name":"Foo",
                   	"age":25,
                   	"gender":"male",
                   	"phoneNo":"123-123-1234",
                   	"emailId":"abc@gmail.com"
                   }
            On success it should return 200 status code along with the object it has stored
         3. To retrieve employee details by id, hit url localhost:8080/employee/1 in postman as GET request
            It should return an Employee details as output along with 200 status code.
<hr/>
</pre>

<pre>
<h2>Configuring Swagger2 in a Spring Boot application</h2>
Step 1 : Add the below dependency in pom.xml file

            <!-- THIS DEPENDENCY WILL HELP TO CREATE AN API DOCUMENTATION BASED END POINTS AVAILABLE IN A APPLICATION -->
            <dependency>
                <groupId>io.springfox</groupId>
                <artifactId>springfox-swagger2</artifactId>
                <version>2.9.2</version>
            </dependency>

            <!-- THIS DEPENDENCY WILL HELP TO CREATE HTML VIEW OF THE REST END POINTS AVAILABLE IN A APPLICATION -->
            <dependency>
                <groupId>io.springfox</groupId>
                <artifactId>springfox-swagger-ui</artifactId>
                <version>2.9.2</version>
            </dependency>

Step 2 : Annotate a class with @EnableSwagger ( Indicates that Swagger support should be enabled)
         Either you can annotate the above annotation with SpringBoot main class or you can create a separate configuration class to define the properties of swagger2

        <b>Restart the application and hit url localhost:8080/v2/api-docs</b>
        <p>It will return a json object which container detail documentation about your application</p>

        <p>If you would like to see the Swagger API Documentation in HTML view then hit http://localhost:8080/swagger-ui.html#/</p>

Step 3 :
</pre>

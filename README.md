# foodwasteproject-service
RESTful API over the foodwastedb written using Java Spring Boot. 

This project is the services componet of the Food Waste Project Web Application.



<h2>Purpose: </h2>
<p>
Uneaten food  is a major source of waste. Up to 40% of food produced in the United States is not eaten, and instead makes its way to landfills, 
both contributing to pollution, as well as costing households hundreds of dollars in wasted food every year. One way that this 
problem could be alleviated is through better household management of food inventory through better tracking of how long ago food was 
purchased, as well as the availability of recipes that can help households make full use of purchased food. This project seeks to build an 
application that will help households track the age of their perishable food inventory, and suggest recipes that will help households use 
purchased food before it expires and needs to be discarded.
<p>

<h2>Architecture Notes</h2>
<p>This is a Java Spring project and contains the web service layer of the web application. The API is generally split into three packages: the model package contains the data field definitions, a constructor for the data object, and getter and setter methods for each data table field; the repository package has a JPA interface (the ORM used for the project)  for each database object that has a set of endpoints in the object; and the controller class contains the actual endpoints over the database objects.</p>

<h2>Setup: </h2>
<p>
This project requires Java SDK version 18 to run. To check if this is the case you can use the following Terminal command:
java -version
If needed, Java SE Development Kits can be downloaded here: https://www.oracle.com/java/technologies/downloads/#jdk18-mac
The project comes packaged with configuration files for the IntelliJ IDEA IDE. If you are using this IDE, configuring the project in your development environment should be as simple as opening the project within the IDE. By default, when the project is running it can be accessed via port 8080.
If not using IntelliJ IDEA, make sure that your classpath is set to the proper directory where the project is kept followed by ‘foodwasteproject/target/classes’.
Java SpringBoot download and installation instructions can be found here: https://docs.spring.io/spring-boot/docs/1.0.2.RELEASE/reference/html/getting-started-installing-spring-boot.html.
 It is also recommended that a build tool such as Maven is installed in order to help manage the project dependencies. If using Maven, there will be POM file included in the application build. The repository for this project includes a POM file that should not need to be modified in order to work with the application.</p>

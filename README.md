# BackBase - BBlog QA TasK


1. Created Manual Test cases using CRUD operation


2. Automate test cases of BBlog Home page using Selenium(Hybrid Framework with Data-Driven approach) using Java , Maven , TestNG  with applying Page Object Model for Designing pattern.



# Description 


Selenium Framework project using Java , Maven , TestNG  with applying Page Object Model.
This framework is developed for Regression Testing scope of the CRUD Functions of "https://qa-task.backbasecloud.com/" on Both Chrome and Firefox browsers on Windows OS & mac.



# How to run? 



There are several ways to run the code after importing the project:



- Run each Test Class separately from backbase.qa.bbblog.tests packages by right click on the class and select "run as testNG test".



- Run the "testng_regression.xml" as testNG suite ;you can add the browser parameter in it or leave it to take the optional value in testBase class;it will run the tests with "Regression" group included



- Run through the command line by navigating to the project folder in the command line then write 
`mvn test` 



# Project Packages


Project consists of 7 packages as the following:



- "backbase.qa.bbblog.factory": This package contains "DriverFactory" class which initializes the driver and configuration properties.


- "backbase.qa.bblog.pages": This package contains "BBlogHomePage" class which initializes the driver and elementUtils. 
  Besides , Page Classes which have the locators and methods for dealing with the web elements.
  
  
- "backbase.qa.bblog.utils": This package contains "Constants" were i have defined all constant values and "ElementUtils" where i have defined all repetitive elements which are using while creating the page classes.



- "backbase.qa.bblog.base": This package contains "BaseTest" were i have defined all precondition which are using in my test class & also i have declared @BeforeTest & @ AfterTest in the base class.



- "backbase.qa.bblog.tests": This package contains of "BBlogHomePageTest" were test class have the Independent Test scenarios mapped with the methods from page objects , with an inheritance from "BaseTest" superclass also run the test cases from here also.



- "config": This file "config.properties" contain URL and Browser information & connected with "DriverFactory" class.




- "testrunners": This file "testng_regression" contain "thread-count", "parallel", "verbose" and "test class" data & we can run framework from here as well.
    

# Project Additional Folders


 
- "ManualTestCasesForBBlog" :  Excel sheet "Manual Tests for Backbase Task" contains the manual tests for CURD functions.


- "testng_regression.xml" :  XML file for testng suite to be run sequentially.




# Dependencies/Plug-ins used



- Selenium: To initiate the driver and handle with the web elements.


- Testng: Used for test annotations , asserting on the results and parallel execution. 

 
- Maven-surefire-plugin: used for configuring the testng and suite xml"testng_regression.xml"


- Maven-compiler-plugin: used to compile the project to  java version 1.8 



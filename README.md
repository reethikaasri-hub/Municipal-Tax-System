MUNICIPAL TAX COLLECTION SYSTEM USING JDBC

1. PROJECT DESCRIPTION
   This project is a console-based application developed using Java and JDBC. It is designed to manage municipal tax records by connecting Java with a MySQL database. The system allows users to perform basic database operations efficiently.

2. OBJECTIVE

* To establish connection between Java and MySQL using JDBC
* To perform CRUD operations (Create, Read, Update, Delete)
* To manage citizen data in a structured manner

3. TECHNOLOGIES USED

* Java (Core Java)
* JDBC (Java Database Connectivity)
* MySQL Database
* MySQL Workbench

4. FEATURES

* Add new citizen records
* View all citizen details
* Update existing records
* Delete records from database
* Menu-driven console interface

5. DATABASE DETAILS
   Database Name: municipal_tax
   Table Name: citizens

Fields:

* id (Primary Key, Auto Increment)
* name
* address
* phone

6. SOFTWARE REQUIREMENTS

* Java JDK 8 or above
* MySQL Server
* MySQL Workbench
* Eclipse IDE

7. HOW TO RUN THE PROJECT

* Open MySQL Workbench and create the database
* Create the citizens table using SQL commands
* Open the project in Eclipse
* Add MySQL Connector JAR file to build path
* Update database username and password in DBConnection.java
* Run MunicipalTaxSystem.java

8. OUTPUT
   The program displays a menu with options to add, view, update, and delete citizen records. The operations are reflected in the MySQL database.

9. CONCLUSION
   This project demonstrates how Java can be integrated with MySQL using JDBC. It provides a simple and effective way to manage municipal tax data using database operations.

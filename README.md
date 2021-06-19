# taxi-service

The goal of this project is to create a simple taxi service. The project implements driver authentication with different functionality:

To use all features you need to create new driver and authenticate
Driver can add himself to different cars
View all drivers
All of the remaining functionality you can find by starting the app
Implementation details and technologies
Project based on 3-layer architecture:

Presentation layer (controllers)
Application layer (services)
Data access layer (DAO)
Technologies
Apache Tomcat - version 9.0.46
MySQL - version 8.0.22
JDBC
Servlet
JSTL
JSP
HTML, CSS
Setup
Configure Apache Tomcat
Install MySQL and MySQL Workbench
Create a schema and all the necessary tables by using the script from resources/init_db.sql in MySQL Workbench
In the /util/ConnectionUtil.java class change the "user" and "password" properties to the ones you specified when installing MySQL
Start the application

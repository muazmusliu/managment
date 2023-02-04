# Spring Repository Project
This is a Java Spring Repository project that includes the following pojos:
Product
Order
OrderProduct
Inventory
Supplier
Customer
Employee
Report

*******************************************************************************************************
Requirements
Java 11 or later
Spring Boot 2.4.x or later
Maven
An IDE of your choice (Eclipse, IntelliJ, etc.)

*******************************************************************************************************
How to run the project
Clone the repository to your local machine: git clone https://github.com/muazmusliu/managment.git
Open the project in your IDE.
Run the main method in the ManagmentApplication class.
The application will start at http://localhost:8080/.
Project structure
The project consists of the following packages:
pojo package includes all the entities mentioned above.
repository package includes the repositories for each entity.
controller package includes the controllers for each entity.
service package includes the services for each entity.

******************************************************************************************************
REST endpoints
The following REST endpoints are available for each entity:
GET /products: Retrieve a list of all products.
GET /products/{id}: Retrieve a product by its ID.
POST /products: Create a new product.
PUT /products/{id}: Update an existing product.
DELETE /products/{id}: Delete a product.
GET /orders: Retrieve a list of all orders.
GET /orders/{id}: Retrieve an order by its ID.
POST /orders: Create a new order.
PUT /orders/{id}: Update an existing order.
DELETE /orders/{id}: Delete an order.
GET /inventory: Retrieve a list of all inventory entries.
GET /inventory/{id}: Retrieve an inventory entry by its ID.
POST /inventory: Create a new inventory entry.
PUT /inventory/{id}: Update an existing inventory entry.
DELETE /inventory/{id}: Delete an inventory

**********************************8**********************************************************************
Created by Muaz Musliu and Alban Abduli

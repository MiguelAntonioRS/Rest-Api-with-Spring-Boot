# RESTful Spring Boot Application  

This project is a Spring Boot RESTful API that manages `Maker` and `Product` entities, providing basic CRUD operations. It includes an example of using DTOs, services, repositories, and controllers. The application follows good software engineering practices and implements design patterns such as **DAO (Data Access Object)** and **DTO (Data Transfer Object)**.

## Requirements

- Java 8+ (JDK)
- Maven 3.6+
- A database (H2, MySQL, PostgreSQL, etc.) 
- An IDE (Optional: IntelliJ IDEA, Eclipse)
 
## Getting Started

Follow these steps to set up and run the project locally.

### 1. Clone the repository

```bash
git clone https://github.com/MiguelAntonioRS/Rest-Api-with-Spring-Boot.git
cd ApiRestwithSpringBoot
```

### 2. Build the project

Run the following Maven command to build the project:

```bash
mvn clean install
```

### 3. Run the Spring Boot Application

You can run the Spring Boot application using the following command:

```bash
mvn spring-boot:run
```

Alternatively, you can run the compiled `jar`:

```bash
java -jar target/RestSpringBootApplication.jar
```

### 4. API Endpoints

Once the application is running, you can interact with the REST API. Below are some examples of the available endpoints:

#### Maker Endpoints

- **Find all makers**:  
  `GET` `/api/maker/findAll`  
  Example:  
  ```bash
  curl -X GET http://localhost:8080/api/maker/findAll
  ```

- **Find maker by ID**:  
  `GET` `/api/maker/find/{id}`  
  Example:  
  ```bash
  curl -X GET http://localhost:8080/api/maker/find/1
  ```

- **Create a new maker**:  
  `POST` `/api/maker/save`  
  Example:  
  ```bash
  curl -X POST http://localhost:8080/api/maker/save -H "Content-Type: application/json" -d "{"name":"New Maker"}"
  ```

- **Update an existing maker**:  
  `PUT` `/api/maker/update/{id}`  
  Example:  
  ```bash
  curl -X PUT http://localhost:8080/api/maker/update/1 -H "Content-Type: application/json" -d "{"name":"Updated Maker"}"
  ```

- **Delete a maker**:  
  `DELETE` `/api/maker/delete/{id}`  
  Example:  
  ```bash
  curl -X DELETE http://localhost:8080/api/maker/delete/1
  ```

#### Product Endpoints

- **Find all products**:  
  `GET` `/api/product/findAll`  
  Example:  
  ```bash
  curl -X GET http://localhost:8080/api/product/findAll
  ```

- **Find product by ID**:  
  `GET` `/api/product/find/{id}`  
  Example:  
  ```bash
  curl -X GET http://localhost:8080/api/product/find/1
  ```

- **Create a new product**:  
  `POST` `/api/product/save`  
  Example:  
  ```bash
  curl -X POST http://localhost:8080/api/product/save -H "Content-Type: application/json" -d "{"name":"New Product", "price":100.00, "maker":{"id":1}}"
  ```

- **Update an existing product**:  
  `PUT` `/api/product/update/{id}`  
  Example:  
  ```bash
  curl -X PUT http://localhost:8080/api/product/update/1 -H "Content-Type: application/json" -d "{"name":"Updated Product", "price":150.00}"
  ```

- **Delete a product**:  
  `DELETE` `/api/product/delete/{id}`  
  Example:  
  ```bash
  curl -X DELETE http://localhost:8080/api/product/delete/1
  ```

## Design Patterns and Best Practices

This project follows **best practices** in software development and implements the following design patterns:

- **DAO (Data Access Object)**: The DAO pattern is used to separate the persistence layer (database interactions) from the business logic. Interfaces like `IProductDAO` and `IMakerDAO` manage the interactions with the database using JPA repositories, ensuring loose coupling and better testability.
  
- **DTO (Data Transfer Object)**: DTOs like `MakerDTO` and `ProductDTO` are used to transfer data between different layers (controllers and services). This prevents exposing the internal data structure of entities and ensures flexibility in handling various client requests and responses.

## Configuration

### Application Properties

You can configure the application by editing the `src/main/resources/application.properties` file. For example, you can change the database settings, server port, etc.

Example for H2 Database (Default):
```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=update
```

For MySQL or PostgreSQL, replace the appropriate settings in the `application.properties` file.

### 5. Running Tests

To run unit tests, execute the following Maven command:

```bash
mvn test
```

## Technologies Used

- **Spring Boot**: Backend framework
- **Maven**: Dependency management
- **H2 Database**: In-memory database (for development/testing)
- **JPA/Hibernate**: ORM for database interaction
- **Lombok**: For reducing boilerplate code
- **DAO Pattern**: Applied for database interaction management
- **DTO Pattern**: Used for data transfer between layers

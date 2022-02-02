# Spring boot assessment

You task is to create a spring boot project titled `person-rest-api` which accomplishes the following objectives.

## Objectives


### 1 - Model

This application should use the following model class.

```java

public class Person {

    private Integer id;
    private String name;
    private LocalDate dob;
    private String address;
    private String email;

}
```

This class must be created as an entity class. Make sure all the necessary annotatins are used. Use `H2`database.

### 2 - Repository

The application must use the repository layer to access the data. The repository must be created as a JPA repository.

### 3 - Service

The application must use the service layer to access the repository and it should have methods

- Create a person 
- Find a person by id
- Find all people
- Update a person
- Delete a person

### 4 - DTO

The application must implement the **DTO** pattern to collect the data from the user. Use `ModelMapper` to map the data from the **DTO** to the model class. 

### 5 - Data Validation

The appllication must validate the data provided for the following

- Name cannot be mepty
- DOB cannot be null
- Address cannot be empty
- Email cannot be empty


### 6 - Controller

The application must have a controller to handle the requests. The controller must have the following end points.

| Method   |      Endpoint          |  Description |
|----------|:-------------:|------: |
| `GET`       |  `/person`          | Find all people|
| `GET`       |  `/person/{id}`     | Find a person with the `id` |
| `POST`      |  `/person`          | Create a person |
| `PUT`       |  `/person/{id}`     | Update a person with the `id` |
| `DELETE`    |  `/person/{id}`     | Delete a person with the `id` |

### 7 - Exception Handling

An exception handler must be implemented to handle the following exceptions.

- `MethodArgumentNotValidException`
- `PersonNotFoundException` - this excetion class must be created and is thrown when a person is not found.

## References

Spring initializr: https://start.spring.io/

Model Mapper: https://modelmapper.org/

```xml
<dependency>
  <groupId>org.modelmapper</groupId>
  <artifactId>modelmapper</artifactId>
  <version>3.0.0</version>
</dependency>
```

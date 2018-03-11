# heroes-java-spring-api
A simple RESTful API in Java with spring-boot and MySQL

### Table of Contents

- [Run](#Run)
- [Testing](#Testing)
- [Authors / Contributors](#authors-contributors)

<a name="Run"></a>
## Run

1. Clone the repository:

  ```bash
  $ git clone git@github.com:iShuga139/heroes-java-spring-api.git
  $ cd heroes-java-spring-api/heroes
  ```
2. Update /src/main/resources/application.properties file:

  ```bash
  spring.datasource.username=here_your_MySQL_user
  spring.datasource.password=here_your_MySQL_password
  ```

3. Execute the application:

  ```bash
  $ ./mvnw spring-boot:run
  ```

<a name="Testing"></a>
## Testing

This program uses defaults of Spring-Boot with Maven scope.

To test the program run:

```bash
$ ./mvnw test
```

<a name="authors-contributors"></a>
## Authors / Contributors

- **Maintainer:** iShuga
- **Author:** Jonathan Estrada - <jeaworks@hotmail.com>
- **Contributors:**
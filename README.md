# User Management CRUD Backend

This is the backend part of the User Management CRUD application, built using Kotlin and Spring Boot. The backend provides RESTful API endpoints to manage user data, including creating, reading, updating, and deleting user records.

## Technologies Used

- Kotlin
- Spring Boot
- MySQL Database
- RestTemplate for api requests to Agify

## Prerequisites

Before running the backend, ensure you have the following installed:

- Kotlin
- Java Development Kit (JDK)
- IDE (e.g., IntelliJ IDEA, Visual Studio Code)
- Git

## Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/users-agify/users-agify-backend.git
   ```

2. Navigate to the backend directory.

3. Run the Kotlin application:

   ```bash
   ./gradlew bootRun
   ```

The backend will be running at `http://localhost:5000`.

## API Endpoints

- Create User: `POST /api/users`
- Get All Users: `GET /api/users`
- Get User by ID: `GET /api/users/{id}`
- Update User: `PUT /api/users/{id}`
- Delete User: `DELETE /api/users/{id}`

## Agify API Integration

This application integrates with the [Agify API](https://api.agify.io/?name=?) to fetch user age based on the provided name.

## Database

The application uses a MySQL database for demonstration purposes. You can configure a different database in the `application.properties` file in the backend directory.

## CLOUD Platform

The application is hosted in AWS RDS: 'jdbc:mysql://user-aws-database.cxj9deyuq5zh.eu-north-1.rds.amazonaws.com:3306/user_rest_api_database'.

## Contributing

Contributions are welcome! Feel free to open issues or submit pull requests.

## Acknowledgments

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Kotlin](https://kotlinlang.org/)

## Contact

If you have any questions or feedback, please contact [Royal Aliyev](mailto:royal.alyv@gmail.com).

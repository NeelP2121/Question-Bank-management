# Question Bank Management System

## Overview

The **Question Bank Management System** is a microservice-based application designed to manage a question bank, generate question papers, and provide search functionality. The system consists of three primary microservices:

1. **ItemBankCRUD Service**: Manages CRUD operations for the question bank.
2. **QuestionPaperGeneration Service**: Generates question papers based on specified criteria.
3. **Search Service**: Facilitates searching within the question bank.

## Project Structure

```
Question-Bank-management/
├── itembankCRUD/
├── questionpaperGeneration/
└── searchService/
```

### Services

#### 1. ItemBankCRUD Service
- **Description**: Handles creation, retrieval, updating, and deletion of questions in the question bank.
- **Technologies**: Java, Spring Boot, MySQL
- **Key Endpoints**:
  - `POST /items`: Add a new question.
  - `GET /items/{id}`: Retrieve a specific question by ID.
  - `PUT /items/{id}`: Update a question.
  - `DELETE /items/{id}`: Delete a question.
  - `GET /items`: Retrieve a list of all questions.

#### 2. QuestionPaperGeneration Service
- **Description**: Generates question papers based on predefined criteria such as difficulty level and topics.
- **Technologies**: Java, Spring Boot
- **Key Endpoints**:
  - `POST /generate`: Generate a new question paper.
  - `GET /papers/{id}`: Retrieve a generated question paper.
  - `DELETE /papers/{id}`: Delete a generated question paper.

#### 3. Search Service
- **Description**: Provides search functionality across the question bank.
- **Technologies**: Java, Spring Boot
- **Key Endpoints**:
  - `GET /search`: Search for questions using filters like keywords, tags, and difficulty levels.
  - `GET /search/suggestions`: Retrieve search suggestions.

## Prerequisites

- **Java 11** or higher
- **Maven** (for building the project)
- **MySQL** or any other relational database
- **Eclipse IDE** or any other Java-compatible IDE

## Installation and Setup

### Clone the Repository

```bash
git clone https://github.com/NeelP2121/Question-Bank-management.git
cd Question-Bank-management
```

### Import into Eclipse

1. Open Eclipse IDE.
2. Go to **File > Import > Maven > Existing Maven Projects**.
3. Browse to the directory where you cloned the repository.
4. Select the directories of the three services (`itembankCRUD`, `questionpaperGeneration`, and `searchService`) and click **Finish**.

### Database Configuration

1. Ensure MySQL (or your chosen RDBMS) is running.
2. Configure the database connection in each service’s `src/main/resources/application.properties` or `application.yml` file.
3. Use the provided SQL scripts (if any) to set up the initial schema and data.

### Build and Run the Services

For each service:

1. Right-click on the project in Eclipse and select **Run As > Maven build**.
2. In the Goals field, enter `clean install` and click **Run**.
3. After the build is successful, right-click on the project again and select **Run As > Spring Boot App**.

### Accessing the Services

- **ItemBankCRUD Service**: `http://localhost:8081/items`
- **QuestionPaperGeneration Service**: `http://localhost:8082/generate`
- **Search Service**: `http://localhost:8083/search`

### API Documentation

Each service comes with Swagger UI documentation:
- **ItemBankCRUD**: `http://localhost:8081/swagger-ui.html`
- **QuestionPaperGeneration**: `http://localhost:8082/swagger-ui.html`
- **Search Service**: `http://localhost:8083/swagger-ui.html`

## Contributing

Contributions are welcome! Please fork this repository, create a new branch, and submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

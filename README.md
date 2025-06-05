# Online Quiz Application - Backend

## Project Description
This is the backend implementation of an Online Quiz Application developed in Java.  
It supports user authentication, quiz management, quiz taking, scoring, and progress tracking using a MySQL database.

## Features
- User registration and login with password hashing.
- Admin functionality to create, edit, and delete quizzes and questions.
- Users can take quizzes one question at a time with immediate feedback.
- Scores are calculated and stored after each quiz attempt.
- Users can view their past quiz attempts and scores.
- JDBC is used for database interaction with MySQL.
- Structured with DAO, Model, Service layers.

## Technologies Used
- Java 17+
- MySQL Database
- JDBC for database connectivity
- Maven (optional, if you use it)
- VS Code (or any Java IDE)

## Project Structure

onlinequizapp-backend/
├── src/
│ ├── dao/ # Data Access Objects
│ ├── model/ # Java Model classes
│ ├── service/ # Business logic
│ ├── util/ # Utility classes (e.g., DBConnection)
│ └── Main.java # Main entry point (if applicable)
├── lib/ # External libraries (e.g., MySQL Connector/J)
├── quiz.sql # Database schema and initial scripts
├── README.md # This file





## Setup Instructions

1. **Install Java JDK 17 or later**  
   Download and install from [Oracle](https://www.oracle.com/java/technologies/downloads/).

2. **Install MySQL Server**  
   Download and install MySQL Community Server from [MySQL](https://dev.mysql.com/downloads/mysql/).

3. **Create the database and tables**  
   Run the `quiz.sql` script in your MySQL server to create necessary tables and initial data.

4. **Configure database connection**  
   Update the `DBConnection` class with your MySQL username and password.

5. **Add MySQL JDBC driver**  
   Place the MySQL Connector/J jar file inside the `lib/` folder and include it in your project’s classpath.

6. **Compile and run the project**  
   Use your IDE or command line tools to compile and run the Java backend.

## Usage

- Register users and admins.
- Admins create quizzes and questions.
- Users take quizzes and get feedback.
- Users can view past quiz scores.

## Future Enhancements
- Add password hashing and salting.
- Implement role-based access control.
- Add timer and difficulty levels to quizzes.
- Create RESTful API for frontend integration.

## License
This project is open source and available under the MIT License.

---

**Author:** Muthuvengadesh M  
**GitHub:** [https://github.com/muthuvengadesh40/OnlineQuizApp-Backend](https://github.com/muthuvengadesh40/OnlineQuizApp-Backend)

package main;

import dao.QuizDAO;
import dao.UserDAO;
import model.Quiz;
import model.User;
import service.QuizService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserDAO userDAO = new UserDAO();

        System.out.println("1. Register\n2. Login");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        User user = null;
        if (choice == 1) {
            boolean success = userDAO.registerUser(new User(0, username, password));
            System.out.println(success ? "Registered Successfully" : "Registration Failed");
        } else {
            user = userDAO.loginUser(username, password);
            if (user == null) {
                System.out.println("Login Failed");
                return;
            }
        }

        QuizDAO quizDAO = new QuizDAO();
        List<Quiz> quizzes = quizDAO.getAllQuizzes();
        System.out.println("Available Quizzes:");
        for (Quiz q : quizzes) {
            System.out.println(q.getId() + ": " + q.getTitle());
        }

        System.out.print("Choose a quiz ID: ");
        int quizId = scanner.nextInt();
        scanner.nextLine();

        QuizService quizService = new QuizService();
        int score = quizService.conductQuiz(quizId, scanner);

        System.out.println("Your Score: " + score + "/" + quizzes.size());
        scanner.close();
    }
}
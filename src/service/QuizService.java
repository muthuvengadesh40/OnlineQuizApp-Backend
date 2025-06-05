package service;

import dao.QuestionDAO;
import model.Question;

import java.util.List;
import java.util.Scanner;

public class QuizService {
    public int conductQuiz(int quizId, Scanner scanner) {
        QuestionDAO questionDAO = new QuestionDAO();
        List<Question> questions = questionDAO.getQuestionsByQuizId(quizId);
        int score = 0;

        for (Question q : questions) {
            System.out.println(q.getQuestionText());
            System.out.println("A: " + q.getOptionA());
            System.out.println("B: " + q.getOptionB());
            System.out.println("C: " + q.getOptionC());
            System.out.println("D: " + q.getOptionD());
            System.out.print("Your Answer: ");
            String answer = scanner.nextLine().trim().toUpperCase();

            if (answer.equals(q.getCorrectOption())) {
                score++;
                System.out.println("Correct!\n");
            } else {
                System.out.println("Incorrect! Correct Answer: " + q.getCorrectOption() + "\n");
            }
        }
        return score;
    }
}
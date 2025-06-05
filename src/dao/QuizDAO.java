package dao;

import model.Quiz;
import util.DBConnection;

import java.sql.*;
import java.util.*;

public class QuizDAO {

    public List<Quiz> getAllQuizzes() {
        List<Quiz> quizzes = new ArrayList<>();
        String sql = "SELECT * FROM quizzes";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                quizzes.add(new Quiz(rs.getInt("id"), rs.getString("title")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return quizzes;
    }
}
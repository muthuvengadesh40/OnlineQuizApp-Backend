package dao;

import model.Question;
import util.DBConnection;

import java.sql.*;
import java.util.*;

public class QuestionDAO {

    public List<Question> getQuestionsByQuizId(int quizId) {
        List<Question> questions = new ArrayList<>();
        String sql = "SELECT * FROM questions WHERE quiz_id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, quizId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                questions.add(new Question(
                    rs.getInt("id"), rs.getInt("quiz_id"), rs.getString("question_text"),
                    rs.getString("option_a"), rs.getString("option_b"), rs.getString("option_c"),
                    rs.getString("option_d"), rs.getString("correct_option")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return questions;
    }
}
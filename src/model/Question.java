package model;

public class Question {
    private int id;
    private int quizId;
    private String questionText;
    private String optionA, optionB, optionC, optionD;
    private String correctOption;

    public Question() {}

    public Question(int id, int quizId, String questionText, String optionA, String optionB, String optionC, String optionD, String correctOption) {
        this.id = id;
        this.quizId = quizId;
        this.questionText = questionText;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctOption = correctOption;
    }

    // Getters and Setters ...
}
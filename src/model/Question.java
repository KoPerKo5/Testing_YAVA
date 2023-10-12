package model;

import utils.Demonstrate;

public class Question implements Demonstrate {

    private int questionId;

    private String questionTheme;

    private String questionText;

    public Question(String questionTheme, String questionText) {
        this.questionId = (int)(Math.random()*1000);
        this.questionTheme = questionTheme;
        this.questionText = questionText;
    }

    public int Question() {
        return questionId = (int)(Math.random()*1000);
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestionTheme() {
        return questionTheme;
    }

    public void setQuestionTheme(String questionTheme) {
        this.questionTheme = questionTheme;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    @Override
    public void demonstrate() {
        System.out.println(questionId + " " + questionTheme + " " + questionText);
        System.out.println("____________________");
    }
}

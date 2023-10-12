package model;

import utils.Demonstrate;

public class Answer implements Demonstrate {

    private int answerId;

    private String answerText;

    private boolean answerTruth;

    public Answer(String answerText, boolean answerTruth) {
        this.answerId = (int)(Math.random()*1000);
        this.answerText = answerText;
        this.answerTruth = answerTruth;
    }

    public Answer() {
        this.answerId = (int)(Math.random()*1000);
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public boolean isAnswerTruth() {
        return answerTruth;
    }

    public void setAnswerTruth(boolean answerTruth) {
        this.answerTruth = answerTruth;
    }


    @Override
    public void demonstrate() {
        System.out.println(answerId + " " + answerText + " " + "Truth: " + answerTruth);
        System.out.println("____________________");
    }
}

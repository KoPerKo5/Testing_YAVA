package model;

import utils.Demonstrate;

public class QuestionAnswer implements Demonstrate {
    private int id;
    private int questionId;
    private String questionText;
    private int answerId1;
    private int answerId2;
    private int answerId3;
    private String answerText1;
    private String answerText2;
    private String answerText3;

    public QuestionAnswer(Question question, Answer answer1, Answer answer2, Answer answer3) {
        this.id = (int)(Math.random()*1000);
        this.questionId = question.getQuestionId();
        this.questionText = question.getQuestionText();
        this.answerId1 = answer1.getAnswerId();
        this.answerText2 = answer1.getAnswerText();
        this.answerId1 = answer2.getAnswerId();
        this.answerText2 = answer2.getAnswerText();
        this.answerId1 = answer3.getAnswerId();
        this.answerText2 = answer3.getAnswerText();
    }

    public QuestionAnswer() {
        this.id = (int)(Math.random()*1000);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Question-----
    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    //Answer-----
    //GET TEXT
    public String getAnswerText1() {
        return answerText1;
    }
    public String getAnswerText2() {
        return answerText2;
    }
    public String getAnswerText3() {
        return answerText3;
    }
    //SET TEXT
    public void setAnswerText1(String answerText) {
        this.answerText1 = answerText;
    }
    public void setAnswerText2(String answerText) {
        this.answerText2 = answerText;
    }
    public void setAnswerText3(String answerText) {
        this.answerText3 = answerText;
    }
    //GET ID
    public int getAnswerId1() {
        return answerId1;
    }
    public int getAnswerId2() {
        return answerId2;
    }
    public int getAnswerId3() {
        return answerId3;
    }

    public void setAnswerId1(int answerId) {
        this.answerId1 = answerId;
    }
    public void setAnswerId2(int answerId) {
        this.answerId2 = answerId;
    }
    public void setAnswerId3(int answerId) {
        this.answerId3 = answerId;
    }

    @Override
    public void demonstrate() {
        System.out.println(questionId + " " + questionText + " " + answerId1 + " " + answerText1);
        System.out.println(answerId2 + " " + answerText2);
        System.out.println(answerId3 + " " + answerText3);
        System.out.println("____________________");
    }
}

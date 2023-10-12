package repository;

import model.Question;

import java.util.ArrayList;
import java.util.List;

public class QuestionRep implements Repository <Question> {
    private List<Question> questions = new ArrayList<>();


    @Override
    public List<Question> getAllEntity() {
        return questions;
    }

    @Override
    public Question getEntityById(int id) {
        for (Question ques : questions){
            if(ques.getQuestionId() == id) return ques;
        }
        return null;
    }

    @Override
    public void deleteEntityById(int id) {
        for (Question ques : questions){
            if(ques.getQuestionId() == id) questions.remove(ques);
        }
    }

    @Override
    public void saveEntity(Question entity) {
        questions.add(entity);
    }
}

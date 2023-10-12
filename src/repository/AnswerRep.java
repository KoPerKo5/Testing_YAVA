package repository;

import model.Answer;

import java.util.ArrayList;
import java.util.List;

public class AnswerRep implements Repository<Answer> {

    private List<Answer> answers = new ArrayList<>();

    @Override
    public List<Answer> getAllEntity() {
        return answers;
    }

    @Override
    public Answer getEntityById(int id) {
        for (Answer answ : answers) {
            if (answ.getAnswerId() == id) return answ;
        }
        return null;
    }

    @Override
    public void deleteEntityById(int id) {
        for (Answer answ : answers) {
            if (answ.getAnswerId() == id) answers.remove(answ);
        }
    }

    @Override
    public void saveEntity(Answer entity) {
        answers.add(entity);
    }
}

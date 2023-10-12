package repository;

import model.Answer;
import model.Question;
import model.QuestionAnswer;

import java.util.ArrayList;
import java.util.List;

public class QuestionAnswerRep implements Repository<QuestionAnswer>{
    private List<QuestionAnswer> questionAnswers = new ArrayList<>();

    @Override
    public List<QuestionAnswer> getAllEntity() {
        return questionAnswers;
    }

    @Override
    public QuestionAnswer getEntityById(int id) {
        for (QuestionAnswer quesAnsw : questionAnswers) {
            if (quesAnsw.getId() == id) return quesAnsw;
        }
        return null;
    }

    public QuestionAnswer getEntityByQuestAnswId(Question ques, Answer answ) {
        for (QuestionAnswer quesAnsw : questionAnswers) {

            //Да, здесь и в том классе тоже переделать!
            if (quesAnsw.getQuestionId() == ques.getQuestionId() &&
                    quesAnsw.getAnswerId1() == answ.getAnswerId() ||
                    quesAnsw.getAnswerId2() == answ.getAnswerId() ||
                    quesAnsw.getAnswerId3() == answ.getAnswerId()
                ) return quesAnsw;  //?????????????????????? ID ответов
        }
        return null;
    }

    @Override
    public void deleteEntityById(int id) {
        for (QuestionAnswer quesAnsw : questionAnswers) {
            if (quesAnsw.getId() == id) questionAnswers.remove(quesAnsw);
        }
    }

    @Override
    public void saveEntity(QuestionAnswer entity) {
        questionAnswers.add(entity);
    }
}

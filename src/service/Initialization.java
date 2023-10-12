package service;

import model.Answer;
import model.Question;
import model.QuestionAnswer;
import repository.AnswerRep;
import repository.QuestionAnswerRep;
import repository.QuestionRep;
import repository.Repository;

import java.util.List;

public class Initialization {
    public void init(List<Repository> list){
        Repository<Question> quesRep = new QuestionRep();
        Repository<Answer> answRep = new AnswerRep();
        Repository<QuestionAnswer> quesAnswRep = new QuestionAnswerRep();

        Question question = new Question("Загадка", "Что делал слон, когда пришёл на поле он?");
        Answer answer1 = new Answer("Хороший вопрос", false);
        Answer answer2 = new Answer("Травку жевал", true);
        Answer answer3 = new Answer("Кто? Наполеон?", false);
        QuestionAnswer questionAnswer = new QuestionAnswer(question, answer1, answer2, answer3);

        //Разобраться
        quesRep.saveEntity(question);
        answRep.saveEntity(answer1);
        answRep.saveEntity(answer2);
        answRep.saveEntity(answer3);
        quesAnswRep.saveEntity(questionAnswer);

        list.add(quesRep);
        list.add(answRep);
        list.add(quesAnswRep);
    }
}

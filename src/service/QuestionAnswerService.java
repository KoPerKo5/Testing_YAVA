package service;

import model.Answer;
import model.Question;
import model.QuestionAnswer;
import repository.QuestionAnswerRep;
import utils.Demonstrate;

import java.util.Scanner;

public class QuestionAnswerService implements Service{
    private QuestionAnswerRep questionAnswerRep;

    public  QuestionAnswerService(QuestionAnswerRep quesAnswRep, QuestionService quesService, AnswerService answService) {
        init(quesAnswRep, quesService, answService);
        this.questionAnswerRep = quesAnswRep;
    }

    public void init(QuestionAnswerRep quesAnswRep, QuestionService quesService, AnswerService answService) {
        Question question = quesService.getQuestionRep().getAllEntity().get(0);
        //Переделать: ответы засунуть в лист или ещё как-то структурировать... Я доделаю это позже!
        Answer answer = answService.getAnswerRep().getAllEntity().get(0);
        Answer answer2 = answService.getAnswerRep().getAllEntity().get(1);
        Answer answer3 = answService.getAnswerRep().getAllEntity().get(2);
        QuestionAnswer questionAnswer = new QuestionAnswer(question, answer, answer2, answer3);
        questionAnswerRep.saveEntity(questionAnswer);
    }

    public void addQuestionAnswerRep(QuestionService questionService, AnswerService answerService) {
        Scanner scanner = new Scanner(System.in);
        Question question;
        Answer answer;
        QuestionAnswer questionAnswer = new QuestionAnswer();

        //Здесь будет осуществляться добавление ответов к вопросу (да, пока ещё не переработано - не стал трогать)

        System.out.println("");
    }

    @Override
    public void demonstrate() {
        for (Demonstrate demo : questionAnswerRep.getAllEntity()) demo.demonstrate();
    }

    @Override
    public void add() {

    }
}

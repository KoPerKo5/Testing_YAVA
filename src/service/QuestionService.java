package service;

import model.Question;
import repository.QuestionRep;
import utils.Demonstrate;

import java.util.Scanner;

public class QuestionService implements Service {
    private QuestionRep questionRep;

    public QuestionRep getQuestionRep() {
        return questionRep;
    }

    public QuestionService(QuestionRep questionRep) {
        init(questionRep);
        this.questionRep = questionRep;
    }

    private void init(QuestionRep questionRep) {
        Question question = new Question("Загадка", "Что делал слон, когда пришёл на поле он?");
        questionRep.saveEntity(question);
    }


    @Override
    public void demonstrate() {
        for (Demonstrate demo : questionRep.getAllEntity()) demo.demonstrate();
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тему вопроса:");
        String quesTheme = scanner.next();
        System.out.println("Введите текст вопроса:");
        String quesText = scanner.next();

        questionRep.saveEntity(new Question(quesTheme, quesText));
        System.out.println("Вопрос успешно добавлен!");
    }
}
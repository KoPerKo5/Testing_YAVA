package service;

import model.Answer;
import repository.AnswerRep;
import utils.Demonstrate;

import java.util.Scanner;

public class AnswerService implements Service{
    private AnswerRep answerRep;

    public AnswerRep getAnswerRep() {
        return answerRep;
    }

    public AnswerService(AnswerRep answerRep) {
        init(answerRep);
        this.answerRep = answerRep;
    }

    private void init(AnswerRep answerRep) {
        Answer answer = new Answer("Хороший вопрос", false);
        answerRep.saveEntity(answer);
    }


    @Override
    public void demonstrate() {
        for (Demonstrate demo : answerRep.getAllEntity()) demo.demonstrate();
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст ответа");
        String answerText = scanner.next();
        System.out.println("Ответ верный? (true/false)");
        scanner.nextLine();
        boolean answerTruth = scanner.nextBoolean();

        answerRep.saveEntity(new Answer(answerText, answerTruth));
        System.out.println("Ответ успешно добавлен!");
    }
}
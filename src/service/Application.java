package service;

import repository.AnswerRep;
import repository.QuestionAnswerRep;
import repository.QuestionRep;
import utils.Menu;


import java.util.Scanner;

public class Application {
    public void start(){
        QuestionRep questionRep = new QuestionRep();
        QuestionService questionService = new QuestionService(questionRep);
        AnswerRep answerRep = new AnswerRep();
        AnswerService answerService = new AnswerService(answerRep);
        QuestionAnswerRep questionAnswerRep = new QuestionAnswerRep();
        QuestionAnswerService questionAnswerService = new QuestionAnswerService(questionAnswerRep, questionService, answerService);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            Menu.showMainMenu();
            int a = scanner.nextInt();

            switch (a) {
                //Все вопросы
                case 11:
                    questionService.demonstrate();
                    break;
                //Все ответы
                case 12:
                    answerService.demonstrate();
                    break;
                //Все вопросы-ответы
                case 13:
                    questionAnswerService.demonstrate();
                    break;
                //Добавить вопрос
                case 21:
                    questionService.add();
                    break;
                //Добавить ответ
                case 22:
                    answerService.add();
                    break;
                //Добавить вопрос-ответ
                case 23:
                    questionAnswerService.addQuestionAnswerRep(questionService, answerService);
                    break;
                case 3:
                    System.exit(3);
            }
        }
    }
}

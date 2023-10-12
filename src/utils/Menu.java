package utils;

public class Menu {
    public static void showMainMenu(){
        System.out.println("Выберите действие: ");
        System.out.println("   Отобразить:");
        System.out.println("     11. Все вопросы");
        System.out.println("     12. Все ответы");
        System.out.println("     13. Все задания (вопрос-ответ, тест и т.п.)");
        System.out.println("   Добавить:");
        System.out.println("     21. Вопрос");
        System.out.println("     22. Ответ");
        System.out.println("     23. Задание (Вопрос с 3 вариантами ответов, но с 1 верным)");
        System.out.println("   3. Выйти.");
    }
}

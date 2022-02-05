package Home_Work3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int countMistake = 0;
        int result = 0;
        String[] questions = new String[3];
        questions[0] = "1. Сколько цифр потребуется для записи числа девятьсот шесть тысяч семьсот пятнадцать? " +
                "\n Варианты ответов: \n 1) 5                2) 6               3) 7                4) 8 ";
        questions[1] = "2. Найди число, предыдущее для числа 70 900 000. " +
                "\n Варианты ответов: \n 1) 70 999 999           2) 70 900 001          3) 70 899 999           4) 70 900 009";
        questions[2] = "3. Найди решение примера: 800 000 : 1 000. " +
                "\n Варианты ответов: \n 1) 8 000              2) 80               3) 800                 4) 80 000 ";

        String[] rightAnswer = new String[3];
        rightAnswer[0] = "2";
        rightAnswer[1] = "3";
        rightAnswer[2] = "3";

        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i]);
            Scanner scan1 = new Scanner(System.in);
            String answer1 = scan1.nextLine();
            if(answer1.equals(rightAnswer[i])) {
                System.out.println("Верно!");
            }
            else {
                System.out.println("Не верно!");
                countMistake++;
            }
        }
        switch (countMistake) {
            case  (0):
                result = 5;
                break;
            case (1):
                result = 4;
                break;
            case (2):
                result = 3;
                break;
            case (3):
                result = 2;
                break;
            default:
                break;
        }
        System.out.println("\n Ваша оценка: " + result);
    }
}

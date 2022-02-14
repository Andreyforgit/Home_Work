package Home_Work4;

import java.io.IOException;
import java.util.Scanner;

public class Testing {
    public static void main(String [] args) throws IOException {
        int countMistake = 0;
        int countQwe = 0;
        int result = 0;
        System.out.println("Укажи количество вопросов в тесте: ");
        Scanner scanCount = new Scanner(System.in);
        countQwe = scanCount.nextInt();
        System.out.println("Внеси данные для тестирования: ");
        Questions testMath = new Questions();
        testMath.makeTest(countQwe);
        Answers answersOnTestMath = new Answers();
        answersOnTestMath.takeAnswer(countQwe);
        Scanner getAnsw = new Scanner(System.in);
        System.out.println("Ответь на вопросы: ");
        for (int i = 0; i < countQwe; i++) {
            System.out.println(testMath.listQwestions[i]);
            System.out.println(testMath.listVariants[i]);
            answersOnTestMath.listAnswer[i] = getAnsw.nextLine();
            if(testMath.listRightAnswers[i].equalsIgnoreCase(answersOnTestMath.listAnswer[i])){
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
        answersOnTestMath.getResult();
    }
}

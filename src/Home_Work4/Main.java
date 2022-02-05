package Home_Work4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int countMistake = 0;
        String resulShow;
        int numberOfQuestions = Questions.countQwe;
        String qwAndVariantsAnswer;

// Выводим вопрос и варианты ответа. Получаем ответ
        Scanner receivedResponse = new Scanner(System.in);
        for (int i = 0; i <numberOfQuestions; i++) {
            qwAndVariantsAnswer = Questions.showQwestions(i);
            System.out.println(qwAndVariantsAnswer);
            String answer1 = receivedResponse.nextLine();

//Получаем результат проверки ответ и выводим на экран
            resulShow = RightAnswer.rightAnswer(answer1,i);

//Если ответ не верный записываем
            if(resulShow.equals("Не верно!")){
                countMistake++;
            }
            System.out.println(resulShow);
        }
        receivedResponse.close();
// Получаем результат прохождения теста
        int resultTest = Rating.testScore(countMistake);

        System.out.println("\n Ваша оценка: " + resultTest);
    }
}


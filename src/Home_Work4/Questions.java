package Home_Work4;

public class Questions {
    static int countQwe = 3;

    public static String showQwestions(int i){
        String result;
        String[] questions = new String[countQwe];
        questions[0] = "1. Сколько цифр потребуется для записи числа девятьсот шесть тысяч семьсот пятнадцать? " +
                "\n Варианты ответов: \n 1) 5                2) 6               3) 7                4) 8 ";

        questions[1] = "2. Найди число, предыдущее для числа 70 900 000. " +
                "\n Варианты ответов: \n 1) 70 999 999           2) 70 900 001          3) 70 899 999           4) 70 900 009";
        questions[2] = "3. Найди решение примера: 800 000 : 1 000. " +
                "\n Варианты ответов: \n 1) 8 000              2) 80               3) 800                 4) 80 000 ";
        result = questions[i];
        return result;

    }





}

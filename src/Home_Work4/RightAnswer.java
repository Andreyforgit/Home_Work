package Home_Work4;

public class RightAnswer {

    public static String rightAnswer(String str,int i){
        String[] rightAnswer = new String[3];
        rightAnswer[0] = "2";
        rightAnswer[1] = "3";
        rightAnswer[2] = "3";
        String result;
        if(str.equals(rightAnswer[i])) {
            result = "Верно!";
        }
        else {
            result = "Не верно!";
        }
        return result;

    }
}

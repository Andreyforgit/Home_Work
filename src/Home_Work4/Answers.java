package Home_Work4;

import java.util.Arrays;

public class Answers {
    String[] listAnswer;
    public void takeAnswer(int countQwe){
        listAnswer = new String[countQwe];
    }
    public void getResult(){
        System.out.println("Твои ответы: " + Arrays.toString(listAnswer));
    }
}

package Home_Work4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Questions {
    String [] listQwestions;
    String [] listVariants;
    String [] listRightAnswers;

    public void makeTest(int countQwe) throws IOException {
        BufferedReader readQwestions = new BufferedReader(new InputStreamReader(System.in));
        listQwestions = new String[countQwe];
        listVariants = new String[countQwe];
        listRightAnswers = new String[countQwe];
        for (int i = 0; i < countQwe; i++) {
            listQwestions[i] = readQwestions.readLine();
        }
        for (int i = 0; i < countQwe; i++) {
            listVariants[i] = readQwestions.readLine();
        }
        for (int i = 0; i < countQwe; i++) {
            listRightAnswers[i] = readQwestions.readLine();
        }
    }

}

package Home_Work4;

public class Rating {
    public static int testScore(int numberMistakes){
        int testResult = 0;
        switch (numberMistakes) {
            case  (0):
                testResult = 5;
                break;
            case (1):
                testResult = 4;
                break;
            case (2):
                testResult = 3;
                break;
            case (3):
                testResult = 2;
                break;
            default:
                break;
        }
        return testResult;
    }
}

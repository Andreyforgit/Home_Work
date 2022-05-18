package Home_Work8.tests.unit;


import Home_Work8.src.main.java.ru.otus.game.DiceImpl;
import org.junit.jupiter.api.Assertions;

public class DicelmpiTest {
    public void testDicelmpi() {
        String scenario = "Тест полученного числа";
        try {
            long min = 20l;
            long max = 0;
            for (int i = 0; i < 2000; i++) {
                int actual = new DiceImpl().roll();
                if(actual > max) max = actual;
                if(actual < min) min = actual;
            }
            Assertions.assertTrue(max <= 6);
            Assertions.assertTrue((min >=1));

            System.out.printf("\"%s\" passed %n", scenario);

        }catch (Throwable e){
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
    public void testDice(){
        String scenario = "Тест работы логики игры";
        try {
            int actual = new FakeDice(2).roll();
            Assertions.assertEquals(2, actual);
            System.out.printf("\"%s\" passed %n", scenario);

        }catch (Throwable e){
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

}

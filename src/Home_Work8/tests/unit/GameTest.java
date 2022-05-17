package Home_Work8.tests.unit;

import Home_Work8.src.main.java.ru.otus.game.Player;
import org.junit.jupiter.api.Assertions;

public class GameTest {
    public void testPlayGame() {
        String scenario = "Тест правильного победителя";
        try {
            String actual = String.valueOf(new FakeGame().playGame(new Player("Vasa"), new Player("Petya")));
            Assertions.assertEquals("Vasa", actual);
            System.out.printf("\"%s\" passed %n", scenario);

        }catch (Throwable e){
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
    public void testPlayGame2() {
        String scenario = "Тест правильного проигравшего";
        try {
            String actual = String.valueOf(new FakeGame().playGame(new Player("Vasa"), new Player("Petya")));
            Assertions.assertNotEquals("Vasa", actual);
            System.out.printf("\"%s\" passed %n", scenario);

        }catch (Throwable e){
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}

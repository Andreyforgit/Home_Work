package Home_Work8.tests;

import Home_Work8.src.main.java.ru.otus.game.Game;
import Home_Work8.tests.unit.DicelmpiTest;
import Home_Work8.tests.unit.FakeGame;
import Home_Work8.tests.unit.GameTest;

public class AllTests {
    public static void main(String[] args) {
        new DicelmpiTest().testDicelmpi();
        new DicelmpiTest().testDice();
        new GameTest().testPlayGame();
        new GameTest().testPlayGame2();

    }
}

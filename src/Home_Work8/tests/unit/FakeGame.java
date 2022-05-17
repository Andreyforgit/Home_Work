package Home_Work8.tests.unit;

import Home_Work8.src.main.java.ru.otus.game.*;

public class FakeGame {

    public Player playGame(Player player1, Player player2) {
        int player1Result = 4;
        int player2Result = 2;

        Player winner = (player1Result > player2Result)? player1: player2;
        return winner;

    }


}

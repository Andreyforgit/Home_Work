package Home_Work8.tests.unit;

import Home_Work8.src.main.java.ru.otus.game.Dice;

public class FakeDice implements Dice {
    int number;
    FakeDice(int num){
        this.number = num;
    }
    @Override
    public int roll() {
        return number;
    }
}

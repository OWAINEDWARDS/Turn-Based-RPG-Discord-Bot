package Dice;

import java.util.Random;

public class HealthDie6 extends HealthDice{ // deal a single point of damage too

    @Override
    public int roll() {
        return rollHealth();
    }

    @Override
    protected int rollHealth() {
        return new Random().nextInt(7 - 1 ) + 1; //7 exclusive
    }
}

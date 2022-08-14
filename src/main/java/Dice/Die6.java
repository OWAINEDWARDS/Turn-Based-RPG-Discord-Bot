package Dice;

import java.util.Random;

public class Die6 implements Dice {

    @Override
    public int roll() {
        return new Random().nextInt(7 - 1 ) + 1; //7 exclusive
    }
}

package Dice;

import java.util.Random;

public class Die8 implements Dice{

    @Override
    public int roll() {
        return new Random().nextInt(9 - 1 ) + 1;
    }
}

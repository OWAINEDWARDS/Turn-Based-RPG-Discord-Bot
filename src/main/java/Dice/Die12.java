package Dice;

import java.util.Random;

public class Die12 implements Dice{

    @Override
    public int roll() {
        return new Random().nextInt(13 - 1 ) + 1;
    }
}

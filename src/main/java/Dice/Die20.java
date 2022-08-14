package Dice;

import java.util.Random;

public class Die20 implements Dice{

    @Override
    public int roll() {
        return new Random().nextInt(21 - 1 ) + 1; //21 exclusive so 1 to 20
    }
}

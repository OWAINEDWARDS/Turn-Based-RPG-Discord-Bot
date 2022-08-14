package Dice;

public abstract class ElectricDice implements Dice {

    @Override
    abstract public int roll();

    protected abstract int rollElectric();
}

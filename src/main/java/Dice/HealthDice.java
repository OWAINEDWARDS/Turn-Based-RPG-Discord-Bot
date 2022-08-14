package Dice;

public abstract class HealthDice implements Dice {

    @Override
    abstract public int roll();

    protected abstract int rollHealth();
}

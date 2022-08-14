package Dice;

public class ElectricDie6 extends ElectricDice{
    @Override
    public int roll() {
        return rollElectric();
    }

    @Override
    protected int rollElectric() {
        return 0;
    }
}

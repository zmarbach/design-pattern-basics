package designpatterns.StrategyPattern;

public class ExtremeStrength implements SuperPowerInterface {
    @Override
    public void exerciseSuperPower() {
        System.out.println("Punch! Kick! Lift heavy things!");
    }
}

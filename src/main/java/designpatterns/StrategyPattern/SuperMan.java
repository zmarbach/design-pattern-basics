package designpatterns.StrategyPattern;

public class SuperMan implements SuperHeroInterface {
    SuperPowerInterface superPowerInterface;

    public SuperMan(SuperPowerInterface superPowerInterface) {
        this.superPowerInterface = superPowerInterface;
    }

    @Override
    public void performSuperPower() {
        superPowerInterface.exerciseSuperPower();
    }

    @Override
    public void changeSuperPower(SuperPowerInterface superPowerInterface) {
        this.superPowerInterface = superPowerInterface;
    }


}

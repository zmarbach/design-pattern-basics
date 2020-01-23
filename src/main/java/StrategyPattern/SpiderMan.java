package StrategyPattern;

public class SpiderMan implements SuperHeroInterface {
    SuperPowerInterface superPowerInterface;

    public SpiderMan(SuperPowerInterface superPowerInterface) {
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

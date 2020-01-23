package StrategyPattern;

public class Batman implements SuperHeroInterface {
    SuperPowerInterface superPowerInterface;

    public Batman(SuperPowerInterface superPowerInterface) {
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

package designpatterns.StrategyPattern;

import designpatterns.ParentMain;

public class StrategyMain extends ParentMain {
    public StrategyMain(String patternName) {
        super(patternName);
    }

    @Override
    public void execute() {
    //STRATEGY - code to an INTERFACE so can easily change method behavior at runtime, by using different IMPLEMENTATION of that interface
    //like services cuz can use any implementation of that service interface anywhere in the app...FLEXIBLE!!
        System.out.println("---------- STRATEGY PATTERN ----------");
        System.out.println();
        System.out.println("SpiderMan does the following...isn't it cool how he can perform so many powers w/o changing the code?!");
        System.out.println("--------------------------");
        //can change Spiderman's super power dynamically cuz performSuperPower() and changeSuperPower() accept any class that IMPLEMENTS SuperPowerInterface as parameter
        SpiderMan spiderMan = new SpiderMan(new SpiderWebs());
        spiderMan.performSuperPower();
        spiderMan.changeSuperPower(new ExtremeStrength());
        spiderMan.performSuperPower();
        spiderMan.changeSuperPower(new UseGadgets());
        spiderMan.performSuperPower();
    }

}

package designpatterns.BuilderPattern;

import designpatterns.ParentMain;

public class BuilderMain extends ParentMain {

    public BuilderMain(String patternName) {
        super(patternName);
    }

    @Override
    public void execute() {
        System.out.println("---------- Builder Pattern ----------------- ");
        System.out.println("SEE ACTUAL CLASSES FOR SPECIFICS OF BUILDER PATTERN STRUCTURE.");

        CarBuilder carBuilder = new CarBuilder();

        System.out.println("Building Kelli's car......");
        Car kelliCar = carBuilder
                .withMake("Mazda")
                .withModel("CX5")
                .withPrice(21000)
                .withMpg(32)
                .build();

        System.out.println(kelliCar.toString());
        System.out.println("***Notice that Kelli did not provide color, so default color of WHITE was assigned***");

        System.out.println("Building Zach's dream car......");
        Car zachDreamCar = carBuilder
                .withMake("Chevy")
                .withModel("Silverado")
                .withColor("Maroon")
                .withPrice(27000)
                .withMpg(28)
                .build();

        System.out.println(zachDreamCar.toString());

    }
}

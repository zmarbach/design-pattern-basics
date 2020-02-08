package designpatterns.DecoratorPattern;

import designpatterns.DecoratorPattern.decorators.CaramelDecorator;
import designpatterns.DecoratorPattern.decorators.EspressoDecorator;
import designpatterns.DecoratorPattern.decorators.VanillaDecorator;
import designpatterns.DecoratorPattern.decorators.WhippedCreamDecorator;
import designpatterns.ParentMain;

public class DecoratorMain extends ParentMain {
    public DecoratorMain(String patternName) {
        super(patternName);
    }

    @Override
    public void execute() {
    //DECORATOR - useful when have multiple combinations of options.
    //Dont write unique class for each combo...write class for each option and then just "decorate" a base class with the different options to create each combo
        System.out.println("---------- DECORATOR PATTERN ----------");
        System.out.println("Similar to Builder patter. Dont have to write class for every possible combo of coffee ingredients.");
        System.out.println("INSTEAD, write one class for each coffee option and \"decorate\" base coffee with each option to make all possible combos");

        System.out.println();
        System.out.println("ORDER #1: coffee with vanilla and espresso");
        Coffee baseCoffee1 = new BaseCoffee();
        System.out.println("            Poured base coffee");
        System.out.println("            ***cost = " + baseCoffee1.getCost());
        Coffee vanillaDecorator = new VanillaDecorator(baseCoffee1);
        System.out.println("            added vanilla");
        System.out.println("            ***cost = " + vanillaDecorator.getCost());
        Coffee espressoDecorator = new EspressoDecorator(vanillaDecorator);
        System.out.println("            added 1st espresso shot");
        System.out.println("            ***cost = " + espressoDecorator.getCost());
        System.out.println("            Final Ingredients : " + espressoDecorator.getIngredients().toString());

        System.out.println("_______________________________________________");


        System.out.println();
        System.out.println("ORDER #2: coffee with espresso, caramel, and whipped cream");
        Coffee baseCoffee2 = new BaseCoffee();
        System.out.println("            Poured base coffee");
        System.out.println("            ***cost = " + baseCoffee2.getCost());
        Coffee espressoDecorator1 = new EspressoDecorator(baseCoffee2);
        System.out.println("            added espresso");
        System.out.println("            ***cost = " + espressoDecorator1.getCost());
        Coffee caramelDecorator = new CaramelDecorator(espressoDecorator1);
        System.out.println("            added caramel");
        System.out.println("            ***cost = " + caramelDecorator.getCost());
        Coffee whippedCreamDecorator = new WhippedCreamDecorator(caramelDecorator);
        System.out.println("            added whipped cream");
        System.out.println("            ***cost = " + whippedCreamDecorator.getCost());
        System.out.println("            Final Ingredients : " + whippedCreamDecorator.getIngredients().toString());

        System.out.println("_______________________________________________");

        System.out.println();
        System.out.println("ORDER #3: coffee with vanilla, caramel, 2 shots espresso, and whipped cream");
        Coffee baseCoffee3 = new BaseCoffee();
        System.out.println("            Poured base coffee");
        System.out.println("            ***cost = " + baseCoffee3.getCost());
        Coffee vanillaDecorator1 = new VanillaDecorator(baseCoffee3);
        System.out.println("            added vanilla");
        System.out.println("            ***cost = " + vanillaDecorator1.getCost());
        Coffee caramelDecorator1 = new CaramelDecorator(vanillaDecorator1);
        System.out.println("            added caramel");
        System.out.println("            ***cost = " + caramelDecorator1.getCost());
        Coffee espressoDecorator2 = new EspressoDecorator(caramelDecorator1);
        System.out.println("            added 1st espresso");
        System.out.println("            ***cost = " + espressoDecorator2.getCost());
        Coffee espressoDecorator3 = new EspressoDecorator(espressoDecorator2);
        System.out.println("            added 2nd espresso");
        System.out.println("            ***cost = " + espressoDecorator3.getCost());
        Coffee whippedCreamDecorator1 = new WhippedCreamDecorator(espressoDecorator3);
        System.out.println("            added whipped cream");
        System.out.println("            ***cost = " + whippedCreamDecorator1.getCost());
        System.out.println("            Final Ingredients : " + whippedCreamDecorator1.getIngredients().toString());

        System.out.println("_______________________________________________");
    }
}

import DecoratorPattern.BaseCoffee;
import DecoratorPattern.decorators.CoffeeWithCaramel;
import DecoratorPattern.decorators.CoffeeWithEspresso;
import DecoratorPattern.decorators.CoffeeWithVanilla;
import DecoratorPattern.decorators.CoffeeWithWhippedCream;
import ObserverPattern.ObserverA;
import ObserverPattern.ObserverB;
import ObserverPattern.Subject;
import StrategyPattern.ExtremeStrength;
import StrategyPattern.SpiderMan;
import StrategyPattern.SpiderWebs;
import StrategyPattern.UseGadgets;

public class Main {

    public static void main(String[] args) {
        boolean observer = false;
        boolean strategy = false;
        boolean decorator = true;

        //OBSERVER - main SUBJECT class keeps track of data and notifies OBSERVERS when data changes
        if(observer){
            System.out.println("---------- OBSERVER PATTERN ----------");
            Subject subject = new Subject();

            //create observers and pass in subject they want to observe (constructor code will add them as observers to the subject)
            new ObserverA(subject);
            new ObserverB(subject);

            //subject data changes and automatically updates all observers...triggering their souts (reporting the changed number)
            subject.changeUnstableInt();
        }

        //STRATEGY - code to an INTERFACE so can easily change method behavior at runtime, by using different IMPLEMENTATION of that interface
        //like services cuz can use any implementation of that service interface anywhere in the app...FLEXIBLE!!
        if (strategy){
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

        if(decorator){
            System.out.println("---------- DECORATOR PATTERN ----------");
            System.out.println("Similar to Builder patter. Dont have to write class for every possible combo of coffee ingredients.");
            System.out.println("INSTEAD, write one class for each coffee option and \"decorate\" base coffee with each option to make all possible combos");

            System.out.println();
            System.out.println("ORDER #1: coffee with vanilla and espresso");
            var baseCoffee1 = new BaseCoffee();
            System.out.println("            Poured base coffee");
            System.out.println("            ***cost = " + baseCoffee1.getCost());
            var withVanilla = new CoffeeWithVanilla(baseCoffee1);
            System.out.println("            added vanilla");
            System.out.println("            ***cost = " + withVanilla.getCost());
            var withVanillaAndEspresso = new CoffeeWithEspresso(withVanilla);
            System.out.println("            added 1st espresso shot");
            System.out.println("            ***cost = " + withVanillaAndEspresso.getCost());
            System.out.println("            Final Ingredients : " + withVanillaAndEspresso.getIngredients().toString());

            System.out.println("_______________________________________________");


            System.out.println();
            System.out.println("ORDER #2: coffee with espresso, caramel, and whipped cream");
            var baseCoffee2 = new BaseCoffee();
            System.out.println("            Poured base coffee");
            System.out.println("            ***cost = " + baseCoffee2.getCost());
            var withEspresso = new CoffeeWithEspresso(baseCoffee2);
            System.out.println("            added espresso");
            System.out.println("            ***cost = " + withEspresso.getCost());
            var withEspressoAndCaramel = new CoffeeWithCaramel(withEspresso);
            System.out.println("            added caramel");
            System.out.println("            ***cost = " + withEspressoAndCaramel.getCost());
            var withEspressoAndCaramelAndWhippedCream = new CoffeeWithWhippedCream(withEspressoAndCaramel);
            System.out.println("            added whipped cream");
            System.out.println("            ***cost = " + withEspressoAndCaramelAndWhippedCream.getCost());
            System.out.println("            Final Ingredients : " + withEspressoAndCaramelAndWhippedCream.getIngredients().toString());

            System.out.println("_______________________________________________");

            System.out.println();
            System.out.println("ORDER #3: coffee with vanilla, caramel, 2 shots espresso, and whipped cream");
            var baseCoffee3 = new BaseCoffee();
            System.out.println("            Poured base coffee");
            System.out.println("            ***cost = " + baseCoffee3.getCost());
            var withVanilla2 = new CoffeeWithVanilla(baseCoffee3);
            System.out.println("            added vanilla");
            System.out.println("            ***cost = " + withVanilla2.getCost());
            var withVanillaAndCaramel = new CoffeeWithCaramel(withVanilla2);
            System.out.println("            added caramel");
            System.out.println("            ***cost = " + withVanillaAndCaramel.getCost());
            var withVanillaAndCaramelAndEspresso1 = new CoffeeWithEspresso(withVanillaAndCaramel);
            System.out.println("            added 1st espresso");
            System.out.println("            ***cost = " + withVanillaAndCaramelAndEspresso1.getCost());
            var withVanillaAndCaramelAndEspresso2 = new CoffeeWithEspresso(withVanillaAndCaramelAndEspresso1);
            System.out.println("            added 2nd espresso");
            System.out.println("            ***cost = " + withVanillaAndCaramelAndEspresso2.getCost());
            var allOfIt = new CoffeeWithWhippedCream(withVanillaAndCaramelAndEspresso2);
            System.out.println("            added whipped cream");
            System.out.println("            ***cost = " + allOfIt.getCost());
            System.out.println("            Final Ingredients : " + allOfIt.getIngredients().toString());

            System.out.println("_______________________________________________");
        }
    }
}


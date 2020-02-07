import AdapterPattern.sources.WeatherBug;
import AdapterPattern.sources.WeatherChannel;
import AdapterPattern.sources.WeatherSource;
import AdapterPattern.adapters.WeatherBugAdapter;
import AdapterPattern.adapters.WeatherChannelAdapter;
import CommandPattern.commandObjs.*;
import CommandPattern.executionObjs.Fan;
import CommandPattern.executionObjs.GarageDoor;
import CommandPattern.executionObjs.LightBulb;
import CommandPattern.RemoteControl;
import DecoratorPattern.BaseCoffee;
import DecoratorPattern.decorators.CaramelDecorator;
import DecoratorPattern.decorators.EspressoDecorator;
import DecoratorPattern.decorators.VanillaDecorator;
import DecoratorPattern.decorators.WhippedCreamDecorator;
import FacadePattern.CustomAPI.CustomAPI;
import FacadePattern.CustomAPI.CustomFacade;
import FacadePattern.ThirdPartyAPIs.*;
import FactoryPattern.factories.ChicagoPizzaFactory;
import FactoryPattern.factories.NYPizzaFactory;
import FactoryPattern.restaurants.ChicagoRestaurant;
import FactoryPattern.restaurants.IRestaurant;
import FactoryPattern.restaurants.NYRestaurant;
import ObserverPattern.ObserverA;
import ObserverPattern.ObserverB;
import ObserverPattern.Subject;
import SingletonPattern.CacheSingleton;
import StrategyPattern.ExtremeStrength;
import StrategyPattern.SpiderMan;
import StrategyPattern.SpiderWebs;
import StrategyPattern.UseGadgets;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        boolean observer = false;
        boolean strategy = false;
        boolean decorator = false;
        boolean factory = false;
        boolean singleton = false;
        boolean command = false;
        boolean adapter = false;
        boolean facade = true;

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

        //FACTORY - abstract out the NEWing up of objects to one place, rather than having a class NEW and USE the object
        if(factory){
            System.out.println("---------- FACTORY PATTERN ----------");

            System.out.println("customer orders NY style pizza from NY restaurant");
            IRestaurant nyRestaurant = new NYRestaurant(new NYPizzaFactory());
            nyRestaurant.orderPizza();
            System.out.println("-----------------------------------------");

            System.out.println("customer orders Chicago style pizza from Chicago restaurant");
            IRestaurant chicagoRestaurant = new ChicagoRestaurant(new ChicagoPizzaFactory());
            chicagoRestaurant.orderPizza();
            System.out.println("-----------------------------------------");

            System.out.println("customer orders NY style pizza from CHICAGO restaurant....gasp! Weird, but we can still do it cuz we coded to an interface");
            IRestaurant chicagoRestaurant1 = new ChicagoRestaurant(new NYPizzaFactory());
            chicagoRestaurant1.orderPizza();
            System.out.println("-----------------------------------------");

        }

        //DECORATOR - useful when have multiple combinations of options.
        //Dont write unique class for each combo...write class for each option and then just "decorate" a base class with the different options to create each combo
        if(decorator){
            System.out.println("---------- DECORATOR PATTERN ----------");
            System.out.println("Similar to Builder patter. Dont have to write class for every possible combo of coffee ingredients.");
            System.out.println("INSTEAD, write one class for each coffee option and \"decorate\" base coffee with each option to make all possible combos");

            System.out.println();
            System.out.println("ORDER #1: coffee with vanilla and espresso");
            var baseCoffee1 = new BaseCoffee();
            System.out.println("            Poured base coffee");
            System.out.println("            ***cost = " + baseCoffee1.getCost());
            var vanillaDecorator = new VanillaDecorator(baseCoffee1);
            System.out.println("            added vanilla");
            System.out.println("            ***cost = " + vanillaDecorator.getCost());
            var espressoDecorator = new EspressoDecorator(vanillaDecorator);
            System.out.println("            added 1st espresso shot");
            System.out.println("            ***cost = " + espressoDecorator.getCost());
            System.out.println("            Final Ingredients : " + espressoDecorator.getIngredients().toString());

            System.out.println("_______________________________________________");


            System.out.println();
            System.out.println("ORDER #2: coffee with espresso, caramel, and whipped cream");
            var baseCoffee2 = new BaseCoffee();
            System.out.println("            Poured base coffee");
            System.out.println("            ***cost = " + baseCoffee2.getCost());
            var espressoDecorator1 = new EspressoDecorator(baseCoffee2);
            System.out.println("            added espresso");
            System.out.println("            ***cost = " + espressoDecorator1.getCost());
            var caramelDecorator = new CaramelDecorator(espressoDecorator1);
            System.out.println("            added caramel");
            System.out.println("            ***cost = " + caramelDecorator.getCost());
            var whippedCreamDecorator = new WhippedCreamDecorator(caramelDecorator);
            System.out.println("            added whipped cream");
            System.out.println("            ***cost = " + whippedCreamDecorator.getCost());
            System.out.println("            Final Ingredients : " + whippedCreamDecorator.getIngredients().toString());

            System.out.println("_______________________________________________");

            System.out.println();
            System.out.println("ORDER #3: coffee with vanilla, caramel, 2 shots espresso, and whipped cream");
            var baseCoffee3 = new BaseCoffee();
            System.out.println("            Poured base coffee");
            System.out.println("            ***cost = " + baseCoffee3.getCost());
            var vanillaDecorator1 = new VanillaDecorator(baseCoffee3);
            System.out.println("            added vanilla");
            System.out.println("            ***cost = " + vanillaDecorator1.getCost());
            var caramelDecorator1 = new CaramelDecorator(vanillaDecorator1);
            System.out.println("            added caramel");
            System.out.println("            ***cost = " + caramelDecorator1.getCost());
            var espressoDecorator2 = new EspressoDecorator(caramelDecorator1);
            System.out.println("            added 1st espresso");
            System.out.println("            ***cost = " + espressoDecorator2.getCost());
            var espressoDecorator3 = new EspressoDecorator(espressoDecorator2);
            System.out.println("            added 2nd espresso");
            System.out.println("            ***cost = " + espressoDecorator3.getCost());
            var whippedCreamDecorator1 = new WhippedCreamDecorator(espressoDecorator3);
            System.out.println("            added whipped cream");
            System.out.println("            ***cost = " + whippedCreamDecorator1.getCost());
            System.out.println("            Final Ingredients : " + whippedCreamDecorator1.getIngredients().toString());

            System.out.println("_______________________________________________");
        }

        //ONE and ONLY ONE instance of a class and entire app has global access to it
            //great for classes that you need to remain consistent (counting site viewers, cache history, etc)
        if(singleton){
            System.out.println("-------- SINGLETON ----------");
            //create first instance
            var cacheSingleton1 = CacheSingleton.getInstance();
            //add data
            cacheSingleton1.addDataToCache("red");
            cacheSingleton1.addDataToCache("blue");

            //get instance
            var cacheSingleton2 = CacheSingleton.getInstance();
            //add data
            cacheSingleton2.addDataToCache("green");
            cacheSingleton2.addDataToCache("yellow");

            //both of these should be the same because pointing to same instance
            System.out.println("Version 1 data: " + cacheSingleton1.getCacheData());
            System.out.println("Version 2 data: " + cacheSingleton2.getCacheData());
        }

        //encapsulates a request as an object (includes the Object that will actually do the work and the method that will be called on that Object)
        //buffer between Invoker and Receiver
        //Invoker = Waitress, Command Object = OrderSlip, Receiver = Cook
        //Invoker = You, Command Object = Remote Control, Receiver = TV, Light, Fan, etc
        if(command){
            System.out.println("---------- COMMAND PATTERN ----------");
            RemoteControl remoteControl = new RemoteControl();
            LightBulb lightBulb = new LightBulb();
            GarageDoor garageDoor = new GarageDoor();
            Fan fan = new Fan();

            //make command objects, passing in the Object that will actually DO THE WORK (in this case, turn on/off light)
            LightOnCommand lightOnCommand = new LightOnCommand(lightBulb);
            LightOffCommand lightOffCommand = new LightOffCommand(lightBulb);
            GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
            GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
            FanLowCommand fanLowCommand = new FanLowCommand(fan);
            FanHighCommand fanHighCommand = new FanHighCommand(fan);
            FanOffCommand fanOffCommand = new FanOffCommand(fan);

            //program button on remote with light ON command
            remoteControl.setButton(lightOnCommand);
            remoteControl.pressExecuteButton();

            //program button on remote with light OFF command
            remoteControl.setButton(lightOffCommand);
            remoteControl.pressExecuteButton();

            remoteControl.setButton(garageDoorOpenCommand);
            //door is opened and then closed cuz of UNDO
            remoteControl.pressExecuteButton();
            remoteControl.pressUndoButton();

            //fan is turned on HIGH, then LOW, then undo, so should be back to HIGH
            //could implement stack if want to do multiple undo operations
            remoteControl.setButton(fanHighCommand);
            remoteControl.pressExecuteButton();
            remoteControl.setButton(fanLowCommand);
            remoteControl.pressExecuteButton();
            remoteControl.pressUndoButton();
        }

        //use interface to map common methods to specific methods of different implementation classes
        //Weather example - dont have to worry about what each weather service calls its methods or what TYPE it returns
        //use ADAPTER class to map maintain consistency - call same method and get same TYPE result no matter the service
        if(adapter){
            System.out.println("-------- ADAPTER ----------");
            WeatherBug weatherBug = new WeatherBug(100, "C");
            WeatherSource weatherBugAdapter = new WeatherBugAdapter(weatherBug);

            WeatherChannel weatherChannel = new WeatherChannel("56 F");
            WeatherSource weatherChannelAdapter = new WeatherChannelAdapter(weatherChannel);

            List<WeatherSource> weatherSources = new ArrayList<>();
            weatherSources.add(weatherBugAdapter);
            weatherSources.add(weatherChannelAdapter);

            //can CALL same method on ALL sources and will get same TYPE result you expect because of ADAPTER
            for(var source : weatherSources) {
                System.out.println(" ---------- " + source.toString() + " ---------- ");
                System.out.println("Temp: " + source.getTemperature());
                System.out.println("High: " + source.getHigh());
                System.out.println("Low: " + source.getLow());
            }
        }

        if(facade){
            System.out.println("-------- FACADE ----------");
            AccurateTempService accurateTempService = new AccurateTempServiceImpl();
            AccuratePressureService accuratePressureService = new AccuratePressureServiceImpl();
            AccurateHumidityService accurateHumidityService = new AccurateHumidityServiceImpl();
            CustomAPI customAPI = new CustomFacade(accurateHumidityService, accuratePressureService, accurateTempService);

            //use ONE customAPI with consistent methods to interact with 3 different third party APIs
            //makes easier for us to remember and can write clearer method names if third party methods are confusing
            System.out.println(customAPI.getTemp());
            System.out.println(customAPI.getHumidity());
            System.out.println(customAPI.getPressure());


        }
    }
}


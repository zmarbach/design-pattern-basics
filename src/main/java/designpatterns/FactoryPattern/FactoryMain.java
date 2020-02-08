package designpatterns.FactoryPattern;

import designpatterns.FactoryPattern.factories.ChicagoPizzaFactory;
import designpatterns.FactoryPattern.factories.NYPizzaFactory;
import designpatterns.FactoryPattern.restaurants.ChicagoRestaurant;
import designpatterns.FactoryPattern.restaurants.IRestaurant;
import designpatterns.FactoryPattern.restaurants.NYRestaurant;
import designpatterns.ParentMain;

public class FactoryMain extends ParentMain {
    public FactoryMain(String patternName) {
        super(patternName);
    }

    @Override
    public void execute() {
    //FACTORY - abstract out the NEWing up of objects to one place, rather than having a class NEW and USE the object
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
}

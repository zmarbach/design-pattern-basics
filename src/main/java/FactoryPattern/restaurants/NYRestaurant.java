package FactoryPattern.restaurants;

import FactoryPattern.factories.IPizzaFactory;
import FactoryPattern.pizzas.IPizza;

public class NYRestaurant implements IRestaurant{
    private IPizzaFactory pizzaFactory;

    public NYRestaurant(IPizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public IPizza orderPizza() {
        System.out.println("NY restaurant is ordering pizza");
        IPizza pizza = pizzaFactory.makePizza();
        System.out.println("NY restaurant gets pizza with " + pizza.getCrust() + " crust");
        return pizza;
    }
}

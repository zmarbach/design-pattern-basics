package designpatterns.FactoryPattern.restaurants;

import designpatterns.FactoryPattern.factories.IPizzaFactory;
import designpatterns.FactoryPattern.pizzas.IPizza;

public class ChicagoRestaurant implements IRestaurant {
    private IPizzaFactory pizzaFactory;

    public ChicagoRestaurant(IPizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public IPizza orderPizza() {
        System.out.println("Chicago restaurant is ordering pizza");
        IPizza pizza = pizzaFactory.makePizza();
        System.out.println("Chicago restaurant gets pizza with " + pizza.getCrust() + " crust");
        return pizza;
    }
}

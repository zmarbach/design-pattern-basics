package designpatterns.FactoryPattern.factories;

import designpatterns.FactoryPattern.pizzas.ChicagoPizza;
import designpatterns.FactoryPattern.pizzas.IPizza;

public class ChicagoPizzaFactory implements  IPizzaFactory {

    public IPizza makePizza() {
        System.out.println("Chicago factory is making pizza");
        return new ChicagoPizza();
    }
}

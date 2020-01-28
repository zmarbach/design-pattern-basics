package FactoryPattern.factories;

import FactoryPattern.pizzas.ChicagoPizza;
import FactoryPattern.pizzas.IPizza;

public class ChicagoPizzaFactory implements  IPizzaFactory {

    public IPizza makePizza() {
        System.out.println("Chicago factory is making pizza");
        return new ChicagoPizza("thick");
    }
}

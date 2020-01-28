package FactoryPattern.factories;

import FactoryPattern.pizzas.IPizza;
import FactoryPattern.pizzas.NYPizza;

public class NYPizzaFactory implements IPizzaFactory {

    public IPizza makePizza() {
        System.out.println("NY factory is making pizza");
        return new NYPizza("thin");
    }
}

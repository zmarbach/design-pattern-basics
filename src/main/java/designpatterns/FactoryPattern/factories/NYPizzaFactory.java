package designpatterns.FactoryPattern.factories;

import designpatterns.FactoryPattern.pizzas.IPizza;
import designpatterns.FactoryPattern.pizzas.NYPizza;

public class NYPizzaFactory implements IPizzaFactory {

    public IPizza makePizza() {
        System.out.println("NY factory is making pizza");
        return new NYPizza();
    }
}

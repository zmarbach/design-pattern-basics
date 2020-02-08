package designpatterns.FactoryPattern.restaurants;

import designpatterns.FactoryPattern.pizzas.IPizza;

public interface IRestaurant {

    IPizza orderPizza();
}

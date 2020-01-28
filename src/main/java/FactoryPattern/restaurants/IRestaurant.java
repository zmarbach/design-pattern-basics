package FactoryPattern.restaurants;

import FactoryPattern.pizzas.IPizza;

public interface IRestaurant {

    IPizza orderPizza();
}

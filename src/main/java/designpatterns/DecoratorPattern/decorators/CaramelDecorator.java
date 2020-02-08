package designpatterns.DecoratorPattern.decorators;

import designpatterns.DecoratorPattern.Coffee;

import java.util.ArrayList;
import java.util.List;

public class CaramelDecorator implements Coffee {
    private Coffee decoratedCoffee;
    private Double cost = 0.50;
    private List<String> ingredients = new ArrayList<>();

    //decorating the existing coffee with Espresso
    public CaramelDecorator(Coffee baseCoffee) {
        this.decoratedCoffee = baseCoffee;
        //add cost for espresso
        cost += baseCoffee.getCost();

        //get ingredients base coffee and add them to decoratedCoffee ingredient list
        baseCoffee.getIngredients().forEach(i -> ingredients.add(i));

        //finally add espresso to ingredient list
        ingredients.add("caramel");
    }

    @Override
    public Double getCost() {
        return cost;
    }

    @Override
    public List<String> getIngredients() {
        return this.ingredients;
    }


}

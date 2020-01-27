package DecoratorPattern.decorators;

import DecoratorPattern.Coffee;

import java.util.ArrayList;
import java.util.List;

public class EspressoDecorator implements Coffee {
    private Coffee decoratedCoffee;
    private Double cost = 1.50;
    private List<String> ingredients = new ArrayList<>();

    //decorating the existing coffee with Espresso
    public EspressoDecorator(Coffee baseCoffee) {
        this.decoratedCoffee = baseCoffee;
        //add cost for espresso
        cost += baseCoffee.getCost();

        //get ingredients base coffee and add them to decoratedCoffee ingredient list
        baseCoffee.getIngredients().forEach(i -> ingredients.add(i));

        //finally add espresso to ingredient list
        ingredients.add("espresso");
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

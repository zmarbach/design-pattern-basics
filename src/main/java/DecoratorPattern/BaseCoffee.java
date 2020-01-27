package DecoratorPattern;

import java.util.ArrayList;
import java.util.List;

public class BaseCoffee implements Coffee{
    //plain jane coffee is $1.50
    private Double cost = 1.50;
    private List<String> ingredients = new ArrayList<>();

    public Double getCost() {
        return cost;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}

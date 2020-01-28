package FactoryPattern.pizzas;

public class NYPizza implements IPizza {
    private final String crust;

    public NYPizza(String crust) {
        this.crust = crust;
    }

    public String getCrust() {
        return crust;
    }
}

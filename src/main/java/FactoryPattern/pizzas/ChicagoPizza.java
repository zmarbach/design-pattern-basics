package FactoryPattern.pizzas;

public class ChicagoPizza implements IPizza {
    private final String crust;

    public ChicagoPizza(String crust) {
        this.crust = crust;
    }

    public String getCrust() {
        return crust;
    }
}

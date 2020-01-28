package FactoryPattern.pizzas;

public class ChicagoPizza implements IPizza {
    private final String THICK_CRUST = "THICK";


    public String getCrust() {
        return THICK_CRUST;
    }
}

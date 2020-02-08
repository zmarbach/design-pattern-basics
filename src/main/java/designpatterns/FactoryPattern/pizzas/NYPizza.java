package designpatterns.FactoryPattern.pizzas;

public class NYPizza implements IPizza {
    private final String THIN_CRUST = "THIN";

    public String getCrust() {
        return THIN_CRUST;
    }
}

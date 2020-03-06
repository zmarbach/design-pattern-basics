package designpatterns.TemplateMethodPattern;

import java.util.List;

public class Coffee extends CaffeinatedBeverage {

    public Coffee(List<String> desiredExtras) {
        super(desiredExtras);
    }

    //Coffee class determines how to brew, but relies on CaffeinatedBeverage class to handle all other consistent steps
    @Override
    protected void brew() {
        System.out.println("Pouring coffee through filter.");
    }


}

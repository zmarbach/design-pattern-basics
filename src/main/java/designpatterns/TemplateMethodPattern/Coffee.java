package designpatterns.TemplateMethodPattern;

import java.util.List;

public class Coffee extends CaffeinatedBeverage {

    public Coffee(List<String> desiredExtras) {
        super(desiredExtras);
    }

    @Override
    protected void brew() {
        System.out.println("Pouring coffee through filter.");
    }


}

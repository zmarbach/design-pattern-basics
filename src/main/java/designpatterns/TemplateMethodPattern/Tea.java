package designpatterns.TemplateMethodPattern;

import java.util.List;

public class Tea extends CaffeinatedBeverage {
    public Tea(List<String> desiredExtras) {
        super(desiredExtras);
    }

    //Tea class determines how to brew, but relies on CaffeinatedBeverage class to handle all other consistent steps
    @Override
    protected void brew() {
        System.out.println("Steeping the tea");

    }
}

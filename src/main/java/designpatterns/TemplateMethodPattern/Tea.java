package designpatterns.TemplateMethodPattern;

import java.util.List;

public class Tea extends CaffeinatedBeverage {
    public Tea(List<String> desiredExtras) {
        super(desiredExtras);
    }

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");

    }
}

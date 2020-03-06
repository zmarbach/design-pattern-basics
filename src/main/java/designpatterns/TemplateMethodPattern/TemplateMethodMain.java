package designpatterns.TemplateMethodPattern;

import designpatterns.ParentMain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TemplateMethodMain extends ParentMain {

    private final String MILK = "milk";
    private final String SUAGR = "sugar";
    private final String HONEY = "honey";
    private final String SWEETEN_LOW = "sweeten low";
    private Coffee coffee;
    private Coffee coffeeWithNoExtras;
    private Tea tea;
    private Tea teaWithNoExtras;

    public TemplateMethodMain(String patternName) {
        super(patternName);
    }

    @Override
    public void execute() {
        buildBeverageObjects();

        System.out.println("---------- TEMPLATE METHOD PATTERN ----------");
        System.out.println("***Preparing coffee...");
        coffee.prepareBeverage();
        System.out.println("***Preparing coffee with NO extras...");
        coffeeWithNoExtras.prepareBeverage();
        System.out.println("***Preparing tea...");
        tea.prepareBeverage();
        System.out.println("***Preparing tea with NO extras...");
        teaWithNoExtras.prepareBeverage();
    }

    private void buildBeverageObjects(){
        List<String> coffeeExtras = new ArrayList<>();
        coffeeExtras.add(MILK);
        coffeeExtras.add(SUAGR);
        coffee = new Coffee(coffeeExtras);

        coffeeWithNoExtras = new Coffee(Collections.emptyList());

        List<String> teaExtras = new ArrayList<>();
        teaExtras.add(HONEY);
        teaExtras.add(SWEETEN_LOW);
        tea = new Tea(teaExtras);

        teaWithNoExtras = new Tea(Collections.emptyList());
    }
}

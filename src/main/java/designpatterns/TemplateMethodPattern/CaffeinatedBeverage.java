package designpatterns.TemplateMethodPattern;

import java.util.List;

public abstract class CaffeinatedBeverage {
    private List<String> desiredExtras;

    public CaffeinatedBeverage(List<String> desiredExtras) {
        this.desiredExtras = desiredExtras;
    }

    public List<String> getDesiredExtras() {
        return desiredExtras;
    }

    public void prepareBeverage(){
        boilWater();
        brew();
        pourInCup();
        addExtras();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    //this changes based on type of beverage so delegate implementation to subclass
    protected abstract void brew();

    private void pourInCup() {
        System.out.println("Pouring beverage in cup");
    }

    private void addExtras() {
        if(getDesiredExtras().isEmpty()){
            System.out.println("No extras added.");
            System.out.println();
        }
        else {
            System.out.println("Adding extras...");
            for( String extra : getDesiredExtras()){
                System.out.println("     Added " + extra);
            }
            System.out.println();
        }
    }
}

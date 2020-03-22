package designpatterns.BuilderPattern;

public class CarBuilder {
    private static final String DEFAULT_MAKE = "Default Make";
    private static final String DEFAULT_MODEL = "Default Model";
    private static final String DEFAULT_COLOR = "White";
    private static final Integer ZERO_PRICE = 0;
    private static final Integer ZERO_MPG = 0;

    private Car car = new Car(DEFAULT_MAKE, DEFAULT_MODEL, DEFAULT_COLOR, ZERO_PRICE, ZERO_MPG);

    public CarBuilder withMake(String make){
        System.out.println("Building make...");
        car.setMake(make);
        return this;
    }

    public CarBuilder withModel(String model){
        System.out.println("Building model...");
        car.setModel(model);
        return this;
    }

    public CarBuilder withColor(String color){
        System.out.println("Building color...");
        car.setColor(color);
        return this;
    }

    public CarBuilder withPrice(Integer price){
        System.out.println("Building price...");
        car.setPrice(price);
        return this;
    }

    public CarBuilder withMpg(Integer mpg){
        System.out.println("Building mpg...");
        car.setMpg(mpg);
        return this;
    }
    public Car build(){
        return car;
    }
}

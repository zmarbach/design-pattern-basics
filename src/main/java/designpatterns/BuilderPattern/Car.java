package designpatterns.BuilderPattern;

public class Car {
    private String make;
    private String model;
    private String color;
    private Integer price;
    private Integer mpg;

    public Car(String make, String model, String color, Integer price, Integer mpg) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
        this.mpg = mpg;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getMpg() {
        return mpg;
    }

    public void setMpg(Integer mpg) {
        this.mpg = mpg;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", mpg=" + mpg +
                '}';
    }
}

package CommandPattern.executionObjs;

public class Fan {
    private final String low = "LOW";
    private final String medium = "MEDIUM";
    private final String high = "HIGH";
    private final String off = "OFF";
    String speed;

    //fan is off when created
    public Fan(){
        speed = off;
    }

    public void high(){
        speed = high;
        printSpeed();
    }

    public void medium(){
        speed = medium;
        printSpeed();
    }

    public void low(){
        speed = low;
        printSpeed();
    }

    public void off(){
        speed = off;
        System.out.println("Fan is off");
    }

    public void printSpeed(){
        System.out.println("Fan is on " + speed);
    }

    public String getSpeed() {
        return speed;
    }

    public String getLow() {
        return low;
    }

    public String getMedium() {
        return medium;
    }

    public String getHigh() {
        return high;
    }

    public String getOff() {
        return off;
    }
}

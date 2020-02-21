package designpatterns.FacadePattern.HomeMovieTheaterSubsystem;

public class PopcornMachine {
    private boolean isOn = false;

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void turnOn(){
        setOn(true);
        System.out.println("Popcorn Machine is running.");;
    }
}
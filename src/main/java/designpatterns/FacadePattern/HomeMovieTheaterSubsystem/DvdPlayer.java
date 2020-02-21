package designpatterns.FacadePattern.HomeMovieTheaterSubsystem;

public class DvdPlayer {
    private boolean isOn = false;
    private String currentDvd;

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public String getCurrentDvd() {
        return currentDvd;
    }

    public void setCurrentDvd(String currentDvd) {
        this.currentDvd = currentDvd;
    }

    public void turnOn(){
        setOn(true);
        System.out.println("DVD Player is on.");
    }

    public void playDvd(String dvdTitle){
        setCurrentDvd(dvdTitle);
        System.out.println(dvdTitle + " is playing. Enjoy!");;
    }
}

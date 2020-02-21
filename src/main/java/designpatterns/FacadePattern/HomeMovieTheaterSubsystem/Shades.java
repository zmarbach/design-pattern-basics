package designpatterns.FacadePattern.HomeMovieTheaterSubsystem;

public class Shades {
    private boolean areDrawn = false;

    public boolean isAreDrawn() {
        return areDrawn;
    }

    public void setAreDrawn(boolean areDrawn) {
        this.areDrawn = areDrawn;
    }

    public void draw(){
        setAreDrawn(true);
        System.out.println("Shades are drawn.");;
    }
}
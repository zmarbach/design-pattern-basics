package designpatterns.FacadePattern;

import designpatterns.FacadePattern.HomeMovieTheaterSubsystem.DvdPlayer;
import designpatterns.FacadePattern.HomeMovieTheaterSubsystem.MovieScreen;
import designpatterns.FacadePattern.HomeMovieTheaterSubsystem.PopcornMachine;
import designpatterns.FacadePattern.HomeMovieTheaterSubsystem.Shades;
import designpatterns.ParentMain;

public class FacadeMain extends ParentMain {
    public FacadeMain(String patternName) {
        super(patternName);
    }

    @Override
    public void execute() {
    //similar to ADAPTER - mapping bad APIs to using a custom interface that makes more sense (naming, types, etc)
        System.out.println("-------- FACADE ----------");
        //instantiate all classes in subsystem
        MovieScreen movieScreen = new MovieScreen();
        PopcornMachine popcornMachine = new PopcornMachine();
        Shades shades = new Shades();
        DvdPlayer dvdPlayer = new DvdPlayer();

        //build facade and pass in subsystem classes
        HomeMovieTheaterFacade homeMovieTheaterFacade = new HomeMovieTheaterFacade(movieScreen, popcornMachine, shades, dvdPlayer);

        //client uses ONE facade class that calls methods on all subsystem classes (simplify things for client)
        homeMovieTheaterFacade.watchMovie("Remember The Titans");
    }
}

package designpatterns.FacadePattern;


import designpatterns.FacadePattern.HomeMovieTheaterSubsystem.DvdPlayer;
import designpatterns.FacadePattern.HomeMovieTheaterSubsystem.MovieScreen;
import designpatterns.FacadePattern.HomeMovieTheaterSubsystem.PopcornMachine;
import designpatterns.FacadePattern.HomeMovieTheaterSubsystem.Shades;

public class HomeMovieTheaterFacade {
    private final MovieScreen movieScreen;
    private final PopcornMachine popcornMachine;
    private final Shades shades;
    private final DvdPlayer dvdPlayer;

    public HomeMovieTheaterFacade(MovieScreen movieScreen, PopcornMachine popcornMachine, Shades shades, DvdPlayer dvdPlayer) {
        this.movieScreen = movieScreen;
        this.popcornMachine = popcornMachine;
        this.shades = shades;
        this.dvdPlayer = dvdPlayer;
    }

    //use this method to simplify the interface/API that clients have to use
    //clients doesnt have to know details of the subsystem because this Facade class does it all for them with ONE SIMPLE method - watchMovie()
    //only change this code if subsystem changes...rather than everywhere in the client code

    public void watchMovie(String dvdTitle){
        System.out.println("Prepping all steps to watch a " + dvdTitle + "...");
        movieScreen.turnOn();
        popcornMachine.turnOn();
        shades.draw();
        dvdPlayer.turnOn();
        dvdPlayer.playDvd(dvdTitle);
    }
}

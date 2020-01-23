package ObserverPattern;

import java.util.Observable;
import java.util.Random;

public class Subject extends Observable {
    private Integer unstableInt = 0;

    public void changeUnstableInt(){
        Random r = new Random();
        unstableInt = r.nextInt(100);
        System.out.println("unstableInt has been changed");

        //this called Observables setChanged() method...will flag as changed
        setChanged();
        System.out.println("setChanged called");

        //THEN call Observable's notifyObservers(), passing in data to notify about...this will check the changed flag (which we just set to true above)
        //and notify all observers
        System.out.println("Notifying all observers.....");
        notifyObservers(unstableInt);

    }
}

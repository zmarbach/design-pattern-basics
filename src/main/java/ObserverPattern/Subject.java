package ObserverPattern;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

public class Subject extends Observable {
    private Integer unstableInt = 0;

    public void addObserver(Observer o){
        System.out.println("adding an observer");
        super.addObserver(o);
        System.out.println(o.toString() + " added");
    }

    public void notifyObservers(Integer unstableInt) {
        System.out.println("Notifying observers");
        super.notifyObservers(unstableInt);
    }

    @Override
    public synchronized void setChanged() {
        super.setChanged();
        System.out.println("setChanged called");
        notifyObservers(this.unstableInt);
    }

    public void changeUnstableInt(){
        Random r = new Random();
        unstableInt = r.nextInt(100);

        //simulating what Java will do behind the scenes...setChanged() automatically triggers notifyObservers()
        this.setChanged();
    }
}

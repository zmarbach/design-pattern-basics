package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class ObserverA implements Observer {
    //Upon initialization, register this class an OBSERVER of whatever Observable we pass in
    public ObserverA(Observable observable) {
        observable.addObserver(this);
    }

    //when Observable's notifyObservers is called...it will find all observers and call the UPDATE method
    //importance of coding to a COMMON INTERFACE...so we KNOW an update() method will exist
    @Override
    public void update(Observable observable, Object o) {
        System.out.println(this.toString() + " confirms it has received update. New int value is : " + o.toString());

    }
    
    @Override
    public String toString() {
        return "ObserverA";
    }
}


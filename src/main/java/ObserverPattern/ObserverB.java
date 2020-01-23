package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class ObserverB implements Observer {

    //Upon initialization, register this class an OBSERVER of whatever Observable we pass in
    public ObserverB(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        System.out.println(this.toString() + " confirms it has received update. New int value is : " + o.toString());

    }

    @Override
    public String toString() {
        return "ObserverB";
    }
}


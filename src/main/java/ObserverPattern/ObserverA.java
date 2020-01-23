package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class ObserverA implements Observer {

    @Override
    public void update(Observable observable, Object o) {
        System.out.println(this.toString() + " confirms it has received update. New int value is : " + o.toString());

    }

    @Override
    public String toString() {
        return "ObserverA";
    }
}


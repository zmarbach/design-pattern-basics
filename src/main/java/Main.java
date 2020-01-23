import ObserverPattern.ObserverA;
import ObserverPattern.ObserverB;
import ObserverPattern.Subject;

public class Main {

    public static void main(String[] args) {
        boolean observerPatterExample = true;

        if(observerPatterExample){
            ObserverA observerA = new ObserverA();
            ObserverB observerB = new ObserverB();
            Subject subject = new Subject();

            //observer register with subject
            subject.addObserver(observerA);
            subject.addObserver(observerB);

            //subject data changes and automatically updates all observers...triggering their souts (reporting the changed number)
            subject.changeUnstableInt();
        }
    }
}

import ObserverPattern.ObserverA;
import ObserverPattern.ObserverB;
import ObserverPattern.Subject;

public class Main {

    public static void main(String[] args) {
        boolean observerPatterExample = true;

        if(observerPatterExample){
            Subject subject = new Subject();

            //create observers and pass in subject they want to observe (constructor code will add them as observers to the subject)
            new ObserverA(subject);
            new ObserverB(subject);

            //subject data changes and automatically updates all observers...triggering their souts (reporting the changed number)
            subject.changeUnstableInt();
        }
    }
}

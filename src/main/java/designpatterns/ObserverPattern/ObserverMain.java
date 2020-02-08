package designpatterns.ObserverPattern;

import designpatterns.ParentMain;

public class ObserverMain extends ParentMain {
    public ObserverMain(String patternName) {
        super(patternName);
    }

    @Override
    public void execute() {
    //OBSERVER - main SUBJECT class keeps track of data and notifies OBSERVERS when data changes
        System.out.println("---------- OBSERVER PATTERN ----------");
        Subject subject = new Subject();

        //create observers and pass in subject they want to observe (constructor code will add them as observers to the subject)
        new ObserverA(subject);
        new ObserverB(subject);

        //subject data changes and automatically updates all observers...triggering their souts (reporting the changed number)
        subject.changeUnstableInt();
    }
}

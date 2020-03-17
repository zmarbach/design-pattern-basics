package designpatterns.StatePattern.states;

import designpatterns.ParentMain;
import designpatterns.StatePattern.Parcel;

public class StateMain extends ParentMain {
    public StateMain(String patternName) {
        super(patternName);
    }

    @Override
    public void execute() {
        System.out.println("---------- STATE PATTERN ----------");
        System.out.println("Allow obj to change behavior w/o changing its class. Just change the state of the object, each state having different behavior.");
        System.out.println("Also keeps code cleaner w/less if/else statements.");
        System.out.println();

        Parcel parcel = new Parcel();
        System.out.println("Starting status ---> " + parcel.getStatus());

        System.out.println("Customer orders and item from website and process begins...");
        System.out.println();

        parcel.next();
        System.out.println(parcel.getStatus());
        parcel.next();
        System.out.println(parcel.getStatus());
        parcel.next();
        System.out.println(parcel.getStatus());
        parcel.next();
        System.out.println(parcel.getStatus());

        //do one extra next tp show that there is no more steps...could handle this nicely with error handling or try/catch
        parcel.next();
    }
}

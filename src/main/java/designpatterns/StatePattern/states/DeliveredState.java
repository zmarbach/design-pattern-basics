package designpatterns.StatePattern.states;

import designpatterns.StatePattern.Parcel;
import designpatterns.StatePattern.states.State;

public class DeliveredState implements State {
    private Parcel parcel;

    public DeliveredState(Parcel parcel) {
        this.parcel = parcel;
    }

    @Override
    public void prev(Parcel parcel) {
        System.out.println("Moving back one step...");
        parcel.setCurrentState(new ShippedState(parcel));
    }

    @Override
    public void next(Parcel parcel) {
        System.out.println("Item has already been delivered. No further states.");
    }

    @Override
    public String getStatus() {
        return "Current state = Delivered";
    }

    @Override
    public void performActivity() {
        System.out.println("Delivering items...");
    }
}

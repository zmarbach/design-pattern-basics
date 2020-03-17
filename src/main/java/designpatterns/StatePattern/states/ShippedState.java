package designpatterns.StatePattern.states;

import designpatterns.StatePattern.Parcel;

public class ShippedState implements State {
    private Parcel parcel;

    public ShippedState(Parcel parcel) {
        this.parcel = parcel;
    }

    @Override
    public void prev(Parcel parcel) {
        System.out.println("Moving back one step...");
        parcel.setCurrentState(new PackedState(parcel));
    }

    @Override
    public void next(Parcel parcel) {
        parcel.setCurrentState(new DeliveredState(parcel));
        parcel.performActivity();
    }

    @Override
    public String getStatus() {
        return "Current state = Shipped";
    }

    @Override
    public void performActivity() {
        System.out.println("Shipping items...");
    }
}

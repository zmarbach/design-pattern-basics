package designpatterns.StatePattern.states;

import designpatterns.StatePattern.Parcel;

public class ShippedState implements State {
    private Parcel parcel;

    public ShippedState(Parcel parcel) {
        this.parcel = parcel;
    }

    @Override
    public void prev() {
        System.out.println("Moving back one step...");
        parcel.setCurrentState(parcel.getPackedState());
    }

    @Override
    public void next() {
        parcel.setCurrentState(parcel.getDeliveredState());
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

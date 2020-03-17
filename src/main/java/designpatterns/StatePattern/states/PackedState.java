package designpatterns.StatePattern.states;

import designpatterns.StatePattern.Parcel;

public class PackedState implements State {
    private Parcel parcel;

    public PackedState(Parcel parcel) {
        this.parcel = parcel;
    }

    @Override
    public void prev() {
        System.out.println("Moving back one step...");
        parcel.setCurrentState(parcel.getOrderedState());
    }

    @Override
    public void next() {
        parcel.setCurrentState(parcel.getShippedState());
        parcel.performActivity();
    }

    @Override
    public String getStatus() {
        return "Current state = Packed";
    }

    @Override
    public void performActivity() {
        System.out.println("Packing items...");
    }
}

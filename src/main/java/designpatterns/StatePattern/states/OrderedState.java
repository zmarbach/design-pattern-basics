package designpatterns.StatePattern.states;

import designpatterns.StatePattern.Parcel;

public class OrderedState implements State {
    private Parcel parcel;

    public OrderedState(Parcel parcel) {
        this.parcel = parcel;
    }

    @Override
    public void prev() {
        System.out.println("Moving back one step...");
        parcel.setCurrentState(parcel.getDormantState());
    }

    @Override
    public void next() {
        parcel.setCurrentState(parcel.getPackedState());
        parcel.performActivity();
    }

    @Override
    public String getStatus() {
        return "Current state = Ordered";
    }

    @Override
    public void performActivity() {
        System.out.println("Ordering items...");
    }
}

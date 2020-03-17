package designpatterns.StatePattern.states;

import designpatterns.StatePattern.Parcel;

public class OrderedState implements State {
    private Parcel parcel;

    public OrderedState(Parcel parcel) {
        this.parcel = parcel;
    }

    @Override
    public void prev(Parcel parcel) {
        System.out.println("Moving back one step...");
        parcel.setCurrentState(new DormantState(parcel));
    }

    @Override
    public void next(Parcel parcel) {
        parcel.setCurrentState(new PackedState(parcel));
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

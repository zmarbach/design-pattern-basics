package designpatterns.StatePattern.states;

import designpatterns.StatePattern.Parcel;

public class DormantState implements State {
    private Parcel parcel;

    public DormantState(Parcel parcel) {
        this.parcel = parcel;
    }

    @Override
    public void prev() {
        System.out.println("You are in initial state. No previous states.");
    }

    @Override
    public void next() {
        parcel.setCurrentState(parcel.getOrderedState());
        parcel.performActivity();
    }

    @Override
    public String getStatus() {
        return "Current state = Dormant";
    }

    @Override
    public void performActivity() {
        System.out.println("Do nothing");
    }
}

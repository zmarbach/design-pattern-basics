package designpatterns.StatePattern;

import designpatterns.StatePattern.states.*;

public class Parcel {
    private State dormantState = new DormantState(this);
    private State orderedState = new OrderedState(this);
    private State packedState = new PackedState(this);
    private State shippedState = new ShippedState(this);
    private State deliveredState = new DeliveredState(this);

    private State currentState = dormantState;

    public void prev(){
        currentState.prev();
    }

    public void next(){
        currentState.next();
    }

    public void performActivity(){
        currentState.performActivity();
    }

    public String getStatus(){
        return currentState.getStatus();
    }

    public State getDormantState() {
        return dormantState;
    }

    public State getOrderedState() {
        return orderedState;
    }

    public State getPackedState() {
        return packedState;
    }

    public State getShippedState() {
        return shippedState;
    }

    public State getDeliveredState() {
        return deliveredState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}

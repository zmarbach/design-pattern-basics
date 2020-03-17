package designpatterns.StatePattern;

import designpatterns.StatePattern.states.DormantState;
import designpatterns.StatePattern.states.State;

public class Parcel {
    private State currentState = new DormantState(this);

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void prev(){
        currentState.prev(this);
    }

    public void next(){
        currentState.next(this);
    }

    public void performActivity(){
        currentState.performActivity();
    }

    public String getStatus(){
        return currentState.getStatus();
    }
}

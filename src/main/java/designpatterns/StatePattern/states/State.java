package designpatterns.StatePattern.states;

import designpatterns.StatePattern.Parcel;

public interface State {
    void prev(Parcel parcel);
    void next(Parcel parcel);
    String getStatus();
    void performActivity();
}

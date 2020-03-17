package designpatterns.StatePattern.states;

public interface State {
    void prev();
    void next();
    String getStatus();
    void performActivity();
}

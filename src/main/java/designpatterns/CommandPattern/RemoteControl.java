package designpatterns.CommandPattern;

import designpatterns.CommandPattern.commandObjs.Command;

public class RemoteControl {
    private Command button;

    public void setButton(Command button) {
        this.button = button;
    }

    //button is pressed, run execute() on command Object which will run on() for the specific object (light, fan, tv, etc)
    public void pressExecuteButton(){
        button.execute();
    }

    public void pressUndoButton(){
        button.undo();
    }
}

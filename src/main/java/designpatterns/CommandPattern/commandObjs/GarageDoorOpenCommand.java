package designpatterns.CommandPattern.commandObjs;

import designpatterns.CommandPattern.executionObjs.GarageDoor;

//Command Object
public class GarageDoorOpenCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.open();
    }

    public void undo() {
        garageDoor.close();
    }
}

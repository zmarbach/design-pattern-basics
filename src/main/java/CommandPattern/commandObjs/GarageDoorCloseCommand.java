package CommandPattern.commandObjs;

import CommandPattern.executionObjs.GarageDoor;

//Command Object
public class GarageDoorCloseCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    //close command so execute closes the door
    public void execute() {
        garageDoor.close();
    }

    //close command so undo opens the door
    public void undo() {
        garageDoor.open();
    }
}
package CommandPattern.commandObjs;

import CommandPattern.executionObjs.LightBulb;

//Command Object
public class LightOffCommand implements Command {
    //this is the class that will actually do the work
    private LightBulb lightBulb;

    public LightOffCommand(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    public void execute() {
        lightBulb.off();
    }

    public void undo() {
        lightBulb.on();
    }
}

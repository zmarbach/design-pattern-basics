package designpatterns.CommandPattern.commandObjs;

import designpatterns.CommandPattern.executionObjs.LightBulb;

//Command Object
public class LightOnCommand implements Command {
    //this is the class that will actually do the work
    private LightBulb lightBulb;

    public LightOnCommand(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    public void execute() {
        lightBulb.on();
    }

    public void undo() {
        lightBulb.off();
    }
}

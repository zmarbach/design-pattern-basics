package designpatterns.CommandPattern;

import designpatterns.CommandPattern.commandObjs.*;
import designpatterns.CommandPattern.executionObjs.Fan;
import designpatterns.CommandPattern.executionObjs.GarageDoor;
import designpatterns.CommandPattern.executionObjs.LightBulb;
import designpatterns.ParentMain;

public class CommandMain extends ParentMain {
        public CommandMain(String patternName) {
                super(patternName);
        }

        @Override
    public void execute() {
        //encapsulates a request as an object (includes the Object that will actually do the work and the method that will be called on that Object)
        //buffer between Invoker and Receiver
        //Invoker = Waitress, Command Object = OrderSlip, Receiver = Cook
        //Invoker = You, Command Object = Remote Control, Receiver = TV, Light, Fan, etc
            System.out.println("---------- COMMAND PATTERN ----------");
            RemoteControl remoteControl = new RemoteControl();
            LightBulb lightBulb = new LightBulb();
            GarageDoor garageDoor = new GarageDoor();
            Fan fan = new Fan();

            //make command objects, passing in the Object that will actually DO THE WORK (in this case, turn on/off light)
            LightOnCommand lightOnCommand = new LightOnCommand(lightBulb);
            LightOffCommand lightOffCommand = new LightOffCommand(lightBulb);
            GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
            GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
            FanLowCommand fanLowCommand = new FanLowCommand(fan);
            FanHighCommand fanHighCommand = new FanHighCommand(fan);
            FanOffCommand fanOffCommand = new FanOffCommand(fan);

            //program button on remote with light ON command
            remoteControl.setButton(lightOnCommand);
            remoteControl.pressExecuteButton();

            //program button on remote with light OFF command
            remoteControl.setButton(lightOffCommand);
            remoteControl.pressExecuteButton();

            remoteControl.setButton(garageDoorOpenCommand);
            //door is opened and then closed cuz of UNDO
            remoteControl.pressExecuteButton();
            remoteControl.pressUndoButton();

            //fan is turned on HIGH, then LOW, then undo, so should be back to HIGH
            //could implement stack if want to do multiple undo operations
            remoteControl.setButton(fanHighCommand);
            remoteControl.pressExecuteButton();
            remoteControl.setButton(fanLowCommand);
            remoteControl.pressExecuteButton();
            remoteControl.pressUndoButton();
    }
}

package designpatterns.CommandPattern.commandObjs;

import designpatterns.CommandPattern.executionObjs.Fan;

//Command Object
public class FanOffCommand implements Command {
    private Fan fan;
    String prevSpeed;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        //store prevSpeed before changing speed so we can undo it later if necessary
        prevSpeed = fan.getSpeed();
        fan.off();
    }

    @Override
    public void undo() {
        //restore speed based on what the prevSpeed was
        if(prevSpeed == fan.getHigh()){
            fan.high();
        } else if(prevSpeed == fan.getMedium()){
            fan.medium();
        } else if(prevSpeed == fan.getLow()){
            fan.low();
        } else if (prevSpeed == fan.getOff()){
            fan.off();
        }
    }
}

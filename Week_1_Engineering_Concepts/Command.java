package Week_1_Engineering_Concepts.DesignPatternsMaster;
// Save as Command.java
public interface Command { void execute(); }

class Light {
    public void turnOn() { System.out.println("Light is ON"); }
    public void turnOff() { System.out.println("Light is OFF"); }
}

class LightOnCommand implements Command {
    private Light light; public LightOnCommand(Light l) { this.light = l; }
    public void execute() { light.turnOn(); }
}
class LightOffCommand implements Command {
    private Light light; public LightOffCommand(Light l) { this.light = l; }
    public void execute() { light.turnOff(); }
}

class RemoteControl {
    private Command slot;
    public void setCommand(Command c) { this.slot = c; }
    public void pressButton() { slot.execute(); }
}
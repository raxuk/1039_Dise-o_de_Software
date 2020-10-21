package buttonlamp1;

public class Button {
    Lamp lamp;
    boolean lampStatus;

    public Button(Lamp lamp) {
        this.lamp = lamp;
        this.lampStatus = false;
    }

    public void click() {
        if (!lampStatus) {
            lampStatus = true;
            lamp.turnOn();
        } else {
            lampStatus = false;
            lamp.turnOff();
        }
    }
}

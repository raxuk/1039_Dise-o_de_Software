package buttonlamp2;

public class Lamp implements IActivable {

    public void turnOn() {
        System.out.println("Turned on");
    }

    public void turnOff() {
        System.out.println("Turned off");
    }
}

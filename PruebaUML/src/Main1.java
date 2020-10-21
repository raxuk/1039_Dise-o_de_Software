import buttonlamp1.Button;
import buttonlamp1.Lamp;

public class Main1 {
    public void main(String[] args) {
        Lamp lamp = new Lamp();
        Button button = new Button(lamp);

        button.click();
        button.click();
    }

}

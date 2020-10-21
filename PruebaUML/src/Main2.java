import buttonlamp2.Button;
import buttonlamp2.IActivable;
import buttonlamp2.Lamp;

public class Main2 {
    public void main(String[] args) {
        IActivable lamp = new Lamp();
        Button button = new Button(lamp);

        button.click();
        button.click();
    }

}

import buttonlamp3.IActivable;
import buttonlamp3.IClickable;
import buttonlamp3.Injector;

public class Main3 {
    public static void main(String[] args) {
        Injector injector = new Injector();
        IActivable lamp = injector.createActivable();
        IClickable button = injector.createClickable(lamp);

        button.click();
        button.click();
    }
}

package buttonlamp3;

public class Injector {
    public IActivable createActivable(){
        return new Lamp();
    }

    public IClickable createClickable(IActivable activable){
        return new Button(activable);
    }

}

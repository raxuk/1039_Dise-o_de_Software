package abstracts;

import enums.Directions;
import interfaces.ICharacterClass;
import interfaces.IMount;
import interfaces.IWeapon;

public abstract class ACharacter {
    public abstract void eligeArma(IWeapon weapon);

    public abstract void utilizaArma();

    public abstract void eligeMontura(IMount mount);

    public abstract void utilizaMontura(int distancia, Directions direction);

    public abstract void eligeClase(ICharacterClass charClassType);

    public abstract void info();
}

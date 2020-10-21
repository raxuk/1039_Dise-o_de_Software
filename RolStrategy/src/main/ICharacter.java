package main;

import enums.Directions;
import models.CharacterClass;
import models.Mount;
import models.Weapon;

public abstract class ICharacter {
    public abstract void eligeArma(Weapon weapon);

    public abstract void utilizaArma();

    public abstract void eligeMontura(Mount mount);

    public abstract void utilizaMontura(int distancia, Directions direction);

    public abstract void eligeClase(CharacterClass charClassType);

    public abstract void info();
}

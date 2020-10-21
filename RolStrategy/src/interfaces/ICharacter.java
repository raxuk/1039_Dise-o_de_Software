package interfaces;

import enums.Directions;
import models.CharacterClass;
import models.Mount;
import models.Weapon;

public interface ICharacter {
    void eligeArma(Weapon weapon);
    void utilizaArma();
    void eligeMontura(Mount mount);
    void utilizaMontura(int distancia, Directions direction);
    void eligeClase(CharacterClass charClassType);
    void info();

}

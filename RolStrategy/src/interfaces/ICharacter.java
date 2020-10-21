package interfaces;

import models.Mount;
import models.Weapon;

public interface ICharacter {
    void eligeArma(Weapon weapon);
    void utilizaArma();
    void eligeMontura(Mount mount);
    void utilizaMontura(int distancia, int direccion);
    void info();

}

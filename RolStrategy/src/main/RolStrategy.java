package main;

import enums.CharacterClassType;
import enums.Directions;
import interfaces.IWarehouse;
import models.Character;
import models.CharacterClass;
import models.Mount;
import models.Weapon;

public class RolStrategy {

    public static void main(String[] args) {
        IWarehouse warehouse = new Warehouse();
        //////////////////////////////////////
        Character character = warehouse.newCharacter("Pepe García López");
        CharacterClass charClass = warehouse.getCharClass(CharacterClassType.KNIGHT);
        Weapon weapon = warehouse.getRandomSword();
        Mount mount = warehouse.getRandomHorse();
        //////////////////////////////////////
        character.eligeClase(charClass);
        character.eligeArma(weapon);
        character.eligeMontura(mount);
        //////////////////////////////////////
        character.utilizaMontura(100, Directions.NORTH);
        character.utilizaArma();
    }

}

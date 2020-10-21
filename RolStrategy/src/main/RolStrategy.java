package main;

import enums.CharacterClassType;
import enums.Directions;
import interfaces.ICharacterClass;
import interfaces.IMount;
import interfaces.IWarehouse;
import interfaces.IWeapon;
import models.Character;

public class RolStrategy {

    public static void main(String[] args) {
        IWarehouse warehouse = new Warehouse();
        //////////////////////////////////////
        Character character = warehouse.newCharacter("Pepe García López");
        ICharacterClass charClass = warehouse.getCharClass(CharacterClassType.KNIGHT);
        IWeapon weapon = warehouse.getRandomSword();
        IMount mount = warehouse.getRandomHorse();
        //////////////////////////////////////
        character.eligeClase(charClass);
        character.eligeArma(weapon);
        character.eligeMontura(mount);
        //////////////////////////////////////
        character.utilizaMontura(100, Directions.NORTH);
        character.utilizaArma();
    }

}

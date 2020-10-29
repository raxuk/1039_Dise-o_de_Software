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
        String name = "Pepe García López";
        Character character = warehouse.newCharacter(name, CharacterClassType.KNIGHT);
        IWeapon weapon = warehouse.getRandomSword();
        IMount mount = warehouse.getRandomHorse();
        //////////////////////////////////////
        character.eligeArma(weapon);
        character.eligeMontura(mount);
        //////////////////////////////////////
        character.utilizaMontura(100, Directions.NORTH);
        character.utilizaArma();
    }

}

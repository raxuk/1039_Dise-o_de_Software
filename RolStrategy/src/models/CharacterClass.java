package models;

import enums.CharacterClassType;
import interfaces.ICharacterClass;

public class CharacterClass implements ICharacterClass {
    private CharacterClassType type;

    @Override
    public CharacterClassType getType() {
        return type;
    }


}

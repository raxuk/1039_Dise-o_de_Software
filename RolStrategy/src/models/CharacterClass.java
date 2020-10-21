package models;

import enums.CharacterClassType;
import interfaces.ICharacterClass;

public class CharacterClass implements ICharacterClass {
    private final CharacterClassType type;

    public CharacterClass(CharacterClassType type) {
        this.type = type;
    }

    @Override
    public CharacterClassType getType() {
        return type;
    }


}

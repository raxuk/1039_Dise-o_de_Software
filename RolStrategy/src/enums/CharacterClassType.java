package enums;

public enum CharacterClassType {
    SOLDIER("Soldado"),
    KNIGHT("Caballero"),
    WIZARD("Mago");

    private final String classType;

    CharacterClassType(final String classType) {
        this.classType = classType;
    }

    @Override
    public String toString() {
        return classType;
    }
}

package enums;

public enum CharacterClass {
    SOLDIER("Soldado"),
    KNIGHT("Caballero"),
    WIZARD("Mago");

    private final String classType;

    CharacterClass(final String classType) {
        this.classType = classType;
    }

    @Override
    public String toString() {
        return classType;
    }
}

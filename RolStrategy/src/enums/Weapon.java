package enums;

public enum Weapon {
    SWORD("Espada"),
    BOW("Arco"),
    DISARMED("Desarmado");

    private final String weaponName;

    Weapon(final String weaponName) {
        this.weaponName = weaponName;
    }

    @Override
    public String toString() {
        return weaponName;
    }
}
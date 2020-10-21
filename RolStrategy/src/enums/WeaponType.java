package enums;

public enum WeaponType {
    SWORD("Espada"),
    BOW("Arco"),
    DISARMED("Desarmado");

    private final String weaponName;

    WeaponType(final String weaponName) {
        this.weaponName = weaponName;
    }

    @Override
    public String toString() {
        return weaponName;
    }
}
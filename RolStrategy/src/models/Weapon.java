package models;

import enums.WeaponType;
import interfaces.IWeapon;

public class Weapon implements IWeapon {
    private final WeaponType type;
    private final String name;
    private final float damage;

    public Weapon(WeaponType type, String name, float damage) {
        this.type = type;
        this.name = name;
        this.damage = damage;
    }

    @Override
    public WeaponType getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getDamage() {
        return damage;
    }
}

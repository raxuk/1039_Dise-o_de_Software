package models;

import interfaces.IWeapon;

public class Weapon implements IWeapon {
    enums.Weapon type;
    String name;
    float damage;

    @Override
    public enums.Weapon getType() {
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

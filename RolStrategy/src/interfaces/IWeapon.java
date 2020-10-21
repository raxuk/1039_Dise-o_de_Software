package interfaces;

import enums.Weapon;

public interface IWeapon {
    Weapon getType();
    String getName();
    float getDamage();
}

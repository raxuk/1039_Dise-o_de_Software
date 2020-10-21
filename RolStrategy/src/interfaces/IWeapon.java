package interfaces;

import enums.WeaponType;

public interface IWeapon {
    WeaponType getType();
    String getName();
    float getDamage();
}

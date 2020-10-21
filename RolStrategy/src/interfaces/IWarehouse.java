package interfaces;

import enums.CharacterClassType;
import models.Mount;
import models.Weapon;

public interface IWarehouse {
    Weapon getRandomSword();
    Weapon getRandomBow();
    Weapon getDisarmed(CharacterClassType classType);

    Mount getRandomHorse();
    Mount getRandomDragon();
    Mount getNoMount(CharacterClassType classType);

    Weapon getSword(String swordName);
    Weapon getBow(String bowName);

    Mount getHorse(String horseName);
    Mount getDragon(String dragonName);
}

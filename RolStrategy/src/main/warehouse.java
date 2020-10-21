package main;

import enums.CharacterClassType;
import enums.MountType;
import enums.WeaponType;
import interfaces.IWarehouse;
import models.CharacterClass;
import models.Mount;
import models.Weapon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class warehouse implements IWarehouse {
    private HashMap<String, Float> swords;
    private HashMap<String, Float> bows;
    private HashMap<CharacterClassType, Float> disarmed;

    private HashMap<String, Float> horses;
    private HashMap<String, Float> dragons;
    private HashMap<CharacterClassType, Float> noMount;

    public warehouse() {
        this.swords = new HashMap<String, Float>() {{
            put("Cercenadora siniestra de El Jinete", 6.76f);
            put("Hoja oscura del arrepentido", 32f);
            put("Espada de Gladiador pecaminoso", 34.4f);
            put("Derrama sangre", 23.75f);
            put("Lacerador de trols", 18.9f);
            put("Aterra penas", 16.44f);
        }};

        this.bows = new HashMap<String, Float>() {{
            put("Arco de guerra de la Cacería Salvaje", 34.26f);
            put("Arco corto de sauce nocturno", 31.58f);
            put("Arco compuesto", 18.96f);
            put("Buscador de almas de Ulmath", 14.62f);
            put("Arco largo ígneo", 12.99f);
            put("Arco de la Reina del Invierno", 31.58f);
        }};

        this.disarmed = new HashMap<CharacterClassType, Float>() {{
            put(CharacterClassType.KNIGHT, 4f);
            put(CharacterClassType.SOLDIER, 2f);
            put(CharacterClassType.WIZARD, 1f);
        }};

        this.horses = new HashMap<String, Float>() {{
            put("Riendas del destrero de la muerte carmesí", 30f);
            put("Yegua resucitada", 35f);
            put("Palomino presto", 28.6f);
            put("Caballo de montaña", 25f);
            put("Desterro de la muerte de Acherus", 45f);
            put("Caballo de guerra de la alianza", 25f);
        }};

        this.dragons = new HashMap<String, Float>() {{
            put("Draco del Viento del Norte", 45.2f);
            put("Draco llameante", 46.1f);
            put("Draco vil", 46.5f);
            put("Draco de piedra Fosforescente", 43.8f);
            put("Presagista Crepuscular", 46.5f);
            put("Ultraxion", 55.5f);
        }};

        this.noMount = new HashMap<CharacterClassType, Float>() {{
            put(CharacterClassType.KNIGHT, 10f);
            put(CharacterClassType.SOLDIER, 8f);
            put(CharacterClassType.WIZARD, 6f);
        }};
    }

    @Override
    public Weapon getRandomSword() {
        Random random = new Random();
        List<String> keys = new ArrayList<>(this.swords.keySet());
        String randomSword = keys.get(random.nextInt(keys.size()));
        return new Weapon(WeaponType.SWORD, randomSword, this.swords.get(randomSword));
    }

    @Override
    public Weapon getRandomBow() {
        Random random = new Random();
        List<String> keys = new ArrayList<>(this.bows.keySet());
        String randomBow = keys.get(random.nextInt(keys.size()));
        return new Weapon(WeaponType.BOW, randomBow, this.bows.get(randomBow));
    }

    @Override
    public Weapon getDisarmed(CharacterClassType classType) {
        return new Weapon(WeaponType.DISARMED, classType.toString(), this.disarmed.get(classType));
    }

    @Override
    public Mount getRandomHorse() {
        Random random = new Random();
        List<String> keys = new ArrayList<>(this.horses.keySet());
        String randomHorse = keys.get(random.nextInt(keys.size()));
        return new Mount(MountType.HORSE, randomHorse, this.horses.get(randomHorse));
    }

    @Override
    public Mount getRandomDragon() {
        Random random = new Random();
        List<String> keys = new ArrayList<>(this.dragons.keySet());
        String randomDragon = keys.get(random.nextInt(keys.size()));
        return new Mount(MountType.DRAGON, randomDragon, this.horses.get(randomDragon));
    }

    @Override
    public Mount getNoMount(CharacterClassType classType) {
        return new Mount(MountType.NOMOUNT, classType.toString(), this.noMount.get(classType));
    }

    @Override
    public Weapon getSword(String swordName) {
        float damage = this.swords.get(swordName);
        return new Weapon(WeaponType.SWORD, swordName, damage);
    }

    @Override
    public Weapon getBow(String bowName) {
        float damage = this.bows.get(bowName);
        return new Weapon(WeaponType.BOW, bowName, damage);
    }

    @Override
    public Mount getHorse(String horseName) {
        float speed = this.horses.get(horseName);
        return new Mount(MountType.HORSE, horseName, speed);
    }

    @Override
    public Mount getDragon(String dragonName) {
        float speed = this.dragons.get(dragonName);
        return new Mount(MountType.DRAGON, dragonName, speed);
    }
}

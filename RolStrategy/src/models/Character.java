package models;

import enums.Directions;
import abstracts.ACharacter;
import interfaces.ICharacterClass;
import interfaces.IMount;
import interfaces.IWeapon;

import java.text.MessageFormat;

public class Character extends ACharacter {
    private final String name;
    private ICharacterClass tipo;
    private IWeapon weapon;
    private IMount mount;

    public Character(String name) {
        super();
        this.name = name;
    }


    /**
     * El personaje recibe un arma o la cambia
     *
     * @param weapon tipo de arma
     */
    @Override
    public void eligeArma(IWeapon weapon) {
        this.weapon = weapon;
    }

    /**
     * Muestra un mensaje mostrando el tipo de arma y la cantidad de daño
     */
    @Override
    public void utilizaArma() {
        System.out.println(MessageFormat.format("Has hecho {0} de daño con tu {1}, {2}.", this.weapon.getDamage(), this.weapon.getType().toString(), this.weapon.getName()));
    }

    /**
     * El personaje recibe una montura o la cambia
     *
     * @param mount tipo de montura
     */
    @Override
    public void eligeMontura(IMount mount) {
        this.mount = mount;
    }

    /**
     * Muestra un mensaje indicando el tipo de montura, la dirección y la duración del viaje
     *
     * @param distancia cantidad de distancia en metros
     * @param direction dirección del viaje
     */
    @Override
    public void utilizaMontura(int distancia, Directions direction) {
        float duration = this.mount.travelDuration(distancia);
        System.out.println(MessageFormat.format("Has viajado {0}m dirección {1} con tu {2}, {3}, en {4} segundos.", distancia, direction.toString(), this.mount.getType().toString(), this.mount.getName(), duration));
    }

    /**
     * El personaje elige una clase o la cambia
     *
     * @param charClassType clase del personaje
     */
    @Override
    public void eligeClase(ICharacterClass charClassType) {
        this.tipo = charClassType;
    }

    /**
     * Muestra por pantalla el tipo de personaje,
     * su nombre, su arma, los puntos de daño de su arma y su tipo
     * montura.
     */
    @Override
    public void info() {
        System.out.println(MessageFormat.format("{0} {1}", this.name, this.tipo.toString()));
        System.out.println(MessageFormat.format("{0} - {1} - {2} damage", this.weapon.getType().toString(), this.weapon.getName(), this.weapon.getDamage()));
    }
}

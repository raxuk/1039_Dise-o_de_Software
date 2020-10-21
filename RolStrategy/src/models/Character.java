package models;

import interfaces.ICharacter;

import java.text.MessageFormat;

public class Character implements ICharacter {
    String name;
    CharacterClass tipo;
    Weapon weapon;
    Mount mount;

    public Character(String name) {
        this.name = name;
    }


    /**
     * El personaje recibe un arma o la cambia
     *
     * @param weapon tipo de arma
     */
    @Override
    public void eligeArma(Weapon weapon) {
        this.weapon = weapon;
    }

    /**
     * Muestra un mensaje mostrando el tipo de arma y la cantidad de daño
     */
    @Override
    public void utilizaArma() {
        System.out.println("");

    }

    /**
     * El personaje recibe una montura o la cambia
     *
     * @param mount tipo de montura
     */
    @Override
    public void eligeMontura(Mount mount) {
        this.mount = mount;
    }

    /**
     * Muestra un mensaje indicando el tipo de montura, la dirección y la duración del viaje
     *
     * @param distancia cantidad de distancia en metros
     * @param direccion dirección en numero (0 - norte, 1 - este, 2 - sur, 3 - oeste)
     */
    @Override
    public void utilizaMontura(int distancia, int direccion) {
        System.out.println("muestra un mensaje indicando el tipo de montura, la dirección y la duración del viaje");
    }

    /**
     * Muestra por pantalla el tipo de personaje,
     * su nombre, su arma, los puntos de daño de su arma y su tipo
     * montura.
     */
    @Override
    public void info() {
        System.out.println(MessageFormat.format("{0} {1}", this.name, this.tipo.toString()));
        System.out.println(MessageFormat.format("{0} {1} {2} damage", this.weapon.getType(), this.weapon.getName(), this.weapon.getDamage()));

    }
}

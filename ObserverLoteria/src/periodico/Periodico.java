package periodico;

import jugador.IObserverJugador;
import loteriaPrimitiva.IObserverLoteria;

import java.text.MessageFormat;
import java.util.HashSet;

public class Periodico implements IObserverJugador, IObserverLoteria {
    private final int numerosLoteria = 6;
    private int[] numeroAciertos = new int[this.numerosLoteria + 1];
    private HashSet<Integer> numeroGanador;


    @Override
    public void numerosGanadores(HashSet<Integer> numerosGanadores) {
        this.numeroGanador = numerosGanadores;
    }

    @Override
    public void acertante(int aciertos) {
        this.numeroAciertos[aciertos] += 1;
    }

    /**
     * Muestra el número ganador de la loteria y el número de acertantes
     */
    public void show() {
        System.out.println(MessageFormat.format("Números ganadores del sorteo: {0} \nNúmero de aciertantes de: \n \t3 números: {1} \n \t4 números: {2} \n \t5 números: {3} \n \t6 números: {4} ", this.numeroGanador, this.numeroAciertos[3], this.numeroAciertos[4], this.numeroAciertos[5], this.numeroAciertos[6]));
    }
}

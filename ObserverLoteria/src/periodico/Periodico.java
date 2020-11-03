package periodico;

import java.text.MessageFormat;
import java.util.HashSet;

public class Periodico implements IPeriodico {
    private final int numerosLoteria = 6;
    private int[] numeroAciertos = new int[this.numerosLoteria+1];
    private HashSet<Integer> numeroGanador;


    @Override
    public void acertante(int aciertos) {
        this.numeroAciertos[aciertos] += 1;
    }

    @Override
    public void numeroGanador(HashSet<Integer> numeroGanador) {
        this.numeroGanador = numeroGanador;
    }

    @Override
    public void show() {
        System.out.println(MessageFormat.format("Números ganadores del sorteo: {0} \n Número de aciertantes de: \n \t 3 números: {1} \n \t 4 números: {2} \n \t 5 números: {3} \n \t 6 números: {4} ", this.numeroGanador, this.numeroAciertos[3], this.numeroAciertos[4], this.numeroAciertos[5], this.numeroAciertos[6]));
    }
}

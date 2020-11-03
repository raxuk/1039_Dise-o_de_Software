package jugador;

import loteriaPrimitiva.IObserverLoteria;
import periodico.ISubjectPeriodico;
import periodico.Periodico;

import java.text.MessageFormat;
import java.util.HashSet;

public class Jugador implements IObserverLoteria, ISubjectPeriodico {
    private final String nombre;
    private final HashSet<Integer> numerosJugados;
    private Periodico periodico;
    private int aciertos;

    public Jugador(String nombre, HashSet<Integer> numerosJugados) {
        this.nombre = nombre;
        this.numerosJugados = numerosJugados;
    }

    @Override
    public void registerPeriodico(Periodico periodico) {
        this.periodico = periodico;
    }

    @Override
    public void removePeriodico(Periodico periodico) {
        this.periodico = null;
    }

    @Override
    public void numerosGanadores(HashSet<Integer> numerosGanadores) {
        this.aciertos = 0;

        for (Integer numerosJugado : numerosJugados) {
            if (numerosGanadores.contains(numerosJugado)) {
                aciertos++;
            }
        }
        this.periodico.acertante(this.aciertos);
//        display();
    }

    private void display() {
        System.out.println(MessageFormat.format("Jugador: {0} \t Número de aciertos: {1}", this.nombre, this.aciertos));
    }
}

package jugador;

import java.text.MessageFormat;
import java.util.TreeSet;

public class Jugador implements IJugador {
    private final String nombre;
    private final TreeSet<Integer> numerosJugados;

    public Jugador(String nombre, TreeSet<Integer> numerosJugados) {
        this.nombre = nombre;
        this.numerosJugados = numerosJugados;
    }

    @Override
    public void numeroAciertos(TreeSet<Integer> numerosGanadores) {
        int aciertos = 0;

        for (Integer numerosJugado : numerosJugados) {
            if (numerosGanadores.contains(numerosJugado)) {
                aciertos++;
            }
        }

        System.out.println(MessageFormat.format("Jugador: {0} \t Número de aciertos: {1}", this.nombre, aciertos));
    }
}

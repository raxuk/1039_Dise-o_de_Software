package loteriaPrimitiva;

import jugador.ISubjectJugador;
import jugador.Jugador;
import periodico.ISubjectPeriodico;
import periodico.Periodico;
import utils.GeneradorNumeroLoteria;

import java.util.ArrayList;
import java.util.HashSet;

public class Loteria implements ISubjectJugador, ISubjectPeriodico {
    private HashSet<Integer> numeroGanador;
    private ArrayList<Jugador> jugadores;
    private Periodico periodico;

    public Loteria() {
        this.jugadores = new ArrayList<>();
    }

    @Override
    public void registerJugador(Jugador jugador) {
        this.jugadores.add(jugador);
    }

    @Override
    public void removeJugador(Jugador jugador) {
        this.jugadores.remove(jugador);
    }

    @Override
    public void registerPeriodico(Periodico periodico) {
        this.periodico = periodico;
    }

    @Override
    public void removePeriodico(Periodico periodico) {
        this.periodico = null;
    }

    /**
     * Genera un nuevo numero ganador de loteria y anunca a los jugadores el numero
     */
    public void nuevoSorteo() {
        this.numeroGanador = GeneradorNumeroLoteria.generarNumero();
        this.periodico.numerosGanadores(this.numeroGanador);
        for (Jugador jugador : jugadores) {
            jugador.numerosGanadores(numeroGanador);
        }
    }
}

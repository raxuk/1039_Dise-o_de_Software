package loteriaPrimitiva;

import jugador.IJugador;
import periodico.IPeriodico;
import utils.GeneradorNumeroLoteria;

import java.util.ArrayList;
import java.util.HashSet;

public class Loteria implements ILoteria {
    private HashSet<Integer> numeroGanador;
    private ArrayList<IJugador> jugadores;
    private IPeriodico periodico;

    public Loteria() {
        this.jugadores = new ArrayList<>();
    }

    @Override
    public void registerJugador(IJugador jugador) {
        this.jugadores.add(jugador);
    }

    @Override
    public void removeJugador(IJugador jugador) {
        this.jugadores.remove(jugador);
    }

    @Override
    public void registerPeriodico(IPeriodico periodico) {
        this.periodico = periodico;
    }

    @Override
    public void removePeriodico(IPeriodico periodico) {
        this.periodico =  null;
    }

    @Override
    public void nuevoSorteo() {
        this.numeroGanador = GeneradorNumeroLoteria.generarNumero();
        this.periodico.numeroGanador(this.numeroGanador);
        for (IJugador jugador : jugadores){
            jugador.numeroAciertos(numeroGanador);
        }
    }
}

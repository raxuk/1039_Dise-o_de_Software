package loteriaPrimitiva;

import jugador.IJugador;
import utils.GeneradorNumeroLoteria;

import java.util.ArrayList;
import java.util.TreeSet;

public class Loteria implements ILoteria {
    ArrayList<IJugador> jugadores;

    public Loteria() {
        this.jugadores = new ArrayList<IJugador>();
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
    public void nuevoSorteo() {
        TreeSet<Integer> numeroGanador = GeneradorNumeroLoteria.generarNumero();
        for (IJugador jugador : jugadores){
            jugador.numeroAciertos(numeroGanador);
        }
    }
}

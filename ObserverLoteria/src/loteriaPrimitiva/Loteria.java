package loteriaPrimitiva;

import jugador.IJugador;
import utils.GeneradorNumeroLoteria;

import java.util.ArrayList;
import java.util.HashSet;

public class Loteria implements ILoteria {
    ArrayList<IJugador> jugadores;

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
    public void nuevoSorteo() {
        HashSet<Integer> numeroGanador = GeneradorNumeroLoteria.generarNumero();
        for (IJugador jugador : jugadores){
            jugador.numeroAciertos(numeroGanador);
        }
    }
}

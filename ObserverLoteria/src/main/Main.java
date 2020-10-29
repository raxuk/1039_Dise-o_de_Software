package main;

import jugador.IJugador;
import jugador.Jugador;
import loteriaPrimitiva.ILoteria;
import loteriaPrimitiva.Loteria;
import utils.GeneradorNumeroLoteria;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int numeroJugadores = 10;
        //////////////////////////////////////////////////////////
        ILoteria loteria = new Loteria();
        //////////////////////////////////////////////////////////
        ArrayList<IJugador> jugadores = new ArrayList<IJugador>();
        for (int i = 0; i < numeroJugadores; i++) {
            IJugador j = new Jugador("jugador_" + i, GeneradorNumeroLoteria.generarNumero());
            loteria.registerJugador(j);
        }
        //////////////////////////////////////////////////////////
        loteria.nuevoSorteo();
    }

}

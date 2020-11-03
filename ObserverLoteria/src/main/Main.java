package main;

import jugador.Jugador;
import loteriaPrimitiva.Loteria;
import periodico.Periodico;
import utils.GeneradorNumeroLoteria;

public class Main {

    public static void main(String[] args) {
        int numeroJugadores = 1000000;
        //////////////////////////////////////////////////////////
        Loteria loteria = new Loteria();
        Periodico periodico = new Periodico();
        //////////////////////////////////////////////////////////
        loteria.registerPeriodico(periodico);
        //////////////////////////////////////////////////////////
        for (int i = 0; i < numeroJugadores; i++) {
            Jugador j = new Jugador("jugador_" + i, GeneradorNumeroLoteria.generarNumero());
            loteria.registerJugador(j);
            j.registerPeriodico(periodico);
        }
        //////////////////////////////////////////////////////////
        loteria.nuevoSorteo();
        periodico.show();
    }

}

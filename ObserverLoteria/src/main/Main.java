package main;

import jugador.IJugador;
import jugador.Jugador;
import loteriaPrimitiva.ILoteria;
import loteriaPrimitiva.Loteria;
import periodico.IPeriodico;
import periodico.Periodico;
import utils.GeneradorNumeroLoteria;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int numeroJugadores = 1000000;
        //////////////////////////////////////////////////////////
        ILoteria loteria = new Loteria();
        IPeriodico periodico = new Periodico();
        //////////////////////////////////////////////////////////
        loteria.registerPeriodico(periodico);
        //////////////////////////////////////////////////////////
        for (int i = 0; i < numeroJugadores; i++) {
            IJugador j = new Jugador("jugador_" + i, GeneradorNumeroLoteria.generarNumero());
            loteria.registerJugador(j);
            j.registerPeriodico(periodico);
        }
        //////////////////////////////////////////////////////////
        loteria.nuevoSorteo();
        periodico.show();
    }

}

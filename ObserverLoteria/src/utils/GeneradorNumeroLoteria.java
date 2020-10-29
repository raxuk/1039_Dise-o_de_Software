package utils;

import java.util.Random;
import java.util.HashSet;

public class GeneradorNumeroLoteria {

    public static HashSet<Integer> generarNumero() {
        int longitudLoteria = 6;

        HashSet<Integer> numerosGanadores = new HashSet<>();

        Random r = new Random();
        int min = 1;
        int max = 49;

        while (numerosGanadores.size() < longitudLoteria) {
            numerosGanadores.add(r.nextInt(max - min) + min);
        }

        return numerosGanadores;
    }
}

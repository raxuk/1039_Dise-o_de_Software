package utils;

import java.util.Random;
import java.util.TreeSet;

public class GeneradorNumeroLoteria {

    public static TreeSet<Integer> generarNumero() {
        int longitudLoteria = 6;

        TreeSet<Integer> numerosGanadores = new TreeSet<Integer>();

        Random r = new Random();
        int min = 1;
        int max = 49;

        for (int i = 0; i < longitudLoteria; i++) {
            numerosGanadores.add(r.nextInt(max - min) + min);
        }

        return numerosGanadores;
    }}

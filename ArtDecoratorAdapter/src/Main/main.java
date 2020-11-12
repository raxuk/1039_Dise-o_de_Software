package Main;

import ASCII.AsciiArt;
import ASCII.Cuadrado;
import ASCII.Triangulo;
import Decorators.DuplicaHorizontal;
import Decorators.Marco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<AsciiArt> cosas = new ArrayList<AsciiArt>();
        cosas.add(new Cuadrado(3, 'o'));
        cosas.add(new Triangulo(5, 't'));
        for (AsciiArt cosa : cosas) {
            Dibuja(new Marco(new DuplicaHorizontal(new Marco(cosa, '#')), '@'));
        }
    }


    public static void Dibuja(AsciiArt asciiArt) {
        for(String linea : asciiArt.getLineas()){
            System.out.println(linea);
        }
        System.out.println();
    }
}
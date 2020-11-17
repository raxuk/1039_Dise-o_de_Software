package Main;

import ASCII.AsciiArt;
import ASCII.Cuadrado;
import ASCII.Triangulo;
import Adapter.StringArt2AsciiArt;
import StringArt.*;
import Decorators.DuplicaHorizontal;
import Decorators.Marco;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
//        pruebaParte1();
        pruebaParte2();
    }


    public static void Dibuja(AsciiArt asciiArt) {
        for (String linea : asciiArt.getLineas()) {
            System.out.println(linea);
        }
        System.out.println();
    }

    public static void pruebaParte1() {
        List<AsciiArt> cosas = new ArrayList<AsciiArt>();
        cosas.add(new Cuadrado(3, 'o'));
        cosas.add(new Triangulo(5, 't'));
        for (AsciiArt cosa : cosas) {
            Dibuja(new Marco(new DuplicaHorizontal(cosa), '@'));
        }
    }

    public static void pruebaParte2() {
        List<StringArt> animales = new ArrayList<StringArt>();
        animales.add(new Rana());
        animales.add(new Murcielago());
        for (StringArt animal : animales) {
            Dibuja(new Marco(new DuplicaHorizontal(new Marco(new StringArt2AsciiArt(animal), '#')), '#'));
        }
    }
}
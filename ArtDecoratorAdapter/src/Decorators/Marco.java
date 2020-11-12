package Decorators;

import ASCII.AsciiArt;
import ASCII.AsciiArtDecorator;

public class Marco extends AsciiArtDecorator {
    private char caracterMarco;
    private AsciiArt asciiArt;

    public Marco(AsciiArt duplicaHorizontal, char caracterRelleno) {
        this.asciiArt = duplicaHorizontal;
        this.caracterMarco = caracterRelleno;

        int ancho = this.asciiArt.getAncho() + 2;
        int alto = this.asciiArt.getAlto() + 2;
        this.lineas = new String[alto];

        String marcoHorizontal = Character.toString(this.caracterMarco).repeat(ancho);
        this.lineas[0] = marcoHorizontal;
        this.lineas[alto - 1] = marcoHorizontal;
        for (int i = 0; i < this.asciiArt.getAlto(); i++) {
            StringBuilder fila = new StringBuilder();
            fila.append(caracterRelleno);
            fila.append(asciiArt.getLineas()[i]);
            int cantidadBlancos = ancho -2 - asciiArt.getLineas()[i].length();
            fila.append(" ".repeat(cantidadBlancos));
            fila.append(caracterRelleno);
            this.lineas[i + 1] = fila.toString();
        }
    }

}

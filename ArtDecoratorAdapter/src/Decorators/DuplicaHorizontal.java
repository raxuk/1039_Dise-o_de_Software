package Decorators;

import ASCII.AsciiArt;
import ASCII.AsciiArtDecorator;

public class DuplicaHorizontal extends AsciiArtDecorator {
    AsciiArt asciiArt;

    public DuplicaHorizontal(AsciiArt asciiArt) {
        this.asciiArt = asciiArt;
        this.lineas = new String[asciiArt.getAlto()];
        for (int i = 0; i < asciiArt.getAlto(); i++) {
            this.lineas[i] = asciiArt.getLineas()[i].repeat(2);
        }
    }

}

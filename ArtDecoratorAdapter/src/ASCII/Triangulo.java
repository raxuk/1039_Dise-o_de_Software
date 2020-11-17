package ASCII;

public class Triangulo extends AsciiArt {

    public Triangulo(int longitud, char caracterRelleno) {
        this.lineas = new String[longitud];
        for (int i = 1; i <= longitud; i++) {
            this.lineas[i-1] = Character.toString(caracterRelleno).repeat(i);
        }
    }
}

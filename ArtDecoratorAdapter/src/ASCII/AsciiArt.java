package ASCII;

public abstract class AsciiArt {
    protected String[] lineas = {"XX", "XX"};

    public int getAncho() {
        int ancho = -1;
        for(String linea: lineas)
            ancho = Math.max(ancho, linea.length());

        return ancho;
    }

    public int getAlto() {
        return lineas.length;
    }

    public String[] getLineas() {
        return lineas;
    }

}

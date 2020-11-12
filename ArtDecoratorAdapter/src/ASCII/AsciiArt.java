package ASCII;

public abstract class AsciiArt {
    protected String[] lineas = {"XX", "XX"};

    public int getAncho() {
        return lineas[lineas.length-1].length();
    }

    public int getAlto() {
        return lineas.length;
    }

    public String[] getLineas() {
        return lineas;
    }

}

package formas;

import java.text.MessageFormat;

public class Rectangulo extends FormaComponent {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public Rectangulo(int x1, int y1, int x2, int y2) {
        super();
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    @Override
    public void dibuja() {
        System.out.println(MessageFormat.format("Rectangulo({0},{1},{2},{3})", this.x1, this.y1, this.x2, this.y2));
    }

    @Override
    public void desplazaRelativo(int x, int y) {
        this.x1 += x;
        this.x2 += x;
        this.y1 += y;
        this.y2 += y;
    }
}

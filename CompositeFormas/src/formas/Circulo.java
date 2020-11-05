package formas;

import utils.CompositeIterator;
import utils.NullIterator;

import java.text.MessageFormat;

public class Circulo extends FormaComponent {
    private int x1;
    private int y1;
    private int radio;
    private CompositeIterator iterator;

    public Circulo(int x1, int y1, int radio) {
        super();
        this.x1 = x1;
        this.y1 = y1;
        this.radio = radio;
    }

    @Override
    public void dibuja() {
        System.out.println(MessageFormat.format("Circulo({0},{1},{2})", this.x1, this.y1, this.radio));
    }

    @Override
    public void desplazaRelativo(int x, int y) {
        this.x1 += x;
        this.y1 += y;
    }

    @Override
    public CompositeIterator createIterator() {
        this.iterator = new CompositeIterator(new NullIterator());
        return this.iterator;
    }
}

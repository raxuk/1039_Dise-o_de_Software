package formas;

import utils.CompositeIterator;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class Forma extends FormaComponent {
    private ArrayList<FormaComponent> formas = new ArrayList<>();
    private String nombre;
    private CompositeIterator iterator;

    public Forma(String nombre) {
        super();
        this.nombre = nombre;
    }

    @Override
    public void dibuja() {
        System.out.println(MessageFormat.format("Forma({0}) {1}", this.nombre, '{'));
        System.out.print("\t".repeat(1));
        for (FormaComponent forma : formas) {
            forma.dibuja();
        }
        System.out.println("}");
    }

    @Override
    public void desplazaRelativo(int x, int y) {
        for (FormaComponent forma : formas) {
            forma.desplazaRelativo(x, y);
        }
    }

    @Override
    public void anade(FormaComponent fc) {
        this.formas.add(fc);
    }

    @Override
    public void elimina(FormaComponent fc) {
        this.formas.remove(fc);
    }

    @Override
    public FormaComponent profundidad(int i) {
        return this.formas.get(i);
    }

    @Override
    public CompositeIterator createIterator(){
        this.iterator = new CompositeIterator(formas.iterator());
        return this.iterator;
    }
}

package formas;

import utils.CompositeIterator;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public abstract class FormaComponent implements Iterable {
    public FormaComponent padre;

    public abstract void dibuja();

    public abstract void desplazaRelativo(int x, int y);

    public void anade(FormaComponent fc) {
        throw new UnsupportedOperationException();
    }

    public void elimina(FormaComponent fc) {
        throw new UnsupportedOperationException();
    }

    public FormaComponent profundidad(int i) {
        throw new UnsupportedOperationException();
    }

    public CompositeIterator createIterator() {
        throw new UnsupportedOperationException();
    }

    ///////////////////////////////////
    public Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    public void forEach(Consumer action) {
        throw new UnsupportedOperationException();
    }

    public Spliterator spliterator() {
        throw new UnsupportedOperationException();
    }
}


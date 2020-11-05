package formas;

public abstract class FormaComponent {
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
}

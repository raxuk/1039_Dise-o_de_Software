package periodico;

import java.util.HashSet;

public interface IPeriodico {
    void acertante(int aciertos);
    void numeroGanador(HashSet<Integer> numeroGanador);
    void show();
}

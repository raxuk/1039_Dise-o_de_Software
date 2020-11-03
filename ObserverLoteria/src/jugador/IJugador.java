package jugador;

import periodico.IPeriodico;

import java.util.HashSet;

public interface IJugador {
    void registerPeriodico(IPeriodico periodico);
    void removePeriodico(IPeriodico periodico);
    void numeroAciertos(HashSet<Integer> numerosGanadores);
}

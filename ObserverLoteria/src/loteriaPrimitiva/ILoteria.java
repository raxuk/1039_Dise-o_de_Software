package loteriaPrimitiva;


import jugador.IJugador;
import periodico.IPeriodico;

public interface ILoteria {
    void registerJugador(IJugador jugador);
    void removeJugador(IJugador jugador);
    void registerPeriodico(IPeriodico periodico);
    void removePeriodico(IPeriodico periodico);
    void nuevoSorteo();
}

package loteriaPrimitiva;


import jugador.IJugador;

public interface ILoteria {
    void registerJugador(IJugador jugador);
    void removeJugador(IJugador jugador);
    void nuevoSorteo();
}

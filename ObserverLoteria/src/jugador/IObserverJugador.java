package jugador;

public interface IObserverJugador {
    /**
     * Cada jugador pasará al observador la cantidad de aciertos que ha tenido
     * @param aciertos cantidad de aciertos de la loteria
     */
    void acertante(int aciertos);
}

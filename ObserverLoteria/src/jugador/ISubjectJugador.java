package jugador;

public interface ISubjectJugador {
    /** Para registrarse una instancia jugador como subject
     * @param jugador instancia de jugador
     */
    void registerJugador(Jugador jugador);

    /** Para eliminar una instancia de jugador guardada
     * @param jugador instancia de jugador
     */
    void removeJugador(Jugador jugador);
}

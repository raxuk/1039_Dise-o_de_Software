package loteriaPrimitiva;

import java.util.HashSet;

public interface IObserverLoteria {
    /** El observer será avisado de los números ganadores de la loteria
     * @param numerosGanadores HashSet de los números ganadores
     */
    void numerosGanadores(HashSet<Integer> numerosGanadores);
}

package periodico;

import periodico.Periodico;

public interface ISubjectPeriodico {
    /** Para registrarse una instancia periodico como subject
     * @param periodico instancia de periodico
     */
    void registerPeriodico(Periodico periodico);
    /** Para eliminar una instancia de periodico guardada
     * @param periodico instancia de periodico
     */
    void removePeriodico(Periodico periodico);
}

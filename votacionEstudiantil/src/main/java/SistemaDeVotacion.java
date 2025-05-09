import java.util.List;

public interface SistemaDeVotacion {
    /**
     * @pre El nombre no debe ser vacío ni repetido
     * @post Agrega un nuevo candidato al sistema
     */
    void agregarCandidato(String nombre);

    /**
     * @pre El nombre debe corresponder a un candidato existente
     * @post Suma un voto al candidato indicado
     */
    void votarPor(String nombre);

    /**
     * @post Devuelve una lista con los candidatos y su cantidad de votos, ordenados por cantidad descendente
     */
    List<Candidato> obtenerResultados();

    /**
     * @post Devuelve el nombre del candidato con más votos
     * @throws IllegalStateException si no hay candidatos
     */
    String obtenerGanador();
}

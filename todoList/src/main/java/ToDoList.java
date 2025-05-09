public interface ToDoList {
    /**
     * Add one task to the collection of tasks
     */
    boolean agregarTarea(String descripcion);

    /**
     * Remove the tasks that have match with the description
     * @return true iff the tasks was deleted
     */
    boolean eliminarTarea(String descripcion);

    /**
     * Change state true when the tasks was completed
     * @return
     */
    boolean marcarTareaComoHecha(String descripcion);
    
    /**
     * Show pendients tasks
     * @return
     */
    String mostrarTareasPendientes();

    /**
     * Show completed tasks
     * @return
     */
    String mostrarTareasCompletadas();
}

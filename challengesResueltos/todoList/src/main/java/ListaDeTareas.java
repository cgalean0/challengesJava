import java.util.*;

public class ListaDeTareas implements ToDoList {
    private Map<String, Boolean> tareas;

    public ListaDeTareas() {
        tareas = new LinkedHashMap<>();// conserva el orden de inserción
    }

    /**
     * @pre the task must not exist in the list!
     * @post Add the taks at the list
     */
    @Override
    public boolean agregarTarea(String descripcion) {
        
        if (!tareas.containsKey(descripcion)) {
            tareas.put(descripcion, false);
            return true;
        }
        return false;
    }

    /**
     * @post Delete the taks if this exist
     * @return true iff the tasks was deleted
     */
    @Override
    public boolean eliminarTarea(String descripcion) {

        if (tareas.containsKey(descripcion)) {
            tareas.remove(descripcion);
            return true;
        }
        return false;
    }

    /**
     * @post Marca la tarea como completada ssi existe y no esta completa
     * @return true iff the tasks was completed
     */
    @Override
    public boolean marcarTareaComoHecha(String descripcion) {
        if (tareas.containsKey(descripcion)) {
            tareas.put(descripcion, true);
            return true;
        }
        return false;
    }

    @Override
    public String mostrarTareasPendientes() {
        Map<String, Boolean> filtered = new HashMap<>();
        for (String key : tareas.keySet()) {
            if (tareas.get(key).equals(false)) {
                filtered.put(key, false);
            }
        }
        return filtered.toString();
    }

    @Override
    public String mostrarTareasCompletadas() {
        Map<String, Boolean> filtered = new HashMap<>();
        for (String key : tareas.keySet()) {
            if (tareas.get(key).equals(true)) {
                filtered.put(key, true);
            }
        }
        return filtered.toString();
    }
}


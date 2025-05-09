import java.util.*;

public class ListaDeTareas implements ToDoList {
    private Map<String, Boolean> tareas;

    public ListaDeTareas() {
        tareas = new LinkedHashMap<>();// conserva el orden de inserción
    }

    @Override
    public boolean agregarTarea(String descripcion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregarTarea'");
    }

    @Override
    public boolean eliminarTarea(String descripcion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarTarea'");
    }

    @Override
    public boolean marcarTareaComoHecha(String descripcion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'marcarTareaComoHecha'");
    }

    @Override
    public String mostrarTareasPendientes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarTareasPendientes'");
    }

    @Override
    public String mostrarTareasCompletadas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarTareasCompletadas'");
    }

    
}


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListaDeTareasTest {

    private ToDoList lista;

    @BeforeEach
    public void setUp() {
        lista = new ListaDeTareas();
    }

    @Test
    public void testAgregarTareaNueva() {
        assertTrue(lista.agregarTarea("Estudiar matemáticas"));
    }

    @Test
    public void testAgregarTareaDuplicada() {
        lista.agregarTarea("Estudiar Java");
        assertFalse(lista.agregarTarea("Estudiar Java")); // ya existe
    }

    @Test
    public void testEliminarTareaExistente() {
        lista.agregarTarea("Leer Clean Code");
        assertTrue(lista.eliminarTarea("Leer Clean Code"));
    }

    @Test
    public void testEliminarTareaInexistente() {
        assertFalse(lista.eliminarTarea("Tarea que no existe"));
    }

    @Test
    public void testMarcarTareaComoHechaExistente() {
        lista.agregarTarea("Practicar JUnit");
        assertTrue(lista.marcarTareaComoHecha("Practicar JUnit"));
    }

    @Test
    public void testMarcarTareaYaCompletada() {
        lista.agregarTarea("Entrenar calistenia");
        lista.marcarTareaComoHecha("Entrenar calistenia");
        assertFalse(lista.marcarTareaComoHecha("Entrenar calistenia")); // ya estaba hecha
    }

    @Test
    public void testMostrarTareasPendientes() {
        lista.agregarTarea("Comprar leche");
        lista.agregarTarea("Leer paper de grafos");
        lista.marcarTareaComoHecha("Comprar leche");

        String esperado = "Leer paper de grafos";
        assertEquals(esperado, lista.mostrarTareasPendientes());
    }

    @Test
    public void testMostrarTareasCompletadas() {
        lista.agregarTarea("Revisar notas de clase");
        lista.agregarTarea("Hacer resumen");
        lista.marcarTareaComoHecha("Hacer resumen");

        String esperado = "Hacer resumen";
        assertEquals(esperado, lista.mostrarTareasCompletadas());
    }

    @Test
    public void testMostrarTareasVacias() {
        assertEquals("", lista.mostrarTareasPendientes());
        assertEquals("", lista.mostrarTareasCompletadas());
    }
}

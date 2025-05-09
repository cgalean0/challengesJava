import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListaDeTareasTest {
    // @Test
    // public void tareasPendientesTest()
    // {
    //     ListaDeTareas tasks = new ListaDeTareas();
    //     tasks.agregarTarea("Salir a correr");
    //     tasks.agregarTarea("Salir a correr2");
    //     tasks.agregarTarea("Salir a correr3");
    //     tasks.agregarTarea("Salir a correr4");
    //     assertEquals(tasks.toString(), tasks.mostrarTareasPendientes());
    // }

    @Test
    public void tareasPendientesTest2()
    {
        ListaDeTareas tasks = new ListaDeTareas();
        tasks.agregarTarea("Salir a correr");
        tasks.agregarTarea("Salir a correr2");
        tasks.agregarTarea("Salir a correr3");
        tasks.agregarTarea("Salir a correr4");
        tasks.marcarTareaComoHecha("Salir a correr2");
        System.out.println(tasks.mostrarTareasPendientes());
    }

    // @Test
    // public void tareasCompletasTest()
    // {
    //     ListaDeTareas tasks = new ListaDeTareas();
    //     tasks.agregarTarea("Salir a correr");
    //     tasks.agregarTarea("Salir a correr2");
    //     tasks.agregarTarea("Salir a correr3");
    //     tasks.agregarTarea("Salir a correr4");
    //     tasks.marcarTareaComoHecha("Salir a correr");
    //     tasks.marcarTareaComoHecha("Salir a correr2");
    //     tasks.marcarTareaComoHecha("Salir a correr3");
    //     tasks.marcarTareaComoHecha("Salir a correr4");
    //     assertEquals(tasks.toString(), tasks.mostrarTareasCompletadas());
    // }

    @Test
    public void tareasCompletasTest2()
    {
        ListaDeTareas tasks = new ListaDeTareas();
        tasks.agregarTarea("Salir a correr");
        tasks.agregarTarea("Salir a correr2");
        tasks.agregarTarea("Salir a correr3");
        tasks.agregarTarea("Salir a correr4");
        tasks.marcarTareaComoHecha("Salir a correr2");
        System.out.println(tasks.mostrarTareasCompletadas());
    }
}

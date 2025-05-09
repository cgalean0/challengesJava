import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class BibliotecaSimpleTest {

    private BibliotecaSimple biblioteca;

    @BeforeEach
    public void setUp() {
        biblioteca = new BibliotecaSimple();
        biblioteca.agregarLibro(new Libro("El Principito", "Antoine de Saint-Exupéry", 1943));
        biblioteca.agregarLibro(new Libro("1984", "George Orwell", 1949));
        biblioteca.agregarLibro(new Libro("Fahrenheit 451", "Ray Bradbury", 1953));
    }

    @Test
    public void testAgregarLibro() {
        Libro nuevo = new Libro("Dune", "Frank Herbert", 1965);
        biblioteca.agregarLibro(nuevo);

        Libro resultado = biblioteca.buscarPorTitulo("Dune");
        assertEquals("Frank Herbert", resultado.getAutor());
    }

    @Test
    public void testEliminarLibroPorTitulo_Existente() {
        boolean eliminado = biblioteca.eliminarLibroPorTitulo("1984");
        assertTrue(eliminado);

        assertThrows(LibroNoEncontradoException.class, () -> {
            biblioteca.buscarPorTitulo("1984");
        });
    }

    @Test
    public void testEliminarLibroPorTitulo_NoExistente() {
        boolean eliminado = biblioteca.eliminarLibroPorTitulo("No Existe");
        assertFalse(eliminado);
    }

    @Test
    public void testBuscarPorTitulo_Existente() {
        Libro libro = biblioteca.buscarPorTitulo("Fahrenheit 451");
        assertEquals("Ray Bradbury", libro.getAutor());
    }

    @Test
    public void testBuscarPorTitulo_NoExistente() {
        assertThrows(LibroNoEncontradoException.class, () -> {
            biblioteca.buscarPorTitulo("Libro Fantasma");
        });
    }

    @Test
    public void testObtenerLibrosOrdenadosPorAutor() {
        List<Libro> ordenados = biblioteca.obtenerLibrosOrdenadosPorAutor();
        assertEquals("Antoine de Saint-Exupéry", ordenados.get(0).getAutor());
        assertEquals("George Orwell", ordenados.get(1).getAutor());
        assertEquals("Ray Bradbury", ordenados.get(2).getAutor());
    }

    @Test
    public void testObtenerLibrosOrdenadosPorAnio() {
        List<Libro> ordenados = biblioteca.obtenerLibrosOrdenadosPorAnio();
        assertEquals(1943, ordenados.get(0).getAnioPublicacion());
        assertEquals(1949, ordenados.get(1).getAnioPublicacion());
        assertEquals(1953, ordenados.get(2).getAnioPublicacion());
    }
}

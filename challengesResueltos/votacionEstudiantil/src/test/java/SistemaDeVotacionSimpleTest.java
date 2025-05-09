import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class SistemaDeVotacionSimpleTest {

    private SistemaDeVotacion sistema;

    @BeforeEach
    public void setUp() {
        sistema = new SistemaDeVotacionSimple();
    }

    @Test
    public void testAgregarCandidato() {
        sistema.agregarCandidato("Juan");
        assertEquals(1, sistema.obtenerResultados().size());
        assertEquals("Juan", sistema.obtenerResultados().get(0).getNombre());
    }

    @Test
    public void testAgregarCandidatoDuplicadoLanzaExcepcion() {
        sistema.agregarCandidato("Ana");
        assertThrows(IllegalArgumentException.class, () -> sistema.agregarCandidato("Ana"));
    }

    @Test
    public void testVotarPorCandidato() {
        sistema.agregarCandidato("Lucía");
        sistema.votarPor("Lucía");
        sistema.votarPor("Lucía");

        List<Candidato> resultados = sistema.obtenerResultados();
        assertEquals(2, resultados.get(0).getVotos());
    }

    @Test
    public void testVotarPorCandidatoInexistenteLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> sistema.votarPor("Pedro"));
    }

    @Test
    public void testObtenerResultadosOrdenCorrecto() {
        sistema.agregarCandidato("A");
        sistema.agregarCandidato("B");
        sistema.votarPor("B");
        sistema.votarPor("B");
        sistema.votarPor("A");

        List<Candidato> resultados = sistema.obtenerResultados();

        assertEquals("B", resultados.get(0).getNombre());
        assertEquals(2, resultados.get(0).getVotos());
        assertEquals("A", resultados.get(1).getNombre());
        assertEquals(1, resultados.get(1).getVotos());
    }

    @Test
    public void testObtenerGanador() {
        sistema.agregarCandidato("Carlos");
        sistema.agregarCandidato("Diana");

        sistema.votarPor("Carlos");
        sistema.votarPor("Carlos");
        sistema.votarPor("Diana");

        assertEquals("Carlos", sistema.obtenerGanador());
    }

    @Test
    public void testObtenerGanadorSinCandidatosLanzaExcepcion() {
        assertThrows(IllegalStateException.class, () -> sistema.obtenerGanador());
    }
}

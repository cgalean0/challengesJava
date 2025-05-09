import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AgendaSimpleTest {

    private AgendaDeContactos agenda;
    private Contacto contacto1;
    private Contacto contacto2;
    private Contacto contactoDuplicado;

    @BeforeEach
    public void setUp() {
        agenda = new AgendaDeContactos();
        contacto1 = new Contacto("Nahuel Díaz", "123456789", "nahuel@email.com", "Calle Falsa 123");
        contacto2 = new Contacto("Laura Gómez", "987654321", "laura@email.com", "Av. Siempreviva 742");
        contactoDuplicado = new Contacto("Nahuel Díaz", "123456789", "otro@email.com", "Otra Calle 456");
    }

    @Test
    public void testAgregarContacto() {
        agenda.agregarContacto(contacto1);
        assertEquals(contacto1, agenda.buscarPorNombre("Nahuel Díaz"));
    }

    @Test
    public void testAgregarContactoDuplicadoNoSeAgregaDosVeces() {
        agenda.agregarContacto(contacto1);
        agenda.agregarContacto(contactoDuplicado);
        List<Contacto> contactos = agenda.listarContactosOrdenadosPorNombre();
        assertEquals(1, contactos.size());
    }

    @Test
    public void testBuscarContactoExistente() {
        agenda.agregarContacto(contacto2);
        Contacto encontrado = agenda.buscarPorNombre("Laura Gómez");
        assertNotNull(encontrado);
        assertEquals(contacto2, encontrado);
    }

    @Test
    public void testBuscarContactoInexistenteDevuelveNull() {
        assertNull(agenda.buscarPorNombre("Inexistente"));
    }

    @Test
    public void testEliminarContacto() {
        agenda.agregarContacto(contacto1);
        assertTrue(agenda.eliminarContacto(contacto1));
        assertNull(agenda.buscarPorNombre("Nahuel Díaz"));
    }

    @Test
    public void testEliminarContactoInexistente() {
        assertFalse(agenda.eliminarContacto(contacto2));
    }

    @Test
    public void testListarContactosOrdenadosPorNombre() {
        agenda.agregarContacto(contacto2);
        agenda.agregarContacto(contacto1);

        List<Contacto> ordenados = agenda.listarContactosOrdenadosPorNombre();

        assertEquals(2, ordenados.size());
        assertEquals("Laura Gómez", ordenados.get(0).getNombreCompleto());
        assertEquals("Nahuel Díaz", ordenados.get(1).getNombreCompleto());
    }

    @Test
    public void testToStringContacto() {
        String esperado = "Nombre: Nahuel Díaz, Tel: 123456789, Email: nahuel@email.com, Dirección: Calle Falsa 123";
        assertEquals(esperado, contacto1.toString());
    }

    @Test
    public void testEqualsYHashCodeSonConsistentes() {
        assertEquals(contacto1, contactoDuplicado);
        assertEquals(contacto1.hashCode(), contactoDuplicado.hashCode());
    }

    @Test
    public void testToStringAgenda() {
        agenda.agregarContacto(contacto1);
        agenda.agregarContacto(contacto2);
        String resultado = agenda.toString();
        assertTrue(resultado.contains("Nahuel Díaz"));
        assertTrue(resultado.contains("Laura Gómez"));
    }
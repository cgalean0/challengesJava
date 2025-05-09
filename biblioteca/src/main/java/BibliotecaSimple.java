import java.util.ArrayList;
import java.util.List;

public class BibliotecaSimple implements Biblioteca{

    private List<Libro> libros;

    //Constructor de la clase
    public BibliotecaSimple()
    {
        libros = new ArrayList<>();
    }

    @Override
    public void agregarLibro(Libro libro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregarLibro'");
    }

    @Override
    public boolean eliminarLibroPorTitulo(String titulo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarLibroPorTitulo'");
    }

    @Override
    public Libro buscarPorTitulo(String titulo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorTitulo'");
    }

    @Override
    public List<Libro> obtenerLibrosOrdenadosPorAutor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerLibrosOrdenadosPorAutor'");
    }

    @Override
    public List<Libro> obtenerLibrosOrdenadosPorAnio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerLibrosOrdenadosPorAnio'");
    }

    
    
}

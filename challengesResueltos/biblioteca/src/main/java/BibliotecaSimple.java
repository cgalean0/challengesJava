import java.util.ArrayList;
import java.util.List;

public class BibliotecaSimple implements Biblioteca{

    private List<Libro> libros;

    //Constructor de la clase
    public BibliotecaSimple()
    {
        libros = new ArrayList<>();
    }

    /**
     * @pre libro no debe ser null.
     * @post Agrega un libro a la biblioteca.
     */
    @Override
    public void agregarLibro(Libro libro) throws IllegalArgumentException {
        libros.add(libro);
    }

    /**
     * @pre titulo no debe ser null ni vacío.
     * @post Elimina el libro si existe.
     * @return true si el libro fue eliminado, false si no existía.
     */
    @Override
    public boolean eliminarLibroPorTitulo(String titulo) {

        if (titulo.trim().isEmpty()) throw new IllegalArgumentException(); // Titulo vacío

        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getTitulo().equals(titulo)) {
                libros.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * @pre titulo no debe ser null ni vacío.
     * @post Devuelve el libro con ese título.
     * @throws LibroNoEncontradoException si no existe un libro con ese título.
     */
    @Override
    public Libro buscarPorTitulo(String titulo){

        if (titulo.trim().isEmpty()) throw new IllegalArgumentException(); // Titulo vacío
        
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }

        throw new LibroNoEncontradoException("El libro: " + titulo + ", No existe!!");
    }

    /**
     * @post Devuelve los libros ordenados alfabéticamente por autor.
     */
    @Override
    public List<Libro> obtenerLibrosOrdenadosPorAutor() {
        List<Libro> copia = new ArrayList<>(libros);
        //lambda expresion que compara los libros
        copia.sort((libro1, libro2) -> libro1.getAutor().compareToIgnoreCase(libro2.getAutor()));
        return copia;
    }

    /**
     * @post Devuelve los libros ordenados por año de publicación ascendente.
     */
    @Override
    public List<Libro> obtenerLibrosOrdenadosPorAnio() {
        List<Libro> copia = new ArrayList<>(libros);
        copia.sort((libro1, libro2) -> Integer.compare(libro1.getAnioPublicacion(), libro2.getAnioPublicacion()));
        return copia;
    }
    
}

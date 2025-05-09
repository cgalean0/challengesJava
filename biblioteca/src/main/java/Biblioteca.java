import java.util.List;

public interface Biblioteca {
    /**
     * @pre libro no debe ser null.
     * @post Agrega un libro a la biblioteca.
     */
    void agregarLibro(Libro libro);

    /**
     * @pre titulo no debe ser null ni vacío.
     * @post Elimina el libro si existe.
     * @return true si el libro fue eliminado, false si no existía.
     */
    boolean eliminarLibroPorTitulo(String titulo);

    /**
     * @pre titulo no debe ser null ni vacío.
     * @post Devuelve el libro con ese título.
     * @throws LibroNoEncontradoException si no existe un libro con ese título.
     */
    Libro buscarPorTitulo(String titulo);

    /**
     * @post Devuelve los libros ordenados alfabéticamente por autor.
     */
    List<Libro> obtenerLibrosOrdenadosPorAutor();

    /**
     * @post Devuelve los libros ordenados por año de publicación ascendente.
     */
    List<Libro> obtenerLibrosOrdenadosPorAnio();
}

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    /**
     * @pre titulo, autor no deben ser null o vacíos. anioPublicacion debe ser positivo.
     * @post Crea un libro con los datos especificados.
     */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + " (" + anioPublicacion + ")";
    }
}

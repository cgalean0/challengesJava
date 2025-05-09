public class Contacto {

    private String nombre;
    private String telefono;
    private String email;
    private String direccion;

    public Contacto(String nombre, String telefono, String email, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }

    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getTelefono() {
        throw new UnsupportedOperationException("Not supported yet.");        
    }

    public String getEmail() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getDireccion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean equals(Object obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("Not supported yet.");       
    }

}

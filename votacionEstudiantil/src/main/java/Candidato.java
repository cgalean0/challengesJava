public class Candidato {
    private String nombre;
    private int votos;

    public Candidato(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public int getVotos() { 
        return this.votos;
     }

    public void votar() { 
        this.votos++;
     }
}


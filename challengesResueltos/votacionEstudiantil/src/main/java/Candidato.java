public class Candidato {
    private String nombre;
    private int votos;


    public Candidato(String nombre) {
        this.nombre = nombre;
        this.votos = 0;
    }

    public Candidato(String nombre, Integer votos) {
        this.nombre = nombre;
        this.votos = votos;
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


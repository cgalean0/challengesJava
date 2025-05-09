import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class SistemaDeVotacionSimple implements SistemaDeVotacion {

    Map<String, Integer> listado;

    public SistemaDeVotacionSimple()
    {
        listado = new HashMap<>();
    }

    /**
     * @pre El nombre no debe ser vacío ni repetido
     * @post Agrega un nuevo candidato al sistema
     */
    @Override
    public void agregarCandidato(String nombre) {
        if (nombre.trim().isEmpty() || listado.containsKey(nombre)) throw new IllegalArgumentException();
        
        if (!listado.containsKey(nombre)) {
            listado.put(nombre, 0);//Los candidatos arrancan con 0 votos.
        }
    }

    /**
     * @post Devuelve el nombre del candidato con más votos
     * @throws IllegalStateException si no hay candidatos
     */
    @Override
    public String obtenerGanador() {
        if (!listado.isEmpty()) {
            List<Candidato> listado = obtenerResultados();
            return listado.get(0).getNombre();
        }
        throw new IllegalStateException();
    }

    /**
     * @post Devuelve una lista con los candidatos y su cantidad de votos, ordenados por cantidad descendente
     */
    @Override
    public List<Candidato> obtenerResultados() {
        //ordenamos los elementos por cant descendente de votos
        List<Map.Entry<String, Integer>> resultados = new ArrayList<>(listado.entrySet());
        resultados.sort((a, b) -> b.getValue() - a.getValue());

        List<Candidato> listOrd = new ArrayList();

        for (Map.Entry<String, Integer> entry : resultados) {
            String nombre = entry.getKey();
            Integer votos = entry.getValue();
            
            listOrd.add(new Candidato(nombre, votos));
        }

        return listOrd;
    }

    /**
     * @pre El nombre debe corresponder a un candidato existente
     * @post Suma un voto al candidato indicado
     */
    @Override
    public void votarPor(String nombre) {
       if (!listado.containsKey(nombre)) throw new IllegalArgumentException();

       listado.replace(nombre, listado.get(nombre), listado.get(nombre)+1);
       
    }
    
}

public class Colectivo extends Transporte implements Pasajeros {
    private int capacidad;
    private double tarifaPorKm;

    public Colectivo(String nombre, int capacidad, double tarifaPorKm) {
        super(nombre);
        this.capacidad = capacidad;
        if (tarifaPorKm < 0) throw new IllegalArgumentException();
        this.tarifaPorKm = tarifaPorKm;
    }

    @Override
    public int capacidadPasajeros() {
        return capacidad;
    }

    @Override
    public double calcularCosto(double distanciaKm) {
        return tarifaPorKm * distanciaKm;
    }
}

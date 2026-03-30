import java.util.ArrayList;
import java.util.List;

public class AgenciaAlquiler {
    private String nombre;
    private List<Vehiculo> flota;

    public AgenciaAlquiler(String nombre) {
        this.nombre = nombre;
        this.flota = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo v) {
        flota.add(v);
    }

    public void mostrarPresupuestos(int dias) {
        System.out.println("--- Presupuestos en " + nombre + " por " + dias + " días ---");
        for (Vehiculo v : flota) {
            System.out.println("Modelo: " + v.getModelo() +
                    " | Patente: " + v.getPatente() +
                    " | Total: $" + v.calcularAlquiler(dias));
        }
    }
}

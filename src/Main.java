public class Main {
    public static void main(String[] args) {
        AgenciaAlquiler miAgencia = new AgenciaAlquiler("GudiRent Cars");

        Vehiculo auto1 = new Auto("ABC-123", "Fiat Cronos", 15000, true);
        Vehiculo auto2 = new Auto("XYZ-987", "Renault Kwid", 12000, false);

        miAgencia.agregarVehiculo(auto1);
        miAgencia.agregarVehiculo(auto2);

        miAgencia.mostrarPresupuestos(5);
    }
}
public abstract class Vehiculo {
    private String patente;
    private String modelo;
    private double precioBaseDiario;

    public Vehiculo(String patente, String modelo, double precioBaseDiario) {
        this.patente = patente;
        this.modelo = modelo;
        this.precioBaseDiario = precioBaseDiario;
    }

    public abstract double calcularAlquiler(int dias);

    public String getPatente() { return patente; }
    public String getModelo() { return modelo; }
    public double getPrecioBaseDiario() { return precioBaseDiario; }
}


class Auto extends Vehiculo {
    private boolean tieneAireAcondicionado;

    public Auto(String patente, String modelo, double precioBase, boolean aire) {
        super(patente, modelo, precioBase);
        this.tieneAireAcondicionado = aire;
    }

    @Override
    public double calcularAlquiler(int dias) {
        double total = getPrecioBaseDiario() * dias;
        if (tieneAireAcondicionado) total += 500 * dias;
        return total;
    }
}

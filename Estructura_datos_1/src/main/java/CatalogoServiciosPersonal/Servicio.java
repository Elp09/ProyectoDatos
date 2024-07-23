package CatalogoServiciosPersonal;

public class Servicio {

    // Atributos privados
    private String descripcion;
    private double costo;
    private int cantidadPersonasACargo;

    // Constructor vacío
    public Servicio() {
    }

    // Constructor con parámetros
    public Servicio(String descripcion, double costo, int cantidadPersonasACargo) {
        this.descripcion = descripcion;
        this.costo = costo;
        this.cantidadPersonasACargo = cantidadPersonasACargo;
    }

    // Getters y Setters para cada atributo
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCantidadPersonasACargo() {
        return cantidadPersonasACargo;
    }

    public void setCantidadPersonasACargo(int cantidadPersonasACargo) {
        this.cantidadPersonasACargo = cantidadPersonasACargo;
    }

}

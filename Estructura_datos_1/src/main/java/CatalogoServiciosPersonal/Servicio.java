package CatalogoServiciosPersonal;

public class Servicio {

    // Atributos privados
    private int id;
    private String nombre;
    private String descripcion;
    private double costo;
    private int cantidadPersonasACargo;
    private boolean estado;

    // Constructor vacío
    public Servicio() {
    }

    // Constructor con parámetros
    public Servicio(String nombre, String descripcion, double costo, int cantidadPersonasACargo) {      
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
        this.cantidadPersonasACargo = cantidadPersonasACargo;
        this.estado = true;
    }
    
    // Getters y Setters para cada atributo
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {    
        this.nombre = nombre;
    }

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

    public boolean isEstado(){
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }    
}

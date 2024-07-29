package CatalogoServiciosPersonal;

public class NodoLDC {
    private Persona persona;
    private NodoLDC siguiente;
    private NodoLDC anterior;

    public NodoLDC(Persona persona) {
        this.persona = persona;
    }

    public NodoLDC() {
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public NodoLDC getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLDC siguiente) {
        this.siguiente = siguiente;
    }

    public NodoLDC getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoLDC anterior) {
        this.anterior = anterior;
    }
    
    
}

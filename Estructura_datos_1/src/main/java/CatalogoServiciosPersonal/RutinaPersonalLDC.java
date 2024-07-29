package CatalogoServiciosPersonal;

public class RutinaPersonalLDC {
    LDC lista_doble_personal;

    public RutinaPersonalLDC() {
        this.lista_doble_personal = new LDC();
    }

    public RutinaPersonalLDC(LDC lista_doble_personal) {
        this.lista_doble_personal = lista_doble_personal;
    }
    
    public NodoLDC crear__nodo_persona(String cedula, String nombre, String primerApellido, String segundoApellido, String direccion, String telefono){
        Persona persona = new Persona(cedula, nombre, primerApellido, segundoApellido, direccion, telefono);
        return new NodoLDC(persona);
    }
    
    public void agregar_personal(String cedula, String nombre, String primerApellido, String segundoApellido, String direccion, String telefono){
        NodoLDC nuevo_nodo = crear__nodo_persona(cedula, nombre, primerApellido, segundoApellido, direccion, telefono);
        lista_doble_personal.agregar(nuevo_nodo, null);
    }
    
    public void mostrar_personal(){
        lista_doble_personal.mostrar();
    }
    
}

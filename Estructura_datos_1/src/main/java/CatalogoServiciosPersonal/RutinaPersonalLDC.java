package CatalogoServiciosPersonal;

import javax.swing.JOptionPane;

public class RutinaPersonalLDC {

    LDC lista_doble_personal;

    public RutinaPersonalLDC() {
        this.lista_doble_personal = new LDC();
    }

    public RutinaPersonalLDC(LDC lista_doble_personal) {
        this.lista_doble_personal = lista_doble_personal;
    }

    public NodoLDC crear__nodo_persona(String cedula, String nombre, String primerApellido, String segundoApellido, String direccion, String telefono) {
        Persona persona = new Persona(cedula, nombre, primerApellido, segundoApellido, direccion, telefono);
        return new NodoLDC(persona);
    }

    public void agregar_personal(String cedula, String nombre, String primerApellido, String segundoApellido, String direccion, String telefono) {
        if (persona_existe(cedula)) {
            NodoLDC nuevo_nodo = crear__nodo_persona(cedula, nombre, primerApellido, segundoApellido, direccion, telefono);
            lista_doble_personal.agregar(nuevo_nodo, null);
            JOptionPane.showMessageDialog(null, "La persona fue registrada con exito");
        } else {
            JOptionPane.showMessageDialog(null, "Error, la persona ya esta registrada");
        }
    }

    public void mostrar_personal() {
        lista_doble_personal.mostrar();
    }

    //aqui va la verificacion en base a la cedula de la persona
    public boolean persona_existe(String cedula) {
        return true;
    }

}

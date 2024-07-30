package CatalogoServiciosPersonal;

import javax.swing.JOptionPane;

public class RutinaPersonalLDC {

    public LDC lista_doble_personal;

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
    
    public LDC getListaDoblePersonal() {
        return lista_doble_personal;
    }

    public void setListaDoblePersonal(LDC listaDoblePersonal) {
        this.lista_doble_personal = listaDoblePersonal;
    }
    
    public void modificarPersonal(String cedula, String nombre, String primerApellido, String segundoApellido, String direccion, String telefono, String estado) {
        NodoLDC nodoActual = lista_doble_personal.getInicio();

        while (nodoActual != null) {
            Persona persona = nodoActual.getPersona();

            // Verificar si la cédula de la persona no es nula y coincide con la cédula buscada
            if (persona != null && persona.getCedula().equals(cedula)) {
                // Actualizar los datos del empleado
                persona.setNombre(nombre);
                persona.setPrimerApellido(primerApellido);
                persona.setSegundoApellido(segundoApellido);
                persona.setDireccion(direccion);
                persona.setTelefono(telefono);
                persona.setEstado(estado);

                // Notificar al usuario que los datos fueron actualizados
                System.out.println("Datos del empleado con cédula " + cedula + " han sido actualizados.");
                return; // Salir del método una vez que se actualiza la persona
            }

            nodoActual = nodoActual.getSiguiente();
        }

        // Si no se encuentra la persona, se puede manejar de alguna manera
        System.out.println("Empleado con cédula " + cedula + " no encontrado.");
    }
}

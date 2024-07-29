package CatalogoServiciosPersonal;

public class LDC {

    private NodoLDC inicio;
    private NodoLDC fin;

    public boolean es_vacia() {
        return inicio == null;
    }

    public void agregar(NodoLDC nodo_nuevo, NodoLDC nodo) {
        if(nodo == null){
            nodo = inicio;
        }
        int id_nuevo = nodo_nuevo.getPersona().getId();
        if (es_vacia()) {
            inicio = nodo_nuevo;
            inicio.setSiguiente(inicio);
            inicio.setAnterior(inicio);
            fin = inicio;
        } else if (id_nuevo < inicio.getPersona().getId()) {
            nodo_nuevo.setSiguiente(inicio);
            nodo_nuevo.setAnterior(fin);
            inicio.setAnterior(nodo_nuevo);
            fin.setSiguiente(nodo_nuevo);
            inicio = nodo_nuevo;
        } else if (id_nuevo >= fin.getPersona().getId()) {
            nodo_nuevo.setSiguiente(inicio);
            nodo_nuevo.setAnterior(fin);
            inicio.setAnterior(nodo_nuevo);
            fin.setSiguiente(nodo_nuevo);
            fin = nodo_nuevo;
        //PARTE RECURSIVA
        } else if (nodo.getSiguiente().getPersona().getId() < id_nuevo) {
            agregar(nodo_nuevo, nodo.getSiguiente());
        } else {
            nodo_nuevo.setSiguiente(nodo.getSiguiente());
            nodo_nuevo.setAnterior(nodo);
            nodo.getSiguiente().setAnterior(nodo_nuevo);
            nodo.setSiguiente(nodo_nuevo);
        }
        //PARTE RECURSIVA
    }

    public NodoLDC getInicio() {
        return inicio;
    }

    public void setInicio(NodoLDC inicio) {
        this.inicio = inicio;
    }

    public NodoLDC getFin() {
        return fin;
    }

    public void setFin(NodoLDC fin) {
        this.fin = fin;
    }

    public void mostrar() {
        System.out.println("Listado de Personal INICIO ----------------------------------------".substring(0, 35));

        if (es_vacia()) {
            System.out.println("No hay personal registrado en la base de datos");
        } else {
            System.out.print("Nombre: " + inicio.getPersona().getNombre());
            System.out.println(" | Cedula: " + inicio.getPersona().getCedula());
            NodoLDC nodo = inicio.getSiguiente();
            while (nodo != inicio) {
                System.out.print("Nombre: " + nodo.getPersona().getNombre());
                System.out.println(" | Cedula: " + nodo.getPersona().getCedula());
                nodo = nodo.getSiguiente();
            }
        }
        System.out.println("Listado de Personal FIN ---------------------------------------------".substring(0, 35));
    }

}

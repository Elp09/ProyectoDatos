package com.mycompany.main;

import CatalogoServiciosPersonal.Servicio;

public class NodoCola {
    //Variables para crear la clase NodoCola
    public Servicio elementos;
    public NodoCola siguiente;
    
    //Constructores de la clase
    public NodoCola() {
        this.siguiente = null;
    }

    public NodoCola(Servicio elementos, NodoCola siguiente) {
        this.elementos = elementos;
        this.siguiente = siguiente;
    }
    
    //Getters y Setters de la clase
    public Servicio getElementos() {
        return elementos;
    }

    public void setElementos(Servicio elementos) {
        this.elementos = elementos;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }      
}

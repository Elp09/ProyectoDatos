package com.mycompany.main;

public class Nodo {
    private Usuario elemento;
    private Nodo  siguiente;

    //Contructor
    public Nodo() {
        elemento = null;
        this.siguiente = null;
    }

    //Getters and setters
    public Usuario getElemento() {
        return elemento;
    }

    public void setElemento(Usuario elemento) {
        this.elemento = elemento;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }  

    @Override
    public String toString() {
        return "Nodo{" + "elemento=" + elemento + ", siguiente=" + siguiente + '}';
    }
    
    
}

package com.mycompany.main;

import CatalogoServiciosPersonal.Servicio;

public class RutinaCola {
    public NodoCola inicio;
    public NodoCola fin;
        
    //Método para determinar si la lista de Servicios está vacío.
    public boolean esVacio(){
        if(inicio == null){
            return true;
        }else{
            return false;
        }
    }
    
    //Método para determinar si el Servicio existe.
    public boolean existe(int id){        
        return true;
    }
    
    //Método para agregar un Servicio
    public void agregarServicio(){
        Servicio servicio = new Servicio();
        NodoCola nuevoServicio = new NodoCola();
        
        
        if(esVacio()){
            inicio = nuevoServicio;
            fin = nuevoServicio;            
        }else{            
            fin.setSiguiente(nuevoServicio);
            fin = nuevoServicio;       
        } 
    }
    
    //Método para editar un Servicio
    public void editarServicio(){}
    
    //Método para inactivar un Servicio
    public void inactivarServicio(){}
    
    //Método para mostrar los Servicios
    public void mostrarServicio(){}
}

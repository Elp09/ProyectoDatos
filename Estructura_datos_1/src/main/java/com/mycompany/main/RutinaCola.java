package com.mycompany.main;

import CatalogoServiciosPersonal.Servicio;
import javax.swing.JOptionPane;

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
    
    //Método para diferenciar servicios ya existentes
    public boolean existe(String nombre){
        NodoCola aux = inicio;
        boolean existe = false;
        
        while(aux != null){
            if(aux.getElementos().getNombre().equals(nombre)){
                existe = true;
                aux = null;
            }else{
                aux = aux.getSiguiente();
                existe = false;
            }
        }      
        return existe;
    }

    //Método para Buscar un Servicio, busca servicio por medio de nombre de servicio.
    public NodoCola buscarSercicio(String nombreServicio){
        NodoCola aux = inicio;
        if(!esVacio()){
            while(aux != null){
                if(aux.getElementos().getNombre().equals(nombreServicio)){
                    return aux;
                }else{
                    aux = aux.getSiguiente();
                }
            }  
        }
        return null;
    }
    
    
    //Método para agregar un Servicio
    public void agregarServicio(String nombre, String descripcion, double costo, int cantidadPersonasACargo){
        Servicio servicio = new Servicio(nombre, descripcion, costo, cantidadPersonasACargo);
        
        NodoCola nuevoServicio = new NodoCola();
        nuevoServicio.setElementos(servicio);
        
        if(!existe(servicio.getNombre())){               
            if(esVacio()){
                inicio = nuevoServicio;
                fin = nuevoServicio;            
            }else{            
                fin.setSiguiente(nuevoServicio);
                fin = nuevoServicio;       
            } 
        }else{
            JOptionPane.showMessageDialog(null, "¡El servicio ya existe!");
        }
    }    
    
    //Método para editar un Servicio
    public void editarServicio(Servicio servicioModificado, String nombre){
        NodoCola aux = inicio;
        
        if(existe(nombre) ){
            while(aux != null){
                if(aux.getElementos().getNombre().equals(nombre)){
                    aux.getElementos().setNombre(servicioModificado.getNombre());
                    aux.getElementos().setDescripcion(servicioModificado.getDescripcion());
                    aux.getElementos().setCosto(servicioModificado.getCosto());
                    aux.getElementos().setCantidadPersonasACargo(servicioModificado.getCantidadPersonasACargo());                
                }else{
                    aux = aux.getSiguiente();
                }                               
            }
        }else{            
            JOptionPane.showMessageDialog(null, "¡El servicio no existe!");
        }    
    }
    
    //Método para inactivar un Servicio
    public void inactivarServicio(String nombreServicio){
        NodoCola nodo = buscarSercicio(nombreServicio);
        if(nodo == null){
            JOptionPane.showMessageDialog(null, "¡El fue servicio no fue encontrado");
        }else{
            JOptionPane.showMessageDialog(null, "El servicio fue inactivado exitosamente");
            nodo.getElementos().setEstado(false);
        }    
    }
    
    //Método para mostrar los Servicios
    public void mostrarServicio(){
        NodoCola aux = inicio;
        String servicios = "";
        
        while(aux != null){
            servicios += "ID de servicio: " + aux.getElementos().getId() + " Nombre de Servicio: " + aux.getElementos().getNombre() + "\n"; 
            aux = aux.getSiguiente();
        }
        
        JOptionPane.showMessageDialog(null, servicios);
    }
}
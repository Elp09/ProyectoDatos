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
    
    //Método para determinar si el Servicio existe.
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
    
    //Método para agregar un Servicio
    public void agregarServicio(){
        Servicio servicio = new Servicio();
        servicio.setId(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del servicio")));
        servicio.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del servicio"));
        servicio.setCantidadPersonasACargo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas a cargo del servicio")));
        servicio.setCosto(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el costo del servicio")));
        servicio.setDescripcion(JOptionPane.showInputDialog("Ingrese la descripción del servicio"));
        
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
    public void editarServicio(String nombre){
        if(existe(nombre)){
        
        }else{
            JOptionPane.showMessageDialog(null, "¡El servicio ya existe!");
        }    
    }
    
    //Método para inactivar un Servicio
    public void inactivarServicio(String nombre){
        if(existe(nombre)){
        
        }else{
            JOptionPane.showMessageDialog(null, "¡El servicio ya existe!");
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

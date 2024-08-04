package com.mycompany.main;

import CatalogoServiciosPersonal.RutinaPersonalLDC;
import javax.swing.JOptionPane;

public class Rutina {
    private Pila pila;
    private RutinaCola r_cola;
    private RutinaPersonalLDC rutinaPersonal;

    public Rutina() {
        pila = new Pila();
        r_cola = new RutinaCola();
        rutinaPersonal = new RutinaPersonalLDC();
    }

    public Usuario crearUsuario(String nombre, String apellido, String nickname, String password) { //Apila los usuarios, crea un nuevo usuario y nodo al mismo tiempo
        Usuario user = new Usuario();
        user.setNombre(nombre);
        user.setApellidos(apellido);
        user.setNickname(nickname);
        user.setPassword(password);
        return user;
    }

    public void apilarUsuario(String nombre, String apellido, String nickname, String password) {
         if (!usuarioExiste(nickname)) {
            Usuario user = crearUsuario(nombre, apellido, nickname, password);
            pila.apilar(user);
            JOptionPane.showMessageDialog(null, "Usuario registrado con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "El nombre de usuario ya existe. Por favor, elija otro.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void apilar5Usuarios() {
        pila.apilar(new Usuario("Pedro", "Ramires", "Pramirez", "12345"));
        pila.apilar(new Usuario("Marco", "Escobar", "mesco", "afad"));
        pila.apilar(new Usuario("Juan", "Samolon", "juanso", "1231 af"));
        pila.apilar(new Usuario("Alejandro", "Rano", "ranol", "341 a"));
        pila.apilar(new Usuario("Miguel", "Pon", "miguelillo", " 1a d"));
    }

    public void desapilarUsuario() { // Recordar esto sobre pilas: Pilas → Estructura tipo LIFO: Last in fisrt out.
        if (getPila().esVacia()) {
            pila.setCima(getPila().getCima().getSiguiente());
            JOptionPane.showMessageDialog(null,
                    "Elemento extraído");
        } else {
            JOptionPane.showMessageDialog(null,
                    "¡No se puede extrar, pila vacía!");
        }
    }

    //Busca y devuelve un usuario por nickname
    public Nodo buscarUsuario(String nickname) {
        if (!pila.esVacia()) {
            Nodo top = pila.getCima();
            while (top != null) {
                if (top.getElemento().getNickname().equals(nickname)) {
                    return top;
                } else {
                    top = top.getSiguiente();
                }
            }
        }
        return null;
    }

    public boolean contraCorresponde(Nodo nodo, String contraseña) {
        return nodo.getElemento().getPassword().equals(contraseña);
    }

    public void inactivarUsuario(String nickname) {
        Nodo nodo = buscarUsuario(nickname);
        if (nodo == null) {
            JOptionPane.showMessageDialog(null, "El usuario no existe");
        } else if (!nodo.getElemento().isEstado()) {
            JOptionPane.showMessageDialog(null, "El usuario ya estaba inactivo");
        } else {
            nodo.getElemento().setEstado(false);
            JOptionPane.showMessageDialog(null, "El usuario fue inactivado exitosamente");
        }
    }
    
    public void reactivarUsuario(String nickname) {
        Nodo nodo = buscarUsuario(nickname);
        if (nodo == null) {
            JOptionPane.showMessageDialog(null, "El usuario no existe");
        } else if (nodo.getElemento().isEstado()) {
            JOptionPane.showMessageDialog(null, "El usuario ya está activo");
        } else {
            nodo.getElemento().setEstado(true);
            JOptionPane.showMessageDialog(null, "El usuario fue reactivado exitosamente");
        }
    }

    public void loguearse(String usuario, String contraseña) {
        Nodo nodo = buscarUsuario(usuario);
        if (nodo == null) {
            JOptionPane.showMessageDialog(null, "Acceso denegado");
        } else {
            if (contraCorresponde(nodo, contraseña) && nodo.getElemento().isEstado()) {
                JOptionPane.showMessageDialog(null, "Inicio de sesion exitoso");
            } else {
                JOptionPane.showMessageDialog(null, "Acceso denegado");
            }
        }
    }

    public void mostrarPila() {
        JOptionPane.showMessageDialog(null, pila.devolverString());
    }
    
    public boolean usuarioExiste(String nickname) {
        Nodo actual = pila.getCima();
        while (actual != null) {
            if (actual.getElemento().getNickname().equals(nickname)) {
                return true; // Usuario encontrado
            }
            actual = actual.getSiguiente();
        }
        return false; // Usuario no encontrado
    }

    public Pila getPila() {
        return pila;
    }

    public void setPila(Pila pila) {
        this.pila = pila;
    }

    public RutinaCola getR_cola() {
        return r_cola;
    }

    public void setR_cola(RutinaCola r_cola) {
        this.r_cola = r_cola;
    }

    public RutinaPersonalLDC getRutinaPersonal() {
        return rutinaPersonal;
    }

    public void setRutinaPersonal(RutinaPersonalLDC rutinaPersonal) {
        this.rutinaPersonal = rutinaPersonal;
    }
    
    
    
    

}

package com.mycompany.main;

import javax.swing.JOptionPane;

public class Rutina {
    private Pila pila;

    public Rutina() {
        pila = new Pila();
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
        pila.apilar(crearUsuario( nombre,  apellido,  nickname, password));
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
    public Nodo buscarUsuario(String nickname) {;
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
        } else {
            nodo.getElemento().setEstado(false);
            JOptionPane.showMessageDialog(null, "El usuario fue inactivado exitosamente");
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

    public Pila getPila() {
        return pila;
    }

    public void setPila(Pila pila) {
        this.pila = pila;
    }

}
package com.mycompany.main;

import javax.swing.JOptionPane;

public class Pila {

    private Nodo cima;

    public Pila() {
    }

    public boolean esVacia() {
        return (cima == null);
    }

    public Nodo getCima() {
        return cima;
    }

    public void setCima(Nodo cima) {
        this.cima = cima;
    }

    public String devolverString() { //mostrar pila basicamente
        if (!esVacia()) {
            String stUsers = "";
            Nodo aux = cima;
            while (aux != null) {
                stUsers = stUsers + aux.getElemento().getNickname() + ", "
                        + ((aux.getElemento().isEstado()) ? "Activo" : "Inactivo") +
                        ", "+ aux.getElemento().getPassword() + "\n";
                aux = aux.getSiguiente();
            }
            return stUsers;
//            JOptionPane.showMessageDialog(null,
//                    "La pila contiene:\n" + stUsers);
        } else {
            return "";
//            JOptionPane.showMessageDialog(null,
//                    "¡No se puede mostrar, pila vacía!");
        }
    }

    public void apilar(Usuario usuario) {
        Nodo nuevo = new Nodo();
        nuevo.setElemento(usuario);
        if (esVacia()) {
            cima = nuevo;
        } else {
            nuevo.setSiguiente(cima);
            cima = nuevo;
        }
    }

    @Override
    public String toString() {
        return "Pila{" + "cima=" + cima + '}';
    }
    
    

}

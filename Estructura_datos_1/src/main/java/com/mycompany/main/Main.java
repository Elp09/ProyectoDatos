package com.mycompany.main;

import CatalogoServiciosPersonal.RutinaPersonalLDC;
import vistas.menuPrincipal;

public class Main {
    public static void main(String[] args) {
        Rutina rutina = new Rutina();
        menuPrincipal m = new menuPrincipal(rutina);
        m.setVisible(true);        
    }
}

package com.mycompany.main;

import CatalogoServiciosPersonal.RutinaPersonalLDC;
import vistas.menuPrincipal;

public class Main {
    public static void main(String[] args) {
        Rutina rutina = new Rutina();
        RutinaPersonalLDC rutinaPersonal = new RutinaPersonalLDC();
        menuPrincipal m = new menuPrincipal(rutina, rutinaPersonal);
        m.setVisible(true);        
    }
}

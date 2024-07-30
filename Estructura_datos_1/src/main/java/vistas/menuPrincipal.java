package vistas;

import CatalogoServiciosPersonal.RutinaPersonalLDC;
import com.mycompany.main.Rutina;
import com.mycompany.main.RutinaCola;

public class menuPrincipal extends javax.swing.JFrame {

    Rutina r;
    RutinaPersonalLDC rutinaPersonal;
    RutinaCola rutinaCola;

    public menuPrincipal(Rutina rutina, RutinaPersonalLDC rutinaPersonal) {
        this.rutinaPersonal = rutinaPersonal;
        r = rutina;
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Menu Principal");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnInactivar = new javax.swing.JButton();
        btnIniciarSesion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnMenuPersonal = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jButton3.setText("jButton3");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MultiClean");

        jButton2.setLabel("Agregar Usuarios");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUsuario(evt);
            }
        });

        btnInactivar.setLabel("Inactivar Usuarios");
        btnInactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInactivarActionPerformed(evt);
            }
        });

        btnIniciarSesion.setText("Iniciar Sesión");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        jLabel3.setText("Menú Principal");

        btnMenuPersonal.setText("Menu Personal");
        btnMenuPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPersonalActionPerformed(evt);
            }
        });

        jButton4.setText("Mostrar users");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnInactivar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMenuPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInactivar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIniciarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMenuPersonal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        iniciarSesion n = new iniciarSesion(r, rutinaPersonal);
        n.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnInactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInactivarActionPerformed
        inactivarUsuarios n = new inactivarUsuarios(r, rutinaPersonal);
        n.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnInactivarActionPerformed

    private void btnAgregarUsuario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUsuario
        agregarUsuarios n = new agregarUsuarios(r, rutinaPersonal);
        n.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgregarUsuario

    private void btnMenuPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPersonalActionPerformed
        MenuPersonal m = new MenuPersonal(this, rutinaPersonal);
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuPersonalActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        r.mostrarPila();
    }//GEN-LAST:event_jButton4ActionPerformed

    public RutinaCola getRutinaCola() {
        return rutinaCola;
    }

    public void setRutinaCola(RutinaCola rutinaCola) {
        this.rutinaCola = rutinaCola;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInactivar;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnMenuPersonal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

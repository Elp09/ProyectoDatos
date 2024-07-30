package vistas;

import CatalogoServiciosPersonal.NodoLDC;
import CatalogoServiciosPersonal.Persona;
import CatalogoServiciosPersonal.RutinaPersonalLDC;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MenuPersonal extends javax.swing.JFrame {

    RutinaPersonalLDC rutinaPersonal;

    public MenuPersonal(JFrame menuPrincipal, RutinaPersonalLDC rutinaPersonalLDC) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Menu Personal");
        rutinaPersonal = rutinaPersonalLDC;

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                menuPrincipal.setVisible(true);
                dispose();
            }
        });
    }

    public MenuPersonal(RutinaPersonalLDC rutinaPersonal) {
        initComponents();
        this.rutinaPersonal = rutinaPersonal;
        btnModificarPersonal.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSegundoApellido = new javax.swing.JTextField();
        btnAgregarPersonal = new javax.swing.JButton();
        btnMostrarPersonal = new javax.swing.JButton();
        btnModificarPersonal = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jCBEstadoActual = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setText("Direccion:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Tel:");

        jLabel4.setText("Primer apellido:");

        jLabel5.setText("Cedula:");

        jLabel6.setText("Segundo apellido:");

        txtSegundoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSegundoApellidoActionPerformed(evt);
            }
        });

        btnAgregarPersonal.setText("Agregar personal");
        btnAgregarPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPersonalActionPerformed(evt);
            }
        });

        btnMostrarPersonal.setText("Mostrar Personal");
        btnMostrarPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPersonalActionPerformed(evt);
            }
        });

        btnModificarPersonal.setText("Modificar Personal");
        btnModificarPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPersonalActionPerformed(evt);
            }
        });

        jLabel7.setText("Estado actual");

        jCBEstadoActual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(31, 31, 31)
                            .addComponent(jCBEstadoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMostrarPersonal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarPersonal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarPersonal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnModificarPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jCBEstadoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPersonalActionPerformed
        //Obtener los datos de los campos de entrada
        String cedula = txtCedula.getText();
        String nombre = txtNombre.getText();
        String primerApellido = txtApellido.getText();
        String segundoApellido = txtSegundoApellido.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTel.getText();

        //Agregar el personal a la rutina
        rutinaPersonal.agregar_personal(cedula, nombre, primerApellido, segundoApellido, direccion, telefono);

        //Limpiar los campos de entrada
        limpiarCampos();
    }//GEN-LAST:event_btnAgregarPersonalActionPerformed

    private void txtSegundoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSegundoApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSegundoApellidoActionPerformed

    private void btnMostrarPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPersonalActionPerformed
        String cedulaBuscada = txtCedula.getText();

        // Verificar si la cédula ingresada no es nula ni vacía
        if (cedulaBuscada == null || cedulaBuscada.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese una cédula válida.");
            return; // Salir del método si la cédula está vacía
        }

        NodoLDC nodoActual = rutinaPersonal.getListaDoblePersonal().getInicio();
        boolean encontrado = false;

        while (nodoActual != null) {
            Persona persona = nodoActual.getPersona();
            String cedulaPersona = persona.getCedula();

            //Verificar si la cédula de la persona no es nula y coincide con la cedula buscada
            if (cedulaPersona != null && cedulaPersona.equals(cedulaBuscada)) {
                // Mostrar los datos del empleado encontrado
                txtNombre.setText(persona.getNombre());
                txtApellido.setText(persona.getPrimerApellido());
                txtSegundoApellido.setText(persona.getSegundoApellido());
                txtDireccion.setText(persona.getDireccion());
                txtTel.setText(persona.getTelefono());

                //Asignar el estado en el ComboBox
                String estado = persona.getEstado();
                if (estado != null) {
                    jCBEstadoActual.setSelectedIndex(estado.equals("Activo") ? 0 : 1);
                } else {
                    jCBEstadoActual.setSelectedIndex(0); // Por defecto se pone en "Activo"
                }

                encontrado = true;
                btnModificarPersonal.setEnabled(true); //Habilitar el boton de modificar
                break; // Salir del bucle si se encuentra la persona
            }
            nodoActual = nodoActual.getSiguiente();
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(this, "Empleado con cedula " + cedulaBuscada + " no encontrado.");
            limpiarCampos();
            btnModificarPersonal.setEnabled(false); //Desactivar el botón de modificar
        }
    }//GEN-LAST:event_btnMostrarPersonalActionPerformed

    private void btnModificarPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPersonalActionPerformed
        //Obtener los datos modificados de los campos de entrada
        String cedula = txtCedula.getText();
        String nombre = txtNombre.getText();
        String primerApellido = txtApellido.getText();
        String segundoApellido = txtSegundoApellido.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTel.getText();
        String estado = (String) jCBEstadoActual.getSelectedItem();

        //Actualizar los datos del empleado
        rutinaPersonal.modificarPersonal(cedula, nombre, primerApellido, segundoApellido, direccion, telefono, estado);

        //Notificar al usuario
        JOptionPane.showMessageDialog(this, "Datos del empleado actualizados.", "Exito", JOptionPane.INFORMATION_MESSAGE);

        //Limpiar los campos de entrada y desactivar el botón de modificar
        limpiarCampos();
        btnModificarPersonal.setEnabled(false);
    }//GEN-LAST:event_btnModificarPersonalActionPerformed

        private void limpiarCampos() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtSegundoApellido.setText("");
        txtDireccion.setText("");
        txtTel.setText("");
        txtCedula.setText("");
        jCBEstadoActual.setSelectedIndex(0); //O el índice que corresponda a "Activo"
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarPersonal;
    private javax.swing.JButton btnModificarPersonal;
    private javax.swing.JButton btnMostrarPersonal;
    private javax.swing.JComboBox<String> jCBEstadoActual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSegundoApellido;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}

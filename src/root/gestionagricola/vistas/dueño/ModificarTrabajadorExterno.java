/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.gestionagricola.vistas.dueño;

/**
 *
 * @author Ronaru
 */
public class ModificarTrabajadorExterno extends javax.swing.JFrame {
    GestionTrabajadorExterno gestion;
    
    /**
     * 
     */
    public ModificarTrabajadorExterno(GestionTrabajadorExterno gestion) {
        this.gestion = gestion;
        initComponents();
        this.setLocationRelativeTo(null);
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        botonModificar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        datoRut_Trabajador = new javax.swing.JTextField();
        etiquetaIngresar_Rut = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonModificar.setBackground(new java.awt.Color(255, 255, 255));
        botonModificar.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        botonModificar.setText("Modificar");
        jPanel3.add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        botonCancelar.setBackground(new java.awt.Color(255, 255, 255));
        botonCancelar.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));
        jPanel3.add(datoRut_Trabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 110, 220, -1));

        etiquetaIngresar_Rut.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaIngresar_Rut.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        etiquetaIngresar_Rut.setText("Ingrese Rut del Trabajador");
        jPanel3.add(etiquetaIngresar_Rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
       this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JTextField datoRut_Trabajador;
    private javax.swing.JLabel etiquetaIngresar_Rut;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}

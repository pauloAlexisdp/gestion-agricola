/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.gestionagricola.vistas.dueño;

import com.toedter.calendar.JDateChooser;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import root.gestionagricola.gestioncontrato.ControladorContrato;
import root.gestionagricola.gestiontrabajador.ControladorTrabajador;

/**
 *
 * @author Javier
 */
public class CrearTrabajadorExterno extends javax.swing.JFrame {
    GestionTrabajadorExterno gestion;
    public CrearTrabajadorExterno(GestionTrabajadorExterno gestion) {
        this.gestion = gestion;
        initComponents();
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonCancelar = new javax.swing.JButton();
        botonIngresar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        datoNum_Contrato = new javax.swing.JTextField();
        etiquetaTelefono = new javax.swing.JLabel();
        datoTelefono = new javax.swing.JTextField();
        etiquetaRol = new javax.swing.JLabel();
        datoRol = new javax.swing.JTextField();
        datoNombre = new javax.swing.JTextField();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaRut = new javax.swing.JLabel();
        datoRut = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonCancelar.setBackground(new java.awt.Color(255, 255, 255));
        botonCancelar.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        botonCancelar.setForeground(new java.awt.Color(0, 0, 0));
        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 130, 30));

        botonIngresar.setBackground(new java.awt.Color(255, 255, 255));
        botonIngresar.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        botonIngresar.setForeground(new java.awt.Color(0, 0, 0));
        botonIngresar.setText("Ingresar");
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(botonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 130, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("N° Contrato");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        datoNum_Contrato.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(datoNum_Contrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 200, -1));

        etiquetaTelefono.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaTelefono.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        etiquetaTelefono.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaTelefono.setText("Telefóno");
        jPanel1.add(etiquetaTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        datoTelefono.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(datoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 200, -1));

        etiquetaRol.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaRol.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        etiquetaRol.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaRol.setText("Rol");
        jPanel1.add(etiquetaRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        datoRol.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(datoRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 200, -1));

        datoNombre.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(datoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 200, -1));

        etiquetaNombre.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaNombre.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        etiquetaNombre.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaNombre.setText("Nombre");
        jPanel1.add(etiquetaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        etiquetaRut.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaRut.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        etiquetaRut.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaRut.setText("Rut");
        jPanel1.add(etiquetaRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 110, -1));

        datoRut.setForeground(new java.awt.Color(0, 0, 0));
        datoRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datoRutActionPerformed(evt);
            }
        });
        jPanel1.add(datoRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        if(this.datoRut.getText() != null && this.datoNombre.getText() != null &&
            this.datoRol.getText() != null && this.datoTelefono.getText() != null
            && this.datoNum_Contrato.getText() != null){
            // aiqui se llama al método controlador que hara la conexion con el modelo.

            ControladorTrabajador.crearTrabajadorExterno(Integer.valueOf(datoRut.getText()), datoNombre.getText(),
                datoRol.getText(), Integer.valueOf(datoTelefono.getText()), "SubContrato",
                Integer.valueOf(datoNum_Contrato.getText()));

            try {
                String[][] datos;
                datos = ControladorTrabajador.cargarTrabajadoresExternos();
                gestion.setDatos_para_tabla(datos);
                gestion.cargarDatosTabla();

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CrearTrabajadorExterno.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(CrearTrabajadorExterno.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(CrearTrabajadorExterno.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(CrearTrabajadorExterno.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
            JOptionPane.showMessageDialog(null, "Trabajador Ingresado.", "Crear", JOptionPane.INFORMATION_MESSAGE);

        }else{//si no, avisa al usuario que le faltan casillas por llenar.
            JOptionPane.showMessageDialog(null, "Faltan ingresar datos", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botonIngresarActionPerformed

    private void datoRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datoRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datoRutActionPerformed

    public JTextField getDatoNombre() {
        return datoNombre;
    }

    public JTextField getDatoNum_Contrato() {
        return datoNum_Contrato;
    }

    public JTextField getDatoRol() {
        return datoRol;
    }

    public JTextField getDatoRut() {
        return datoRut;
    }

    public JTextField getDatoTelefono() {
        return datoTelefono;
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonIngresar;
    private javax.swing.JTextField datoNombre;
    private javax.swing.JTextField datoNum_Contrato;
    private javax.swing.JTextField datoRol;
    private javax.swing.JTextField datoRut;
    private javax.swing.JTextField datoTelefono;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaRol;
    private javax.swing.JLabel etiquetaRut;
    private javax.swing.JLabel etiquetaTelefono;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

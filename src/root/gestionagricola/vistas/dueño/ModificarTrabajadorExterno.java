package root.gestionagricola.vistas.dueño;

import java.awt.Container;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import root.gestionagricola.gestiontrabajador.ControladorTrabajador;

/**
 *
 * @author Ariel
 */
public class ModificarTrabajadorExterno extends javax.swing.JFrame {

    private int rut_recibido;

    public ModificarTrabajadorExterno() {
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
        BotonModificar = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        datoRut = new javax.swing.JTextField();
        datoNombre = new javax.swing.JTextField();
        datoRol = new javax.swing.JTextField();
        datoTelefono = new javax.swing.JTextField();
        datoNum_Contrato = new javax.swing.JTextField();
        etiquetaRut = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaRol = new javax.swing.JLabel();
        etiquetaTelefono = new javax.swing.JLabel();
        etiquetaNum_Contrato = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonModificar.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        BotonModificar.setText("Modificar");
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 135, -1));

        BotonCancelar.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        BotonCancelar.setText("Cancelar");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 135, -1));

        datoRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datoRutActionPerformed(evt);
            }
        });
        jPanel1.add(datoRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 200, -1));
        jPanel1.add(datoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 200, -1));
        jPanel1.add(datoRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 200, -1));
        jPanel1.add(datoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 200, -1));
        jPanel1.add(datoNum_Contrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 200, -1));

        etiquetaRut.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaRut.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        etiquetaRut.setText("Rut");
        jPanel1.add(etiquetaRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 110, -1));

        etiquetaNombre.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaNombre.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        etiquetaNombre.setText("Nombre");
        jPanel1.add(etiquetaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        etiquetaRol.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaRol.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        etiquetaRol.setText("Rol");
        jPanel1.add(etiquetaRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        etiquetaTelefono.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaTelefono.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        etiquetaTelefono.setText("Telefóno");
        jPanel1.add(etiquetaTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        etiquetaNum_Contrato.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaNum_Contrato.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        etiquetaNum_Contrato.setText("N° Contrato");
        jPanel1.add(etiquetaNum_Contrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        String[] datos = null;
        datos = ControladorTrabajador.getTrabajador(this.rut_recibido);
        if (datos == null) {
            JOptionPane.showMessageDialog(null, "El trabajador a modificar no existe.", "ERROR", JOptionPane.WARNING_MESSAGE);
        }else {
            if (this.datoRut.getText() != null && this.datoNombre.getText() != null && 
                this.datoRol.getText() != null && this.datoTelefono.getText() != null
                && this.datoNum_Contrato.getText() != null) {
                ControladorTrabajador.modificarTrabajadorInterno(this.rut_recibido, this.datoNombre.getText(), this.datoRol.getText(), Integer.valueOf(this.datoTelefono.getText()),
                                                                 "Planta", Integer.valueOf(this.datoNum_Contrato.getText()));
                this.dispose();
                JOptionPane.showMessageDialog(null, "Trabajador Modificado.", "Modificación", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Faltan llenar casillas.", "ERROR", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_BotonModificarActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void datoRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datoRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datoRutActionPerformed

    public void setRut_recibido(int rut_recibido) {
        this.rut_recibido = rut_recibido;
    }

    public void actualizarpantalla() {
        Container temp = this.getContentPane();
        SwingUtilities.updateComponentTreeUI(temp);
        temp.validate();
        requestFocusInWindow();
    }

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
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JTextField datoNombre;
    private javax.swing.JTextField datoNum_Contrato;
    private javax.swing.JTextField datoRol;
    private javax.swing.JTextField datoRut;
    private javax.swing.JTextField datoTelefono;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaNum_Contrato;
    private javax.swing.JLabel etiquetaRol;
    private javax.swing.JLabel etiquetaRut;
    private javax.swing.JLabel etiquetaTelefono;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

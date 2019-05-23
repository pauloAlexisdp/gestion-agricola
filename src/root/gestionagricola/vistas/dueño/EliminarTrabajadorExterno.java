
package root.gestionagricola.vistas.dueño;

import com.toedter.calendar.JDateChooser;
import java.awt.Container;
import java.sql.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import root.gestionagricola.gestioncontrato.ControladorContrato;
import root.gestionagricola.gestiontrabajador.ControladorTrabajador;

/**
 *
 * @author Ariel
 */
public class EliminarTrabajadorExterno extends javax.swing.JFrame {
    private int rut_recibido;
    
    public EliminarTrabajadorExterno(GestionTrabajadorExterno g) {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        BotonEliminar = new javax.swing.JButton();
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

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 101, -1));

        BotonEliminar.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 135, -1));

        BotonCancelar.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        BotonCancelar.setText("Cancelar");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 135, -1));

        datoRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datoRutActionPerformed(evt);
            }
        });
        jPanel1.add(datoRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 200, -1));
        jPanel1.add(datoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 200, -1));
        jPanel1.add(datoRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 200, -1));
        jPanel1.add(datoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 200, -1));
        jPanel1.add(datoNum_Contrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 200, -1));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        String[] datos=null;
        datos = ControladorTrabajador.getTrabajador(this.rut_recibido);
        if(datos==null){
             JOptionPane.showMessageDialog(null, "El trabajador a eliminar no existe.", "ERROR", JOptionPane.WARNING_MESSAGE);
        }else{     
            ControladorTrabajador.eliminarTrabajadorInterno(this.rut_recibido);
            this.dispose();
            JOptionPane.showMessageDialog(null, "Trabajador Eliminado.", "Eliminación", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_BotonEliminarActionPerformed

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
    private javax.swing.JButton BotonEliminar;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

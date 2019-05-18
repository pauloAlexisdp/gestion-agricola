/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.gestionagricola.vistas.dueño;

import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import root.gestionagricola.gestioncontrato.ControladorContrato;


/**
 *
 * @author Javier
 */
public class IngresarDatosContratos extends javax.swing.JFrame {

    
    public IngresarDatosContratos() {
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
        jLabel2 = new javax.swing.JLabel();
        RespuestaFolio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        RespuestaRut = new javax.swing.JTextField();
        RespuestNombre = new javax.swing.JTextField();
        RespuestaValor = new javax.swing.JTextField();
        RespuestaTipo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        RespuestFechaTermino = new com.toedter.calendar.JDateChooser();
        RespuestFechaInicio = new com.toedter.calendar.JDateChooser();
        RespuestEstado = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(613, 446));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Folio :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 58, 63, -1));

        RespuestaFolio.setBackground(new java.awt.Color(255, 255, 255));
        RespuestaFolio.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jPanel1.add(RespuestaFolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 56, 185, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fecha Inicio:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 95, 101, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Fecha Termino:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 136, 101, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Rut:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 173, 63, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nombre:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 212, 63, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Sueldo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 251, 63, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tipo:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 333, 63, -1));

        RespuestaRut.setBackground(new java.awt.Color(255, 255, 255));
        RespuestaRut.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jPanel1.add(RespuestaRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 171, 185, -1));

        RespuestNombre.setBackground(new java.awt.Color(255, 255, 255));
        RespuestNombre.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jPanel1.add(RespuestNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 210, 185, -1));

        RespuestaValor.setBackground(new java.awt.Color(255, 255, 255));
        RespuestaValor.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jPanel1.add(RespuestaValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 249, 185, -1));

        RespuestaTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Planta", "Subcontrato" }));
        RespuestaTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RespuestaTipoActionPerformed(evt);
            }
        });
        jPanel1.add(RespuestaTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 330, 185, 21));

        jButton1.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 135, -1));

        jButton2.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 135, -1));

        RespuestFechaTermino.setBackground(new java.awt.Color(51, 51, 51));
        RespuestFechaTermino.setForeground(new java.awt.Color(255, 255, 255));
        RespuestFechaTermino.setFont(new java.awt.Font("Garamond", 0, 12)); // NOI18N
        RespuestFechaTermino.setPreferredSize(new java.awt.Dimension(86, 21));
        jPanel1.add(RespuestFechaTermino, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 130, 185, 21));

        RespuestFechaInicio.setBackground(new java.awt.Color(51, 51, 51));
        RespuestFechaInicio.setForeground(new java.awt.Color(255, 255, 255));
        RespuestFechaInicio.setFont(new java.awt.Font("Garamond", 0, 12)); // NOI18N
        jPanel1.add(RespuestFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 90, 185, 21));
        RespuestFechaInicio.getAccessibleContext().setAccessibleName("");

        RespuestEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Renovado", "Activo", "Finalizado" }));
        RespuestEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RespuestEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(RespuestEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 290, 185, 21));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Estado:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 292, 63, -1));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Si las casillas estan llenas puede guardar los datos
        if(this.RespuestaFolio.getText()!=null && (String)this.RespuestEstado.getSelectedItem()!=null && 
                this.RespuestFechaInicio.getDate()!=null && this.RespuestFechaTermino.getDate()!=null
                && this.RespuestNombre.getText()!=null && (String)this.RespuestaTipo.getSelectedItem()!=null
                && this.RespuestaRut.getText()!=null && this.RespuestaValor.getText()!=null){   
                //Aqui se llama al metodo del controlador que hara la conexion con el modelo.
                ControladorContrato.ingresarContrato(Integer.parseInt(this.RespuestaFolio.getText()), (String)this.RespuestaTipo.getSelectedItem(),(String)this.RespuestEstado.getSelectedItem()
                        , RespuestFechaInicio.getDateFormatString(), RespuestFechaTermino.getDateFormatString(), 
                        RespuestNombre.getText(), Integer.parseInt(RespuestaRut.getText()), Integer.parseInt(RespuestaRut.getText()));
            
            this.dispose();
        }else{//si no le avisa al usuario que le faltan casillas por llenar.
            JOptionPane.showMessageDialog(null, "Faltan llenar casillas.", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RespuestaTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RespuestaTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RespuestaTipoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void RespuestEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RespuestEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RespuestEstadoActionPerformed

    public JComboBox<String> getRespuestEstado1() {
        return RespuestEstado;
    }

    public JDateChooser getRespuestFechaInicio() {
        return RespuestFechaInicio;
    }

    public JDateChooser getRespuestFechaTermino() {
        return RespuestFechaTermino;
    }

    public JTextField getRespuestNombre() {
        return RespuestNombre;
    }

    public JTextField getRespuestaFolio() {
        return RespuestaFolio;
    }

    public JTextField getRespuestaRut() {
        return RespuestaRut;
    }

    public JComboBox<String> getRespuestaTipo() {
        return RespuestaTipo;
    }

    public JTextField getRespuestaValor() {
        return RespuestaValor;
    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> RespuestEstado;
    private com.toedter.calendar.JDateChooser RespuestFechaInicio;
    private com.toedter.calendar.JDateChooser RespuestFechaTermino;
    private javax.swing.JTextField RespuestNombre;
    private javax.swing.JTextField RespuestaFolio;
    private javax.swing.JTextField RespuestaRut;
    private javax.swing.JComboBox<String> RespuestaTipo;
    private javax.swing.JTextField RespuestaValor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

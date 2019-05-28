package root.gestionagricola.vistas.dueño;

import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import root.gestionagricola.gestioncontrato.ControladorContrato;

/**
 * Vista busqueda de cotrato.
 * @author Los Lanzas
 */
public class BusquedaContrato extends javax.swing.JFrame {

    GestionDeContratos Gcontratos;

    /**
     * Constructor de la vista
     * @param gcontratos
     */
    public BusquedaContrato(GestionDeContratos gcontratos) {
        this.Gcontratos = gcontratos;
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        RespuestaEmpresa = new javax.swing.JTextField();
        RespuestNombre = new javax.swing.JTextField();
        RespuestaValor = new javax.swing.JTextField();
        RespuestaTipo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        RespuestFechaTermino = new com.toedter.calendar.JDateChooser();
        RespuestFechaInicio = new com.toedter.calendar.JDateChooser();
        RespuestEstado = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        RespuestaRut = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fecha Inicio:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 101, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Fecha Termino:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 101, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombre Empresa:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 130, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nombre:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 63, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Sueldo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 63, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tipo:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 63, -1));

        RespuestaEmpresa.setBackground(new java.awt.Color(255, 255, 255));
        RespuestaEmpresa.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        RespuestaEmpresa.setEnabled(false);
        jPanel1.add(RespuestaEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 185, -1));

        RespuestNombre.setBackground(new java.awt.Color(255, 255, 255));
        RespuestNombre.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jPanel1.add(RespuestNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 185, -1));

        RespuestaValor.setBackground(new java.awt.Color(255, 255, 255));
        RespuestaValor.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jPanel1.add(RespuestaValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 185, -1));

        RespuestaTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Planta", "Subcontrato" }));
        RespuestaTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RespuestaTipoActionPerformed(evt);
            }
        });
        jPanel1.add(RespuestaTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 185, 21));

        jButton1.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 135, -1));

        jButton2.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 135, -1));

        RespuestFechaTermino.setBackground(new java.awt.Color(51, 51, 51));
        RespuestFechaTermino.setForeground(new java.awt.Color(255, 255, 255));
        RespuestFechaTermino.setFont(new java.awt.Font("Garamond", 0, 12)); // NOI18N
        RespuestFechaTermino.setPreferredSize(new java.awt.Dimension(86, 21));
        jPanel1.add(RespuestFechaTermino, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 185, 21));

        RespuestFechaInicio.setBackground(new java.awt.Color(51, 51, 51));
        RespuestFechaInicio.setForeground(new java.awt.Color(255, 255, 255));
        RespuestFechaInicio.setFont(new java.awt.Font("Garamond", 0, 12)); // NOI18N
        jPanel1.add(RespuestFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 185, 21));
        RespuestFechaInicio.getAccessibleContext().setAccessibleName("");

        RespuestEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Renovado", "Activo", "Finalizado" }));
        RespuestEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RespuestEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(RespuestEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 185, 21));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Estado:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 63, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Rut:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 63, -1));

        RespuestaRut.setBackground(new java.awt.Color(255, 255, 255));
        RespuestaRut.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jPanel1.add(RespuestaRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 185, -1));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //Si las casillas estan llenas puede guardar los datos
        if ((String) this.RespuestEstado.getSelectedItem() != null
                || this.RespuestFechaInicio.getDate() != null || this.RespuestFechaTermino.getDate() != null
                || this.RespuestNombre.getText() != null || (String) this.RespuestaTipo.getSelectedItem() != null
                || this.RespuestaEmpresa.getText() != null || this.RespuestaValor.getText() != null
                || this.RespuestaEmpresa.getText() != null) {
            String[][] datos = null;
            if (this.RespuestaRut.getText().equals("")) {
                this.RespuestaRut.setText("0");
            }
            if (this.RespuestaValor.getText().equals("")) {
                this.RespuestaValor.setText("0");
            }
            datos = ControladorContrato.buscarContrato((String) this.RespuestaTipo.getSelectedItem(), (String) this.RespuestEstado.getSelectedItem(), this.RespuestFechaInicio.getDate(),
                    this.RespuestFechaTermino.getDate(), this.RespuestNombre.getText(), ControladorContrato.parseRUTtoINT(this.RespuestaRut.getText()),
                    Integer.parseInt(this.RespuestaValor.getText()), this.RespuestaEmpresa.getText());
            if (datos != null) {
                this.Gcontratos.setDatos_para_tabla(datos);
                this.Gcontratos.cargarDatosTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Los datos no han sido encontrados.", "ERROR", JOptionPane.WARNING_MESSAGE);
            }

            this.dispose();

        } else {//si no le avisa al usuario que le faltan casillas por llenar.
            JOptionPane.showMessageDialog(null, "Debe llenar al menos una casilla.", "ERROR", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void RespuestaTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RespuestaTipoActionPerformed
        String aux = (String) this.RespuestaTipo.getSelectedItem();
        if (aux.equals("Planta")) {
            this.RespuestaEmpresa.setEnabled(false);
        } else {
            this.RespuestaEmpresa.setEnabled(true);
        }
    }//GEN-LAST:event_RespuestaTipoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void RespuestEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RespuestEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RespuestEstadoActionPerformed

    /**
     * Permite obtener el estado
     * @return
     */
    public JComboBox<String> getRespuestEstado1() {
        return RespuestEstado;
    }

    /**
     * Permite obtener la fecha de inicio
     * @return
     */
    public JDateChooser getRespuestFechaInicio() {
        return RespuestFechaInicio;
    }

    /**
     * Permite obtener la fecha de termino
     * @return
     */
    public JDateChooser getRespuestFechaTermino() {
        return RespuestFechaTermino;
    }

    /**
     * Permite obtener el nombre
     * @return
     */
    public JTextField getRespuestNombre() {
        return RespuestNombre;
    }

    /**
     * Permite obtener el rut.
     * @return
     */
    public JTextField getRespuestaRut() {
        return RespuestaEmpresa;
    }

    /**
     * Permite obtener el tipo.
     * @return
     */
    public JComboBox<String> getRespuestaTipo() {
        return RespuestaTipo;
    }

    /**
     * permite obtener el valor.
     * @return
     */
    public JTextField getRespuestaValor() {
        return RespuestaValor;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> RespuestEstado;
    private com.toedter.calendar.JDateChooser RespuestFechaInicio;
    private com.toedter.calendar.JDateChooser RespuestFechaTermino;
    private javax.swing.JTextField RespuestNombre;
    private javax.swing.JTextField RespuestaEmpresa;
    private javax.swing.JTextField RespuestaRut;
    private javax.swing.JComboBox<String> RespuestaTipo;
    private javax.swing.JTextField RespuestaValor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
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

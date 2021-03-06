package root.gestionagricola.vistas.dueño;

import com.toedter.calendar.JDateChooser;
import java.awt.Container;
import java.sql.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import root.gestionagricola.gestioncontrato.ControladorContrato;

/**
 * Vista para modificar contrato.
 * @author Los Lanzas
 */
public class ModificarDatoContrato extends javax.swing.JFrame {

    private int folio_recibido;

    /**
     * Constructor de la vista.
     */
    public ModificarDatoContrato() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        RespuestaEmpresa = new javax.swing.JTextField();
        RespuestNombre = new javax.swing.JTextField();
        RespuestaValor = new javax.swing.JTextField();
        RespuestaRut = new javax.swing.JTextField();
        RespuestaTipo = new javax.swing.JComboBox<>();
        BotonModificar = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        RespuestFechaTermino = new com.toedter.calendar.JDateChooser();
        RespuestFechaInicio = new com.toedter.calendar.JDateChooser();
        RespuestEstado = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fecha Inicio:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 101, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Fecha Termino:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 101, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Rut:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 63, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nombre:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 63, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Sueldo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 63, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tipo:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 63, -1));

        RespuestaEmpresa.setBackground(new java.awt.Color(255, 255, 255));
        RespuestaEmpresa.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        RespuestaEmpresa.setEnabled(false);
        jPanel1.add(RespuestaEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 185, -1));

        RespuestNombre.setBackground(new java.awt.Color(255, 255, 255));
        RespuestNombre.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jPanel1.add(RespuestNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 185, -1));

        RespuestaValor.setBackground(new java.awt.Color(255, 255, 255));
        RespuestaValor.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        RespuestaValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RespuestaValorActionPerformed(evt);
            }
        });
        jPanel1.add(RespuestaValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 185, -1));

        RespuestaRut.setBackground(new java.awt.Color(255, 255, 255));
        RespuestaRut.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        RespuestaRut.setEnabled(false);
        jPanel1.add(RespuestaRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 185, -1));

        RespuestaTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Planta", "Subcontrato" }));
        RespuestaTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RespuestaTipoActionPerformed(evt);
            }
        });
        jPanel1.add(RespuestaTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 185, 21));

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

        RespuestFechaTermino.setBackground(new java.awt.Color(51, 51, 51));
        RespuestFechaTermino.setForeground(new java.awt.Color(255, 255, 255));
        RespuestFechaTermino.setFont(new java.awt.Font("Garamond", 0, 12)); // NOI18N
        RespuestFechaTermino.setPreferredSize(new java.awt.Dimension(86, 21));
        jPanel1.add(RespuestFechaTermino, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 185, 21));

        RespuestFechaInicio.setBackground(new java.awt.Color(51, 51, 51));
        RespuestFechaInicio.setForeground(new java.awt.Color(255, 255, 255));
        RespuestFechaInicio.setFont(new java.awt.Font("Garamond", 0, 12)); // NOI18N
        jPanel1.add(RespuestFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 185, 21));
        RespuestFechaInicio.getAccessibleContext().setAccessibleName("");

        RespuestEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Renovado", "Activo", "Finalizado" }));
        RespuestEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RespuestEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(RespuestEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 185, 21));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Estado:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 63, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Nombre Empresa:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 120, 20));

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
        datos = ControladorContrato.getContrato(this.folio_recibido);

        if ((String) this.RespuestEstado.getSelectedItem() != null
                && this.RespuestFechaInicio.getDate() != null && this.RespuestFechaTermino.getDate() != null
                && this.RespuestNombre.getText() != null && (String) this.RespuestaTipo.getSelectedItem() != null
                && this.RespuestaEmpresa.getText() != null && this.RespuestaValor.getText() != null) {

            //Valido si folio y sueldo es Numero.
            if (this.esNumero(this.RespuestaValor.getText())) {
                if (this.validarRut(this.RespuestaRut.getText())) {//Valido si el rut es correcto
                    //Aqui se llama al metodo del controlador que hara la conexion con el modelo.
                    if (this.RespuestFechaTermino.getDate().after(this.RespuestFechaInicio.getDate())) {//verifico si la fecha de termino esta despues de la fecha de inicio
                        ControladorContrato.modificarContrato(this.folio_recibido, (String) this.RespuestaTipo.getSelectedItem(), (String) this.RespuestEstado.getSelectedItem(), this.RespuestFechaInicio.getDate(),
                                this.RespuestFechaTermino.getDate(), this.RespuestNombre.getText(), ControladorContrato.parseRUTtoINT(this.RespuestaRut.getText()), Integer.parseInt(this.RespuestaValor.getText()), this.RespuestaEmpresa.getText());
                        this.dispose();
                        JOptionPane.showMessageDialog(null, "Contrato Modificado.", "Modificación", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "La fecha de termino tiene que ser despues de la Fecha de Inicio.", "ERROR", JOptionPane.WARNING_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Rut Invalido.", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "El Sueldo deben ser numeros Enteros sin puntos.", "ERROR", JOptionPane.WARNING_MESSAGE);
            }

        } else {//si no le avisa al usuario que le faltan casillas por llenar.
            JOptionPane.showMessageDialog(null, "Faltan llenar casillas.", "ERROR", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_BotonModificarActionPerformed

    private void RespuestaTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RespuestaTipoActionPerformed
        String aux = (String) this.RespuestaTipo.getSelectedItem();
        if (aux.equals("Planta")) {
            this.RespuestaEmpresa.setEnabled(false);

        } else {
            this.RespuestaEmpresa.setEnabled(true);
        }

    }//GEN-LAST:event_RespuestaTipoActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void RespuestEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RespuestEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RespuestEstadoActionPerformed

    private void RespuestaValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RespuestaValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RespuestaValorActionPerformed
    /**
     * Metodo para validar rut Chileno.
     *
     * @param rut String que contendra el rut ingresado por el usuario.
     * @return Verdadero si el rut es valido, Falso si el rut es invalido
     */
    public boolean validarRut(String rut) {

        boolean validacion = false;
        try {
            rut = rut.toUpperCase();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

            char dv = rut.charAt(rut.length() - 1);

            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }

    /**
     * Metodo para validar Si el folio y sueldo son numeros.
     *
     * @param cadena Cadena que sera recibida en un texfield.
     * @return true si es un numero, False si no es un numero.
     */
    public boolean esNumero(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    /**
     * Permite obtener folio
     * @param folio_recibido
     */
    public void setFolio_recibido(int folio_recibido) {
        this.folio_recibido = folio_recibido;
    }

    /**
     * Permite obtener estado.
     * @return
     */
    public JComboBox<String> getRespuestEstado() {
        return RespuestEstado;
    }

    /**
     * Permite obtener fecha inicio.
     * @return
     */
    public JDateChooser getRespuestFechaInicio() {
        return RespuestFechaInicio;
    }

    /**
     * Permite obtener fecha termino.
     * @return
     */
    public JDateChooser getRespuestFechaTermino() {
        return RespuestFechaTermino;
    }

    /**
     * Permite obtener nombre.
     * @return
     */
    public JTextField getRespuestNombre() {
        return RespuestNombre;
    }

    /**
     * Permite obtener empresa.
     * @return
     */
    public JTextField getRespuestaEmpresa() {
        return RespuestaEmpresa;
    }

    /**
     * Permite obtener rut.
     * @return
     */
    public JTextField getRespuestaRut() {
        return RespuestaRut;
    }

    /**
     * Permite obtener tipo.
     * @return
     */
    public JComboBox<String> getRespuestaTipo() {
        return RespuestaTipo;
    }

    /**
     * Permite obtener valor.
     * @return
     */
    public JTextField getRespuestaValor() {
        return RespuestaValor;
    }

    /**
     * Permite actualizar el frame.
     */
    public void actualizarpantalla() {
        Container temp = this.getContentPane();
        SwingUtilities.updateComponentTreeUI(temp);
        temp.validate();
        requestFocusInWindow();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JComboBox<String> RespuestEstado;
    private com.toedter.calendar.JDateChooser RespuestFechaInicio;
    private com.toedter.calendar.JDateChooser RespuestFechaTermino;
    private javax.swing.JTextField RespuestNombre;
    private javax.swing.JTextField RespuestaEmpresa;
    private javax.swing.JTextField RespuestaRut;
    private javax.swing.JComboBox<String> RespuestaTipo;
    private javax.swing.JTextField RespuestaValor;
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

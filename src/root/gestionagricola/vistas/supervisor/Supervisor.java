package root.gestionagricola.vistas.supervisor;

import root.gestionagricola.gestionsupervisor.ControladorAsistencia;
import root.gestionagricola.vistas.ControladorVistas;
import root.gestionagricola.vistas.ModificarDatoCuentaPropia;

/**
 *
 * @author Javier
 */
public class Supervisor extends javax.swing.JPanel {

    private ControladorVistas controladorVistas;

    private ModificarDatoCuentaPropia modificarDato;

    public Supervisor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Titulo6 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1270, 735));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/gestionagricola/vistas/imagenes/frutap.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 10, 229, 151));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/gestionagricola/vistas/imagenes/desconectarte.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 130, 70));

        botonModificar.setBackground(new java.awt.Color(255, 255, 255));
        botonModificar.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        botonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/gestionagricola/vistas/imagenes/tuerca-de-opciones.png"))); // NOI18N
        botonModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 153), 2));
        botonModificar.setBorderPainted(false);
        botonModificar.setFocusPainted(false);
        botonModificar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 50, 60));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/gestionagricola/vistas/imagenes/Asistencia.png"))); // NOI18N
        jButton6.setText("Asistencia");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 153), 2, true));
        jButton6.setFocusPainted(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 600, 130));

        Titulo6.setBackground(new java.awt.Color(255, 255, 255));
        Titulo6.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        Titulo6.setForeground(new java.awt.Color(255, 255, 255));
        Titulo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo6.setText("Supervisor");
        add(Titulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 232, 83));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/gestionagricola/vistas/imagenes/Fondo oscuro.png"))); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(1299, 735));
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 735));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String[][] datos = ControladorAsistencia.getTabla();
        this.controladorVistas.getAsistencia().setDatos_tabla(datos);
        this.controladorVistas.getAsistencia().cargarDatosTabla();
        this.controladorVistas.SeleccionarPanel("asistencia");


    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.controladorVistas.SeleccionarPanel("login");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed

        this.modificarDato = new ModificarDatoCuentaPropia();
        modificarDato.setVisible(true);

    }//GEN-LAST:event_botonModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Titulo6;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    public void setControladorVista(ControladorVistas controladorVistas) {
        this.controladorVistas = controladorVistas;
    }
}

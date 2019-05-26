package root.gestionagricola.vistas.administrador;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import root.gestionagricola.gestionusuario.ControladorUsuario;
import root.gestionagricola.vistas.ControladorVistas;
import root.gestionagricola.vistas.ModificarDatoCuentaPropia;

/**
 *
 * @author Javier
 */
public class Administrador extends javax.swing.JPanel {

    private ControladorVistas controladorVista;
    private crearDatosUsuario crearDatosUsuario;
    private ModificarDatoUsuario modificarDato;
    private ModificarDatoCuentaPropia modifcarCuentaPropia;
    private EliminarDatoUsuario eliminarDato;
    private String[][] datos_para_tabla;

    public Administrador() throws SQLException, IllegalAccessException, InstantiationException, ClassNotFoundException  {
        
        initComponents();
        this.datos_para_tabla = ControladorUsuario.cargarDatos();
        this.cargarDatosTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        volver = new javax.swing.JButton();
        Titulo6 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        BotonCrear = new javax.swing.JButton();
        BotonModificarUsuarios = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1270, 735));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/gestionagricola/vistas/imagenes/desconectarte.png"))); // NOI18N
        volver.setBorderPainted(false);
        volver.setContentAreaFilled(false);
        volver.setFocusPainted(false);
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 130, 70));

        Titulo6.setBackground(new java.awt.Color(255, 255, 255));
        Titulo6.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        Titulo6.setForeground(new java.awt.Color(255, 255, 255));
        Titulo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo6.setText("Administrador");
        add(Titulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 232, 83));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/gestionagricola/vistas/imagenes/usuarios-multiples-en-silueta.png"))); // NOI18N
        jButton6.setText("Gestión de Cuentas de Usuario");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 153), 2, true));
        jButton6.setFocusPainted(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 840, 50));

        botonEliminar.setBackground(new java.awt.Color(255, 255, 255));
        botonEliminar.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        botonEliminar.setForeground(new java.awt.Color(0, 0, 0));
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/gestionagricola/vistas/imagenes/circulo.png"))); // NOI18N
        botonEliminar.setText("Eliminar Usuario");
        botonEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 153), 2));
        botonEliminar.setFocusPainted(false);
        botonEliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 200, 40));

        BotonCrear.setBackground(new java.awt.Color(255, 255, 255));
        BotonCrear.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        BotonCrear.setForeground(new java.awt.Color(0, 0, 0));
        BotonCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/gestionagricola/vistas/imagenes/circulo.png"))); // NOI18N
        BotonCrear.setText("Crear Usuario");
        BotonCrear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 153), 2));
        BotonCrear.setFocusPainted(false);
        BotonCrear.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCreaarActionPerformed(evt);
            }
        });
        add(BotonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 200, 40));

        BotonModificarUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        BotonModificarUsuarios.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        BotonModificarUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        BotonModificarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/gestionagricola/vistas/imagenes/circulo.png"))); // NOI18N
        BotonModificarUsuarios.setText("Modificar Usuario");
        BotonModificarUsuarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 153), 2));
        BotonModificarUsuarios.setFocusPainted(false);
        BotonModificarUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonModificarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarUsuariosbotonCreaarActionPerformed(evt);
            }
        });
        add(BotonModificarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 200, 40));

        botonModificar.setBackground(new java.awt.Color(255, 255, 255));
        botonModificar.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        botonModificar.setForeground(new java.awt.Color(0, 0, 0));
        botonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/gestionagricola/vistas/imagenes/tuerca-de-opciones.png"))); // NOI18N
        botonModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 153), 2));
        botonModificar.setBorderPainted(false);
        botonModificar.setFocusPainted(false);
        botonModificar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonModificar.setOpaque(false);
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 50, 60));

        Tabla.setBackground(new java.awt.Color(255, 255, 255));
        Tabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Tabla.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        Tabla.setForeground(new java.awt.Color(0, 0, 0));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre Usuario", "Tipo de Cuenta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabla.setGridColor(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(Tabla);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 620, 360));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/gestionagricola/vistas/imagenes/frutap.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 10, 229, 151));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/gestionagricola/vistas/imagenes/Fondo oscuro.png"))); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(1299, 735));
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1323, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    }//GEN-LAST:event_jButton6ActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed

        this.eliminarDato = new EliminarDatoUsuario(this);
        eliminarDato.setVisible(true);

        
    }//GEN-LAST:event_botonEliminarActionPerformed
   
    public void setDatos_para_tabla(String[][] datos_para_tabla) {
        this.reiniciarTabla();
        this.datos_para_tabla = datos_para_tabla;
    }

    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearActionPerformed


    }//GEN-LAST:event_BotonCrearActionPerformed
    private void botonCreaarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCreaarActionPerformed
        this.crearDatosUsuario = new crearDatosUsuario(this);
        crearDatosUsuario.setVisible(true);
    }//GEN-LAST:event_botonCreaarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        this.modifcarCuentaPropia = new ModificarDatoCuentaPropia();
        this.modifcarCuentaPropia.setVisible(true);


    }//GEN-LAST:event_botonModificarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        this.controladorVista.SeleccionarPanel("login");
    }//GEN-LAST:event_volverActionPerformed

    private void BotonModificarUsuariosbotonCreaarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarUsuariosbotonCreaarActionPerformed
        this.modificarDato = new ModificarDatoUsuario(this);
        modificarDato.setVisible(true);
    }//GEN-LAST:event_BotonModificarUsuariosbotonCreaarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCrear;
    private javax.swing.JButton BotonModificarUsuarios;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel Titulo6;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables

    public void setControladorVista(ControladorVistas controladorVistas) {
        this.controladorVista = controladorVistas;
    }
    public void cargarDatosTabla() {
        for (int i = 0; i < this.datos_para_tabla.length; i++) {
            this.Tabla.setValueAt(this.datos_para_tabla[i][0], i, 0);
            this.Tabla.setValueAt(this.datos_para_tabla[i][1], i, 1);
        }
    }
    public void reiniciarTabla(){
        for (int i = 0; i < this.datos_para_tabla.length; i++) {
            this.Tabla.setValueAt(null, i, 0);
            this.Tabla.setValueAt(null, i, 1);
        }
    }
    public void setTabla(JTable Tabla) {
        this.Tabla = Tabla;
    }
    
}

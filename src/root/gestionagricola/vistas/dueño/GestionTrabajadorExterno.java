/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.gestionagricola.vistas.dueño;

import javax.swing.JTable;
import root.gestionagricola.vistas.ControladorVistas;

/**
 *
 * @author Javier
 */
public class GestionTrabajadorExterno extends javax.swing.JPanel {

    private ControladorVistas controladorVista;
    private CrearTrabajadorExterno crearTrabajadorE;
    private ModificarTrabajadorExterno modificarTrabajadorE;
    private EliminarTrabajadorExterno eliminarTrabajadorE;
    private String[][] datos_para_tabla;

    
    public GestionTrabajadorExterno() {
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
        titulo = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonIngresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Fondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1270, 735));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/gestionagricola/vistas/imagenes/frutap.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 10, 229, 151));

        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/gestionagricola/vistas/imagenes/trabajadores 32px.png"))); // NOI18N
        titulo.setText("Gestión de Trabajadores Externos");
        titulo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 153), 2, true));
        titulo.setFocusPainted(false);
        titulo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloActionPerformed(evt);
            }
        });
        add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 1020, 50));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/gestionagricola/vistas/imagenes/Volver atras.png"))); // NOI18N
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
        botonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/gestionagricola/vistas/imagenes/circulo.png"))); // NOI18N
        botonModificar.setText("Modificar Trabajador");
        botonModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 153), 2));
        botonModificar.setFocusPainted(false);
        botonModificar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 200, 40));

        botonEliminar.setBackground(new java.awt.Color(255, 255, 255));
        botonEliminar.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/gestionagricola/vistas/imagenes/circulo.png"))); // NOI18N
        botonEliminar.setText("Eliminar Trabajador");
        botonEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 153), 2));
        botonEliminar.setFocusPainted(false);
        botonEliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 200, 40));

        botonIngresar.setBackground(new java.awt.Color(255, 255, 255));
        botonIngresar.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        botonIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/gestionagricola/vistas/imagenes/circulo.png"))); // NOI18N
        botonIngresar.setText("Ingresar Trabajador");
        botonIngresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 153), 2));
        botonIngresar.setFocusPainted(false);
        botonIngresar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonIngresar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });
        add(botonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 200, 40));

        Tabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Tabla.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Rut", "Nombre Trabajador", "Rol", "N° Subcontrato"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabla.setEnabled(false);
        Tabla.setGridColor(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(Tabla);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 800, 360));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/gestionagricola/vistas/imagenes/Fondo oscuro.png"))); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(1299, 735));
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1323, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        this.modificarTrabajadorE = new ModificarTrabajadorExterno(this);
        modificarTrabajadorE.setVisible(true);

    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        this.crearTrabajadorE = new CrearTrabajadorExterno(this);
        crearTrabajadorE.setVisible(true);
    }//GEN-LAST:event_botonIngresarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        this.eliminarTrabajadorE = new EliminarTrabajadorExterno(this);
        eliminarTrabajadorE.setVisible(true);

    }//GEN-LAST:event_botonEliminarActionPerformed

    private void tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.controladorVista.SeleccionarPanel("dueño");
    }//GEN-LAST:event_jButton4ActionPerformed

    public void setDatos_para_tabla(String[][] datos_para_tabla) {
        this.reiniciarTabla();
        this.datos_para_tabla = datos_para_tabla;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonIngresar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton titulo;
    // End of variables declaration//GEN-END:variables

    public void setControladorVista(ControladorVistas controlador_vistas) {
        this.controladorVista = controlador_vistas;
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

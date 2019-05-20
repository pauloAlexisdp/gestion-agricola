/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.gestionagricola.vistas.dueño;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import root.gestionagricola.gestioncontrato.ControladorContrato;
import root.gestionagricola.vistas.ControladorVistas;

/**
 *
 * @author ignacioburgos
 */
public class GestionDeContratos extends javax.swing.JPanel {

    private ControladorVistas controladorVistas;
    private IngresarDatosContratos ingresar_datos;
    private ModificarDatoContrato modificarDato;
    private EliminarDatoContrato eliminarDato;
    private BusquedaContrato busquedaContrato;
    private String[][] datos_para_tabla ;

    public GestionDeContratos() {

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

        IconoManzana = new javax.swing.JLabel();
        BotonModificar = new javax.swing.JButton();
        BotonBusqueda = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        BotonIngresar = new javax.swing.JButton();
        BotonVolver = new javax.swing.JButton();
        BotonTitulo = new javax.swing.JButton();
        TablaContratos = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Fondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IconoManzana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/gestionagricola/vistas/imagenes/frutap.png"))); // NOI18N
        IconoManzana.setText("jLabel2");
        add(IconoManzana, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 10, 229, 151));

        BotonModificar.setBackground(new java.awt.Color(255, 255, 255));
        BotonModificar.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        BotonModificar.setForeground(new java.awt.Color(0, 0, 0));
        BotonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/gestionagricola/vistas/imagenes/circulo.png"))); // NOI18N
        BotonModificar.setText("Modificar Contrato");
        BotonModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 153), 2));
        BotonModificar.setFocusPainted(false);
        BotonModificar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });
        add(BotonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 200, 40));

        BotonBusqueda.setBackground(new java.awt.Color(255, 255, 255));
        BotonBusqueda.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        BotonBusqueda.setForeground(new java.awt.Color(0, 0, 0));
        BotonBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/gestionagricola/vistas/imagenes/circulo.png"))); // NOI18N
        BotonBusqueda.setText("Búscar Contratos");
        BotonBusqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 153), 2));
        BotonBusqueda.setFocusPainted(false);
        BotonBusqueda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBusquedaActionPerformed(evt);
            }
        });
        add(BotonBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 200, 40));

        BotonEliminar.setBackground(new java.awt.Color(255, 255, 255));
        BotonEliminar.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        BotonEliminar.setForeground(new java.awt.Color(0, 0, 0));
        BotonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/gestionagricola/vistas/imagenes/circulo.png"))); // NOI18N
        BotonEliminar.setText("Eliminar Contrato");
        BotonEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 153), 2));
        BotonEliminar.setFocusPainted(false);
        BotonEliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });
        add(BotonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 200, 40));

        BotonIngresar.setBackground(new java.awt.Color(255, 255, 255));
        BotonIngresar.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        BotonIngresar.setForeground(new java.awt.Color(0, 0, 0));
        BotonIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/gestionagricola/vistas/imagenes/circulo.png"))); // NOI18N
        BotonIngresar.setText("Ingresar Contrato");
        BotonIngresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 153), 2));
        BotonIngresar.setFocusPainted(false);
        BotonIngresar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonIngresar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BotonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresarActionPerformed(evt);
            }
        });
        add(BotonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 200, 40));

        BotonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/gestionagricola/vistas/imagenes/Volver atras.png"))); // NOI18N
        BotonVolver.setBorderPainted(false);
        BotonVolver.setContentAreaFilled(false);
        BotonVolver.setFocusPainted(false);
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });
        add(BotonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 30, 130, 70));

        BotonTitulo.setBackground(new java.awt.Color(255, 255, 255));
        BotonTitulo.setFont(new java.awt.Font("Garamond", 1, 36)); // NOI18N
        BotonTitulo.setForeground(new java.awt.Color(0, 0, 0));
        BotonTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/gestionagricola/vistas/imagenes/contrato 32px.png"))); // NOI18N
        BotonTitulo.setText("Gestión de Contratos");
        BotonTitulo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 153), 2, true));
        BotonTitulo.setFocusPainted(false);
        BotonTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BotonTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTituloActionPerformed(evt);
            }
        });
        add(BotonTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 1020, 50));

        Tabla.setBackground(new java.awt.Color(255, 255, 255));
        Tabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Tabla.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        Tabla.setForeground(new java.awt.Color(0, 0, 0));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N° Contrato", "Tipo", "Estado", "Fecha Inicio", "Fecha termino", "Nombre", "Rut", "Valor", "Nombre Empresa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabla.setGridColor(new java.awt.Color(153, 153, 153));
        TablaContratos.setViewportView(Tabla);

        add(TablaContratos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 800, 360));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/gestionagricola/vistas/imagenes/Fondo oscuro.png"))); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(1270, 735));
        add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BotonTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonTituloActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        this.controladorVistas.SeleccionarPanel("dueño");
    }//GEN-LAST:event_BotonVolverActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        String respuesta = JOptionPane.showInputDialog(null, "Ingrese el folio del contrato que desea modificar.", "Actualizar", JOptionPane.INFORMATION_MESSAGE);
        if (respuesta == null) {//no hace nada

        } else {//aqui se trabaja con la respuesta.

            this.modificarDato = new ModificarDatoContrato();
            modificarDato.setVisible(true);
            modificarDato.setFolio_recibido(Integer.parseInt(respuesta));
            //aqui se le debe pasar los datos que se modificaran al controlador.Los datos estan guardados como atributos.
        }
    }//GEN-LAST:event_BotonModificarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        String respuesta = JOptionPane.showInputDialog(null, "Ingrese el folio del contrato que desea eliminar.", "Eliminar", JOptionPane.INFORMATION_MESSAGE);
        if (respuesta == null) {//no hace nada

        } else {//aqui se llama al otro JFrame(EliminarDatosContratos) que trabajara los datos.

            this.eliminarDato = new EliminarDatoContrato();
            eliminarDato.setVisible(true);
            eliminarDato.setFolio_recibido(Integer.parseInt(respuesta));
        }

    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresarActionPerformed
        this.ingresar_datos = new IngresarDatosContratos();
        ingresar_datos.setVisible(true);
    }//GEN-LAST:event_BotonIngresarActionPerformed

    private void BotonBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBusquedaActionPerformed
        this.busquedaContrato = new BusquedaContrato(this);
        busquedaContrato.setVisible(true);
    }//GEN-LAST:event_BotonBusquedaActionPerformed

    public void setjTable(JTable jTable) {
        this.Tabla = jTable;
    }

    public void setDatos_para_tabla(String[][] datos_para_tabla) {
        this.datos_para_tabla = datos_para_tabla;
    }

    public void cargarDatosTabla() {
        for (int i = 0; i < this.datos_para_tabla.length; i++) {
            this.Tabla.setValueAt(this.datos_para_tabla[i][0], i, 0);
            this.Tabla.setValueAt(this.datos_para_tabla[i][1], i, 1);
            this.Tabla.setValueAt(this.datos_para_tabla[i][2], i, 2);
            this.Tabla.setValueAt(this.datos_para_tabla[i][3], i, 3);
            this.Tabla.setValueAt(this.datos_para_tabla[i][4], i, 4);
            this.Tabla.setValueAt(this.datos_para_tabla[i][5], i, 5);
            this.Tabla.setValueAt(this.datos_para_tabla[i][6], i, 6);
            this.Tabla.setValueAt(this.datos_para_tabla[i][7], i, 7);
            this.Tabla.setValueAt(this.datos_para_tabla[i][8], i, 8);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBusqueda;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonIngresar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton BotonTitulo;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel IconoManzana;
    private javax.swing.JTable Tabla;
    private javax.swing.JScrollPane TablaContratos;
    // End of variables declaration//GEN-END:variables

    public void setControladorVista(ControladorVistas controlador_vistas) {
        this.controladorVistas = controlador_vistas;
    }

}

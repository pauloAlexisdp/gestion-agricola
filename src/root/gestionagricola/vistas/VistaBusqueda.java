/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.gestionagricola.vistas;

/**
 *
 * @author Los Lanzas
 */
public class VistaBusqueda extends javax.swing.JFrame {

    /**
     * Creates new form VistaBusqueda
     */
    public VistaBusqueda() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Titulo1 = new javax.swing.JLabel();
        Titulo6 = new javax.swing.JLabel();
        Titulo7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        Titulo8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        Titulo9 = new javax.swing.JLabel();
        Titulo10 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        Titulo11 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        Titulo12 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        Titulo13 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Titulo14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(25, 25, 112));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(80, 214, 141));

        Titulo1.setBackground(new java.awt.Color(255, 255, 255));
        Titulo1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        Titulo1.setForeground(new java.awt.Color(255, 255, 255));
        Titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/gestionagricola/vistas/imagenes/frutap.png"))); // NOI18N
        Titulo1.setText("LOG IN  ");

        Titulo6.setBackground(new java.awt.Color(255, 255, 255));
        Titulo6.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        Titulo6.setForeground(new java.awt.Color(255, 255, 255));
        Titulo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo6.setText("Búsqueda");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Titulo6, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 559, Short.MAX_VALUE)
                .addComponent(Titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Titulo6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 120));

        Titulo7.setBackground(new java.awt.Color(255, 255, 255));
        Titulo7.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Titulo7.setForeground(new java.awt.Color(255, 255, 255));
        Titulo7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo7.setText("Nombre: ");
        jPanel1.add(Titulo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 160, 40));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 410, 50));

        Titulo8.setBackground(new java.awt.Color(255, 255, 255));
        Titulo8.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Titulo8.setForeground(new java.awt.Color(255, 255, 255));
        Titulo8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo8.setText("Rut: ");
        jPanel1.add(Titulo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 170, 40));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 410, 50));

        Titulo9.setBackground(new java.awt.Color(255, 255, 255));
        Titulo9.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Titulo9.setForeground(new java.awt.Color(255, 255, 255));
        Titulo9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo9.setText("Fecha de ");
        jPanel1.add(Titulo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 160, -1));

        Titulo10.setBackground(new java.awt.Color(255, 255, 255));
        Titulo10.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Titulo10.setForeground(new java.awt.Color(255, 255, 255));
        Titulo10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo10.setText("Nacimiento:");
        jPanel1.add(Titulo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 200, 50));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 410, 50));

        Titulo11.setBackground(new java.awt.Color(255, 255, 255));
        Titulo11.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Titulo11.setForeground(new java.awt.Color(255, 255, 255));
        Titulo11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo11.setText("Cargo:");
        jPanel1.add(Titulo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 200, 40));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 410, 50));

        Titulo12.setBackground(new java.awt.Color(255, 255, 255));
        Titulo12.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Titulo12.setForeground(new java.awt.Color(255, 255, 255));
        Titulo12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo12.setText("# Contrato:");
        jPanel1.add(Titulo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 200, 40));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 410, 50));

        Titulo13.setBackground(new java.awt.Color(255, 255, 255));
        Titulo13.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Titulo13.setForeground(new java.awt.Color(255, 255, 255));
        Titulo13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo13.setText("Sexo:");
        jPanel1.add(Titulo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 220, 40));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 410, 50));

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton1.setText("Realizar Búsqueda");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 580, 280, 60));

        jButton3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton3.setText("Volver");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 590, 210, 60));

        Titulo14.setBackground(new java.awt.Color(255, 255, 255));
        Titulo14.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Titulo14.setForeground(new java.awt.Color(241, 196, 15));
        Titulo14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Titulo14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 690, 1220, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaBusqueda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo1;
    private javax.swing.JLabel Titulo10;
    private javax.swing.JLabel Titulo11;
    private javax.swing.JLabel Titulo12;
    private javax.swing.JLabel Titulo13;
    private javax.swing.JLabel Titulo14;
    private javax.swing.JLabel Titulo6;
    private javax.swing.JLabel Titulo7;
    private javax.swing.JLabel Titulo8;
    private javax.swing.JLabel Titulo9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}

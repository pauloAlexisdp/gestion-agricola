
package root.gestionagricola.vistas;

import javax.swing.JOptionPane;
import root.gestionagricola.ControladorCuenta;
import root.gestionagricola.Cuenta;
import root.gestionagricola.SingletonCuenta;

/**
 * Permite agregar funcionalidad al login del programa.
 * @author Los Lanzas
 */
public class Login extends javax.swing.JPanel {

    private ControladorVistas controladorVista;
    private static Cuenta instanciaCuenta;
    
    /**
     * Constructor de la clase.
     */
    public Login() {
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
        Titulo2 = new javax.swing.JLabel();
        nombre_txt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        password_txt = new javax.swing.JPasswordField();
        Fondo = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        Titulo2.setBackground(new java.awt.Color(255, 255, 255));
        Titulo2.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        Titulo2.setForeground(new java.awt.Color(255, 255, 255));
        Titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/gestionagricola/vistas/imagenes/frutap.png"))); // NOI18N
        Titulo2.setText("LOG IN  ");

        nombre_txt.setBackground(new java.awt.Color(51, 51, 51));
        nombre_txt.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        nombre_txt.setForeground(new java.awt.Color(255, 255, 255));
        nombre_txt.setText("Usuario");
        nombre_txt.setToolTipText("Nombre De Usuario");
        nombre_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 153)));

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setFont(new java.awt.Font("Garamond", 1, 15)); // NOI18N
        jButton1.setText("Iniciar Sesión");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        password_txt.setBackground(new java.awt.Color(51, 51, 51));
        password_txt.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        password_txt.setForeground(new java.awt.Color(255, 255, 255));
        password_txt.setText("Contrasena");
        password_txt.setToolTipText("Ingrese su contrasena");
        password_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 153)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(71, Short.MAX_VALUE)
                        .addComponent(nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(password_txt))))
                .addGap(65, 65, 65))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 77, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 420, 510));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/gestionagricola/vistas/imagenes/Fondo claro.jpg"))); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(1270, 693));
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 735));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Permite deribar las vistas en base a la instancia de cuenta.
     * @param evt Recibe un <java.awt.event.ActionEvent> con el evento que
     * gatilla la accion.
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        /* Se instancia una cuenta */
        this.instanciaCuenta = SingletonCuenta.getInstance(this.nombre_txt.getText(), this.password_txt.getText(), ControladorCuenta.getTipo(this.nombre_txt.getText(), this.password_txt.getText()));
        String tipo = this.instanciaCuenta.getTipo();
       
        if(tipo.equals("0")){
            JOptionPane.showMessageDialog(null, "Verifique sus datos, Usuario o Contraseña incorrecta.", "ERROR", JOptionPane.WARNING_MESSAGE);
            SingletonCuenta.downInstance();
        }
        
        /* Se derivan las vistas en base a la cuenta */
        else{
            if (this.instanciaCuenta.getTipo().equals("Dueño")){
                controladorVista.SeleccionarPanel("dueño");
            }
            else if (this.instanciaCuenta.getTipo().equals("Administrador")){
                controladorVista.SeleccionarPanel("admin");
            }
            else if (this.instanciaCuenta.getTipo().equals("Supervisor")){
                controladorVista.SeleccionarPanel("supervisor");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nombre_txt;
    private javax.swing.JPasswordField password_txt;
    // End of variables declaration//GEN-END:variables

    /**
     * Permite conectar con el Controlador de Vistas.
     * @param controladorVista Se espera una instancia de <ControladorVistas>.
     */
    public void setControladorVista(ControladorVistas controladorVista) {
        this.controladorVista = controladorVista;
    }
    
    /**
     * Permite obtener una instancia de la cuenta actual.
     * @return Retorna una instancia de <Cuenta> con la informacion de la
     * cuenta que ha iniciado sesion.
     */
    public static Cuenta getInstanciaCuenta(){
        return Login.instanciaCuenta;
    }
}

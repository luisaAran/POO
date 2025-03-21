/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
/**
 * Interfaz gráfica para el login de usuario.
 * Permite ingresar usuario y contraseña.
 *
 * @version 1.0
 * @author LUISA ARANGO
 */
public class LoginGUI extends javax.swing.JFrame {

    /**
     * Creates new form LoginGUI
     * /**
     * Constructor de la clase LoginGUI.
     * Inicializa los componentes y agrega el listener al botón "Iniciar Sesión".
     */
    public LoginGUI() {
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

        iniciarSesion = new javax.swing.JButton();
        Usuario = new javax.swing.JLabel();
        Contraseña = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        contraseña = new javax.swing.JPasswordField();
        errorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        iniciarSesion.setText("Iniciar Sesión");

        Usuario.setText("Ingrese el usuario: ");

        Contraseña.setText("Ingrese la contraseña: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Contraseña)
                            .addComponent(Usuario))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usuario)
                            .addComponent(contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(iniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usuario)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Contraseña)
                    .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(iniciarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorLabel)
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
    * Obtiene el JLabel para mostrar mensajes de error.
    *
    * @return El JLabel para mensajes de error.
    */
    public javax.swing.JLabel getErrorLabel() {
          return errorLabel;
     }
     /**
     * Obtiene el botón "Iniciar Sesión".
     *
     * @return El botón "Iniciar Sesión".
     */
    public javax.swing.JButton getIniciarSesionButton() {
        return iniciarSesion;
    }
     /**
     * Obtiene el campo de contraseña.
     *
     * @return El campo de contraseña.
     */
    public javax.swing.JPasswordField getContrasenaPasswordField() {
        return contraseña;
    }
    /**
     * Obtiene el campo de usuario.
     *
     * @return El campo de usuario.
     */
    public javax.swing.JTextField getUsuarioTextField() {
        return usuario;
    }
    /**
     * Establece el botón "Iniciar Sesión".
     *
     * @param iniciarSesion El botón "Iniciar Sesión".
     */
    public void setIniciarSesionButton(javax.swing.JButton iniciarSesion) {
        this.iniciarSesion = iniciarSesion;
    }

    /**
     * Establece el campo de contraseña.
     *
     * @param contraseña El campo de contraseña.
     */
    public void setContrasenaPasswordField(javax.swing.JPasswordField contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * Establece el campo de usuario.
     *
     * @param usuario El campo de usuario.
     */
    public void setUsuarioTextField(javax.swing.JTextField usuario) {
        this.usuario = usuario;
    }

    /**
     * Establece el JLabel para mostrar mensajes de error.
     *
     * @param errorLabel El JLabel para mensajes de error.
     */
    public void setErrorLabel(javax.swing.JLabel errorLabel) {
        this.errorLabel = errorLabel;
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contraseña;
    private javax.swing.JLabel Usuario;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JButton iniciarSesion;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}

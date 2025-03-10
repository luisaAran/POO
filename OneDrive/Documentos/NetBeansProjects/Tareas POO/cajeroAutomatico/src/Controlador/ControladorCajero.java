package Controlador;

import Excepciones.LoginException;
import Excepciones.OperacionInvalidaException;
import Excepciones.SaldoInsuficienteException;
import GUI.CajeroGui;
import GUI.LoginGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 * Controlador del cajero automático
 * 
 * 
 * @version 1.0
 * @author Luisa Arango
 */
public class ControladorCajero {

    private CajeroGui cajeroGUI;
    private LoginGUI loginBancario;
    private GestorCuentas gestor;

    /**
     * Constructor de ControladorCajero
     * Inicializa las interfaces gráficas y gestiona eventos de los botones
     */
    public ControladorCajero() {
        this.gestor = new GestorCuentas();
        this.loginBancario = new LoginGUI();
        this.cajeroGUI = new CajeroGui();
        this.loginBancario.setVisible(true);
        this.loginBancario.getIniciarSesionButton().addActionListener(new ButtonClickListener());

        JButton retirarButton = this.cajeroGUI.getRetirarButton();
        JButton depositarButton = this.cajeroGUI.getDepositarButton();
        
        retirarButton.addActionListener(new ButtonClickListener());
        depositarButton.addActionListener(new ButtonClickListener());
    }

    /**
     * Maneja el inicio de sesión del usuario
     * Verifica credenciales y muestra la interfaz del cajero si son correctas
     */
    private void handleLogin() {
        String user = this.loginBancario.getUsuarioTextField().getText();
        String password = new String(this.loginBancario.getContrasenaPasswordField().getPassword());
        try {
            if (this.gestor.loginCuenta(user, password)) {
                this.loginBancario.dispose(); // Cierra la ventana de inicio de sesión
                this.cajeroGUI.setVisible(true);  // Muestra la ventana del cajero automático
            }
        } catch (LoginException e) {
            this.loginBancario.getErrorLabel().setText(e.getMessage());
        }
    }

    /**
     * Maneja la operación de retiro
     * Obtiene la cantidad ingresada, la descuenta del saldo y actualiza la interfaz
     */
    private void handleRetiro() {
        String input = this.cajeroGUI.getTextField().getText();
        try {
            double cantidad = Double.parseDouble(input);

            if (cantidad <= 0) {
                throw new OperacionInvalidaException("La cantidad a retirar debe ser mayor que cero.");
            }

            this.gestor.retirar(cantidad);
            this.cajeroGUI.getSaldoLabel().setText("Saldo actual: " + this.gestor.consultarSaldo());
            this.cajeroGUI.getErrorLabel().setText(""); // Limpiar mensaje de error

        } catch (NumberFormatException e) {
            this.cajeroGUI.getErrorLabel().setText("Ingrese un número válido.");
        } catch (OperacionInvalidaException | SaldoInsuficienteException e) {
            this.cajeroGUI.getErrorLabel().setText(e.getMessage());
        } catch (Exception e) {
            this.cajeroGUI.getErrorLabel().setText("Error inesperado: " + e.getMessage());
        }
    }

    /**
     * Maneja la operación de depósito
     * Obtiene la cantidad ingresada, la suma al saldo y actualiza la interfaz
     */
    private void handleDeposito() {
        String input = this.cajeroGUI.getTextField().getText();
        try {
            double cantidad = Double.parseDouble(input);

            if (cantidad <= 0) {
                throw new OperacionInvalidaException("La cantidad a depositar debe ser mayor que cero.");
            }

            this.gestor.depositar(cantidad);
            this.cajeroGUI.getSaldoLabel().setText("Saldo actual: " + this.gestor.consultarSaldo());
            this.cajeroGUI.getErrorLabel().setText(""); // Limpiar mensaje de error

        } catch (NumberFormatException e) {
            this.cajeroGUI.getErrorLabel().setText("Ingrese un número válido.");
        } catch (OperacionInvalidaException e) {
            this.cajeroGUI.getErrorLabel().setText(e.getMessage());
        } catch (Exception e) {
            this.cajeroGUI.getErrorLabel().setText("Error inesperado: " + e.getMessage());
        }
    }
    /**
     * Clase interna que maneja eventos de los botones
     */
    private class ButtonClickListener implements ActionListener {
        /**
         * Maneja eventos de clic en los botones
         * 
         * @param e Evento de acción generado por un botón
         */
        @Override    //está sobrescribiendo un método de la interfaz ActionListener.
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            if (source == loginBancario.getIniciarSesionButton()) {
                handleLogin();
            } else if (source == cajeroGUI.getRetirarButton()) {
                handleRetiro();
            } else if (source == cajeroGUI.getDepositarButton()) {
                handleDeposito();
            }
        }
    }
}

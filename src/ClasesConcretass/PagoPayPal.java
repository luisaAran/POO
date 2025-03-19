package ClasesConcretass;

import Pagoss.AutenticacionExtra;
import Pagoss.Pago;

/**
 * Clase que representa un pago realizado con PayPal
 * Implementa la interfaz AutenticacionExtra para requerir autenticación adicional
 * 
 * @author Luisa Arango 
 * @version 1.0
 */
public class PagoPayPal extends Pago implements AutenticacionExtra {
    /**
     * Correo electrónico asociado a la cuenta de PayPal
     */
    private String email;
    /**
     * Contraseña de la cuenta de PayPal
     */
    private String password;

    /**
     * Constructor para la clase PagoPayPal
     * @param monto Monto del pago
     * @param email Correo electrónico de la cuenta de PayPal
     * @param password Contraseña de la cuenta de PayPal
     * @throws Exception Si el monto no es válido o la contraseña está vacía
     */
    public PagoPayPal(double monto, String email, String password) throws Exception {
        super(monto);
        this.email = email;
        this.password = password;
    }

    /**
     * Realiza la autenticación para el pago con PayPal
     * @throws Exception Si la contraseña está vacía
     */
    @Override
    public void autenticar() throws Exception {
        if (password == null || password.isEmpty()) {
            throw new Exception("Autenticación PayPal fallida: contraseña vacía");
        }
        System.out.println("Autenticación PayPal exitosa para " + email);
    }

    /**
     * Realiza el pago con PayPal después de la autenticación
     * @return Mensaje indicando el resultado del pago
     */
    @Override
    public String realizarPago() {
        try {
            autenticar();
            return "Pago de $" + monto + " realizado con PayPal";
        } catch (Exception e) {
            return "Error en autenticación PayPal: " + e.getMessage();
        }
    }
}
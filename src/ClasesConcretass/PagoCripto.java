package ClasesConcretass;

import Pagoss.AutenticacionExtra;
import Pagoss.Pago;

/**
 * Clase que representa un pago realizado con criptomonedas
 * Implementa la interfaz AutenticacionExtra para requerir autenticación adicional
 * 
 * @author Luisa Arango
 * @version 1.0
 */
public class PagoCripto extends Pago implements AutenticacionExtra {
    /**
     * Dirección de la billetera de criptomonedas que tenga el usuario 
     */
    private String direccionWallet;

    /**
     * Constructor para la clase PagoCripto
     * @param monto Monto del pago
     * @param direccionWallet Dirección de la billetera de criptomonedas
     * @throws Exception Si el monto no es válido o la dirección de la billetera está vacía
     */
    public PagoCripto(double monto, String direccionWallet) throws Exception {
        super(monto);
        this.direccionWallet = direccionWallet;
    }

    /**
     * Realiza la autenticación para el pago con criptomonedas
     * @throws Exception Si la dirección de la billetera está vacía
     */
    @Override
    public void autenticar() throws Exception {
        if (direccionWallet == null || direccionWallet.isEmpty()) {
            throw new Exception("Autenticación Cripto fallida: dirección vacía");
        }
        System.out.println("Autenticación Cripto exitosa para " + direccionWallet);
    }

    /**
     * Realiza el pago con criptomonedas después de la autenticación
     * @return Mensaje indicando el resultado del pago
     */
    @Override
    public String realizarPago() {
        try {
            autenticar();
            return "Pago de $" + monto + " realizado con Criptomonedas";
        } catch (Exception e) {
            return "Error en autenticación Cripto: " + e.getMessage();
        }
    }
}
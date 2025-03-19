package Pagoss;

import Excepciones.MontoInvalidoException;

/**
 * Clase abstracta que define la estructura base para los pagos
 * @author Luisa Arango
 * @version 1.0
 */
public abstract class Pago {

    protected double monto;

    /**
     * Constructor de la clase Pago
     * @param monto Monto del pago
     * @throws MontoInvalidoException Si el monto es inválido
     */
    public Pago(double monto) throws MontoInvalidoException {
        if (monto <= 0) {
            throw new MontoInvalidoException("El monto del pago debe ser mayor que cero");
        }
        this.monto = monto;
    }

    /**
     * Método abstracto para realizar el pago
     * @return String mensaje que describe el resultado del pago 
     * @throws Exception Si ocurre algún error durante el pago
     */
    public abstract String realizarPago() throws Exception;

    /**
     * Método para obtener el monto del pago
     * @return El monto del pago
     */
    public double getMonto() {
        return monto;
    }
}
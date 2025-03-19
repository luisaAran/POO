package ClasesConcretass;

import Pagoss.Pago;

/**
 * Clase que representa un pago realizado con tarjeta de crédito
 * Extiende la clase abstracta Pago
 * 
 * @author Luisa Arango 
 * @version 1.0
 */
public class PagoTarjeta extends Pago {
    /**
     * Número de la tarjeta de crédito
     */
    private String numeroTarjeta;
    /**
     * Fecha de vencimiento de la tarjeta de crédito
     */
    private String fechaVencimiento;
    /**
     * Código CVV de la tarjeta de crédito
     */
    private String cvv;

    /**
     * Constructor para la clase PagoTarjeta
     * @param monto Monto del pago
     * @param numeroTarjeta Número de la tarjeta de crédito
     * @param fechaVencimiento Fecha de vencimiento de la tarjeta de crédito
     * @param cvv Código CVV de la tarjeta de crédito
     * @throws Exception Si el monto no es válido
     */
    public PagoTarjeta(double monto, String numeroTarjeta, String fechaVencimiento, String cvv) throws Exception {
        super(monto);
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.cvv = cvv;
    }

    /**
     * Realiza el pago con tarjeta de crédito
     * @return Mensaje indicando el resultado del pago
     */
    @Override
    public String realizarPago() {
        return "Pago de $" + monto + " realizado con Tarjeta de Crédito";
    }
}
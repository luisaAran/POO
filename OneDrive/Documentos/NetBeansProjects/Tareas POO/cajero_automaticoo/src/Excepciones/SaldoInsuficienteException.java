package Excepciones;

/**
 * Excepción lanzada cuando se intenta retirar más dinero del saldo disponible.
 *
 * @version 1.0
 * @author Luisa Arango
 */
public class SaldoInsuficienteException extends Exception {

    /**
     * Constructor de la clase SaldoInsuficienteException.
     *
     * @param mensaje El mensaje de error asociado a la excepción.
     */
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}
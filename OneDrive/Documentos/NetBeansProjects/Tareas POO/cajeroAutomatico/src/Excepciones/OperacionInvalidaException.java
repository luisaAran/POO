package Excepciones;

/**
 * Excepción lanzada cuando se realiza una operación inválida,
 * como ingresar una cantidad negativa o cero.
 *
 * @version 1.0
 * @author Luisa Arango
 */
public class OperacionInvalidaException extends Exception {

    /**
     * Constructor de la clase OperacionInvalidaException.
     *
     * @param mensaje El mensaje de error asociado a la excepción.
     */
    public OperacionInvalidaException(String mensaje) {
        super(mensaje);
    }
}
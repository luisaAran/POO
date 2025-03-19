package Excepciones;

/**
 * Excepción lanzada cuando el monto ingresado para el pago es inválido
 * 
 * @author Luisa Arango 
 * @version 1.0
 */
public class MontoInvalidoException extends Exception {
    /**
     * Constructor para la excepción MontoInvalidoException
     * @param message Mensaje de error descriptivo
     */
    public MontoInvalidoException(String message) {
        super(message);
    }
}
package Excepciones;

/**
 * Excepción lanzada cuando los datos ingresados son inválidos
 * 
 * @author Luisa Arango 
 * @version 1.0
 */
public class DatosInvalidosException extends Exception {
    /**
     * Constructor para la excepción DatosInvalidosException
     * @param message Mensaje de error descriptivo
     */
    public DatosInvalidosException(String message) {
        super(message);
    }
}
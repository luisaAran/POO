package Excepciones;

/**
 * Excepción para errores de login.
 * 
 * @version 1.0
 * @author Luisa Arango 
 */
public class LoginException extends Exception {

    /**
     * Constructor de LoginException.
     *
     * @param mensaje Mensaje de error.
     */
    public LoginException(String mensaje) {
        super(mensaje);
    }
}
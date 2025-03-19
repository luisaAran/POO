package Pagoss;

/**
 * Interfaz para métodos de pago que requieren autenticación adicional
 * 
 * @author Luisa Arango 
 * @version 1.0
 */
public interface AutenticacionExtra {

    /**
     * Método para realizar la autenticación adicional
     *
     * @throws Exception Si ocurre algún error durante la autenticación
     */
    void autenticar() throws Exception;
}
package cajero_automatico;

/**
 * Clase que representa una cuenta bancaria
 * 
 * Esta clase permite gestionar la información de una cuenta bancaria, incluyendo
 * el usuario, la contraseña y el saldo disponible
 * 
 * @version 1.0
 * @author Luisa Arango
 */
public class CuentaBancaria {
    
    /** Nombre de usuario de la cuenta bancaria. */
    private String usuario;
    
    /** Contraseña de la cuenta bancaria. */
    private String contraseña;
    
    /** Saldo actual de la cuenta bancaria. */
    private double saldo;

    /**
     * Constructor para inicializar una cuenta bancaria con un usuario, contraseña y saldo
     * 
     * @param usuario Nombre de usuario de la cuenta.
     * @param contraseña Contraseña de la cuenta.
     * @param saldo Saldo inicial de la cuenta.
     */
    public CuentaBancaria(String usuario, String contraseña, double saldo) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.saldo = saldo;
    }

    /**
     * Obtiene el nombre de usuario de la cuenta bancaria
     * 
     * @return Nombre de usuario
     */
    public String getUser() {
        return usuario;
    }

    /**
     * Obtiene la contraseña de la cuenta bancaria
     * 
     * @return Contraseña de la cuenta
     */
    public String getPassword() {
        return contraseña;
    }

    /**
     * Obtiene el saldo actual de la cuenta bancaria
     * 
     * @return Saldo actual
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece un nuevo saldo para la cuenta bancaria
     * 
     * @param saldo Nuevo saldo a asignar
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

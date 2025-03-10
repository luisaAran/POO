package Controlador;


import cajero_automatico.CuentaBancaria;
import Excepciones.LoginException;
import Excepciones.OperacionInvalidaException;
import Excepciones.SaldoInsuficienteException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona las cuentas bancarias, permitiendo el inicio de sesión,
 * consulta de saldo, depósitos y retiros
 * 
 * @version 1.0
 * @author Luisa Arango
 */
public class GestorCuentas {

    private List<CuentaBancaria> cuentasBanco;
    private CuentaBancaria cuentaActiva;

    /**
     * Constructor que inicializa la lista de cuentas bancarias con cuentas de ejemplo
     */
    public GestorCuentas() {
        this.cuentasBanco = new ArrayList<>();
        cuentasBanco.add(new CuentaBancaria("luisa", "1234", 0.00));
        cuentasBanco.add(new CuentaBancaria("alvaro", "5678", 0.00));
    }

    /**
     * Método para iniciar sesión en una cuenta bancaria
     * 
     * @param user Nombre de usuario de la cuenta
     * @param password Contraseña de la cuenta
     * @return true si el inicio de sesión es exitoso, false en caso contrario
     * @throws LoginException si no hay cuentas registradas o los datos son incorrectos
     */
    public boolean loginCuenta(String user, String password) throws LoginException {
        if (cuentasBanco.isEmpty()) {
            throw new LoginException("NO HAY CUENTAS REGISTRADAS EN EL SISTEMA");
        }
        for (int i = 0; i < cuentasBanco.size(); i++) {
             CuentaBancaria cuenta = cuentasBanco.get(i);
             if (cuenta.getUser().equalsIgnoreCase(user) && cuenta.getPassword().equals(password)) {
                 cuentaActiva = cuenta;
                 return true;
              }
        }
        throw new LoginException("DATOS INCORRECTOS");
    }

    /**
     * Método para consultar el saldo de la cuenta activa.
     * 
     * @return Saldo actual de la cuenta activa. Retorna 0.0 si no hay cuenta activa.
     */
    public double consultarSaldo() {
        if (cuentaActiva != null) {
            return cuentaActiva.getSaldo();
        } else {
            return 0.0;
        }
    }

    /**
     * Método para depositar una cantidad en la cuenta activa
     * 
     * @param cantidad Monto a depositar
     * @throws OperacionInvalidaException si la cantidad es inválida o no hay cuenta activa
     */
    public void depositar(double cantidad) throws OperacionInvalidaException {
        if (cuentaActiva != null && cantidad > 0) {
            cuentaActiva.setSaldo(cuentaActiva.getSaldo() + cantidad);
        } else {
            throw new OperacionInvalidaException("Cantidad inválida.");
        }
    }

    /**
     * Método para retirar una cantidad de la cuenta activa
     * 
     * @param cantidad Monto a retirar
     * @throws SaldoInsuficienteException si el saldo es insuficiente
     * @throws OperacionInvalidaException si la cantidad es inválida o no hay cuenta activa
     */
    public void retirar(double cantidad) throws SaldoInsuficienteException, OperacionInvalidaException {
        if (cuentaActiva != null && cantidad > 0) {
            if (cuentaActiva.getSaldo() >= cantidad) {
                cuentaActiva.setSaldo(cuentaActiva.getSaldo() - cantidad);
            } else {
                throw new SaldoInsuficienteException("Saldo insuficiente.");
            }
        } else {
            throw new OperacionInvalidaException("Cantidad inválida.");
        }
    }
}

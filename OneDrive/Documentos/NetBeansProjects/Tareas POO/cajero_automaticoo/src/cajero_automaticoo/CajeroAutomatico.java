/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero_automaticoo;

/**
 * Clase que representa un cajero automático básico.
 * Permite realizar depósitos, retiros y consultar el saldo de una cuenta.
 *
 * @version 1.0
 * @author Luisa Arango
 */
public class CajeroAutomatico {

    private double saldo;

    /**
     * Constructor de la clase CajeroAutomatico.
     *
     * @param saldoInicial El saldo inicial de la cuenta.
     */
    public CajeroAutomatico(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    /**
     * Permite depositar dinero en la cuenta.
     *
     * @param cantidad La cantidad a depositar.
     * @throws Excepciones.OperacionInvalidaException Si la cantidad es negativa o cero.
     */
    public void depositar(double cantidad) throws Excepciones.OperacionInvalidaException {
        if (cantidad <= 0) {
            throw new Excepciones.OperacionInvalidaException("La cantidad a depositar debe ser mayor que cero.");
        }
        saldo += cantidad;
    }

    /**
     * Permite retirar dinero de la cuenta.
     *
     * @param cantidad La cantidad a retirar.
     * @throws Excepciones.SaldoInsuficienteException Si no hay saldo suficiente.
     * @throws Excepciones.OperacionInvalidaException Si la cantidad es negativa o cero.
     */
    public void retirar(double cantidad) throws Excepciones.SaldoInsuficienteException, Excepciones.OperacionInvalidaException {
        if (cantidad <= 0) {
            throw new Excepciones.OperacionInvalidaException("La cantidad a retirar debe ser mayor que cero.");
        }
        if (cantidad > saldo) {
            throw new Excepciones.SaldoInsuficienteException("Saldo insuficiente.");
        }
        saldo -= cantidad;
    }

    /**
     * Consulta el saldo actual de la cuenta.
     *
     * @return El saldo actual.
     */
    public double consultarSaldo() {
        return saldo;
    }
}
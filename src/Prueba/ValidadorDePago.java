package Prueba;

import Excepciones.DatosInvalidosException;

/**
 * Clase que proporciona métodos estáticos para validar los datos de pago
 * 
 * @author Luisa Arango
 * @version 1.0
 */
public class ValidadorDePago {

    /**
     * Valida el número de tarjeta
     * @param numeroTarjeta Número de tarjeta a validar
     * @return El número de tarjeta validado
     * @throws DatosInvalidosException Si el número de tarjeta es nulo, no tiene 9 dígitos o no son todos dígitos
     */
    public static String validarNumeroTarjeta(String numeroTarjeta) throws DatosInvalidosException {
        if (numeroTarjeta == null || numeroTarjeta.length() != 9 || !numeroTarjeta.chars().allMatch(Character::isDigit)) {
            throw new DatosInvalidosException("Número de tarjeta inválido. Debe contener exactamente 9 dígitos");
        }
        return numeroTarjeta;
    }

    /**
     * Valida la fecha de vencimiento
     * @param fechaVencimiento Fecha de vencimiento a validar
     * @return La fecha de vencimiento validada
     * @throws DatosInvalidosException Si la fecha de vencimiento es nula, no tiene 5 caracteres, no tiene el formato MM/YY o no son dígitos los caracteres correspondientes
     */
    public static String validarFechaVencimiento(String fechaVencimiento) throws DatosInvalidosException {
        if (fechaVencimiento == null || fechaVencimiento.length() != 5 || fechaVencimiento.charAt(2) != '/'
                || !Character.isDigit(fechaVencimiento.charAt(0)) || !Character.isDigit(fechaVencimiento.charAt(1))
                || !Character.isDigit(fechaVencimiento.charAt(3)) || !Character.isDigit(fechaVencimiento.charAt(4))) {
            throw new DatosInvalidosException("Fecha de vencimiento inválida. Debe estar en formato MM/YY");
        }
        return fechaVencimiento;
    }

    /**
     * Valida el código CVV
     * @param cvv Código CVV a validar
     * @return El código CVV validado
     * @throws DatosInvalidosException Si el código CVV es nulo, no tiene 4 dígitos o no son todos dígitos
     */
    public static String validarCvv(String cvv) throws DatosInvalidosException {
        if (cvv == null || cvv.length() != 4 || !cvv.chars().allMatch(Character::isDigit)) {
            throw new DatosInvalidosException("CVV inválido. Debe contener exactamente 4 dígitos");
        }
        return cvv;
    }

    /**
     * Valida el email
     * @param email Email a validar
     * @return El email validado
     * @throws DatosInvalidosException Si el email es nulo, no contiene "@" o no contiene "."
     */
    public static String validarEmail(String email) throws DatosInvalidosException {
        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new DatosInvalidosException("Email inválido");
        }
        return email;
    }

    /**
     * Valida la contraseña
     * @param password Contraseña a validar
     * @return La contraseña validada
     * @throws DatosInvalidosException Si la contraseña es nula o tiene menos de 8 caracteres
     */
    public static String validarPassword(String password) throws DatosInvalidosException {
        if (password == null || password.length() < 8) {
            throw new DatosInvalidosException("Contraseña inválida. Debe tener al menos 8 caracteres");
        }
        return password;
    }

    /**
     * Valida la dirección de criptomoneda
     * @param direccionCripto Dirección de criptomoneda a validar
     * @return La dirección de criptomoneda validada
     * @throws DatosInvalidosException Si la dirección de criptomoneda es nula o no es igual a "123"
     */
    public static String validarDireccionCripto(String direccionCripto) throws DatosInvalidosException {
        if (direccionCripto == null || !direccionCripto.equals("123")) {
            throw new DatosInvalidosException("Dirección de criptomoneda inválida");
        }
        return direccionCripto;
    }

    /**
     * Obtiene el número de tarjeta predeterminado
     * @return El número de tarjeta predeterminado
     */
    public static String getNumeroTarjetaPredeterminado() {
        return "123456789";
    }

    /**
     * Obtiene la fecha de vencimiento predeterminada
     * @return La fecha de vencimiento predeterminada
     */
    public static String getFechaVencimientoPredeterminada() {
        return "12/25";
    }

    /**
     * Obtiene el código CVV predeterminado
     * @return El código CVV predeterminado
     */
    public static String getCvvPredeterminado() {
        return "1202";
    }

    /**
     * Obtiene el email predeterminado
     * @return El email predeterminado
     */
    public static String getEmailPredeterminado() {
        return "luisa@gmail.com";
    }

    /**
     * Obtiene la contraseña predeterminada
     * @return La contraseña predeterminada
     */
    public static String getPasswordPredeterminado() {
        return "arroz123";
    }

    /**
     * Obtiene la dirección de criptomoneda predeterminada
     * @return La dirección de criptomoneda predeterminada
     */
    public static String getDireccionCriptoPredeterminada() {
        return "123";
    }
}
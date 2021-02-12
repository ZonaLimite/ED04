/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

/**
 *  Tarea para ED04 Clase CCuenta
 *  Una Clase interface para el control de saldo, con metodos accesibles
 *  para ingresar , recuperar y consultar el saldo disponible.
 * @author F.J. BOGA
 * @version 1.0
 * @since  1.5
 */
public class CCuenta {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor por defecto
     */
    public CCuenta()
    {
    }
    /**
     * Constructor con parametros personalizable
     * @param nom El nombre del usuario
     * @param cue El numero de cuenta
     * @param sal El saldo disponible
     * @param tipo Una defincion de tipo posible
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Un metodo para consultar rapidamente el saldo del usuario
     * @return el saldo disponible. Su valor double garantiza cantidades elevadas
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Un metodo que nos permite hacer un ingreso en nuestra cuenta.
     * @param cantidad La cantidad a reponer.
     * @throws Exception Si la cantidad introducida es menor que 0
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Un metodo que nos permite retirar efectivo dle saldo disponible. 
     * @param cantidad La cantidad a retirar.
     * @throws Exception Si la cantidad expresada es menor que 0 o no hay saldo.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}


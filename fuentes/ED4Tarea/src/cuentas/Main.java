/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

/**
 * Tarea para ED04 Clase Main
 * La clase Main permite probar la Clase CCuenta y se efectua la utilizacion
 * de varios de sus metodos.
 * @author F.J. BOGA
 * @see cuentas.CCuenta La referencia a la clase CCuenta
 */
public class Main {
    /**
     * El metodo principal para una instanciacion estatica. LLama al metodo estatico
     * <code>operativa_cuenta</code>.
     * @param args No se utilizan argumentos
     */
    public static void main(String[] args) {
        operativa_cuenta(null);
    }
    /**
     * El metodo <code> operativa_cuenta</code> instancia la clase CCuenta y
     * realiza algunas operaciones obre ella.
     * @param cantidad Un valor necesario, representando un valor posible de saldo.
     *     Al ser <code>Float</code> permite la introduccion con decimales.
     */
    private static void operativa_cuenta(java.lang.Float cantidad) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}


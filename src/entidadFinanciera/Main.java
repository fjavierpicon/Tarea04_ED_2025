/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * @since 2.0
 */

package entidadFinanciera;


public class Main {

    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;
        

        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        probarRetirada(objetoCuenta, objetoCuenta);
        
        probarIngresar(objetoCuenta, objetoCuenta);
        
    }

    public static void probarIngresar(CCuenta objetoCuenta, CCuenta cantidadEsperada) {
        try {
            cantidadEsperada.ingresar(1200);
        } catch (Exception e) {
            System.out.println("No se pudo realizar el ingreso en cuenta");
        }
    }

    public static void probarRetirada(CCuenta objetoCuenta, CCuenta cantidadEsperada) {
        try {
            cantidadEsperada.retirar(2400);
        } catch (Exception e) {
            System.out.println("Error al retirar la cantidad indicada");
        }
    }
}

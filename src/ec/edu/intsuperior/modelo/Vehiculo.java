/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author DANIELA JURADO
 */
public class Vehiculo {
    
    public static void metodoSalida(){
        System.out.println("Llantas");
    }
    
    public static String metodoRetorno(){
        String e="Espejos";
        return e;
    }    
    
    public void salida(){
        System.out.println("Vidrios");
    }
    
    public boolean retorno(){
        return 20==10;
    }
    
}

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
public class ClaseA {
    
        //atributos
    
        //metodos
        //metodos de clase de salida
     
    public static void metodoSalidaA(){  //public private protected default
        System.out.println("Hola chicos animense no sufran dos veces si la pueden hacer una sola en el supletorio");
    }
        //metodos de clase de retorno
        public static String metodoRetornoA(){
            String x="Pilas no se Duerman";
            return x;
        }
        //metodos de instancia (objeto) de salida
        public void salida(){
            System.out.println("Hola Chicos");
        }
        //metodos de instancia (objeto) de retorno
        public boolean retorno(){
            return 6==7;  //False = ==
        }
}

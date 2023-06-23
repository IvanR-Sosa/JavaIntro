/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej08;

import java.util.Scanner;

/**
 *
 * @author ramis
 */
public class JavaIntroEj08 {

    /**
     * @param args the command line arguments
     */
    
  
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner (System.in);
        System.out.println("Ingrese una nota entre 0 y 10");
        int nota=leer.nextInt();
        while (nota>=0 && nota<=10){
        System.out.println("tu nota esta en el rango correcto!!");
        break;
        }
    }
}
   
    


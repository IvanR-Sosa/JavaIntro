/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej06;

import java.util.Scanner;

/**
 *
 * @author ramis
 */
public class JavaIntroEj06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        int num1=leer.nextInt();
        System.out.println("ingrese el segundo numero");
        int num2=leer.nextInt();
        
        if (num1>25 || num2>25) {
           
            System.out.println("uno de sus numeros es mayor que 25");
           
            // TODO code application logic here
        } else 
            System.out.println("los numeros ingresados no son mayores a 25");
            
            
        }
    
}

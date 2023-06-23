
package javaej05;

import java.util.Scanner;


public class JavaEj05 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println("ingrese un numero" );
        
         numero=leer.nextInt();
         System.out.println("el doble de " + numero + " es: " + (numero*2) + "\n"
         + "el triple de " + numero + " es: " + (numero*3) + "\n"
         + "la raiz de " + numero + " es: " + (Math.sqrt(numero)) );
         
        
    }
    
}

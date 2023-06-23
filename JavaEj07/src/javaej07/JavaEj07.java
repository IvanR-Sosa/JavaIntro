
package javaej07;

import java.util.Scanner;


public class JavaEj07 {

   
    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
      String palabra,clave;
      clave="eureka";
        System.out.println("adivine la palabra");
        palabra=leer.nextLine();
        System.out.println((clave.equals(palabra)));
        
            
        
    }
    
}

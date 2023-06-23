
package javaej03;

import java.util.Scanner;

public class JavaEj03 {

    
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       String frase,frase_may,frase_min ;
       
        System.out.println("ingrese una frase");
        frase=leer.nextLine();
        
        frase_may=frase.toUpperCase();
        frase_min=frase.toLowerCase();
        System.out.println("su frase en mayuscula queda: " + frase_may );
        System.out.println("su frase en minuscula queda: " + frase_min );
       
       
    }
}    

  
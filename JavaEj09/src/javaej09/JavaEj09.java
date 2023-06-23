
package javaej09;

import java.util.Scanner;


public class JavaEj09 {

  
    public static void main(String[] args) {
      Scanner leer= new Scanner(System.in);
      String palabra,subcadena;
        System.out.println("ingrese una palabra");
        palabra=leer.nextLine();
        subcadena=palabra.substring(0,0+1);
        if (subcadena.equals("A")) {
            System.out.println("Correcto");
            
        }else{System.out.println("Incorrecto");}
    }
    
}

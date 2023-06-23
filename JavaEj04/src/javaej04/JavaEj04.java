
package javaej04;

import java.util.Scanner;


public class JavaEj04 {

    
    public static void main(String[] args) {
    Scanner leer= new Scanner(System.in);
    float C,F;
        System.out.println("ingrese la temperatura en grados centigrados");
        C=leer.nextFloat();
        System.out.print(C + "°C" + "\n");
       
      F= 32+(9*C/5);
        System.out.println("la temperatura en grados fahrenheit es: " + "\n"
        + F + "F");
        
                
    }
    
}

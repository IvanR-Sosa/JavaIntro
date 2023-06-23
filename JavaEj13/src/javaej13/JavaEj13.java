
package javaej13;

import java.util.Scanner;


public class JavaEj13 {

    
    public static void main(String[] args) {
     Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el tamaño del cuadrado");
        int tam=0;
        tam=leer.nextInt();
        
        for (int i = 0; i < tam; i++) {
           
            for (int j = 0; j < tam; j++) {
                if (i==0 || j==0 || i==(tam-1) || j==(tam-1)) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
           System.out.println("");  
        }
    }
    
}

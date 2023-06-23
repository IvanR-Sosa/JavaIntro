
package javaej08;

import java.util.Scanner;


public class JavaEj08 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String frase;
        System.out.println("ingrese una frase o palabra");
        frase=leer.nextLine();
        
        if (frase.length()==8) {
            System.out.println("CORRECTO tu frase o palabra es de 8 caracteres");
            
        }else{System.out.println("INCORRECTO tu frase no tiene 8 caracteres");}
    }
    
}

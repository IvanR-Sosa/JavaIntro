
package javaej06;

import java.util.Scanner;


public class JavaEj06 {

    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       int numero;
        System.out.println("ingrese un numero");
        numero=leer.nextInt();
        
        if (numero%2==0){
            System.out.println("el numero ingresado es par");
        }else{System.out.println("el numero ingresado es impar");}
    }
    
}


package javaej10;


import java.util.Scanner;


public class JavaEj10 {

    
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       int limite,numero,suma = 0;
        System.out.println("ingrese el valor limite");
        limite=leer.nextInt();
        
        do {
            System.out.println("ingrese numero");
            numero=leer.nextInt();
            suma= suma+numero;
            
             System.out.println("la suma es: " + suma );       
        }while(suma<limite);
        
    }
    
}

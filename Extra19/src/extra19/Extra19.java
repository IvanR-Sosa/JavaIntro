
package extra19;

import java.util.Arrays;
import java.util.Scanner;


public class Extra19 {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int numero=0;
        int tama;
        
        System.out.println("ingrese el tamaño de los vectores");
        tama=leer.nextInt();
        int vector1[]=new int[tama];
        int vector2[]=new int[tama];
        System.out.println("rellena el vector 1");
        for (int i = 0; i < vector1.length; i++) {
            System.out.println("ingrese valores");
            numero=leer.nextInt();
            vector1[i]=numero;
           
        }
        System.out.println("rellena el vector 2");
         for (int i = 0; i < vector2.length; i++) {
                System.out.println("ingrese valores");
                numero=leer.nextInt();
                vector2[i]=numero;
            }
        for (int i = 0; i < vector1.length; i++) {
            System.out.print("["+vector1[i] +"]");
        }
        System.out.println("vector1");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print("["+vector2[i] +"]");
        }
        System.out.println("vector2");
        boolean igual= Arrays.equals(vector2, vector1);
        if (igual) {
            System.out.println("el vector 1 y 2 son iguales");
        }else{
            System.out.println("el vector 1 y 2 no son iguales");
        }
    }
    
}

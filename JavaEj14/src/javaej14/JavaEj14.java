
package javaej14;

import java.util.Scanner;


public class JavaEj14 {

   
    public static void main(String[] args) {
    Scanner leer= new Scanner(System.in);
    float euro=0;
        System.out.println("ingrese la cantidad de euros deseada:");
        euro=leer.nextFloat();
        conversion(euro);
    }
    public static void conversion(float _euro){
        /*
        El cambio de divisas es:
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 €
        */
        float libra=0,dolar=0,yen=0;
         Scanner leer= new Scanner(System.in);
        int opcion;
         System.out.println("a que moneda desea convertir sus euros");
            System.out.println("----MONEDA----" + "\n"
            + "---1:LIBRAS---" + "\n"
            + "---2:DOLARES---" + "\n"
            + "---3:YEN" + "\n");
            opcion=leer.nextInt();
            
            switch (opcion){
                case 1: //libras
                    System.out.println("el valor de sus euros es: " + (_euro*0.86) + "libra");
                    break;
                case 2://dolar
                     System.out.println("el valor de sus euros es: " + (_euro*1.28611) + "dolar");
                     break;
                case 3://yen
                     System.out.println("el valor de sus euros es: " + (_euro*129.852) + "yen");
                     break;
            } 
        System.out.println("GRACIAS POR USAR NUESTRO SISTEMA");
    }
        
}


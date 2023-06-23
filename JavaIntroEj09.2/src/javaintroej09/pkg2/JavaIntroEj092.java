
package javaintroej09.pkg2;

import java.util.Scanner;


public class JavaIntroEj092 {

   
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int conta=0,numero=0,suma=0;
        
        do{
            
        conta++;
            System.out.println("ingrese numero");
            numero=leer.nextInt();
            if (numero>0){
            suma=suma+numero;
            }else
                System.out.println("no voy a sumar negativos");
                
        }while (conta<20 && numero!=0);
        System.out.println("la suma alcanzada es : " + suma);
        // TO3
       
    }
    
}

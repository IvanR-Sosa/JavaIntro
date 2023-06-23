
package javaej12;

import java.util.Scanner;


public class JavaEj12 {

   
    public static void main(String[] args) {
      Scanner leer= new Scanner(System.in);
        System.out.println("validacion de funcionamiento del RS232");
        String intento;
        int valido=0,error=0;
        do{
            System.out.println("ingrese intento");
            intento=leer.nextLine().toUpperCase();
            if (intento.substring(0,1).equals("X") && intento.substring(intento.length()-1,intento.length()).equals("O")) {
                valido+=1;
            }else {
                error+=1;
               
            }
           
        }while(intento.length()==5 && !intento.equals("&&&&&"));
               
        System.out.println("validos: " + valido);
        System.out.println("errores: " + (error-1));
    }
    
}

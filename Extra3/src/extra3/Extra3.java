
package extra3;

import java.util.Scanner;

public class Extra3 {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
         String letra = null;
        do{
             System.out.println("ingrese una letra");
       
        letra=leer.nextLine();
              
                
        
        
        }while (letra.length() !=1) ;
        if (letra.equalsIgnoreCase("a") ||(letra.equalsIgnoreCase("e"))||letra.equalsIgnoreCase("i")|| letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")) {
            System.out.println("acabas de ingresar una vocal y es: "+letra);
        }else{
            System.out.println("lo que ingresaste no es una vocal");
        }
        
    }
    
}

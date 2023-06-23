
package javaintroej07;

import java.util.Scanner;

/**
 *
 * @author ramis
 */
public class JavaIntroEj07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la referencia del motor");
         int motor=leer.nextInt();
         
       
             switch (motor) {
                 case 1:
                     System.out.println("La bomba es una bomba de agua");
                    break;
                 case 2:
                     System.out.println("La bomba es una bomba de gasolina");
                     break;
                 case 3:
                     System.out.println("La bomba es una bomba de hormigón");
                     break;
                 case 4:
                     System.out.println("La bomba es una bomba de pasta alimenticia");
                     break;
                 default: 
                         System.out.println("No existe un valor válido para tipo de bomba");
             
             
         }
             
        // TODO code application logic here
    }
    
}

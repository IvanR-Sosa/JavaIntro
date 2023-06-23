
package extra13;

import java.util.Scanner;


public class Extra13 {

   
    public static void main(String[] args) {
        int numero;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el tamaño de la escalera");
        numero=leer.nextInt();
        System.out.println("");
        for (int i = 1; i <=numero; i++) {
            for (int j = 1; j <= i; j++) {//aqui se iguala el recorrido de j con i
                System.out.print(j+"");   //para que cuando imprima imprima el recorrido 
            }
            System.out.println("");  
        }
    
    }
    
}

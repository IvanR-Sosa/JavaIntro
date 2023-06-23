
package extra11;

import java.util.Scanner;


public class Extra11 {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int numero,contador=0,resultado = 0;
        System.out.print("ingresa un numero: ");
        numero=leer.nextInt();
        resultado=numero;
        do {
            resultado=resultado/10;
            contador++;
        } while (resultado!=0);
        System.out.println("tu numero es de "+contador+" digitos"); 
        
    }
    
}

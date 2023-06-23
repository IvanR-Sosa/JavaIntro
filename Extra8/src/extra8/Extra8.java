
package extra8;

import java.util.Scanner;

/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
y la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
*/
public class Extra8 {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int numero = 0,contador = 0,pares = 0,impares = 0;
        
        do {
            System.out.print("ingrese numero: ");
            numero=leer.nextInt();
            contador++;
            if (numero%2==0) {//aqui es donde vamos a evaluar si el numero es par o impar
                pares++;
            }
            if (numero%2!=0) {//con este evaluamos que el numero es impar
                impares++;
            }
        } while (numero>0 && numero%5!=0  );//aqui vamos a evaluar que termine cuando el numero sea - o multiplo de 5
        System.out.println("la cantidad de numeros ingresada fue: "+contador);
        System.out.println("la cantidad de pares ingresada fue: "+pares);
        System.out.println("la cantidad de impares ingresada fue: "+impares);
        
      
    }
    
}

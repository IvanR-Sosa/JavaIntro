package extra17;

import java.util.Scanner;

public class Extra17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;

        System.out.print("ingrese un numero: ");
        numero = leer.nextInt();
        System.out.println("tu numero es primo? ");
        System.out.println(esPrimo(numero));
    }

    public static boolean esPrimo(int n) {
       /* // El 0, 1 y 4 no son primos
        if (n == 0 || n == 1 || n == 4) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            // Si es divisible por alguno de estos números, no es primo
            if (n % i == 0) {
                return false;
            }
        }
        // Si no se pudo dividir por ninguno de los anteriores, sí es primo
        return true;*/
       boolean primo=true;
        if (n<=2) {
            primo=false;
        }else{
            for (int i = 2; i <n; i++) {
                if (n%i==0) {
                    primo=false;
                    break;
                }
            }
        }
        return primo;
    }
}

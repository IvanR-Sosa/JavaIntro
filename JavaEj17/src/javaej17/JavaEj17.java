package javaej17;

import java.util.Scanner;

public class JavaEj17 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        /*n va a ser el tamaño del vector
        d1=un digito,d2=dos digitos
        d3=tres digitos;d4=cuatro digitos,d5=cinco dogitos
         */
        int n, d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0;

        System.out.println("ingrese el tamaño del vector");
        n = leer.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 99999);
            System.out.println("[" + vector[i] + "]");
            if (vector[i] >= 0 && vector[i] < 10) {
                d1 += 1;
            } else if (vector[i] >= 10 && vector[i] < 100) {
                d2 += 1;
            } else if (vector[i] >= 100 && vector[i] < 1000) {
                d3 += 1;

            } else if (vector[i] >= 1000 && vector[i] < 10000) {
                d4 += 1;
            } else if (vector[i] >= 10000 && vector[i] < 1000000) {
                d5 += 1;
            }

        }

        System.out.println("los numeros de 1 digito son: " + d1);
        System.out.println("los numeros de 2 digitos son: " + d2);
        System.out.println("los numeros de 3 digitos son: " + d3);
        System.out.println("los numeros de 4 digitos son: " + d4);
        System.out.println("los numeros de 5 digitos son: " + d5);
    }
}

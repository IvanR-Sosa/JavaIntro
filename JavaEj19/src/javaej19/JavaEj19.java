
package javaej19;

import java.util.Scanner;


public class JavaEj19 {

   
    public static void main(String[] args) {
      
       int [][] matriz=new int[3][3];
       crear(matriz);
       verificar(matriz);
       mostrar(matriz);
       
            }
    //cargar los valores en la matriz
    public static void crear(int[][] matriz) {
         Scanner leer=new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <matriz.length; j++) {
                System.out.println("ingrese el valor en la posicion ["+i+"]["+j+"]");
                matriz[i][j]=leer.nextInt();
            }
        }
    }
 // verificar
    public static void verificar(int[][] matriz) {
        //este boolean lo uso para almacenar o para verificar si es o no antisimettrica
        boolean ver=false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j]== -(matriz[i][j])) {
                    ver=true;
                }
            }
        }
        if (ver==true) {
            System.out.println("la matriz es antisimetrica");
        }else {
            System.out.println("la matriz no es antisimetrica");
        }
    }
    //  mostrar las matrices
    public static void mostrar(int[][]matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("["+matriz[i][j]+"]");
               
            }
            System.out.println("");
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("["+matriz[j][i]+"]");
               
            }
            System.out.println("");
        }
    }
}

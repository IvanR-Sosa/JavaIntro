
package javaej20;

import java.util.Scanner;


public class JavaEj20 {

   
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int[][]magico= new int[3][3];
       rellenar(magico);
       verificar(magico);
    }
    //rellena y muestra el cuadrado magico
    public static void rellenar(int[][]magico) {
        Scanner leer=new Scanner(System.in);
       
        for (int i = 0; i < magico.length; i++) {
            for (int j = 0; j < magico.length; j++) {
                System.out.print("ingrese los valore en las posiciones["+i+"]["+j+"]:");
                magico[i][j]=leer.nextInt();
            }
            System.out.println("");
        }
        for (int i = 0; i < magico.length; i++) {
            for (int j = 0; j < magico.length; j++) {
                System.out.print("["+magico[i][j]+"]");
            }
            System.out.println("");
        }
    }
    //verificacion de las sumas del cuadro magico
    public static void verificar(int[][]magico) {
        /*
        sf1:sumafila1,sf2:sumafila2,sf3=sumafila3
        sc1:sumacolumna1,sc2:sumacolumna2,sc3:sumacolumna3
        */
        int sf1=0,sf2=0,sf3=0;
        int sc1 = 0,sc2 = 0,sc3 = 0,dia = 0;
        
         for (int i = 0; i < magico.length; i++) {
            for (int j = 0; j < magico.length; j++) {
                
            }
        }
         for (int j = 0; j < magico.length; j++) {
         sf1 = sf1 + magico[0][j];
         sf2 = sf2 + magico[1][j];
         sf3 = sf3 + magico[2][j];
        }
         System.out.println("suma fila 1: "+ sf1);
         System.out.println("suma fila 2: "+ sf2);
         System.out.println("suma fila 3: "+ sf3);
         for (int i = 0; i < magico.length; i++) {
         sc1 = sc1 + magico[i][0];
         sc2 = sc2 + magico[i][1];
         sc3 = sc3 + magico[i][2];
        }
         System.out.println("suma columna 1: "+ sc1);
         System.out.println("suma columna 2: "+ sc2);
         System.out.println("suma columna 3: "+ sc3);
         for (int k = 0; k < magico.length; k++) {
             dia= dia +magico[k][k];
        }
         System.out.println("suma diagonal: "+dia);
         
         if (sf1==sf2 && sf2==sf3 && sf3==sc1 && sc1==sc2 && sc2==sc3 && sc3==dia) {
             System.out.println("tienes un cuadro magico");
        }else{
             System.out.println("ups tu cuadro no es magigo"); 
        }
    }
       
}

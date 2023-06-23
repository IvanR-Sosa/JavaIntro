
package javaej21;

import java.util.Scanner;


public class JavaEj21 {

  
    public static void main(String[] args) {
        //int[][]grande=new int[10][10];
        int [][] grande={{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},
            {1,2,3,4,5,6,7,8,9,10},{0,1,2,3,4,36,5,67,8,8},{0,1,2,3,4,89,90,75,2,2},
            {0,1,2,3,4,14,22,26,3,3},{1,2,3,4,5,6,7,8,9,0},{1,2,3,4,5,6,7,8,9,0},{1,2,3,4,5,6,7,8,9,9}};
        int[][]peque={{36, 5, 67}, {89, 90, 75},{14, 22, 26}};
        
        rellenar(grande,peque);
        verificar(grande,peque);
    }
    // rellenar
    public static void rellenar(int[][]grande,int[][]peque) {
        Scanner leer=new Scanner(System.in);
        
        
        for (int i = 0; i < grande.length; i++) {
            for (int j = 0; j < grande.length; j++) {
               //grande[i][j]=(int)(Math.random()*10);
             // grande[i][j]=leer.nextInt();
             
                System.out.print("[ "+ grande[i][j] + " ]");
            }
            System.out.println("");
        }
        System.out.println("------------------------");
        for (int i = 0; i < peque.length; i++) {
            for (int j = 0; j < peque.length; j++) {
                
                System.out.print("[ "+peque[i][j]+" ]");
            }
            System.out.println("");
        }
    }
    //verificar
    public static void verificar(int[][]grande,int[][]peque) {
        for (int i = 0; i < grande.length - peque.length + 1; i++) {
        for (int j = 0; j < grande[0].length - peque[0].length + 1; j++) {
            boolean match = true;
            for (int k = 0; k < peque.length; k++) {
                for (int l = 0; l < peque[0].length; l++) {
                    if (peque[k][l] != grande[i + k][j + l]) {
                        match = false;
                        break;
                    }
                }
                if (!match) {
                    break;
                }
            }
            if (match) {
                //System.out.println("La submatriz se encuentra en la posición (" + i + ", " + j + ")");
                for (int k = 0; k < peque.length; k++) {
                    for (int l = 0; l < peque[k].length; l++) {
                        System.out.println(i + k + "--" + (j+l));
                        
                    }
                }
            }
        }
    }
    }
}




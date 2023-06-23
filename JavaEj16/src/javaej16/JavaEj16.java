
package javaej16;


import java.util.Scanner;

public class JavaEj16 {

    
    public static void main(String[] args) {
        int tamano=0, numero=0,conta=0,posicion=0,posicion2=0;
        
        System.out.println("ingrese el tamaño de la matriz");
        Scanner leer=new Scanner(System.in);
        tamano=leer.nextInt();
        
       System.out.println("ingrese un numero a buscar");
        numero=leer.nextInt(); 
        
   int[][] matriz=new int[tamano][tamano];
   
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
               matriz[i][j]= (int) (Math.random()*20);
                System.out.print(matriz[i][j] + " ");
                if (numero==matriz[i][j]) {
                    posicion=(i);
                    posicion2=(j);
                    conta +=1;
                }
            }
            System.out.println("");
   
        }
        System.out.println("el numero se encontro en la posicion: " + posicion + "," + posicion2);
        System.out.println("el numero se encontro " + conta + " veces");
       
        }
            
        
    }
    
  


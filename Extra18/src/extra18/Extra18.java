
package extra18;

import java.util.Scanner;


public class Extra18 {

    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        int tama,numero=0;
        int suma=0;//en esta varuable se almacena la suma de las casillas del vector
        System.out.println("ingrese el tamaño del vector");
        tama=leer.nextInt();
        int vector[]=new int[tama];
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print("ingrese valor");
            numero=leer.nextInt();
            vector[i]=numero;
            suma=suma+vector[i];
        }
        System.out.println("esta es la suma de los valores del vector");
        System.out.println(suma);
    }
    
}

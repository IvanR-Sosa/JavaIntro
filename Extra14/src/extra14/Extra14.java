package extra14;

import java.util.Scanner;

public class Extra14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int familias, hijos = 0, edad;
        int suma = 0;//en esta variable se suman las edades de cada hijo de la familia
        int media = 0;
        String opcion;
        System.out.println("cuantas familias desea evaluar");
        familias = leer.nextInt();

        if (familias > 0) {//aqui validamos que el numero de familias sea mayor a 0
            for (int i = 0; i < familias; i++) {//aqui iniciamos el recorrido por cada familia
                System.out.print("cuantos hijos tiene la familia "+(i+1)+": ");
                hijos = leer.nextInt();
                if (hijos > 0) {//aui se valida que el numero de hijos sea mayor a 0 para poder dar con la media
                    for (int j = 0; j < hijos; j++) {
                        System.out.print("ingrese la edad del hijo " + (j + 1) + " : ");
                        edad = leer.nextInt();
                        suma = suma + edad;

                    }
                    media=suma/hijos;
                    System.out.println("la familia "+(i+1)+" tiene"+ "\n" + hijos + " hijos");
                    System.out.println("y la media de las edades es: "+media +" años");
                }
            }
        }
        
    }

}

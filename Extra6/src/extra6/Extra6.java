package extra6;

import java.util.Scanner;

public class Extra6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cantidad;
        double altura;
        double suma = 0; // Suma de las alturas
        double sumaBajas = 0; // Suma de las alturas menores a 1.60
        int contadorBajas = 0; // Contador de las personas menores a 1.60
        double promedio; // Promedio de las alturas en general
        double promedioBajas; // Promedio de las alturas menores a 1.60
        System.out.println("ingrese la cantidad de personas");
        cantidad = leer.nextInt();
        if (cantidad > 0) {
            for (int i = 0; i < cantidad; i++) { //se crea un bucle for para pedir las alturas
                System.out.println("ingrese la altura");
                altura = leer.nextDouble();
                //validamos que el numero sea positivo
                if (altura > 0) {
                    //se empieza a acumular las alturas para dar con el promedio
                    suma = suma + altura;

                    //se empieza a buscar las alturas menore a 1.60 y se empiezan a sumar
                    if (altura < 1.60) {
                        sumaBajas = sumaBajas + altura;

                        contadorBajas = contadorBajas + 1;//con este contador de vamos sacando la cantidad
                    }
                } else {//se vuelve a rectificar que la altura sea positiva
                    System.out.println("la altura debe ser positiva");
                }
            }
        }
        promedio=suma/cantidad;//este va a arrojar el promedio general
        System.out.println("el promedio general de alturas es: " + promedio);
        
        if (contadorBajas>0) {
            promedioBajas=sumaBajas/contadorBajas;//con este lo que hacemo es hallar el promedio de las alturas menores a 1.60
            System.out.println("el promedio de personas de altura menor a 1.60 es: "+promedioBajas);
            
        }else{
            System.out.println("no hay personas mas bajas de 1.60");
        }
    }

}

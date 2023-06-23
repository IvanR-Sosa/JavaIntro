package extra15;


import java.util.Scanner;

public class Extra15 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num1, num2;
        int opc;
        System.out.print("ingrese el primer numero: ");
        num1 = leer.nextInt();
        System.out.print("ingrese el segundo numero: ");
        num2 = leer.nextInt();
        do {
             System.out.println("que operacion desea realizar");
        System.out.println("--suma=1--");
        System.out.println("--resta=2--");
        System.out.println("--multiplicacion=3--");
        System.out.println("--dividir=4--");
        System.out.println("--salir--");
        opc = leer.nextInt();

        switch(opc){
            case 1:
                System.out.println(suma(num1,num2));
                break;
            case 2:
                System.out.println(resta(num1,num2));
                break;
            case 3:
                System.out.println(multiplo(num1,num2));
                break;
            case 4:
                System.out.println( division(num1,num2));
                break;
        }
        } while (opc!=5);
        
    }

    //funcion que suma los numeros
    public static int suma(int num1, int num2) {
        int sumar;
        sumar = (num1 + num2);

        return sumar;
    }

    //funcion que resta los numeros
    public static int resta(int num1, int num2) {
        int restar;
        restar = (num1 - num2);
        return restar;
    }

    //funcion para multiplicar
    public static int multiplo(int num1, int num2) {
        int multi;
        multi = (num1 * num2);
        return multi;
    }

    //funcion para dividir
    public static int division(int num1, int num2) {
        int dividir;
        dividir = (num1 / num2);
        return dividir;
    }
}

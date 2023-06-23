package extra16;

import java.util.Scanner;

public class Extra16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int personas;
        System.out.print("ingrese la cantidad de personas:");
        personas = leer.nextInt();
        relleno(personas);
    }

    //funcion para pedir nombres
    public static void relleno(int personas) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        int edad,conta=0;
        String opc = null;

        do {
             
            System.out.print("NOMBRE: ");
            nombre = leer.nextLine();
            System.out.print("EDAD: ");
            edad=leer.nextInt();
                 if (edad>=18) {
                     System.out.println("es mayor de edad");
                 }else if (edad>0 && edad<18) {
                     System.out.println("es menor de edad");
                 }else {
                     System.out.println("la edad no corresponde");
                 }
                 System.out.println("desea continuar?");
                 System.out.println("--si--no--");
                 leer.nextLine();
                 opc=leer.nextLine();
                 conta++;
                
                 
        
            
        } while (!opc.equalsIgnoreCase("no")&& conta<personas);
        

    }
}


package extra9;

import java.util.Scanner;


public class Extra9 {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int residuo = 0,cociente = 0;
        int divisor,dividendo;
       
        System.out.print("ingrese el dividendo: ");
        dividendo=leer.nextInt();
         System.out.print("ingrese el divisor: ");
        divisor=leer.nextInt();
        residuo=dividendo;//se iguala la variable residuo al divisor para calcularlo en el bucle
        if (divisor!=0) {
            do {
                residuo=residuo-divisor;//aqui se empieza a restar el residuo hasta que cumpla la condicion de while
                
                cociente++;//por cada vuelta que de antes de cumplir la condicion se va sumando de a 1
                
            } while (residuo>=divisor);/*
            se pone que mientras residuo siga siendo mayor que el divisor vuelva a restar 
            hasta que lo iguale o sea menor por este medio nos aseguramos que lo calcule bajo el resultado que vaya dando las restas
            */
           
           
        }else {
            System.out.println("no se puede dividir por cero");
        }
     
        
        System.out.println("el residuo es: "+residuo);
        System.out.println("el cociente es: "+cociente);
        
    }
    
}

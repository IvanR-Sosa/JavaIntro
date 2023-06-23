
package extra1;

import java.util.Scanner;


public class Extra1 {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int minutos = 0,dia =0,hora=0;
        System.out.println("ingrese la cantidad de minutos");
        minutos=leer.nextInt();
        
        
        dia=(minutos/1440);
        hora=(minutos/60)-(24*dia);
        System.out.println("son " + dia +" dias " + hora + " horas");
        }
       
    }
    


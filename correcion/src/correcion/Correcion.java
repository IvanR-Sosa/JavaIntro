package correcion;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Correcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner leer=new Scanner(System.in);
     int numero1,numero2;
        System.out.println("ingrese el primer numero");
        numero1=leer.nextInt();
        System.out.println("ingrese el segundo numero");
        numero2=leer.nextInt();
        int opc = 0;
       // boolean continuar=true;
         String opc2 = null;
         
       do{
            System.out.println("elija una opcion del menu");
            System.out.println("----MENU----" + "\n"
            + "---1:SUMAR---" + "\n"
            + "---2:RESTAR---" + "\n"
            + "---3:MULTIPLICAR" + "\n"
            + "---4:DIVIDIR---" + "\n"
            + "---5:SALIR---");
  
            opc=leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("la suma es: " + (numero1+numero2));
                    break;
                case 2:
                    System.out.println("la resta es: " + (numero1-numero2));
                    break;
                case 3:
                    System.out.println("la multiplicacion es: " + (numero1*numero2));
                    break;
                case 4:
                    float division=(numero1/numero2);
                    System.out.println("la division es: " + division);
                    break;
                    
                case 5:         
                   System.out.println("DESEA SALIR");
                   System.out.println("--S:si--");
                   System.out.println("--N:no--");
                   leer.nextLine();
                   opc2=leer.nextLine();
                   opc2.toUpperCase();
                     if (opc2.equals("S")) {
                         System.out.println("fin");
                      
                    }else if(opc2.equals("N")){
                        opc = 0;
                        
                    }
                    break;         
                default: 
                    System.out.println("dato no valido");
                    break;     
            }  
        } while(opc !=5 );
        
     
    }
    
}

package extra5;

import java.util.Scanner;


public class Extra5 {

   
    public static void main(String[] args) {
        System.out.println("Ingrese nombre del socio");
        String nombre;
        Scanner leer=new Scanner(System.in);
        nombre=leer.nextLine();
        System.out.println("ingrese el valor de su compra");
        float compra;
        compra=leer.nextFloat();
        descuento(compra);
        
        System.out.println("GRACIAS POR COMPRAR");
    }
    public static void descuento(float compra){
        Scanner leer=new Scanner(System.in);
       String donante="";
       float a=(float) (compra*0.50),b=(compra*0.35f);float valort = 0f;
       do{
           System.out.println("seleccione tipo de donante"+"\n"
        +"---A---"+"\n"+"---B---"+"\n"+"---C---");
          donante=leer.nextLine();
            switch(donante){
           case "a":
               System.out.println("su descuento es: "+ a +"\n"+
                       "el total de su cmopra es: " + (compra-a));
               break;
           case "b":
                System.out.println("su descuento es: "+ b +"\n"+
                       "el total de su cmopra es: " + (compra-b));
                break;
           case "c":
               System.out.println("el valor de su compra es: "+ compra);
               break;
       }  
                
        
       }while( !donante.equalsIgnoreCase("a") && !donante.equalsIgnoreCase("b") && !donante.equalsIgnoreCase("c"));
       
       
     
        
    }
}

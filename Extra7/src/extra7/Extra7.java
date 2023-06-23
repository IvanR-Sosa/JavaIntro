
package extra7;

import java.util.Scanner;


public class Extra7 {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n = 0;
        
        System.out.println("ingrese el tamaño del procedimiento");
        n=leer.nextInt();
       metodoW(n);
       metodoD(n);     
    }
    //se usa una funcion para el metodo while
    public static void  metodoW(int n){
         Scanner leer=new Scanner(System.in);
    int valor = 0;
        double maximo=Double.MIN_VALUE;//se inicializa con el valor minimo posible para que tenga un tope hacia abajo para buscar
        double minimo=Double.MAX_VALUE;//se inicializa con el valor maximo posible para que pueda buscar
        float promedio=0;
        int suma = 0,contador=0;
     if (n>0) {
            //se inicia la creacion del while
            while( contador<n){
            System.out.println("ingrese numero");
        valor=leer.nextInt();
       
                if (valor>maximo) {//con este le pedimos que busque cual de los numeros es mayor
                maximo=valor;
                
            }
            if (valor<minimo) {//con este ya le estamos pidiendo que busque el minimo de todos los numeros
                minimo=valor;
            }
            suma=(int) (suma+valor);
            contador++;

        } 
        }
        
        promedio=suma/n;
        System.out.println("el numero mayor es :" + maximo);
        System.out.println("el numero menor es: " + minimo);
        System.out.println("el promedio es: " + promedio);
    }
    //se usa otra funcion para el metodo do while
    public static void metodoD(int n){
         Scanner leer=new Scanner(System.in);
         int valor = 0;
        double maximo=Double.MIN_VALUE;//se inicializa con el valor minimo posible para que tenga un tope hacia abajo para buscar
        double minimo=Double.MAX_VALUE;//se inicializa con el valor maximo posible para que pueda buscar
        float promedio=0;
        int suma = 0,contador=0;
        if (n>0) {
            do {
                   System.out.println("ingrese numero");
        valor=leer.nextInt();
       
                if (valor>maximo) {//con este le pedimos que busque cual de los numeros es mayor
                maximo=valor;
                
            }
            if (valor<minimo) {//con este ya le estamos pidiendo que busque el minimo de todos los numeros
                minimo=valor;
            }
            suma=(int) (suma+valor);
            contador++;
            } while (contador<n);
            
        }
    }
}

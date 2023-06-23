
package extra10;

import java.util.Scanner;


public class Extra10 {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("acountinuacion se van a generar 2 numeros aleatorios entre 0 y 10");
        int numero1=(int) (Math.random() * 10);//los math.random son para darle un rango de numeros
        int numero2=(int) (Math.random() * 10);
        int resultado=(numero1*numero2);//aqui se guarda el resultado
        int adivina=0;
        System.out.println("adivina el resultado de la multiplicacion");
        //aqui empezamos el juego de adivinar
        do {
            System.out.println("intenta ahora");
            adivina=leer.nextInt();
            if (adivina!=resultado) {
                System.out.println("casi pero no");
            }else{
                System.out.println("excelente lo lograste");
            }
            
        } while (adivina!=resultado);
        System.out.println("la multiplicacion era: "+numero1+"*"+numero2);
        
    }
    
}

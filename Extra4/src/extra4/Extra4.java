
package extra4;


import java.util.Scanner;


public class Extra4 {

    
    public static void main(String[] args) {
        int numero = 0;
        Scanner leer=new Scanner(System.in);
        do{
            System.out.println("ingrese un numero de 1 a 10");
            numero=leer.nextInt();
            }while(numero>10);
       System.out.println(numero + " = " +romanos(numero));
       
    }
    public static String romanos(int numero){
        String romano="",aux="";
        int unidades=numero%10;
        if (numero==10) {
            romano=romano+"X";
        }else if (numero==9) {
            romano=romano+"IX";
            
        }else if (numero>=5) {
            romano=romano+"V";
            for (int i = 6; i < unidades; i++) {
                
                romano=romano+"I"    ;
                
            }
            romano=romano+"I";
        }else if (numero==4) {
            romano=romano+"IV";
                   
        }else if (numero>=1) {
            romano=romano+"I";
            for (int i = 2; i < numero; i++) {
               romano=romano+"I"; 
            }
            romano=romano+"I";
        }
        
            
        
         return romano;
    }
}

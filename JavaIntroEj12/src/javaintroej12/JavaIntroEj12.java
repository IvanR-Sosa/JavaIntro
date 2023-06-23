
package javaintroej12;

import java.util.Scanner;


public class JavaIntroEj12 {

   
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        int num1,num2;
        System.out.println("ingrese el numero 1");
        num1=leer.nextInt();
        System.out.println("ingrese el numero 2");
        num2=leer.nextInt();
        
     EsMultiplo(num1,num2); 
        
    }
   //creacion de la funcion
   
    public static void EsMultiplo(int _num1,int _num2){
   

    int division=_num1/_num2 ;
    int comprobar=division*_num2;
    
    if (comprobar == _num1){
        
        System.out.println("los numeros son multiplos");
   
        }else{
        System.out.println("los numeros no son multiplo");
   
        }

    
    } 
}
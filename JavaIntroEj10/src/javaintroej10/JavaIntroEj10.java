/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej10;

import java.util.Scanner;

/**
 *
 * @author ramis
 */
public class JavaIntroEj10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        
        int numero=0;

        for (int i = 0; i < 4; i++) {
            System.out.println("ingrese numero entre 1 y 20");
            numero =leer .nextInt();
            if (numero>0 && numero<=20){
                System.out.print(numero+":");
                
            for (int j = 0; j < numero; j++) {
                System.out.print("*");
            }
                  System.out.println("");
            }
        }
    }
}

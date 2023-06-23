package javaintroej11;

import java.util.Scanner;

public class JavaIntroEj11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase o palabra"
                + "");
        String frase = leer.nextLine();

     
        System.out.println("la frase o palabra modificada es: ");modificado(frase);
        System.out.println("");
}
        //creacion de la funcion
        public static String modificado(String _frase){
        
      //se determina el tamaño de la frase
        int tam = _frase.length();
        //se inicializa la subcadenacadena 
        String sbcadena = "";
        
        for (int i = 0; i < tam; i++) {
            //subcadena de la frase
            sbcadena = _frase.substring(i, i + 1);
        //se crea el segun para poder reemplazar las vocales
           // for (int j = 0; j < tam; j++) {
                switch (sbcadena) {
                    case "a":
                        sbcadena = "@";
                        break;
                    case "e":
                        sbcadena= "#";
                        break;
                    case "i":
                        sbcadena= "$";
                        break;
                    case "o":
                        sbcadena= "%";
                        break;
                    case "u":
                        sbcadena= "*";
                        break;
                    default:
                        sbcadena=sbcadena;
                }
             System.out.print(sbcadena);
        }
        return sbcadena;
        }
        
        
    }
 

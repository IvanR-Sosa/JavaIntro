
package javaej18;


public class JavaEj18 {

    
    public static void main(String[] args) {
        int [][] matriz=new int [4][4];
        
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz.length; j++) {
                
                  matriz[i][j]= (int) (Math.random()*10);
                  System.out.print("["+ matriz[i][j] + "]");
                
            }
            System.out.println("");
        }
        System.out.println("");
        //este for es el mismo que el de arriba pero en orden j.i osea cambio filas y colmunas de orden
          for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz.length; j++) {
                
                  
                  System.out.print("["+ matriz[j][i] + "]");
                
            }
            System.out.println("");
        }
    }
    
}

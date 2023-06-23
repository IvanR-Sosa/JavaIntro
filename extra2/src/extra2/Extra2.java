
package extra2;


public class Extra2 {

  
    public static void main(String[] args) {
      int A=1,B=2,C=3,D=4,aux;
        System.out.println("A: " +A+" B: "+B+" C: "+C+" D: "+D);
   //la variable aux se usa para poder generar correctamente el cambio de los valores
  aux=B;
  B=C;
  C=A;
  A=D;
  D=aux;
        System.out.println("A:"+A+" B:"+B+" C:"+C+" D:"+D);
       
    }
    
}
/*
C=Math.abs(A);
      B=Math.abs(C);
      A=Math.abs(D);
*/
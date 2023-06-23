package extra12;

public class Extra12 {

    public static void main(String[] args) {
        for (int i = 0; i <=9; i++) {
            //se recorre la centena[i][][]
            for (int j = 0; j <= 9; j++) {
                //se recorre la decena [i][j][]
                for (int k = 0; k <= 9; k++) {
                    //se recorre la unidad[i][j][k]
                    if (i==3) {
                        System.out.print("E-");              //con estos if lo que hacemos es evaluar si el numero es 3
                    }else{                                   // y segun lo reemplazamos
                        System.out.print(i+"-");             //  en este algoritmo no es necesario definir variables ya que el solo
                    }                                        // va a recorrer las distancias "i,j,k" estas mismas se vuelven un resultado
                    if (j==3) {                              //y una variable por ende se pueden imprimir   
                        System.out.print("E-");
                    }else{
                        System.out.print(j+"-");
                    }
                    if (k==3) {
                        System.out.println("E");
                    }else{
                        System.out.println(k);
                    }
                }
            }
        }

    }

}

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio6 {
    ///Math.sq -> raiz
    //math.pow (base, expoente)
    //mat.cbrt
    //demais potencais math.pow (base, expoente)
    public static void main(String[] args) {
        DecimalFormat df;
        df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        double y, x, z;

        System.out.println("Insira o valor de x -> ");
        x = sc.nextDouble();

        //Processamneto
        y=Math.pow(x-1/2,6);

        z=Math.sqrt(Math.cbrt(x-1/2));

        System.out.println("O valor de y é.... " + y);

        System.out.println("O valor de z é... " + z);
    }
}

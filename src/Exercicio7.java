import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        double x, y, aux;

        System.out.println("O valor de x" + " --> ");
        x = sc.nextDouble();

        aux = (Math.pow(x,4)-1)/(2*Math.pow(x,2));

        y=Math.sqrt(1 + Math.pow(aux,2))- (Math.pow(x,2)) /2 ;

        System.out.println("O valor de y---->   " + df.format(y));
    }
}

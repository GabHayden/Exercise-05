import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Entrada
        int quatrobits,bi1, bi2, bi3,bit4, decimal ;

        System.out.println("Insira o numero com 4 bits: ");
        quatrobits = sc.nextInt();

        //processamento
        bi1 = quatrobits/1000;
        bi2 = quatrobits /100 %10;
        bi3 = quatrobits % 100 / 10;
        bit4 = quatrobits % 10;

        decimal=bi1*8 + bi2*4 + bi3*2 + bi1*1;
        System.out.println("numero doido -->" + decimal );


    }
}

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Entrada
        int cen,dez,uni,valor, result, resultinvertido;

        System.out.println("insira um numero com 3 digitos -> ");
        valor = sc.nextInt();
        cen = valor/100;
        dez = valor %100 /10;
        uni = valor % 10;

        resultinvertido = uni * 100 + dez * 10 + cen;

        //Processamento
        System.out.println("numero invertido " + uni + dez + cen );

        System.out.println("valor invertido " + resultinvertido);
    }
}

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Entradaa
        int x,result;

        //Processamento
        System.out.println("Digite um numero de 3 digitos se vc é bom -> ");
        x = sc.nextInt();

        result = x%100/10;

        //saida
        System.out.println("Agora está com 2 digitos -> " + result);
        }
}

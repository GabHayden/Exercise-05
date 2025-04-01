import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0,000.00");
        //Entrada de dados
        double salarioliq,valordahora,numerodehoras,descontoinss;
        double salariobruto, porcentagem;

        System.out.println("Insira o valor da hora: ");
        valordahora = sc.nextDouble();

        System.out.println("Insira quantas horas foram trabalhadas: ");
        numerodehoras = sc.nextDouble();

        System.out.println("Insira a porcentagem");
        porcentagem = sc.nextDouble();

        //Processamento
        salariobruto = valordahora * numerodehoras;

        descontoinss = salariobruto* porcentagem/100;

        salarioliq =  salariobruto - descontoinss;

        //saida
        System.out.println("Salario bruto: " + salariobruto);

        System.out.println("Descontado no Inss " + descontoinss);

        System.out.println("Salario liq " + df.format(salarioliq)  );


    }
}
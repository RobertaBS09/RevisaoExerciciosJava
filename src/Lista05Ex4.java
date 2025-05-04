import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista05Ex4  {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        double salarioMinimo;
        int qtdKw;
        double valorKw, total, totalComDesconto;


        System.out.print("Salário mínimo vigente R$ ");
        salarioMinimo = sc.nextDouble();
        System.out.print("Quantidade de kilowatt ");
        qtdKw = sc.nextInt();


        valorKw = salarioMinimo / 7 / 100;
        total = qtdKw * valorKw;
        totalComDesconto = total * 0.90;


        System.out.println("Valor do kilowatt --> R$ " + df.format(valorKw));
        System.out.println("Valor total --> R$ " + df.format(total));
        System.out.println("Valor total com 10% de desconto --> R$ " + df.format(totalComDesconto));


    }
}

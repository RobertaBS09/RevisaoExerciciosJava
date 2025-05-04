import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista02Ex1 {
    public static void main(String[] args) {
        double base,altura, area;
        DecimalFormat df = new DecimalFormat("0.00");

        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos calcular a áre de um triângulo!");

        System.out.print("Digite o valor da base -->");
        base = sc.nextDouble();

        System.out.print("Digite o valor da altura -->");
        altura  = sc.nextDouble();


        area = (base*altura)/2;

        System.out.println("o valor da área desse triângulo é de " + df.format(area));

    }
}

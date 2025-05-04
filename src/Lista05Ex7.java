import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista05Ex7 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000000");
        Scanner sc = new Scanner(System.in);
        double x, y;
        double parte1, parte2;

        System.out.print("Informe o valor de x --> ");
        x = sc.nextDouble();

        parte1 = Math.pow((Math.pow(x, 4) - 1)/(2 * x * x), 2);
        parte2 = x * x / 2;
        y = Math.sqrt(1 + parte1) - parte2;

        System.out.println("y = " + df.format(y));
    }
}
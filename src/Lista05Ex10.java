import java.util.Scanner;

public class Lista05Ex10 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int binario, decimal;
            int d1, d2, d3, d4;

            System.out.print("Informe um valor em binário com 4 dígitos -->");
            binario = sc.nextInt();

            d1 = binario / 1000;
            d2 = binario % 1000 / 100;
            d3 = binario % 100 / 10;
            d4 = binario % 10;

            decimal = d1 * 8 + d2 * 4 + d3 * 2 + d1 * 1;

            System.out.println(decimal);

        }}

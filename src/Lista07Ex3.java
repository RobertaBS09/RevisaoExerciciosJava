import java.util.Scanner;

public class Lista07Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, delta, x1, x2;

        System.out.print("Digite o valor de A: ");
        a = sc.nextDouble();

        System.out.print("Digite o valor de B: ");
        b = sc.nextDouble();

        System.out.print("Digite o valor de C: ");
        c = sc.nextDouble();

        if (a == 0) {
            System.out.println("Não é uma equação do segundo grau.");
        } else {
            delta = Math.pow(b, 2) - 4 * a * c;

            if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
            } else if (delta == 0) {
                x1 = -b / (2 * a);
                System.out.println("A equação possui uma raiz real: x = " + x1);
            } else {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("As raízes da equação são:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }


    }
}

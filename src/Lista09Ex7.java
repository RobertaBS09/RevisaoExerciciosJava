import java.util.Scanner;

public class Lista09Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contribuintes, dependentes;
        String CPF;
        double desconto;
        double salariomin, renda, IR;

        System.out.print("Salário mínimo atual -->");
        salariomin = sc.nextDouble();

        System.out.print("Número de contribuintes -->");
        contribuintes = sc.nextInt();

        while (contribuintes >= 1) {
            System.out.print("CPF -->");
            CPF = sc.next();

            System.out.print("Quantidade de dependetes -->");
            dependentes = sc.nextInt();

            System.out.print("Renda mensal --> R$");
            renda = sc.nextDouble();

            desconto = salariomin * (0.05 * dependentes);
            if (renda <= 2 * salariomin) {
                IR = 0;
            } else if (renda <= 3 * salariomin) {
                IR = renda * 0.05;
            } else if (renda <= 5 * salariomin) {
                IR = renda * 0.10;

            } else if (renda <= 7 * salariomin) {
                IR = renda * 0.15;

            } else {
                IR = renda * 0.20;
            }
            System.out.println("IR= R$ " + IR);
            contribuintes--;
        }

    }
}

import java.util.Scanner;

public class Lista05Ex3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int tempo;
        double velocidade , distancia,litros;

        System.out.print("Digite o tempo gasto -->");
        tempo = sc.nextInt();

        System.out.println("Digite a velocidade média -->");
        velocidade= sc.nextDouble();

        distancia= velocidade *tempo;

        litros = distancia/10.5;

        System.out.println("O valor de litros gasto é --> "  + litros);
    }
}

import java.util.Scanner;

public class Lista05Ex8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int valor,dezena;

        System.out.println("Valor -->");
        valor= sc.nextInt();

        dezena= valor/10%10;

        System.out.println(dezena);
    }
}

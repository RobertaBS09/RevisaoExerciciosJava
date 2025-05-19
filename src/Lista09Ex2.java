import java.util.Scanner;

public class Lista09Ex2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num,tab;
        int contador=1;

        System.out.print("Digite um número inteiro--->");
        num=sc.nextInt();

        while (contador<=10){
            tab=num*contador;
            System.out.println(num  +"*" + contador + "=" + tab);
            contador++;
        }
    }
}

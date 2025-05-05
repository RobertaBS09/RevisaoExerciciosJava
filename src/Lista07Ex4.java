import java.util.Scanner;

public class Lista07Ex4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int Valor1, Valor2,Valor3;

        System.out.print("Digite o valor 1--->");
        Valor1=sc.nextInt();
        System.out.print("Digite o valor 2--->");
        Valor2=sc.nextInt();
        System.out.print("Digite o valor 3--->");
        Valor3 =sc.nextInt();

        if (Valor1 != Valor2 && Valor1 != Valor3 && Valor2 != Valor3){
            if (Valor1<Valor2 && Valor1< Valor3){
                System.out.println("O menor valor é o Valor 1 --> "+ Valor1);
            }
            else if (Valor2<Valor1 && Valor2<Valor3){
                System.out.println("O menor valor é o Valor 2 --> "+ Valor2);
            }
            else{
                System.out.println("O menor valor é o Valor 3 --> "+ Valor3);
            }
        }
        else {
            System.out.println("Os valores não são diferentes!");
        }
    }
}

import java.util.Scanner;

public class Lista06Ex5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double l1,l2,l3;

        System.out.print("Digite o valor do lado 1 -->");
        l1=sc.nextDouble();
        System.out.print("Digite o valor do lado 2 -->");
        l2= sc.nextDouble();
        System.out.print("Digite o valor do lado 3 -->");
        l3=sc.nextDouble();

        if (l1<l2+l3 && l2<l1+l3 && l3<l1+l2){
            System.out.println("É um triângulo!");
        }
        else {
            System.out.println("Não é um triângulo!!");
        }
    }
}

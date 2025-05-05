import java.util.Scanner;

public class Lista07Ex5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int valor1,valor2,valor3, aux;

        System.out.print("Digite o valor 1 --> ");
        valor1= sc.nextInt();
        System.out.print("Digite o valor 2 --> ");
        valor2 = sc.nextInt();
        System.out.print("Digite o valor 3 --> ");
        valor3= sc.nextInt();

        if (valor1>valor2){
            aux=valor1;
            valor1=valor2;
            valor2 =aux;
        }

        if (valor1>valor3){
            aux=valor1;
            valor1=valor3;
            valor3=aux;
        }

        if (valor2>valor3){
            aux= valor2;
            valor2=valor3;
            valor3=aux;
        }
        System.out.println(valor1 + " " + valor2 +" " + valor3);
    }
}

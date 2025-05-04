import java.util.Scanner;

public class Lista05Ex9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int valor, valorinv;
        int dezena,centena,unidade;

        System.out.print("Digite um valor de 3 digitos --->");
        valor=sc.nextInt();

        dezena= valor/10%10;
        unidade= valor%10;
        centena=valor/100;


        valorinv= unidade*100 +dezena*10+centena;
        System.out.println(valorinv);
    }
}

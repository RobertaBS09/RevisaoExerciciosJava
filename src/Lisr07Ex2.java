import java.text.DecimalFormat;
import java.util.Scanner;

public class Lisr07Ex2 {
    public static void main(String[] args) {
        DecimalFormat df= new DecimalFormat("0.00");
        Scanner sc= new Scanner(System.in);

        double  diaria,txservico,conta;
        int nudiaria;

        System.out.print("Digite o número de diárias -->");
        nudiaria = sc.nextInt();

        diaria=250;

        if (nudiaria> 15){
            txservico = 15.5* nudiaria;
        }
        else if (nudiaria == 15){
            txservico= 36* nudiaria;
        }
        else{
            txservico = 58*nudiaria;
        }
        conta=(diaria*nudiaria)+txservico;

        System.out.println("O valor da conta é de R$"+ df.format(conta) );
    }
}

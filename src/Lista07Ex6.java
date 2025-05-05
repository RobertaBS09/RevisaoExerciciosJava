import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista07Ex6 {
    public static void main(String[] args) {
        DecimalFormat df= new DecimalFormat("0.00");
        Scanner sc=new Scanner(System.in);

        int tempo;
        double salario,novoSalario;
        double diferenca,aumento;
        String cargo;

        aumento=0.05;

        System.out.print("Qual é o se cargo?");
        cargo=sc.next();


        System.out.print("Quanto tempo (anos) de serviço?");
        tempo= sc.nextInt();

        System.out.print("Qual é o seu salario ATUAL?");
        salario=sc.nextDouble();


            if (cargo.equalsIgnoreCase("gerente")) {
                if (tempo < 3) {
                    aumento = 0.08;
                } else if (tempo >= 3 && tempo < 5) {
                    aumento = 0.09;
                } else {
                    aumento = 0.10;
                }
            }

            if (cargo.equalsIgnoreCase("engenheiro")) {
                if (tempo < 3) {
                    aumento = 0.09;
                } else if (tempo >= 3 && tempo < 5) {
                    aumento = 0.10;
                } else {
                    aumento = 0.11;
                }
            }

            if (cargo.equalsIgnoreCase("técnico")) {
                if (tempo < 3) {
                    aumento = 0.10;
                } else if (tempo <= 3 && tempo < 5) {
                    aumento = 0.11;
                } else {
                    aumento = 0.12;
                }
            }


        aumento= salario*aumento;
        novoSalario=salario+aumento;
        diferenca= novoSalario - salario;


            System.out.println("Seu novo salário é de: R$" + df.format(novoSalario));
            System.out.println("A diferenca é de R$"+df.format(diferenca));
    }

}

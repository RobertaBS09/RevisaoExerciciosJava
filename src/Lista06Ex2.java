import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista06Ex2 {
    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("0.00");
        Scanner sc= new Scanner(System.in);

        double  totalsc,tcd,veconomizado;

        System.out.print("Qual foi o valor total das suas compras? ");
        totalsc = sc.nextDouble();

        if (totalsc>1000){
            tcd= totalsc *0.85;
        }
        else{
            tcd= totalsc *0.92;
        }

         veconomizado= totalsc-tcd;
        System.out.println("O valor economizado é de R$" + df.format(veconomizado));
        System.out.println("O valor das suas compras após o desconto é de R$" + df.format(tcd));
    }
}

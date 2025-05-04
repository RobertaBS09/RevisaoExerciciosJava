import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista05Ex1 {
    public static void main(String[] args) {
        DecimalFormat df= new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);

        double base, altura;
        double l1,l2,l3,l4;
        double area, peri;


        System.out.println(" Vamos calcular a área e o perímetro de um retângulo!!");

        System.out.print("Digite o valor da BASE do retângulo -->");
        base=sc.nextDouble();
        System.out.print("Digite o valor da ALTURA do retângulo --->");
        altura=sc.nextDouble();

        area= base*altura;


        System.out.print("Digite o valor do primeiro lado do retângulo -->");
        l1=sc.nextDouble();
        System.out.print("Digite o valor do segundo lado do retângulo -->");
        l2=sc.nextDouble();
        System.out.print("Digite o valor do terceiro lado do retângulo -->");
        l3=sc.nextDouble();
        System.out.print("Digite o valor do quarto lado do retângulo -->");
        l4=sc.nextDouble();

        peri= l1+l2+l3+l4;

        System.out.println("Área = " + df.format(area) + " Perímetro = "+  df.format(peri));



    }
}

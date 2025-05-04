import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista05Ex2 {
    public static void main(String[] args) {

        DecimalFormat df=new DecimalFormat("0.00");
        Scanner sc=new Scanner(System.in);

         double celsius, fah;

        System.out.print("Digite a temperatura em celcius C° ----> ");
        celsius= sc.nextDouble();

        fah= (celsius * 9/5) + 32;

        System.out.println("A temperatura em Fahrenheit é:  " + df.format(fah));
    }
}

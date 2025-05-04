import java.text.DecimalFormat;
import java.util.Scanner;

public class Liista06Ex4 {
    public static void main(String[] args) {
        DecimalFormat df= new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);


        double x,y;

        System.out.print("Digite o valor de X -->");
        x= sc.nextDouble();

        if (x>5 || x<-5 ){
            y= 8/Math.sqrt(Math.pow(x,2)-25);
            System.out.println("y=" + df.format(y));
        }
        else{
            System.out.println("Não existe divisão por 0 e nem raiz quadrada de números negativos! ");
        }

    }
}

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista06Ex1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        DecimalFormat df= new DecimalFormat( "0.00");

        double p1,p2,t1,t2,t3;
        double notaf;
        double  mp,mt;

        System.out.print("Qual foi a sua nota na primeira prova?");
        p1= sc.nextDouble();
        System.out.print("Qual foi a sua nota na segunda prova?");
        p2= sc.nextDouble();

        System.out.print("Qual foi sua nota no primeiro trabalho?");
        t1=sc.nextDouble();
        System.out.print("Qual foi sua nota no segundo trabalho?");
        t2=sc.nextDouble();
        System.out.print("Qual foi sua nota no terceiro trabalho?");
        t3=sc.nextDouble();

        mp=((p1+p2)/2)*0.7;
        mt=((t1+t2+t3)/3)*0.3;

        notaf= mp+mt;


        if (notaf>= 6){
            System.out.println("Média = " + df.format(notaf) +"  Aluno APROVADO(A)!");
        }
        else {
            System.out.println("Média = " + df.format(notaf) +"  Aluno(a) REPROVADO(A)!");
        }

    }
}



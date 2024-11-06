import java.util.Scanner;

public class CasoPráctico54 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int A;
        int B;
        int C;
        System.out.println("Introduzca el valor de A: ");
        A= sc.nextInt();
        System.out.println("Introduzca el valor de B: ");
        B= sc.nextInt();
        sc.close();
        C=A;
        A=B;
        B=C;
        System.out.println("Una vez intercambiado los valores, A pasa a ser: "+A+" y B pasa a ser: "+B);
    }
}

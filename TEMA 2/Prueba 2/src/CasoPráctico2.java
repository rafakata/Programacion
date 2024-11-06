import java.util.Scanner;

public class CasoPráctico2 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca edad.");
        int edad= sc.nextInt();
        System.out.println("Introduzca su peso.");
        double peso= sc.nextDouble();
        sc.close();
        System.out.println("Su edad es "+edad+" años y pesa "+peso+" Kg");
    }
}

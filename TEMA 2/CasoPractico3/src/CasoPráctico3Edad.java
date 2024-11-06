import java.util.Scanner;

public class CasoPráctico3Edad {
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca su año de nacimiento: ");
        int nacimiento= sc.nextInt();
        int edad=2024-nacimiento;
        System.out.println("Usted tiene "+edad+" años.");
    }
}

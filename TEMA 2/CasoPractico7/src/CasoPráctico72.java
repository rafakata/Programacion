import java.util.Scanner;

public class CasoPráctico72 {
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca un año: ");
        int año= sc.nextInt();
        boolean bisiesto=((año%4==0&& !(año%100==0))||((año%100==0))&&(año%400==0));
        if (bisiesto){
            System.out.println("Es bisiesto.");
        }else {
            System.out.println("No es bisiesto.");
        }
    }
}

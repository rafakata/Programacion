import java.util.Scanner;

public class CasoPráctico84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dinero;
        System.out.println("Introduzca cuánto presupuesto tiene: ");
        dinero = sc.nextInt();
        sc.close();
        String regalo = "";
        if (dinero <= 0) {
            System.out.println("Que te compren algo a tí mostro. Regálale tu presencia");
        } else if (dinero <= 10) {
            regalo = "Tarjeta de regalo.";
        } else if (dinero > 10 && dinero < 20) {
            regalo = "Tarjeta de regalo.";
        } else if (dinero <= 20 && dinero <= 50) {
            regalo = "Tarjeta de regalo.";
        } else {
            regalo = "Tarjeta de regalo.";
            {
            }
        }
    }
}
import java.util.Random;
import java.util.Scanner;

public class CasoPráctico1102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int veces;
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;
        int contador6 = 0;
        Random r = new Random();
        do {
            System.out.println("Introduzca cuántas veces quiere tirar el dado:");
            veces = sc.nextInt();
        } while (veces <= 0);
        for (int i = 1; i <= veces; i++) {
            int aleatorio = r.nextInt(6) + 1;
            if (aleatorio == 1) {
                contador1++;
            } else if (aleatorio==2) {
                contador2++;
            } else if (aleatorio==3) {
                contador3++;
            } else if (aleatorio==4) {
                contador4++;
            } else if (aleatorio==5) {
                contador5++;
            } else {
                contador6++;
            }
        }
        System.out.println("El número 1 ha salido "+contador1+" veces.");
        System.out.println("El número 2 ha salido "+contador2+" veces.");
        System.out.println("El número 3 ha salido "+contador3+" veces.");
        System.out.println("El número 4 ha salido "+contador4+" veces.");
        System.out.println("El número 5 ha salido "+contador5+" veces.");
        System.out.println("El número 6 ha salido "+contador6+" veces.");

    }
}

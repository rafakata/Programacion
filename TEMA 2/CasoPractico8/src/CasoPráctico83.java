import java.util.Scanner;

public class CasoPráctico83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cita;
        int costo;
        int total;
        do {
            System.out.println("Introduzca el número de cita: ");
            cita = sc.nextInt();
        } while (cita <= 0);
        sc.close();
        switch (cita) {
            case 1, 2, 3 -> {
                costo = 150;
                total=150*cita;
            }
            case 4, 5 -> {
                costo = 100;
            }
            case 6, 7, 8 -> {
                costo = 90;
            }
            default -> {
                costo = 50;
            }
        }
        System.out.println("Al ser su sesión nº " + cita + ", el precio de la misma es de: " + costo + "€");
    }
}

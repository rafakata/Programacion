import java.util.Scanner;

public class CasoPráctico81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean primo = true;
        System.out.println("Introduzca un número: ");
        int num = sc.nextInt();
        sc.close();
        int divisor = 2;
        while (primo && divisor < num) {
            if (num % divisor == 0) {
                primo = false;
            }
            divisor++;
        }
        if (primo) {
            System.out.println("El número " + num + " es primo.");
        } else
            System.out.println("El número " + num + " no es primo.");
    }

}

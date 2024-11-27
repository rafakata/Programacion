import java.util.Scanner;
/*
Escribe un programa que lea un número entero y cuente cuántos dígitos
tiene.
 */
public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int original = 0;
        int numero = 0;
        int cantidad = 1;
        System.out.println("Introduce un nº entero: ");
        original = sc.nextInt();
        sc.close();
        numero = original;
        do {
            original /= 10;
            cantidad++;
        } while (original >= 10);
        System.out.println("El nº "+numero+" tiene "+cantidad+" dígitos.");

    }
}

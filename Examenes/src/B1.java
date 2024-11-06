import java.util.Scanner;
// Escribe un programa que lea un número entero y determine si es par o impar.
public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Escribe un nº entero y te digo si es par o impar: ");
        num = sc.nextInt();
        sc.close();
        if (num % 2 == 0) {
            System.out.println("Tu nº es par.");
        } else {
            System.out.println("Tu número es impar.");

        }
    }
}


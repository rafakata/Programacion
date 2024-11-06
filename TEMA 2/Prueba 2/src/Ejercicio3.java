import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Introduzca un número: ");
            num= sc.nextInt();
        }while (num<1);

        sc.close();

    }
}
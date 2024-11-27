import java.util.Scanner;
/*
Escribe un programa en Java que imprima los primeros n términos de la
serie de Fibonacci. La serie de Fibonacci comienza por un 0 (para el término 0) y un 1
(para el término 1) y continúa añadiendo números que son la suma de los dos
anteriores.
 */
public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int a = 0;
        int b = 1;
        int suma = 1;
        System.out.println("Introduce un nº para hacer la sucesión de Fibonacci: ");
        n = sc.nextInt();
        sc.close();
        System.out.print("0, ");
        for (int i = 1; i < n; i++) {
            suma = a + b;
            System.out.print(suma + ", ");
            b = a;
            a = suma;
        }
    }
}
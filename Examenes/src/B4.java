import java.util.Scanner;
/*
 Escribe un programa que lea un número entero y lo invierta. Por ejemplo,
si el usuario introduce 1234, el programa debe devolver 4321.
 */
public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int invertido = 0;
        System.out.println("Introduce un número entero: ");
        num = sc.nextInt();
        while (num > 0) {
            invertido = invertido * 10 + num % 10;
            num /= 10;
        }
        System.out.println("El número invertido es: "+invertido);
    }
}


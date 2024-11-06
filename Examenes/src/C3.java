import java.util.Scanner;

/*Escribe un programa que lea un número entero positivo ingresado por el
usuario y determine si es un número capicúa. Un número es capicúa si se lee igual de
izquierda a derecha que de derecha a izquierda, como 121 o 1331.*/
public class C3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int original = 0;
        int capicuo = 0;
        do {
            System.out.println("Introduzca un número");
            num = sc.nextInt();
        } while (num <= 0);
        sc.close();
        original = num;
        while (num != 0) {
            capicuo = capicuo * 10 + num % 10;
            num = num / 10;
        }
        if (original == capicuo) {
            System.out.println("El número es capicuo.");
        } else {
            System.out.println("El número NO es capicuo.");
        }
    }
}

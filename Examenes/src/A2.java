import java.util.Scanner;
/* Escribe un programa en Java que lea un número entero positivo introducido
por el usuario y calcule su factorial. El factorial de un número se calcula de la siguiente
forma: se deben multiplicar todos los números enteros y positivos que hay entre el
número introducido y el número 1:
 */
public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int factorial=1;
        System.out.println("Introduzca un número: ");
        num= sc.nextInt();
        sc.close();
        for (int i=1;i<=num;i++){
            factorial*=i;
        }
        System.out.print("El factorial es: " + factorial);
    }
}

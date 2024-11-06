import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int factorial=1;
        System.out.println("Introduzca un número: ");
        num= sc.nextInt();
        for (int i=1;i<=num;i++){
            factorial*=i;
        }
        System.out.print("El factorial es: " + factorial);
    }
}

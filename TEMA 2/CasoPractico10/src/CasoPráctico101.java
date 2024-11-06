import java.util.Scanner;

public class CasoPráctico101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        double pitagoras;
        do {
            System.out.println("Introduzca la medida del primer cateto:");
            a = sc.nextInt();
        } while (a < 1);
        do {
            System.out.println("Introduzca la medida del segundo cateto:");
            b = sc.nextInt();
        } while (b < 1);
        do {
            System.out.println("Introduzca la medida de la hipotenusa:");
            c = sc.nextInt();
        } while (c < 1);
        sc.close();
        pitagoras = (Math.pow(a, 2) + (Math.pow(b, 2)));
        if (pitagoras == (Math.pow(c, 2))) {
            System.out.println("El triángulo es rectángulo ya que la suma de sus dos catetos elevado a dos es igual a la hipotenusa elevada a 2.");
        } else if (a == b && b == c) {
            System.out.println("Es un triángulo equilátero ya que todos sus lados son iguales.");
        } else if (a == b || a == c || b == c) {
            System.out.println("  El triángulo es isósceles ya que dos de sus lados son iguales");
        } else {
            System.out.println("Es un triángulo escaleno ya que todos sus lados son distintos");
        }
    }
}

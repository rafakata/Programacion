import java.util.Scanner;
/*Escribe un programa que genere los primeros n números triangulares,
donde n es un número entero positivo escrito por el usuario. Un número triangular se
define como la suma de los n primeros números naturales. El primer número triangular
es 1, el segundo es 1 + 2 = 3, el tercero es 1 + 2 + 3 = 6, y así sucesivamente. */
public class D3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de números triangulares que quieres: ");
        int n = sc.nextInt();
        sc.close();
        int numeroTriangular = 0;
        System.out.println("Los números triangulares son: ");
        for (int i = 1; i <= n; i++) {
            numeroTriangular += i;
            System.out.println(numeroTriangular);
        }
    }
}

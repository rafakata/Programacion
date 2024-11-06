import java.util.Scanner;

/*Escribe un programa que calcule el Máximo Común Divisor (MCD) de dos
números ingresados por el usuario usando el algoritmo de Euclides. El Máximo Común
Divisor (MCD) de dos números enteros a y b es el mayor número que puede dividir
exactamente a ambos. Por ejemplo, el MCD de 12 y 8 es 4, ya que 4 es el número más
grande que puede dividir tanto a 12 como a 8 sin dejar resto. El algoritmo de Euclides
es un método eficiente para encontrar el MCD de dos números.*/
public class D4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Pedimos los dos números al usuario
        System.out.print("Introduce el primer número: ");
        int a = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int b = sc.nextInt();

        // Calculamos el MCD usando el algoritmo de Euclides
        while (b != 0) {  // Mientras b no sea 0
            int resto = a % b;  // Obtenemos el resto de la división
            a = b;  // Reemplazamos a por b
            b = resto;  // Reemplazamos b por el resto
        }

        // Mostramos el resultado
        System.out.println("El MCD de los dos números es: " + a);

        sc.close();

    }
}


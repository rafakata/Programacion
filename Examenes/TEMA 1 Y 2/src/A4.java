import java.util.Scanner;
/*Escribe un programa que determine si un número ingresado por el
usuario es un número de Armstrong. Un número de Armstrong de n dígitos es aquel
que es igual a la suma de sus dígitos elevados a la potencia n.
*/
public class A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int original= sc.nextInt();
        sc.close();
        int numero=original;
        int cifras=0;
        while (numero>0) {
            numero /=10;
            cifras++;
        }
        numero=original;
        int num;
        double suma=0;
        while (numero>0) {
            num = numero%10;
            suma+=Math.pow(num,cifras);
            numero /= 10;
        }
        if (suma==original) {
            System.out.println("Es un número de Armstrong");
        } else {
            System.out.println("No es número de Armstrong");
        }
    }
}

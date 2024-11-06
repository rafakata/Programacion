import java.util.Scanner;

public class CasoPráctico2Círculo {
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca el radio de un círculo:");
        double radio= sc.nextDouble();
        sc.close();
        double área= Math.PI*radio*radio;
        System.out.println("El área de este círculo es "+área);
    }
}

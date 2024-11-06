import java.util.Scanner;

public class CasoPráctico2Triángulo {
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca la base de un triángulo:");
        double base= sc.nextDouble();
        System.out.println("Ahora, introduzca la altura:");
        double altura=sc.nextDouble();
        sc.close();
        double área=base*altura/2;
        System.out.println("El área de este triángulo es "+área);
    }
}

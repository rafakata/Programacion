import java.util.Scanner;

public class CasoPráctico3Sueldo {
    public static void main (String[]args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Introduzca el nombre del empleado: ");
        String nombre = sc.nextLine();
        System.out.println("Introduzca el sueldo base: ");
        double base= sc.nextDouble();
        double liquido=base*0.80;
        System.out.println("El sueldo líquido de "+nombre+" es "+liquido+" €.");
    }
}

import java.util.Scanner;

public class CasoPráctico3IVA {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el valor neto de la factura: ");
        double neto=sc.nextDouble();
        double IVA= neto*1.21;
        System.out.println("El valor de la factura, con el +21% del IVA incluido, pasa a ser "+IVA+" €");
    }
}

import java.util.Scanner;

public class CasoPráctic2Descuento {
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca el número de mes: ");
        int mes= sc.nextInt();
        while ((mes<1)||((mes>12))){
            System.out.println("Número de mes no válido. Por favor, vuelva a introducir el número de mes: ");
            mes=sc.nextInt();
        }
        System.out.println("Introduzca el importe total del a compra de dicho mes: ");
        double compra=sc.nextDouble();
        sc.close();
        if (mes == 10){
            double descuento=compra*0.85;
            System.out.println("Enhorabuena, por hacer la compra en Octubre, tiene un 15% de descuento en su compra. Esto hace que el total de la compra pasaría a ser: "+descuento+" €.");
        } else{
            System.out.println("El total de su compra es "+compra+"€ .Si hubiese comprado en el mes de Ocrubre, podría haber disfrutado de un 15% de descuento.");
        }
    }
}

import java.util.Scanner;

public class CasoPráctico53 {
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        int num;
        double cuadrado;
        double cubo;
System.out.println("Ingresa un número: ");
num= sc.nextInt();
sc.close();
for (int i=0;i<=5;i++){
    cuadrado=Math.pow(num,2);
    cubo=Math.pow(num,3);
    System.out.println("Cuadrado de "+num+" = "+cuadrado+" . El cubo de ese número es "+cubo);
    num++;
}
    }
}

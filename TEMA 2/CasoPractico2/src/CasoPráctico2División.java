import java.util.Scanner;

public class CasoPráctico2División {
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca un valor: ");
        double x=sc.nextDouble();
        System.out.println("Introduzca un segundo valor: ");
        double y=sc.nextDouble();
        sc.close();
        if (x>y){
            double división=x/y;
            System.out.println("De los dos, el número mayor es el "+x+" y la división entre "+y+ " da como resultado: "+división);
        } else{
            double división=y/x;
            System.out.println("De los dos, el número mayor es el "+y+" y la división entre "+x+ " da como resultado: "+división);
        }
    }
}

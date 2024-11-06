import java.util.Random;
import java.util.Scanner;

public class CasoPráctico1104 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int intentos;
        int num;
        do {
            System.out.println("¿Cuántos intentos necesita para adivinar la suma de los dados?");
            intentos= sc.nextInt();
        }while (intentos<=0);
        int dado1=r.nextInt(6)+1;
        int dado2= r.nextInt(6)+1;
        int suma=dado1+dado2;
        for (int i=1;i<=intentos;i++){
            System.out.println("Intento nº"+i+" :");
            num= sc.nextInt();
            if (num<suma){
                System.out.println("Tu suma es menor.");
            }else if (num>suma){
                System.out.println("Tu suma es mayor.");
            }else
                System.out.println("¡¡ENHORABUENA, HAS ADIVINADO EL RESULTADO DE LA SUMA!!");
        }
        System.out.println("El número del primer dado era "+dado1+" y el del segundo dado era "+dado2+" por lo que el resultado de la suma es: "+suma+".");
    }

}

import java.util.Random;
import java.util.Scanner;
//Esta corregido pero intenta un poco hacerlo.ñ Estabas donando sangre y no te dió tiempo.
public class CasoPráctico104 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int num;
        do {
            System.out.println("Elige tu arma:");
            System.out.println("0-Piedra");
            System.out.println("1-Papel");
            System.out.println("2-Tijeras");
            num= sc.nextInt();
        }while (num!=0&&num!=1&&num!=2);
        int aleatorio=r.nextInt(2);



    }
}

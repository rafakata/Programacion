import java.util.Random;
import java.util.Scanner;

public class CasoPráctico94 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int num;
        int num1;
        int num2;
        int intentos;
        do {
            System.out.println("¿En qué número empezamos el rango?");
            num1=sc.nextInt();
        }while (num1<=0);
        do {
            System.out.println("¿En qué número terminamos el rango?");
            num2= sc.nextInt();
        }while (num2<=num1);
        do{
            System.out.println("¿Cuántos intentos quieres tener?");
            intentos=sc.nextInt()+1;
        }while(intentos<=0);
        int aleatorio=r.nextInt(num2)+num1;
        for (int i=0;i<=intentos;i++){
            System.out.println("Introduzca un número:");
            num= sc.nextInt();
            if (aleatorio>num){
                System.out.println("El número secreto es mayor que "+num+". Aún te quedan "+(intentos--)+" intentos.");
            } else if (aleatorio<num){
                System.out.println("El número secreto es menor que "+num+". Aún te quedan "+(intentos--)+" intentos.");
            }else{
                System.out.println("¡ENHORABUENAAA HAS CONSEGUIDO ADIVINAR EL NÚMERO SECRETO EN TAN SOLO "+(intentos--)+" INTENTOS!");
            }

        }


    }
}

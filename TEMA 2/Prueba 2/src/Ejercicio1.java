import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Escribe el primer número");
        int numero1= entrada.nextInt();
        System.out.println("Escribe el segundo número");
        int numero2= entrada.nextInt();
        System.out.println("Escribe el tercer número");
        int numero3= entrada.nextInt();

        if ((numero1>numero2) && (numero1>numero3)){
            System.out.println("El primer número introducido, el "+numero1+" ,es el mayor");
        }
        else if ((numero2>numero1) && (numero2>numero3)){
            System.out.println("El segundo número introducido, el "+numero2+" ,es el mayor");
        }
        else{
            System.out.println("El tercer número introducido, el "+numero3+" ,es el mayor");
        }
    }
}
import java.util.Scanner;

public class CasoPráctico63 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int lado;
        System.out.println("Introduzca un número para representar el lado del triángulo: ");
        lado=sc.nextInt();
        sc.close();
        for (int fila=1;fila<=lado;fila++){
            for (int numAsterisco=1;numAsterisco<=fila;numAsterisco++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


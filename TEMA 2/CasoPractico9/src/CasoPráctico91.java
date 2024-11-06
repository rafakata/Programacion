import java.util.Scanner;
//TERMINAR DE CORREGIR
public class CasoPráctico91 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int altura;
        do {
            System.out.println("Introduzca el lado del cuadrado:");
            altura= sc.nextInt();
        }while (altura<=1);
        sc.close();
        //fila de arriba
        for (int fila=1;fila<=altura;fila++){
            System.out.print("*");
        }
        System.out.println();
        //lados intermedios
        for (int i=2;i<=altura;i++){

        }

        //lado de abajo
        for (int fila=1;fila<=altura;fila++){
            System.out.print("*");
        }
    }
}

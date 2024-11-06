import java.util.Scanner;

public class CasoPráctico71 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int altura;
        System.out.println("Introduzca un número para representar un árbol de navidad: ");
        altura=sc.nextInt();
        sc.close();
        //Bucle para la altura
        for (int fila=1;fila<=altura;fila++){
            //Bucle para los espacios en blanco
            for(int j=0;j<altura-fila;j++){
                System.out.print(" ");
            }
            //Tercer for para pintar carácter
            for (int k=1;k<=fila;k++){
                System.out.print("* ");
            }
            //Salto de línea
            System.out.println("");
        }

    }
}
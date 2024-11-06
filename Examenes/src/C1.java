import java.util.Scanner;
/*Escribe un programa que calcule la suma de todos los números enteros
del 1 al n, donde n es un número ingresado por el usuario.  */
public class C1 {
public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
    int num;
    int suma=0;
    do {
        System.out.println("Introduzca un número que cuente como límite:");
        num=sc.nextInt();
    }while (num<=0);
    sc.close();
    for (int i=1;i<=num;i++){
        suma+=i;
    }
    System.out.println("La suma de los números comprendidos entre el 1 y el "+num+" da como resultado: "+suma);
}
}

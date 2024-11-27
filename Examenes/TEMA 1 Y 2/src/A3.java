import java.util.Scanner;
/* Escribe un programa que lea un número entero y calcule la suma de sus
dígitos.
 */
public class A3 {
public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduzca un número:");
    int num= sc.nextInt();
    int suma=0;
    sc.close();
    while(num>0){
        suma+= num%10;
        num/=10;
    }
    System.out.println("La suma es de los números da: "+suma);
}
}

import java.util.Scanner;
/*Escribe un programa en Java que pida al usuario introducir 5 números
enteros y determine cuál es el mayor. */
public class C2 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el primer número:");
        int num1=sc.nextInt();
        System.out.println("Introduzca el segundo número:");
        int num2=sc.nextInt();
        System.out.println("Introduzca el tercer número:");
        int num3=sc.nextInt();
        System.out.println("Introduzca el cuarto número:");
        int num4=sc.nextInt();
        System.out.println("Introduzca el quinto número:");
        int num5=sc.nextInt();
        sc.close();
        if (num1>num2&&num1>num3&&num1>num4&&num1>num5){
            System.out.println("El primer número introducido, el "+num1+" , es el mayor.");
        } else if (num2>num1&&num2>num3&&num2>num4&&num2>num5) {
            System.out.println("El segundo número introducido, el "+num2+" , es el mayor.");
        } else if (num3>num1&&num3>num2&&num3>num4&&num3>num5) {
            System.out.println("El tercer número introducido, el "+num3+" , es el mayor.");
        } else if (num4>num1&&num4>num2&&num4>num3&&num4>num5) {
            System.out.println("El cuarto número introducido, el "+num4+" , es el mayor.");
        }else{
            System.out.println("El quinto número introducido, el "+num5+" , es el mayor.");
        }
    }
}

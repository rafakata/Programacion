import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        String nombre;
        int edad;
        Scanner sc=new Scanner (System.in);
        System.out.println("Hola Mundo");
        System.out.println("Escribe tu nombre");
        nombre= sc.nextLine();
        System.out.print ("¿Cuál es tu edad?");
        edad= sc.nextInt();
        System.out.println("Hola "+ nombre + " Bienvenido. Sé que tienes " + edad + " años");
        sc.close();
    }
}

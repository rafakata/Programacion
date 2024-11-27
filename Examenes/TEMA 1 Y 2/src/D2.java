import java.util.Scanner;
/*Escribe un programa en Java que presente un menú al usuario con las
siguientes opciones:
1. Calcular el cuadrado de un número.
2. Calcular el cubo de un número.
3. Salir.*/
public class D2 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("¿Qué desea hacer?");
            System.out.println("Para calcular el área de un cuadrado, pulse 1.");
            System.out.println("Para calcular el cubo de un número, pulse 2.");
            System.out.println("Para salir del programa, pulse 3");
            opcion= sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Introduzca un número:");
                    double num = sc.nextDouble();
                    double area = num * num;
                    System.out.println("El área del cuadrado introducido es de: " + area);
                    System.out.println("************************************************");
                }
                case 2 -> {
                    System.out.println("Introduzca un número:");
                    double num = sc.nextDouble();
                    double cubo = Math.pow(num, 3);
                    System.out.println("Su numero elevado a 3 es: " + cubo);
                    System.out.println("************************************************");
                }
                case 3-> System.out.println("Gracias por venir.");
            }
        } while (opcion!=3);
    }
}


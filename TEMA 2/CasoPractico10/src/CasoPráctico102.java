import java.util.Scanner;

public class CasoPráctico102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio;
        double preciototal;
        double kilo;
        int tamaño;
        String tipo;
        do {
            System.out.println("Introduzca el precio/kg:");
            precio = sc.nextDouble();
        } while (precio < 1);
        do {
            System.out.println("Introduzca los kilos");
            kilo = sc.nextDouble();
        } while (kilo < 1);
        do {
            System.out.println("Introduzca el tamaño (1 o 2):");
            tamaño = sc.nextInt();
        } while (tamaño != 1 && tamaño != 2);
        do {
            System.out.println("¿De qué tipo lo quiere?¿A o B?");
            tipo = sc.next();
        } while (!tipo.equals("A") && !tipo.equals("B"));
        sc.close();
        if (tipo.equals("A")) {
            if (tamaño == 1) {
                precio += 0.20;
                preciototal = precio * kilo;
            } else {
                precio += 0.30;
                preciototal = precio * kilo;
            }
        } else {
            if (tamaño == 1) {
                precio -= 0.30;
                preciototal = precio * kilo;
            } else {
                precio -= 0.50;
                preciototal = precio * kilo;
            }
        }
        System.out.printf("El precio a pagar por " + kilo + "KG, siendo de tamaño " + tamaño + " y de tipo " + tipo + " es de: %.2f€",preciototal);

    }
}

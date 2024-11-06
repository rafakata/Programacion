import java.util.Scanner;
//Este ejercicio el profesor lo hace con un boolean. Revísalo.
public class CasoPráctico82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total;
        int costo;
        System.out.println("¿De qué tipo quiere la hamburguesa?¿Simple,doble o triple");
        String tipo = sc.nextLine();
        System.out.println("¿Cuántas hamburguesas desea?");
        //El integer lo que hace es leerlo como nextLine, pero cuando es número lo pasa a un int.
        int cantidad = Integer.parseInt(sc.nextLine());
        System.out.println("¿Cómo desea pagarlo?¿Efectivo o tarjeta?");
        String pago = sc.nextLine();
        sc.close();
        switch (tipo.toLowerCase()) {
            case "simple" -> {
                costo = 5;
                total = cantidad * costo;
                if (pago.equalsIgnoreCase("tarjeta")) {
                    total *= 1.05;
                }
                System.out.println("El precio total por " + cantidad + " hamburguesas del tipo " + tipo + " es de:" + total + "€");
            }
            case "doble" -> {
                costo = 8;
                total = cantidad * costo;
                if (pago.equalsIgnoreCase("tarjeta")) {
                    total *= 1.05;
                }
                System.out.println("El precio total por " + cantidad + " hamburguesas del tipo " + tipo + " es de:" + total + "€");
            }
            case "triple" -> {
                costo = 12;
                total = cantidad * costo;
                if (pago.equalsIgnoreCase("tarjeta")) {
                    total *= 1.05;
                }
                System.out.println("El precio total por " + cantidad + " hamburguesas del tipo " + tipo + " es de:" + total + "€");
            }
        }
    }
}
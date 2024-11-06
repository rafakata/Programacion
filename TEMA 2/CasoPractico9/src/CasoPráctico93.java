/*
import java.util.Scanner;
//VAS BIEN, PERO TIENES QUE REVISAR LO DE SI O NO
public class CasoPráctico93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String articulo;
        String lista = "";
        String respuesta;
        double precio;
        double preciofinal=0;
        double descuento;
        do {
            System.out.println("Introduzca un artículo: ");
            articulo = sc.next();
            lista += articulo;
            System.out.println("¿Cuánto cuesta el producto?");
            precio = sc.nextDouble();
            if (precio>=200) {
              precio*=0.85;
            } else if (precio>=100) {
                precio*=0.88;
            }else{
                precio*=0.90;
            }
            preciofinal+=precio;
             System.out.println("El precio con descuento es: "+precio);
            do {
                System.out.println("¿Desea introducir más artículos?¿Sí o no?");
                respuesta = sc.next();
            }while ((!respuesta.equalsIgnoreCase("si") && (!respuesta.equalsIgnoreCase("no"));
        }while (respuesta!="no");
    sc.close();
    }
}
*/
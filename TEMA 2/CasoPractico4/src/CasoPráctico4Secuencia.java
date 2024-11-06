import java.util.Scanner;

public class CasoPráctico4Secuencia {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int numero;
        int mayor=-1;
        do {
            System.out.println("Escribe un número: ");
            numero= sc.nextInt();
            if (numero < 0) {
                System.out.println("No puede ser negativo.");
            } else if (numero>mayor) {
                mayor=numero;
            }
        }while (numero!=0);
        sc.close();
        System.out.println("El mayor es: "+mayor);

}
}

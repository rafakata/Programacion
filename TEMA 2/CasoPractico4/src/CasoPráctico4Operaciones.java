import java.util.Scanner;

public class CasoPráctico4Operaciones {
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca el primer número: ");
        int x=sc.nextInt();
        System.out.println("Introduzca el segundo número: ");
        int y=sc.nextInt();
        sc.close();
        if (x==y){
            int multiplicacion= x*y;
            System.out.println("Al ser los dos números iguales, los multiplicamos, y el resultado es: "+multiplicacion);
        } else if (x>y) {
            int resta=x-y;
            System.out.println("Al ser el primer número mayor que el segundo, los restamos. El resultado sería: "+resta);
        }else{
            int suma=x+y;
            System.out.println("Al ser mayor el segundo que el primero, los sumamos. El resultado da: "+suma);
        }
    }
}

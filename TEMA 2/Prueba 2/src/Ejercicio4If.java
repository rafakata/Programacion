import java.util.Scanner;
public class Ejercicio4If {
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca su nota: ");
        int nota = sc.nextInt();
        sc.close();
    if ((nota>=0) && (nota<4)){
        System.out.println("Insuficiente.");
    } else if ((nota>=4)&&(nota<6)){
        System.out.println("Regular.");
    } else if (nota==6){
        System.out.println("Bien.");
    } else if ((nota>=7)&&(nota<9)){
        System.out.println("Notable.");
        //Con este else solo, cualquier número que no hayamos puesto es sobresaliente. Habría que especificar que es 9 y 10
    } else {
        System.out.println("Sobresaliente.");
    }
    }
}

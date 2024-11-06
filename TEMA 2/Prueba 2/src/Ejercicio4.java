import java.util.Scanner;
public class Ejercicio4 {
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca su nota: ");
        int nota = sc.nextInt();
        sc.close();
        switch (nota){
            case 0,1,2,3:
                System.out.println("Insuficiente.");
                break;
            case 4,5:
                System.out.println("Regular.");
                break;
            case 6:
                System.out.println("Bien.");
                break;
            case 7,8:
                System.out.println("Notable.");
                break;
            case 9,10:
                System.out.println("Sobresaliente.");
                break;
            default:
                System.out.println("Nota no válida.");
        }
    }
}

import java.util.Scanner;

public class CasoPráctico52 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Indique un día de la semana: ");
        String dia=sc.nextLine();
        sc.close();
        switch (dia.toLowerCase()){
           case "lunes","martes","miercoles","miércoles","jueves","viernes":
               System.out.println("Es un día laborable");
               break;
            case "sabado","sábado","domingo":
                System.out.println("No es un día laborable: ");
                break;
            default:
                System.out.println("Día no válido.");
                break;
            }
        }
    }


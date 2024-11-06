import java.util.Scanner;

public class CasoPráctico92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas;
        String turno;
        String dia;
        double pago;
        do {
            System.out.println("Introduzca el número de horas trabajadas:");
            horas = sc.nextInt();
        } while (horas <= 0 || horas >= 24);
        do {
            System.out.println("Introduzca el turno (diurno o nocturno): ");
            turno = sc.next();
        } while (!turno.equalsIgnoreCase("diurno") && !turno.equalsIgnoreCase("nocturno"));
        do {
            System.out.println("¿Qué tipo de día era?¿festivo o laborable?");
            dia = sc.next();
        } while (!dia.equalsIgnoreCase("festivo") && !dia.equalsIgnoreCase("laborable"));
        if (turno.equalsIgnoreCase("diurno")) {
            pago = horas * 10;
            if (dia.equalsIgnoreCase("festivo")) {
                pago *= 1.10;
            }
        } else {
            pago = horas * 13.5;
            if (dia.equalsIgnoreCase("festivo")) {
                pago *= 1.15;
            }
        }
        System.out.println("El pago por haber trabajado " + horas + " horas en un turno " + turno + " y en un día " + dia + " es de " + pago + "€");
    }
}

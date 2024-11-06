import java.util.Scanner;

public class CasoPráctico1103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tiempo;
        int horas;
        int restodivisionhora;
        int minutos;
        int restodivisionminuto;
        int segundos;
        int restodicisionsegundos;
        do {
            System.out.println("Introduzca el número de segundos:");
            tiempo = sc.nextInt();
        } while (tiempo <= 0);
        sc.close();
        horas = tiempo / 3600;
        restodivisionhora = tiempo % 3600;
        minutos = restodivisionhora / 60;
        restodivisionminuto = restodivisionhora % 60;
        segundos = restodivisionminuto % 60;
        System.out.println("Equivale a " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");

    }
}

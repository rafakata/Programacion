import java.util.Scanner;

public class CasoPrácticoMedia {
public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Introduzca el número de alumnos que hay: ");
    int alumnos= sc.nextInt();
    double notas;
    double sumanotas=0;
    double media;
    for (int i=0;i<alumnos;i++){
        System.out.println("Introduzca la nota del alumno número "+(i+1)+" :");
        notas= sc.nextDouble();
        sumanotas=sumanotas+notas;
    sc.close();
    media=sumanotas/alumnos;
    System.out.println("La nota media de los "+alumnos+" alumnos es: "+media);
    }
}
}


import java.util.Scanner;

public class CasoPráctico73 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el numero de alumnos: ");
        int alumnos=sc.nextInt();
        int total=0;
        sc.close();
        if (alumnos>=100){
            total=alumnos*65;
            System.out.println("Cada alumno debe pagar 65€. El total a pagar es: "+total+"€.");
        } else if (alumnos>=50){
            total=alumnos*70;
            System.out.println("Cada alumno debe pagar 70€. El total a pagar es: "+total+"€");
        } else if (alumnos>=30){
            total=alumnos*95;
            System.out.println("Cada alumno debe pagar 95€. El total a pagar es: "+total+"€");
        }else{
            total=3000/alumnos;
            System.out.println("Cada alumno debe pagar "+total+"€. EL total a pagar es: 3000€");
        }
    }
}

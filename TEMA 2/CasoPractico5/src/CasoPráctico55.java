import java.util.Scanner;

public class CasoPráctico55 {
    public static void  main (String[]args){
        Scanner sc=new Scanner(System.in);
        int alumnos;
        int alumnas;
        int pniños;
        int pniñas;
        System.out.println("Introduzca el número de niños: ");
        alumnos= sc.nextInt();
        System.out.println("Introduzca el núemro de niñas: ");
        alumnas= sc.nextInt();
        sc.close();
        int total=alumnos+alumnas;
        pniños=(alumnos*100)/total;
        pniñas=(alumnas*100)/total;
        System.out.println("Hay un total de "+total+" alumnos. Los niños representan un "+pniños+" %. Y las niñas representan un "+pniñas+" %.");
    }
}

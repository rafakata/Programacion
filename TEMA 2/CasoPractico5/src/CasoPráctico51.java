import java.util.Scanner;

public class CasoPráctico51 {
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        int numero=0;
        int pares=0;
        int impares=0;
        int suma=0;
        int sumaImpares=0;
        double media=0;
        for (int i=1;i<=10;i++){
            System.out.println("Introduzca un número entero: ");
            numero= sc.nextInt();
            if (numero%2==0){
                pares++;
                suma+=numero;
            }else{
                impares++;
                sumaImpares+=numero;
            }
        }
        media=sumaImpares/impares;
        sc.close();
        System.out.println("La suma de todos los pares son: "+suma);
        System.out.println("La media de los impares son: "+media);
    }
}

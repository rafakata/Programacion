import java.util.Scanner;

public class CasoPáctico4números {
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        int numero = 0;
        int pares=0;
        int impares=0;
        int positivos=0;
        int negativos=0;
        for (int i=0;i<10;i++){
        System.out.println("Ingresa el "+(i+1)+" número");
        numero= sc.nextInt();
            if (numero%2==0){
                pares++;
            }else{
                impares++;
            }
            if (numero>0){
                positivos++;
            }else {
                negativos++;
            }
    }
    System.out.println("Hay "+pares+" números pares.");
    System.out.println("Hay "+impares+" números impares.");
    System.out.println("Hay "+positivos+" números positivos.");
    System.out.println("Hay "+negativos+" números negativos.");
    sc.close();
}
}

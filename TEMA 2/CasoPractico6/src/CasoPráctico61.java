import java.util.Scanner;
//Hay que terminar de corregirlo
public class CasoPráctico61 {
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        int cantidad;
        do {
            System.out.println("Introduzca cuántos números va a introducir (mayor que 0): ");
            cantidad= sc.nextInt();
        }while(cantidad<=0);
        int num;
        int pares=0;
        int sumapares=0;
        System.out.println("Introduce el número 1:");
        num= sc.nextInt();
        int mayor=num;
        int menor=num;
        for (int i=2;i<=cantidad;i++){
            if (num>mayor){
                mayor=num;
            if (num<menor){
                menor=num;
            if (num%2==0&&num!=0){
                sumapares+=num;
                pares++;
            }
            }
            }
        }
        System.out.println("El mayor es "+mayor);
        System.out.println("El menor es "+menor);
        if (pares>0){
        System.out.println("La media de los pares es: "+(sumapares*1.0/pares));
    }else {
            System.out.println("No hay ningún numero par");
        }
}
}


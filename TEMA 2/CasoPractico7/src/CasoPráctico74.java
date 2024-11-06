import java.util.Scanner;

public class CasoPráctico74 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int num=0;
        int contador500=0;
        int contador200=0;
        int contador100=0;
        int contador50=0;
        int contador20=0;
        int contador10=0;
        int contador5=0;
        int contador2=0;
        int contador1=0;
        do {
            System.out.println("Introduzca una cantidad: ");
            num=sc.nextInt();
        }while (num<1);
        while(num>=500){
            contador500++;
            num-=500;
        }
        while(num>=200){
            contador200++;
            num-=200;
        }
        while(num>=100){
            contador100++;
            num-=100;
        }
        while (num>=50){
            contador50++;
            num-=50;
        }
        while(num>=20){
            contador20++;
            num-=20;
        }
        while(num>=10){
            contador10++;
            num-=10;
        }
        while(num>=5){
            contador5++;
            num-=5;
        }
        while(num>=2){
            contador2++;
            num-=2;
        }
        while (num>=1){
            contador1++;
            num-=1;
        }
        System.out.println("Billetes de 500:"+contador500);
        System.out.println("Billetes de 200: "+contador200);
        System.out.println("Billetes de 100: "+contador100);
        System.out.println("Billetes de 50: "+contador50);
        System.out.println("Billetes de 20: "+contador20);
        System.out.println("Billetes de 10: "+contador10);
        System.out.println("Billetes de 5: "+contador5);
        System.out.println("Monedas de 2: "+contador2);
        System.out.println("Monedas de 1: "+contador1);
}
}

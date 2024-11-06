import java.util.Scanner;

public class CasoPráctico62 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int numero;
        do {
            System.out.print("Introduzca un número entre el 1 y el 1000: ");
            numero= sc.nextInt();
        }while (numero<1||numero>1000);
        if (numero==1000){
            System.out.print("M");
            numero-=1000;
        }
        if (numero>=900&&numero<1000){
            System.out.print("CM");
            numero-=900;
        }
        if (numero>=500&&numero<900){
            System.out.print("D");
            numero-=500;
        }
        if (numero >= 400 && numero < 500) {
            System.out.print("CD");
            numero-=400;
        }
        if (numero>=100&&numero<400){
            int veces=numero/100;
            for(int i=1;i<=veces;i++){
                System.out.print("C");
                numero-=100;
            }
        }
        if (numero>=90&&numero<100){
            System.out.print("XC");
            numero-=90;
        }
        if (numero>=50&&numero<90){
            System.out.print("L");
            numero-=50;
        }
        if (numero >= 40 && numero < 50) {
            System.out.print("XL");
            numero-=40;
        }
        if (numero>=10&&numero<40){
            int veces=numero/10;
            for(int i=1;i<=veces;i++){
                System.out.print("X");
                numero-=10;
            }
        switch (numero){
                case 9->System.out.print("IX");
                case 8->System.out.print("VIII");
                case 7->System.out.print("VII");
                case 6->System.out.print("VI");
                case 5->System.out.print("V");
                case 4->System.out.print("IV");
                case 3->System.out.print("III");
                case 2->System.out.print("II");
                case 1->System.out.print("I");

        }
}  sc.close();
    }

}
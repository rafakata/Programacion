import java.util.Scanner;
//Math.pow(A,B)
public class CasoPráctico4AyB {
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        double A=0;
        double B=0;
        double contador=0;
        double suma=0;
        double potencia=0;
        System.out.println("Introduzca un número: ");
        A= sc.nextDouble();
        System.out.println("Introduzca el segundo número: ");
        B= sc.nextDouble();
        sc.close();
        if (A>B){
            for (int i=100;i<=1000;i++){
                if ((i*(i+1)/5)%5==0){
                    contador++;
                    suma=suma+i;
                }
            }System.out.println("Hay un total de "+contador+" números que cumplan ese requisito.");
             System.out.println("La suma de todos esos números da como resultado: "+suma);
        } else if (A==B){
            for (int i=1;i<=45;i=i+4){
                suma=suma+(i/A);
            } System.out.println(suma);
        }else {
            for (int i=3,x=2;i<=30&&x<=20;i=i+3,x=x+2){
                potencia=((B-A)*(Math.pow(x,i)));
                }
            System.out.println(potencia);
            }

        }
        }



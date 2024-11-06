import java.util.Scanner;
//FALTA POR CORREGIR
public class CasoPráctico75 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int numero= sc.nextInt();
        sc.close();
        int copia=numero;
        String binario="";
        String  octal="";
        String hexadecimal="";
        while (numero>0){
            binario=numero%2+binario;
            numero/=2;
        }
        numero=copia;
        while (numero>0){
            octal=numero%8+octal;
            numero/=8;
        }
        numero=copia;
        while (numero>0){
            hexadecimal=numero%16+hexadecimal;
            numero/=16;
            switch ((hexadecimal)){
                case 0,1,2,3,4,5,6,7,8,9->hexadecimal+=numero;
                case 10->"A"+hexadecimal;


            }
        System.out.println(binario);
        System.out.println(octal);
    }
}

import java.util.Scanner;

public class CasoPráctico85 {
     public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         int num;
         double costo;
         double costototal;
         double costefinal;
         String clase;
         int talla;
         do {
             System.out.println("Introduzca el número de pantalones que quiere:");
             num= sc.nextInt();
         }while (num<=0);
         do {
             System.out.println("Introduzca cuánto cuesta la tela:");
             costo= sc.nextDouble();
         } while (costo<=0);
         do {
             System.out.println("Introduzca de qué modelo quiere los pantalones ¿A o B?");
             clase= sc.next();
         }while (!clase.equals("A")&&!clase.equals("B"));
         do {
             System.out.println("Introduzca la talla que desea:¿30,32 o 36?");
             talla=sc.nextInt();
         }while (talla!=30&&talla!=32&&talla!=36);
         if (clase.equals("A")){
             costo*=1.80;
             costototal=num*costo;
             costefinal=costototal*1.30;
             if (talla==32||talla==36){
                 costo*=1.04;
                 costototal=num*costo;
                 costefinal=costototal*1.30;
             }
         }else {
             costo*=1.95;
             costototal=num*costo;
             costefinal=costototal*1.30;
             if (talla==32||talla==36){
                 costo*=1.04;
                 costototal=num*costo;
                 costefinal=costototal*1.30;
             }
         }
         System.out.println("El costo de un pantalón clase "+clase+" y de talla "+talla+" es de: "+costo+"€. El precio de "+num+" pantalones es de: "+costototal+"€. Si añadimos el 30% de ganancias, da como resultado un total de: "+costefinal+"€.");
     }
}

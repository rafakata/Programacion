public class CasoPráctico4Fórmula {
    public static void main (String[]args){
        int suma=0;
        int contador=0;
        for (int i= 20;i<=3500; i++){
            if ((i*(i+1)/2)%7==0){
                contador++;
                suma=suma+i;
            }
        }
        System.out.println("Hay un total de "+contador+" números que cumplan ese requisito.");
        System.out.println("La suma de todos esos números da como resultado: "+suma);
    }
}

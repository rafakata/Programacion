public class CasoPrácticoSuma {
    public static void main (String[]args){
        int suma= 0;
        for (int i=50;i>=20;i=i-2){
            System.out.println(i);
            suma+=i;
        }
        System.out.println("La suma de todos los números es: "+suma);
    }
}

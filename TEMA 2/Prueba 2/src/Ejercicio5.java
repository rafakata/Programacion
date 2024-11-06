public class Ejercicio5 {
    public static void main (String[]args){
        int contador=0;
        for (int numero=1; numero<=100;numero++){
            if (((numero % 2) == 0) || ((numero % 3) == 0)) {
                System.out.println(numero);
                contador++;
            }
        }
        System.out.println("Hay "+contador+" múltiplos de 2 o 3 entre el número 1 y el 100.");
    }
}

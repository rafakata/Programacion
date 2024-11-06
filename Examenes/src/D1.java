/*Escribe un programa en Java que calcule la suma de todos los números
enteros desde 1 hasta 100 e imprima el resultado. Resultado: 5050  */
public class D1 {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i;
        }
        System.out.println("La suma de todos los números enteros desde 1 hasta 100 es "+suma);
    }
}

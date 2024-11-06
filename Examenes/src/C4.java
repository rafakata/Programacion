
/* Escribe un programa que encuentre todos los pares de números primos
gemelos menores a 100. Dos números primos son gemelos si la diferencia entre ellos
es 2 (por ejemplo, 3 y 5).  */
public class C4 {
    public static void main(String[] args) {
        boolean primo = true;
        int anteriorPrimo = 3;
        for (int i = 5; i < 100; i += 2) {
            primo = true;
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    primo = false;
                }
            }
            if (primo) {
                if (i - anteriorPrimo == 2) {
                    System.out.println(""+anteriorPrimo+"-"+i);
                }
                anteriorPrimo=i;
            }

        }
    }
}



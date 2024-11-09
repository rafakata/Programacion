import java.util.Scanner;

public class EjLibro {
    public static void main (String[]args){
        Libro Libro1 = new Libro("Harry Potter", "Juan de Dios", 560, 0);
        Scanner sc=new Scanner(System.in);
        int pagina;
        Libro1.mostrarInfo();
        System.out.println("¿A qué página quieres llegar?");
        pagina= sc.nextInt();
        for (int i=0;i<pagina;i++){
            Libro1.leerPagina();
        }
        Libro1.mostrarInfo();
        Libro1.retrocederPagina();
        Libro1.mostrarInfo();
    }
}
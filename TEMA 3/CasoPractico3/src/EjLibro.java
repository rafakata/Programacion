
public class EjLibro {
    public static void main (String[]args){
        Libro Libro1 = new Libro("Harry Potter", "Juan de Dios", 560, 0);
        Libro1.leerPagina();
        Libro1.mostrarInfo();
        Libro1.retrocederPagina();
        Libro1.mostrarInfo();
    }
}

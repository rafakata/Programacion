public class Prueba2 {
    public static void main(String[] args) {
        int x=0;
        int y=0;
        y=++x;
        System.out.println("Y vale "+y+ ", X vale "+x);
        y=x++;
        System.out.println("Y vale "+y+", X vale "+x);
        y=--x;
        System.out.println("Y vale "+y+", X vale "+x);
        y=x--;
        System.out.println("Y vale "+y+", X vale "+x);
    }
}
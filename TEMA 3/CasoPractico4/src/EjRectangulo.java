import java.util.Scanner;

public class EjRectangulo {
    public static void main (String[]args){
        double ancho;
        double altura;
        Scanner sc=new Scanner(System.in);
        Rectangulo r1=new Rectangulo(10,20);
        Rectangulo r2=new Rectangulo(6,8);
        Rectangulo r3=new Rectangulo();
        System.out.println("***************************************************************");
        r1.calcularArea();
        System.out.println("El perímetro del primer rectángulo es: "+r1.calcularPerimetro());
        System.out.println("***************************************************************");
        r2.calcularArea();
        System.out.println("El perímetro del segundo rectángulo es: "+r2.calcularPerimetro());
        System.out.println("***************************************************************");
        System.out.println("Introduzca la altura del tercer rectángulo: ");
        altura=sc.nextDouble();
        r3.setAlto(altura);
        System.out.println("Introduzca el ancho: ");
        ancho= sc.nextDouble();
        r3.setAncho(ancho);
        System.out.println("Info del tercer rectángulo: ");
        r3.calcularArea();
        System.out.println("El perímetro del segundo rectángulo es: "+r3.calcularPerimetro());
        sc.close();

    }
}

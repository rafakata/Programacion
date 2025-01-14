import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre:");
        String nombre = sc.nextLine();
        System.out.println("Edad:");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.println("Sexo:");
        char sexo = sc.nextLine().charAt(0);
        System.out.println("Peso:");
        double peso = Double.parseDouble(sc.nextLine());
        System.out.println("Altura:");
        double altura = Double.parseDouble(sc.nextLine());
        Persona p1 = new Persona(nombre, edad, sexo, peso, altura);
        System.out.println("Nombre:");
        nombre = sc.nextLine();
        System.out.println("Edad:");
        edad = Integer.parseInt(sc.nextLine());
        System.out.println("Sexo:");
        sexo = sc.nextLine().charAt(0);
        System.out.println("Peso:");
        peso = Double.parseDouble(sc.nextLine());
        System.out.println("Altura:");
        altura = Double.parseDouble(sc.nextLine());
        Persona p2 = new Persona(nombre, edad, sexo);
        System.out.println("Nombre:");
        nombre = sc.nextLine();
        System.out.println("Edad:");
        edad = Integer.parseInt(sc.nextLine());
        System.out.println("Sexo:");
        sexo = sc.nextLine().charAt(0);
        sc.close();
        p2.setPeso(peso);
        p2.setAltura(altura);
        Persona p3 = new Persona();
        p3.setNombre(nombre);
        p3.setEdad(edad);
        p3.setPeso(peso);
        p3.setAltura(altura);
        p3.setSexo(sexo);

        mensajePeso(p1);
        mensajePeso(p2);
        mensajePeso(p3);

        System.out.println(p1.getNombre()+"es"+(p1.esMayorDeEdad()?"mayor de edad":"menor de edad"));
        System.out.println(p2.getNombre()+"es"+(p2.esMayorDeEdad()?"mayor de edad":"menor de edad"));
        System.out.println(p3.getNombre()+"es"+(p3.esMayorDeEdad()?"mayor de edad":"menor de edad"));

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);


    }

    private static void mensajePeso(Persona p) {
        if (p.calcularIMC() < 0) {
            System.out.println(p.getNombre() + " está por debajo de su peso.");
        } else if (p.calcularIMC() == 0) {
            System.out.println(p.getNombre() + "Peso normal.");
        } else {
            System.out.println(p.getNombre() + "Está sobre de peso.");
        }
    }

}


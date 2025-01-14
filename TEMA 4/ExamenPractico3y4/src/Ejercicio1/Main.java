package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo(60);
        Coche coche = new Coche(120, "Sedán");
        Bicicleta bicicleta = new Bicicleta(15, "Montaña");
        vehiculo.mover();
        coche.mover();
        bicicleta.mover();
        System.out.println();
        vehiculo.mover(50);
        coche.mover(120);
        bicicleta.mover(15);
        System.out.println();
        vehiculo.mover(100, "asfaltado");
        coche.mover(200, "carretera");
        bicicleta.mover(10, "terreno montañoso");
    }
}

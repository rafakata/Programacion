package CasoPractico2.practica02ud06.vehiculo;

public class Moto extends Vehiculo{
    private int cilindrada;

    public Moto(String matricula, int numeroRuedas, String marca, double kilometraje, String color, int cilindrada) {
        super(matricula, numeroRuedas, marca, kilometraje, color);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}

package CasoPractico2.practica02ud06.vehiculo;

public class Coche extends Vehiculo {
    private int numeroPuertas;
    private String extras;

    public Coche(String matricula, int numeroRuedas, String marca, double kilometraje, String color, int numeroPuertas, String extras) {
        super(matricula, numeroRuedas, marca, kilometraje, color);
        this.numeroPuertas = numeroPuertas;
        this.extras = extras;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }
}

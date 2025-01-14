package CasoPractico2.practica02ud06.vehiculo;

public class Vehiculo {
    private String matricula;
    private int numeroRuedas;
    private String marca;
    private double kilometraje;
    private Color color;

    public Vehiculo(String matricula, int numeroRuedas, String marca, double kilometraje, String color) {
        this.matricula = matricula;
        this.numeroRuedas = numeroRuedas;
        this.marca = marca;
        this.kilometraje = kilometraje;
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", numeroRuedas=" + numeroRuedas +
                ", marca='" + marca + '\'' +
                ", kilometraje=" + kilometraje +
                ", Color='" + Color + '\'' +
                '}';
    }
}

package Ejercicio1;

public class Coche extends Vehiculo{
  private String modelo;

    public Coche(int velocidad, String modelo) {
        super(velocidad);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void mover() {
        System.out.println("El coche está en marcha.");
    }

    @Override
    public void mover(int distancia) {
        System.out.println("El coche ha recorrido "+distancia+" kilómetros.");
    }

    @Override
    public void mover(int distancia, String terreno) {
        System.out.println("El coche ha recorrido "+distancia+" kilómetros en un terreno "+terreno+".");
    }

    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' +
                '}';
    }
}

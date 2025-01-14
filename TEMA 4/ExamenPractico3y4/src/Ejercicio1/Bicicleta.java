package Ejercicio1;

public class Bicicleta extends Vehiculo{
    private String tipo;

    public Bicicleta(int velocidad, String tipo) {
        super(velocidad);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void mover() {
        System.out.println("La bicicleta está en movimiento.");
    }

    @Override
    public void mover(int distancia) {
        System.out.println("La bicicleta ha recorrido "+distancia+" kilómetros.");
    }

    @Override
    public void mover(int distancia, String terreno) {
        System.out.println("La bicicleta ha recorrido "+distancia+" kilómetros en un terreno "+terreno+".");
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}

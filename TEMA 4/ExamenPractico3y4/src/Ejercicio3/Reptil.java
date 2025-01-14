package Ejercicio3;

public class Reptil extends Animal{
    private boolean esVenenoso;

    public Reptil(String nombre, int edad, boolean esVenenoso) {
        super(nombre, edad);
        this.esVenenoso = esVenenoso;
    }

    public boolean isEsVenenoso() {
        return esVenenoso;
    }

    public void setEsVenenoso(boolean esVenenoso) {
        this.esVenenoso = esVenenoso;
    }
    public void mostrarPeligrosidad(){
        System.out.println("El reptil "+getNombre()+" es venenoso");
    }

    @Override
    public void emitirSonido() {
        System.out.println("El reptil "+getNombre()+" hace un ruido que suena como assasasa");
    }

    @Override
    public String toString() {
        return "Reptil{" +
                "esVenenoso=" + esVenenoso +
                '}';
    }
}

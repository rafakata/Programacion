package Ejercicio3;

public class Ave extends Animal{
    private boolean puedeVolar;

    public Ave(String nombre, int edad, boolean puedeVolar) {
        super(nombre, edad);
        this.puedeVolar = puedeVolar;
    }

    public boolean isPuedeVolar() {
        return puedeVolar;
    }

    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }
    public void mostrarHabilidadVuelo(){
        System.out.println("El ave "+getNombre()+" puede volar");
    }

    @Override
    public void emitirSonido() {
        System.out.println("El ave "+getNombre()+" canta.");
    }

    @Override
    public String toString() {
        return "Ave{" +
                "puedeVolar=" + puedeVolar +
                '}';
    }
}

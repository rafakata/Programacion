package Ejercicio3;

public class Mamifero extends Animal{
    String tipoDeAlimentacion;

    public Mamifero(String nombre, int edad, String tipoDeAlimentacion) {
        super(nombre, edad);
        this.tipoDeAlimentacion = tipoDeAlimentacion;
    }

    public String getTipoDeAlimentacion() {
        return tipoDeAlimentacion;
    }

    public void setTipoDeAlimentacion(String tipoDeAlimentacion) {
        this.tipoDeAlimentacion = tipoDeAlimentacion;
    }

    @Override
    public void emitirSonido() {
        System.out.println("El "+getNombre()+" ruge.");
    }

    public void mostrarAlimentacion(){
        System.out.println("El mamífero "+getNombre()+" es "+tipoDeAlimentacion+".");
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "tipoDeAlimentacion='" + tipoDeAlimentacion + '\'' +
                '}';
    }
}

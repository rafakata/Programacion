package Ejercicio3;

public class Zoologico {
    public static void main(String[] args) {
        Mamifero leon = new Mamifero("León", 5, "carnívoro");
        Ave loro = new Ave("Loro", 2, true);
        Reptil serpiente = new Reptil("Serpiente", 3, true);
        leon.mostrarAlimentacion();
        leon.emitirSonido();
        leon.alimentar();
        loro.mostrarHabilidadVuelo();
        loro.emitirSonido();
        loro.alimentar();
        serpiente.mostrarPeligrosidad();
        serpiente.emitirSonido();
        serpiente.alimentar();
    }
}

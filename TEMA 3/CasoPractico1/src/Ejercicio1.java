public class Ejercicio1 {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", 23, "masculino");
        Persona p2 = new Persona("Josemi", 24, "femenino");
        p1.monstrarInfo();
        p2.monstrarInfo();
        p1.cumplirAnios();
        p2.cumplirAnios();
        p1.monstrarInfo();
        p2.monstrarInfo();

    }
}

public class Persona {
    private String nombre;
    private String apellido;
    private int telefono;

    public Persona(String nombre, String apellido, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        if (telefono<100000000||telefono>999999999){
            System.out.println("Número de teléfono no válido.");
        }else{
            this.telefono = telefono;
        }
    }
    public Persona(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}

public class Producto {
    private String nombreproducto;
    private String fechacaducidad;
    private String nlote;

    public Producto(String nombreproducto, String fechacaducidad, String nlote) {
        nombreproducto = nombreproducto;
        this.fechacaducidad = fechacaducidad;
        this.nlote = nlote;
    }

    public String getnombreproducto() {
        return nombreproducto;
    }

    public void setnombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public String getFechacaducidad() {
        return fechacaducidad;
    }

    public void setFechacaducidad(String fechacaducidad) {
        this.fechacaducidad = fechacaducidad;
    }

    public String getNlote() {
        return nlote;
    }

    public void setNlote(String nlote) {
        this.nlote = nlote;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombreproducto='" + nombreproducto + '\'' +
                ", fechacaducidad='" + fechacaducidad + '\'' +
                ", nlote=" + nlote +
                '}';
    }
}

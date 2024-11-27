public class ProductoFresco extends Producto{
    private String fechaenvasado;
    private String pais;

    public ProductoFresco(String nombreproducto, String fechacaducidad, String nlote, String fechaenvasado, String pais) {
        super(nombreproducto, fechacaducidad, nlote);
        this.fechaenvasado = fechaenvasado;
        this.pais = pais;
    }

    public String getFechaenvasado() {
        return fechaenvasado;
    }

    public void setFechaenvasado(String fechaenvasado) {
        this.fechaenvasado = fechaenvasado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return super.toString()+ "ProductoFresco{" +
                "fechaenvasado='" + fechaenvasado + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}

public class ProductoRefrigerado extends Producto{
    private int codigo;

    public ProductoRefrigerado(String nombreproducto, String fechacaducidad, String nlote, int codigo) {
        super(nombreproducto, fechacaducidad, nlote);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return super.toString()+ "ProductoRefrigerado{" +
                "codigo=" + codigo +
                '}';
    }
}

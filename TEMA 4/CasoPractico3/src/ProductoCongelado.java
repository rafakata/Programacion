public class ProductoCongelado extends Producto {
    private int temperatura;

    public ProductoCongelado(String nombreproducto, String fechacaducidad, String nlote, int temperatura) {
        super(nombreproducto, fechacaducidad, nlote);
        this.temperatura = temperatura;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return super.toString()+ "ProductoCongelado{" +
                "temperatura=" + temperatura +
                '}';
    }
}

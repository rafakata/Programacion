public class Producto {
    private String nombre;
    private double precio;
    private int CantidadEnStock;

    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        CantidadEnStock = cantidadEnStock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadEnStock() {
        return CantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        CantidadEnStock = cantidadEnStock;
    }

    public void venderProducto(int cantidad) {
        CantidadEnStock -= cantidad;
        if (CantidadEnStock <= 0) {
            System.out.println("Nos hemos quedado sin stock");
        } else {
            System.out.println("Se han vendido " + cantidad + " unidades  del producto: " + nombre + " ,a un precio de " + precio + " cada una, siendo el total " + (precio * cantidad) + ". Ahora quedan " + CantidadEnStock);
        }
    }

    public void reabastecer(int cantidad) {
        CantidadEnStock += cantidad;
        System.out.println("Hemos comprado al proveedor " + cantidad + " unidades del producto: " + nombre + ". Ahora mismo tenemos en stock " + CantidadEnStock + " unidades.");
    }
}

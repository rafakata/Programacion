public class EjProducto {
    public static void main (String[]args){
        Producto producto1=new Producto("Balón de fútbol",24.99,30);
        Producto producto2=new Producto("Camiseta Málaga CF",79.95,20);
        Producto producto3=new Producto("Espinilleras",12.50,10);
        producto1.venderProducto(17);
        producto2.venderProducto(4);
        producto3.venderProducto(12);
        producto1.reabastecer(20);
        producto2.reabastecer(8);
        producto3.reabastecer(40);
    }
}

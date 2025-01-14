public class Producto {
    private String nombre;
    private double [] preciosHistoricos;
    private static int totalProductos;

    public Producto(String nombre,double precioInicial, int longitud) {
        this.nombre = nombre;
        preciosHistoricos=new double[longitud];
        preciosHistoricos[0]=precioInicial;
        totalProductos++;
    }

    private void agregarPrecio(double precio){
        int indice=1;
        boolean encontrado=false;
        do{
            if (preciosHistoricos[indice]==0){
                encontrado=true;
                preciosHistoricos[indice]=precio;
            }else {
                indice++;
            }

        }while (!encontrado&&indice<=preciosHistoricos.length);
    }

    public double[] getPreciosHistoricos() {
        return preciosHistoricos;
    }
    public double[]precioActual(){
        int indice=0;
        boolean encontrado= false;
        double resultado=0;
        do{
            if(preciosHistoricos[indice]==0){
                encontrado=true;
                resultado=preciosHistoricos[indice-1];
            }else {
                indice++;
            }
        }while (!encontrado&&indice<preciosHistoricos.length);
    }
}

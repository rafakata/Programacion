public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double X() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double Y() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distancia(Punto p) {
        double distancia;
        distancia = Math.pow((x - p.x), 2) + Math.pow((y - p.y), 2);
        return Math.sqrt(distancia);
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

public class Vector extends Punto {
    public Vector(double x, double y) {
        super(x, y);
    }

    public Vector(Punto o, Punto e) {
        super(e.X()- o.X(), e.Y()- o.Y());
    }
    public Vector (Punto e){
        super(e.X(), e.Y());
    }
    public boolean comunicacionLineal (Vector v){
        
    }

}

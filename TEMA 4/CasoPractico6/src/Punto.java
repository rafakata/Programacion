public class Punto {
  private float x;
  private float y;

  public Punto(float x, float y) {
    this.x = x;
    this.y = y;
  }
  public Punto() {
    x=0;
    y=0;
  }

  public float getX() {
    return x;
  }

  public void setX(float x) {
    this.x = x;
  }

  public float getY() {
    return y;
  }

  public void setY(float y) {
    this.y = y;
  }

  @Override
  public String toString() {
    return "Punto{" +
            "x=" + x +
            ", y=" + y +
            '}';
  }
  public void trasladar (float a,float b){
    x=a;
    y=b;
  }
}

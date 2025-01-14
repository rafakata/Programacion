import java.util.Random;

public class Urna {
    protected int blancas;
    protected int negras;

    public Urna(int blancas, int negras) {
        this.blancas = blancas;
        this.negras = negras;
    }

    public int totalBolas(){
        return blancas + negras;
    }
    public ColorBola bola(){
        Random r= new Random();
        int bola=r.nextInt(totalBolas())+1;
        ColorBola resultado;
        if (bola<=blancas){
            System.out.println("Se extrae una bola blanca");
            resultado=ColorBola.BLANCA;
            blancas--;
        }else{
            System.out.println("Se extrae una bola negra");
            resultado=ColorBola.NEGRA;
            negras--;
        }
        return resultado;
    }
    public void ponerBlanca(){
        blancas++;
    }
    public void ponerNegra(){
        negras++;
    }
}

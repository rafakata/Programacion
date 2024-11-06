public class CasoPráctico1101 {
    public static void main (String[]args){
        int F;
        double C;
        for (F=0;F<=100;F+=5){
            C= (double) ((F - 32) * 5) /9;
            System.out.printf(+F+"ºF-> %.2f ºC\n",C);
        }
    }
}

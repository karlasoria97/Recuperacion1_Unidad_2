package mx.edu.utng.ecuacion1;

/**
 * Created by Karla on 23/01/2017.
 */

public class Ecuacion2 {
    private int x;
    private int y;
    private int resul;
    private static Ecuacion2 ecuacion2;



    public static Ecuacion2 getEcuacion2(){
        if(ecuacion2 == null){
            ecuacion2 = new Ecuacion2();
        }
        return ecuacion2;
    }

    public Ecuacion2(){
        this.x = 0;
        this.y = 0;
        this.resul = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public static void setEcuacion2(Ecuacion2 ecuacion2) {
        Ecuacion2.ecuacion2 = ecuacion2;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setResul(int resul) {
        this.resul = resul;
    }


    public int getResul() {
        int n1 = x;
        int n2 = y;
        //Raiz Cuadrada
        int x =(int) Math.sqrt(n1);
        double y = (int) 2*Math.sqrt(n2);
        //Potencia
        int res = (int)Math.pow(x+y, 2);
        int result = res;

        return result;
    }

}

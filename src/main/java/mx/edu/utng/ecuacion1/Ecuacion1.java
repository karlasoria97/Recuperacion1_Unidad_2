package mx.edu.utng.ecuacion1;

/**
 * Created by Karla on 23/01/2017.
 */

public class Ecuacion1 {
    private int x;
    private int y;
    private int resul;
    private static Ecuacion1 ecuacion1;



    public static Ecuacion1 getEcuacion1(){
        if(ecuacion1 == null){
            ecuacion1 = new Ecuacion1();
        }
        return ecuacion1;
    }

    public Ecuacion1(){
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

    public static void setEcuacion1(Ecuacion1 ecuacion1) {
        Ecuacion1.ecuacion1 = ecuacion1;
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
        double x = Math.sqrt(2*n1);
        double y = Math.sqrt(3*n2);
        //Potencia
        int res1 =(int) Math.pow(x, 2);
        int res2 =(int) Math.pow(-y, 2);
        int res3 = (int)Math.pow(x-y, 2);
        int res4 = (res1+res2+res3);
        int result= res4;
        return result;
    }

}

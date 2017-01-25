package mx.edu.utng.ecuacion1;

/**
 * Created by Karla on 25/01/2017.
 */

public class Ecuacion3 {
    private double t;

    private double resul;
    private static Ecuacion3 ecuacion3;



    public static Ecuacion3 getEcuacion3(){
        if(ecuacion3 == null){
            ecuacion3 = new Ecuacion3();
        }
        return ecuacion3;
    }

    public Ecuacion3(){
        this.t = 0;
        this.resul = 0;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public void setResul(double resul) {
        this.resul = resul;
    }

    public static void setEcuacion3(Ecuacion3 ecuacion3) {
        Ecuacion3.ecuacion3 = ecuacion3;
    }



    public double getResul() {
        double n1 = t;
        double res1 = Math.pow(n1,3);
        double res2 = 2*Math.pow(n1,2);
        double res3 = 3*n1;
        double res4 = 1;
        double res5 = n1 * Math.sqrt(n1);

        double res = (res1+res2-res3+res4)/res5;
        double result = res;

        return result;
    }
}

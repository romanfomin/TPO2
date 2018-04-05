package Functions.Logarithmic;

import Functions.Computable;

public class Ln implements Computable {
    @Override
    public double compute(double x, double accuracy) {
        return getLn(x, accuracy);
    }

    private double getLn(double x, double accuracy) {

        if (accuracy <= 0 || x < 0 || Math.abs(x)==Double.POSITIVE_INFINITY) {
            throw new IllegalArgumentException();
        }
        if(x==0){
            return Double.NEGATIVE_INFINITY;
        }
        if(x>2){
            return getLn(x/2.0,accuracy)+getLn(2.0,accuracy);
        }

        double fraction = accuracy + 1;
        double ln = 0;
        int n = 1;

        while (Math.abs(fraction) >= accuracy/1000) {
            fraction = (Math.pow(-1, n + 1) / n) * Math.pow(x - 1, n);
            ln += fraction;
            n++;
        }

        return ln;
    }

}

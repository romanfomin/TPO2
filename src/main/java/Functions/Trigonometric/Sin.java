package Functions.Trigonometric;

import Functions.Computable;

public class Sin implements Computable {

    @Override
    public double compute(double x, double accuracy) {
        return getSin(x,accuracy);
    }

    private double getSin(double x, double accuracy) {

        if (accuracy <= 0 || Math.abs(x)==Double.POSITIVE_INFINITY) {
            throw new IllegalArgumentException();
        }
        x%=2*Math.PI;
        boolean minus = false;
        if(x<=-Math.PI && x>-Math.PI*2){
            x=x+2*Math.PI;
        }

        if(x>Math.PI && x<=Math.PI*2){
            x = 2*Math.PI - x;
            minus = true;
        }

        if(x<=Math.PI && x>Math.PI/2){
            x=Math.PI - x;
        }
        double result=0;
        double res1=0;
        double up;
        double down;
        for (int i = 0; ; i++) {
            up = Math.pow(-1,i)*Math.pow(x,2*i+1);
            down = getFactorial(2*i+1);
            res1=up/down;
            result+=res1;
            if (Math.abs(res1)<accuracy){
                break;
            }
        }
        if(minus){
            return -result;
        }
        return result;
    }

    private int getFactorial(int N){
        return ((N == 0) ? 1 : N * getFactorial(N - 1));
    }

}

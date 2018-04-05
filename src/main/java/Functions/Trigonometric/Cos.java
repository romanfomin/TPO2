package Functions.Trigonometric;

import Functions.Computable;

public class Cos implements Computable {

    private Sin sin;

    public Cos(Sin sin){
        this.sin = sin;
    }

    @Override
    public double compute(double x, double accuracy) {
        return Math.sqrt(1-Math.pow(sin.compute(x,accuracy),2));
    }
}

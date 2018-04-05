package Functions.Trigonometric;

import Functions.Computable;

public class Cot implements Computable {

    private Sin sin;
    private Cos cos;

    public Cot(Sin sin, Cos cos){
        this.sin = sin;
        this.cos = cos;
    }

    @Override
    public double compute(double x, double accuracy) {
        return (cos.compute(x, accuracy)) / (sin.compute(x, accuracy));
    }
}

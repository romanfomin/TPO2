package Functions.Trigonometric;

import Functions.Computable;

public class Tan implements Computable {

    private Sin sin;
    private Cos cos;

    public Tan(Cos cos, Sin sin){
        this.cos = cos;
        this.sin = sin;
    }

    @Override
    public double compute(double x, double accuracy) {
        return (sin.compute(x, accuracy)) / (cos.compute(x, accuracy));
    }
}

package Functions.Trigonometric;

import Functions.Computable;

public class Sec implements Computable {

    private Cos cos;

    public Sec(Cos cos){
        this.cos = cos;
    }

    @Override
    public double compute(double x, double accuracy) {
        return (1/(cos.compute(x,accuracy)));
    }
}

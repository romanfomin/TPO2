package Functions.Trigonometric;

import Functions.Computable;

public class Csc implements Computable {

    private Sin sin;

    public Csc(Sin sin){
        this.sin = sin;
    }

    @Override
    public double compute(double x, double accuracy) {
        return (1/(sin.compute(x,accuracy)));
    }
}

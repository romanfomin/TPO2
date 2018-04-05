package Functions.Logarithmic;

import Functions.Computable;

public class Log3 implements Computable {

    private Ln ln;

    public Log3(Ln ln){
        this.ln = ln;
    }

    @Override
    public double compute(double x, double accuracy) {
        return (ln.compute(x, accuracy)) / ln.compute(3, accuracy);
    }
}

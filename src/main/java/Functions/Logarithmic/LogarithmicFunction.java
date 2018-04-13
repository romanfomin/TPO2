package Functions.Logarithmic;

import Functions.Computable;

public class LogarithmicFunction implements Computable {

    private Ln ln;
    private Log3 log3;
    private Log5 log5;
    private Log10 log10;

    public LogarithmicFunction(Ln ln,Log3 log3,Log5 log5,Log10 log10){
        this.ln = ln;
        this.log3 = log3;
        this.log5 = log5;
        this.log10 = log10;
    }

    @Override
    public double compute(double x, double accuracy) {
        if(x<=0 || x==1){
//            throw new IllegalArgumentException();
        }
        return (((((ln.compute(x,accuracy)/ln.compute(x,accuracy))/log5.compute(x,accuracy))
        -(log3.compute(x,accuracy)/log10.compute(x,accuracy)))/log10.compute(x,accuracy))
        -log10.compute(x,accuracy));
    }
}

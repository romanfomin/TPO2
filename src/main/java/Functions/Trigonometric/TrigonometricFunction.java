package Functions.Trigonometric;

import Functions.Computable;

public class TrigonometricFunction implements Computable {

    private Csc csc;
    private Cot cot;
    private Cos cos;
    private Tan tan;
    private Sec sec;

    public TrigonometricFunction(Csc csc, Cot cot, Cos cos, Tan tan, Sec sec){
        this.csc = csc;
        this.cot = cot;
        this.cos = cos;
        this.tan = tan;
        this.sec = sec;
    }

    @Override
    public double compute(double x, double accuracy) {
        if(x>=0 || Math.abs(x)%(Math.PI/2)==0){
//            throw new IllegalArgumentException();
        }
        return (Math.pow((((Math.pow(csc.compute(x, accuracy), 2) + (cot.compute(x, accuracy) - csc.compute(x, accuracy)))
                + (cos.compute(x, accuracy) * tan.compute(x, accuracy))) * sec.compute(x, accuracy)), 3));
    }
}
